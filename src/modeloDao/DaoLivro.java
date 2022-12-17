package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansLivro;
import modeloConnection.ConexaoBD;


public class DaoLivro {
    ConexaoBD conex = new ConexaoBD();
    BeansLivro mod = new BeansLivro();
    
    public void Salvar(BeansLivro mod){
        conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement("insert into livros(codigo,titulo,autor,genero,editora,disponibilidade)"
                + " values(?,?,?,?,?,?)");
            pst.setInt(1, mod.getCodigo());
            pst.setString(2, mod.getTitulo());
            pst.setString(3,mod.getAutor());
            pst.setString(4, mod.getGenero());
            pst.setString(5,mod.getEditora());
            pst.setBoolean(6, mod.isDisponibilidade());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Livro inserido com sucessos!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!\n ERRO:"+ex);
        }
        conex.desconecta();
    }
    
    public BeansLivro buscaLivro(BeansLivro mod){
        conex.conexao();
        conex.executeSql("select * from livros where titulo ilike'%"+mod.getPesquisa()+"%'");
        try {
            if (conex.rs.first()==true){
                mod.setTitulo(conex.rs.getString("titulo"));
                mod.setAutor(conex.rs.getString("autor"));
                mod.setCodigo(conex.rs.getInt("codigo"));
                mod.setGenero(conex.rs.getString("genero"));
                mod.setEditora(conex.rs.getString("editora"));
                mod.setDisponibilidade(conex.rs.getBoolean("disponibilidade"));
                mod.setId(conex.rs.getInt("id"));
            }else{
                JOptionPane.showMessageDialog(null, "Livro não cadastrado!");
                mod.setCodigo(0);
                mod.setTitulo("");
                mod.setAutor("");
                mod.setEditora("");
                mod.setGenero("");
                mod.setId(0);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar livro(s)!\n ERRO TÉCNICO:"+ex);
        }finally{
            try {
                conex.rs.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao finalizar resultset!\nErro:"+ex);
            }
        }
        
        conex.desconecta();
        return mod;
    }
//    
    public void Excluir(BeansLivro mod){
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("delete from livros where id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluídos com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao excluir dados!\nErro:"+ex);
        }
        
        conex.desconecta();
    }
//    
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
    
}
