
package controllers;

import configs.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.CargosModel;

/**
 * @author Bruno Duarte
 * @email  bduarte2010@gmail.com
 */
public class CargosController {
    
    ConectaBanco connCargos = new ConectaBanco();
    
    public void InserirCargos(CargosModel mod) {
        connCargos.conexao();
        
        try {
            PreparedStatement pst = connCargos.conn.prepareStatement("INSERT INTO cargos(nome, status, created, modified) VALUES(?, ?, NOW(), NOW())");
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getStatus());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados.\nERRO: "+ex);
        }
        
        connCargos.desconecta();
    }
    
    public void ExcluirCargo(CargosModel mod) {
        connCargos.conexao();
        
        try {
            PreparedStatement pst = connCargos.conn.prepareStatement("DELETE FROM cargos WHERE id = ?");
            
            pst.setInt(1, mod.getId());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o cadastro.\n ERRO: "+ex);
        }
        connCargos.desconecta();
    }
    
    public void EditarCargo(CargosModel mod) {
        connCargos.conexao();
        
        try {
            PreparedStatement pst = connCargos.conn.prepareStatement("UPDATE cargos SET nome = ?, status = ?, modified = NOW() WHERE id = ?");
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getStatus());
            pst.setInt(3, mod.getId());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o cadastro.\n ERRO: "+ex);
        }
        connCargos.desconecta();
    }
    
    public CargosModel buscaCargosId(CargosModel mod){
        connCargos.conexao();
        
        connCargos.executaSQL("SELECT * FROM cargos WHERE id like '%"+ mod.getPesquisa() +"%'");
        
        try {
            connCargos.rs.first();
            
            mod.setId(connCargos.rs.getInt("id"));
            mod.setNome(connCargos.rs.getString("nome"));
            mod.setStatus(connCargos.rs.getString("status"));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não existe(m) cadastro(s) com os termos digitados.");
        }
        
        connCargos.desconecta();
        
        return mod;
    }
    
    public CargosModel buscaCargosNome(CargosModel mod){
        connCargos.conexao();
        
        connCargos.executaSQL("SELECT * FROM cargos WHERE nome like '%"+ mod.getPesquisa() +"%'");
        
        try {
            connCargos.rs.first();
            
            mod.setId(connCargos.rs.getInt("id"));
            mod.setNome(connCargos.rs.getString("nome"));
            mod.setStatus(connCargos.rs.getString("status"));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não existe(m) cadastro(s) com os termos digitados.");
        }
        
        connCargos.desconecta();
        
        return mod;
    }
    
}
