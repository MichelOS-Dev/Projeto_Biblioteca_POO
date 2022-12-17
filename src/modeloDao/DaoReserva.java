
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansLivro;
import modeloBeans.BeansReserva;
import modeloConnection.ConexaoBD;


public class DaoReserva {
    BeansReserva reserva = new BeansReserva();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexAluno = new ConexaoBD();
    ConexaoBD conexLivro = new ConexaoBD();
    int CodAluno;
    int CodLivro;
    
    
    public void Salvar(BeansReserva Reservas){
        BuscarAluno(Reservas.getNomeALuno());
        BuscarLivro(Reservas.getNomelivro());
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into reservas(codaluno,codlivro,datareserva,dataentrega,situacao)"
                    + " values(?,?,?,?,?)");
            pst.setInt(1,CodAluno);
            pst.setInt(2, CodLivro);
            pst.setDate(3, new java.sql.Date(Reservas.getDateReserva().getTime()));
            pst.setDate(4, new java.sql.Date(Reservas.getDateEntrega().getTime()));
            pst.setString(5, Reservas.getSituacao());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Reserva realizada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar dados!\n"+ ex);
        }
        conex.desconecta();
    }
    
    public void BuscarLivro(String titulo){
        conexLivro.conexao();
        conexLivro.executeSql("select * from livros where titulo='"+titulo+"'");
        try {
            conexLivro.rs.first();
            CodLivro= conexLivro.rs.getInt("id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Livro não encontrado");
        }
        conexLivro.desconecta();
    
    }
    
    public void BuscarAluno(String nome){
        conexAluno.conexao();
        conexAluno.executeSql("select * from alunos where nome='"+nome+"'");
        try {
            conexAluno.rs.first();
            CodAluno= conexAluno.rs.getInt("codigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Aluno não encontrado");
        }
        conexAluno.desconecta();
    
    }
    
    public void Atualizar(BeansLivro mod){
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("update livros set titulo=?,codigo=?,autor=?,editora=?,genero=?,disponibilidade=? where id=?");
            pst.setString(1, mod.getTitulo());
            pst.setInt(2, mod.getCodigo());
            pst.setString(3, mod.getAutor());
            pst.setString(4, mod.getEditora());
            pst.setString(5, mod.getGenero());
            pst.setBoolean(6, mod.isDisponibilidade());
            pst.setInt(7,mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Livro atualizado com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao atualizar dados! \nErro:"+ex);
        }
        conex.desconecta();
    
    }
    public void AtualizarReserva(BeansReserva mod){
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("update reservas set datareserva=?,dataentrega=?,situacao=? where idreserva=?");
            pst.setDate(1, new java.sql.Date(mod.getDateReserva().getTime()));
            pst.setDate(2, new java.sql.Date(mod.getDateEntrega().getTime()));
            pst.setString(3,mod.getSituacao());
            pst.setInt(4,mod.getIdReserva());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Reserva atualizada com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao atualizar dados! \nErro:"+ex);
        }
        conex.desconecta();
    
    }
    

}
