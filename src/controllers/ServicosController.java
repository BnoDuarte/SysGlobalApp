
package controllers;

import configs.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        try {
            PreparedStatement pst = connServicos.conn.prepareStatement("UPDATE servicos SET nome = ?, operadora = ?, categoria = ?, valor = ?, comissao = ?, status = ? WHERE id = ?");
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getOperadora());
            pst.setString(3, mod.getCategoria());
            pst.setDouble(4, mod.getValor());
            pst.setDouble(5, mod.getComissao());
            pst.setString(6, mod.getStatus());
            pst.setInt(7, mod.getId());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o cadastro.\n ERRO: "+ex);
        }
        
        connServicos.desconecta();
    }
    
    public void Excluir(ServicosModel mod) {
        connServicos.conexao();
        
        try {
            PreparedStatement pst = connServicos.conn.prepareStatement("DELETE FROM servicos WHERE id = ?");
            
            pst.setInt(1, mod.getId());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Serviço excluído com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o serviço.\nERRO: " + ex);
        }
        
        connServicos.desconecta();
    }
}
