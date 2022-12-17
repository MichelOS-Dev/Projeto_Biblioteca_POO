package modeloConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    private String driver  = "org.postresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/Biblioteca";
    private String usuario  = "postgres";
    private String senha = "postgresql";
    public Connection con;
    
    public void conexao(){
        try {
            System.setProperty("jdbc:Drivers",driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão Efetuada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com o Banco de dados:\n"+ex.getMessage() );
        }
       
    }
    
    public void executeSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ExecuteSQL:\n"+ex.getMessage() );
        }
    }
    
    public void desconecta(){
        try {
            con.close();
           // JOptionPane.showMessageDialog(null,"Banco de dados desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar desconectar Banco de dados:\n"+ex.getMessage());
        }
    }
}
