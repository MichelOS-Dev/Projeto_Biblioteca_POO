package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;
import modeloConnection.ConexaoBD;


public class DaoUsuario {
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void Salvar(BeansUsuario mod){
        conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement("insert into administradores(nome,senha,tipo,dicasenha)"
                + " values(?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3,mod.getTipo());
            pst.setString(4, mod.getDicaSenha());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuário inserido com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao inserir usuário!\n ERRO:"+ex);
        }
        conex.desconecta();
    }    
    
    public BeansUsuario buscaUsuario(BeansUsuario mod){
        conex.conexao();
        conex.executeSql("select * from administradores where nome ilike'%"+mod.getPesquisa()+"%'");
        try {
            if (conex.rs.first()==true){
                mod.setNome(conex.rs.getString("nome"));
                mod.setTipo(conex.rs.getString("tipo"));
                mod.setSenha(conex.rs.getString("senha"));
                mod.setCodUsuario(conex.rs.getInt("codigo"));
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
                mod.setNome("");
                mod.setTipo("");
                mod.setSenha("");
                mod.setCodUsuario(0);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Usuário não cadastrado!\nErro ao buscar Usuário(s)!\n ERRO TÉCNICO:"+ex);
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
    
    public void Atualizar(BeansUsuario mod){
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("update administradores set nome=?,tipo=?,senha=? where codigo=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getTipo());
            pst.setString(3, mod.getSenha());
            pst.setInt(4,mod.getCodUsuario());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuário atualizado com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao atualizar dados! \nErro:"+ex);
        }
        conex.desconecta();
    
    }
    
    public void Excluir(BeansUsuario mod){
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("delete from administradores where codigo=?");
            pst.setInt(1, mod.getCodUsuario());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuário excluído com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao excluir dados!\nErro:"+ex);
        }
        
        conex.desconecta();
    }
    
}
