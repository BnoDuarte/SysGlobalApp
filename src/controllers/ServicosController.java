
package controllers;

import configs.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.ServicosModel;

/**
 *
 * @author Bruno Duarte
 * @email bduarte2010@gmail.com
 */
public class ServicosController {

    ConectaBanco connServicos = new ConectaBanco();
    
    public void Inserir(ServicosModel mod) {
        connServicos.conexao();
        
        try {
            PreparedStatement pst = connServicos.conn.prepareStatement("INSERT INTO servicos (nome, operadora, categoria, valor, comissao, status, created) VALUES (?, ?, ?, ?, ?, ?, NOW())");
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getOperadora());
            pst.setString(3, mod.getCategoria());
            pst.setDouble(4, mod.getValor());
            pst.setDouble(5, mod.getComissao());
            pst.setString(6, mod.getStatus());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados.\nERRO: "+ex);
        }
        
        connServicos.desconecta();
    }
    
    public void Editar(ServicosModel mod) {
        connServicos.conexao();
    }
}
