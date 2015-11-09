
package controllers;

import configs.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.FornecedoresModel;

/**
 * @author Bruno Duarte
 * @email  bduarte2010@gmail.com
 */
public class FornecedoresController {

    ConectaBanco connFornecedores = new ConectaBanco();
    
    public void Inserir(FornecedoresModel mod) {
        connFornecedores.conexao();
        
        try {
            PreparedStatement pst = connFornecedores.conn.prepareStatement("INSERT INTO fornecedores (razao_social, nome_fantasia, cnpj, ie, telefone, email, contato, cep, logradouro, numero, bairro, localidade, uf, complemento, status, created) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())");
        
        pst.setString(1, mod.getRazao_social());
        pst.setString(2, mod.getNome_fantasia());
        pst.setString(3, mod.getCnpj());
        pst.setString(4, mod.getIe());
        pst.setString(5, mod.getTelefone());
        pst.setString(6, mod.getEmail());
        pst.setString(7, mod.getContato());
        pst.setString(8, mod.getCep());
        pst.setString(9, mod.getLogradouro());
        pst.setString(10, mod.getNumero());
        pst.setString(11, mod.getBairro());
        pst.setString(12, mod.getLocalidade());
        pst.setString(13, mod.getUf());
        pst.setString(14, mod.getComplemento());
        pst.setString(15, mod.getStatus());
        pst.execute();
        
        JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados.\nERRO: "+ex);
        }
        
        connFornecedores.desconecta(); 
    }
    
    public void Editar(FornecedoresModel mod) {
        
        connFornecedores.conexao();
        
        try {           
            PreparedStatement pst = connFornecedores.conn.prepareStatement("UPDATE fornecedores SET razao_social = ?, nome_fantasia = ?, cnpj = ?, ie = ?, telefone = ?, email = ?, contato = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, localidade = ?, uf = ?, complemento = ?, status = ? WHERE id = ?");
            
            pst.setString(1, mod.getRazao_social());
            pst.setString(2, mod.getNome_fantasia());
            pst.setString(3, mod.getCnpj());
            pst.setString(4, mod.getIe());
            pst.setString(5, mod.getTelefone());
            pst.setString(6, mod.getEmail());
            pst.setString(7, mod.getContato());
            pst.setString(8, mod.getCep());
            pst.setString(9, mod.getLogradouro());
            pst.setString(10, mod.getNumero());
            pst.setString(11, mod.getBairro());
            pst.setString(12, mod.getLocalidade());
            pst.setString(13, mod.getUf());
            pst.setString(14, mod.getComplemento());
            pst.setString(15, mod.getStatus());
            pst.setInt(16, mod.getId());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o cadastro.\n ERRO: "+ex);
        }
        
        connFornecedores.desconecta();
    }
    
    public void Excluir(FornecedoresModel mod) {

        try {
            connFornecedores.conexao();

            PreparedStatement pst = connFornecedores.conn.prepareStatement("DELETE FROM fornecedores WHERE id = ?");

            pst.setInt(1, mod.getId());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o fornecedor.\nERRO: " + ex);
        }
        
        connFornecedores.desconecta();
    }
}
