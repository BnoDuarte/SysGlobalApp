
package controllers;

import configs.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.ProdutosModel;

/**
 *
 * @author Bruno Duarte
 * @email bduarte2010@gmail.com
 */
public class ProdutosController {

    ConectaBanco connProdutos = new ConectaBanco();
    
    public void Inserir(ProdutosModel mod) {
        connProdutos.conexao();
        
        try {
            PreparedStatement pst = connProdutos.conn.prepareStatement("INSERT INTO produtos (nome, categoria, fabricante, rede, sistema_operacional, cor, qte_min, valor, status, descricao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCategoria());
            pst.setString(3, mod.getFabricante());
            pst.setString(4, mod.getRede());
            pst.setString(5, mod.getSistema_operacional());
            pst.setString(6, mod.getCor());
            pst.setInt(7, mod.getQte_minima());
            pst.setDouble(8, mod.getValor());
            pst.setString(9, mod.getStatus());
            pst.setString(10, mod.getDescricao());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados.\nERRO: "+ex);
        }
        
        connProdutos.desconecta();
    }
    
    public void Editar(ProdutosModel mod) {
        connProdutos.conexao();
        
        try {
            PreparedStatement pst = connProdutos.conn.prepareStatement("UPDATE produtos SET nome = ?, categoria = ?, fabricante = ?, rede = ?, sistema_operacional = ?, cor = ?, qte_min = ?, valor = ?, status = ?, descricao = ? WHERE id = ?");
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCategoria());
            pst.setString(3, mod.getFabricante());
            pst.setString(4, mod.getRede());
            pst.setString(5, mod.getSistema_operacional());
            pst.setString(6, mod.getCor());
            pst.setInt(7, mod.getQte_minima());
            pst.setDouble(8, mod.getValor());
            pst.setString(9, mod.getStatus());
            pst.setString(10, mod.getDescricao());
            pst.setInt(11, mod.getId());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o cadastro.\n ERRO: "+ex);
        }
        
        connProdutos.desconecta();
    }
    
    public void Excluir(ProdutosModel mod) {
        connProdutos.conexao();
        
        try {
            PreparedStatement pst = connProdutos.conn.prepareStatement("DELETE FROM produtos WHERE id = ?");
            
            pst.setInt(1, mod.getId());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o produto.\nERRO: " + ex);
        }
        
        connProdutos.desconecta();
    }
}
