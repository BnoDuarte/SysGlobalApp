
package configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * @author Bduarte
 */
public class ConectaBanco {
    public Statement stm; //Responsável por preparar e realizar pesquisas no banco de dados
    public ResultSet rs; // Responsável por armazenar o resultado de uma pesquisa passada
    private final String driver = "com.mysql.jdbc.Driver"; // Identifica o serviço do DB
    //private final String caminho = "jdbc:mysql://grpglobal.com.br:3306/globa915_sysjava";
    private final String caminho = "jdbc:mysql://sysglobal.com.br:3306/sysglobal";
    //private final String usuario = "globa915_sysjava";
    private final String usuario = "root";
    //private final String senha = "n3t2015";
    private final String senha = "root";
    public Connection conn; // Realiza a conexão com o BD
    
    public void conexao() {
        System.setProperty("jdbc.Drivers", driver); // seta a propriedade do driver de conexão
        
        try {
            conn = DriverManager.getConnection(caminho, usuario, senha); // Realiza a conexão com o BD
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar-se ao Banco de Dados.\n Erro:" + ex.getMessage());
        }
    }
    
    public void executaSQL(String sql) {
        
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no ExecutaSQL!\n Erro:" + ex.getMessage());
        }
    }
    
    public void desconecta() {
        
        try {
            conn.close();
            //conn = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!\n Erro:" + ex.getMessage());
        }
    }
}