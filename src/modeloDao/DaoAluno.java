package modeloDao;

import modeloConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansAluno;



public class DaoAluno {
    ConexaoBD conex = new ConexaoBD();
    BeansAluno mod = new BeansAluno();
    
    public void Salvar(BeansAluno mod){
        conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement("insert into alunos(matricula,nome,turma,curso,livroslidos)"
                + " values(?,?,?,?,?)");
            pst.setInt(1, mod.getMatricula());
            pst.setString(2, mod.getNome());
            pst.setString(3,mod.getTurma());
            pst.setString(4, mod.getCurso());
            pst.setInt(5,mod.getLivrosLidos());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucessos!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!\n ERRO:"+ex);
        }
        conex.desconecta();
    }
    
    public BeansAluno buscaAluno(BeansAluno mod){
        conex.conexao();
        conex.executeSql("select * from alunos where nome ilike'%"+mod.getPesquisa()+"%'");
        try {
            if (conex.rs.first()==true){
                mod.setMatricula(conex.rs.getInt("matricula"));
                mod.setNome(conex.rs.getString("nome"));
                mod.setTurma(conex.rs.getString("turma"));
                mod.setCurso(conex.rs.getString("curso"));
                mod.setLivrosLidos(conex.rs.getInt("livroslidos"));
                mod.setCodigo(conex.rs.getInt("codigo"));
            }else{
                JOptionPane.showMessageDialog(null, "Aluno não cadastrado!");
                mod.setMatricula(0);
                mod.setNome("");
                mod.setTurma("");
                mod.setCurso("");
                mod.setLivrosLidos(0);
                mod.setCodigo(0);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar aluno(s)!\n ERRO TÉCNICO:"+ex);
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
    
    public void Excluir(BeansAluno mod){
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("delete from alunos where codigo=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluídos com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao excluir dados!\nErro:"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Atualizar(BeansAluno mod){
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("update alunos set matricula=?,nome=?,turma=?,curso=?,livroslidos=? where codigo=?");
            pst.setInt(1, mod.getMatricula());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getTurma());
            pst.setString(4, mod.getCurso());
            pst.setInt(5, mod.getLivrosLidos());
            pst.setInt(6,mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao atualizar dados! \nErro:"+ex);
        }
        conex.desconecta();
    
    }
    
    
}

