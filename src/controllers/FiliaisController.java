
package controllers;

import configs.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.FiliaisModel;

/**
 *
 * @author Bruno Duarte
 * @email bduarte2010@gmail.com
 */
public class FiliaisController {
    
    ConectaBanco connFiliais = new ConectaBanco();
    
    public void InserirFiliais(FiliaisModel mod) {
        connFiliais.conexao();
        
        try {
            PreparedStatement pst = connFiliais.conn.prepareStatement("INSERT INTO filiais (razao_social, nome_fantasia, cnpj, ie, telefone, email, responsavel, cep, logradouro, numero, bairro, localidade, uf, complemento, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
        pst.setString(1, mod.getRazao_social());
        pst.setString(2, mod.getNome_fantasia());
        pst.setString(3, mod.getCnpj());
        pst.setString(4, mod.getIe());
        pst.setString(5, mod.getTelefone());
        pst.setString(6, mod.getEmail());
        pst.setString(7, mod.getResponsavel());
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
        
        connFiliais.desconecta(); 
    }
    
    public void ExcluirFilial(FiliaisModel mod) {

        try {
            connFiliais.conexao();

            PreparedStatement pst = connFiliais.conn.prepareStatement("DELETE FROM filiais WHERE id = ?");

            pst.setInt(1, mod.getId());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o cadastro.\nERRO: " + ex);
        }
        
        connFiliais.desconecta();
    }
    
    public void EditarFilial(FiliaisModel mod) {
        
        connFiliais.conexao();
        
        try {           
            PreparedStatement pst = connFiliais.conn.prepareStatement("UPDATE filiais SET razao_social = ?, nome_fantasia = ?, cnpj = ?, ie = ?, telefone = ?, email = ?, responsavel = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, localidade = ?, uf = ?, complemento = ?, status = ? WHERE id = ?");
            
            pst.setString(1, mod.getRazao_social());
            pst.setString(2, mod.getNome_fantasia());
            pst.setString(3, mod.getCnpj());
            pst.setString(4, mod.getIe());
            pst.setString(5, mod.getTelefone());
            pst.setString(6, mod.getEmail());
            pst.setString(7, mod.getResponsavel());
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
        
        connFiliais.desconecta();
    }
    
    public FiliaisModel buscaFilialId(FiliaisModel mod) {
        
        try {
            connFiliais.conexao();
            connFiliais.executaSQL("SELECT * FROM filiais WHERE id like '%"+ mod.getPesquisa() +"%'");
            connFiliais.rs.first();
            
            mod.setId(connFiliais.rs.getInt("id"));
            mod.setRazao_social(connFiliais.rs.getString("razao_social"));
            mod.setNome_fantasia(connFiliais.rs.getString("nome_fantasia"));
            mod.setCnpj(connFiliais.rs.getString("cnpj"));
            mod.setIe(connFiliais.rs.getString("ie"));
            mod.setTelefone(connFiliais.rs.getString("telefone"));
            mod.setEmail(connFiliais.rs.getString("email"));
            mod.setResponsavel(connFiliais.rs.getString("responsavel"));
            mod.setCep(connFiliais.rs.getString("cep"));
            mod.setLogradouro(connFiliais.rs.getString("logradouro"));
            mod.setNumero(connFiliais.rs.getString("numero"));
            mod.setBairro(connFiliais.rs.getString("bairro"));
            mod.setLocalidade(connFiliais.rs.getString("localidade"));
            mod.setUf(connFiliais.rs.getString("uf"));
            mod.setComplemento(connFiliais.rs.getString("complemento"));
            mod.setStatus(connFiliais.rs.getString("status"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe(m) cadastro(s) com os termos digitados.");
        }
        
        connFiliais.desconecta();
        
        return mod;
    }
    
    public FiliaisModel buscaFilialCnpj(FiliaisModel mod) {
        
        try {
            connFiliais.conexao();
            connFiliais.executaSQL("SELECT * FROM filiais WHERE cnpj like '%"+ mod.getPesquisa() +"%'");
            connFiliais.rs.first();
            
            mod.setId(connFiliais.rs.getInt("id"));
            mod.setRazao_social(connFiliais.rs.getString("razao_social"));
            mod.setNome_fantasia(connFiliais.rs.getString("nome_fantasia"));
            mod.setCnpj(connFiliais.rs.getString("cnpj"));
            mod.setIe(connFiliais.rs.getString("ie"));
            mod.setTelefone(connFiliais.rs.getString("telefone"));
            mod.setEmail(connFiliais.rs.getString("email"));
            mod.setResponsavel(connFiliais.rs.getString("responsavel"));
            mod.setCep(connFiliais.rs.getString("cep"));
            mod.setLogradouro(connFiliais.rs.getString("logradouro"));
            mod.setNumero(connFiliais.rs.getString("numero"));
            mod.setBairro(connFiliais.rs.getString("bairro"));
            mod.setLocalidade(connFiliais.rs.getString("localidade"));
            mod.setUf(connFiliais.rs.getString("uf"));
            mod.setComplemento(connFiliais.rs.getString("complemento"));
            mod.setStatus(connFiliais.rs.getString("status"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe(m) cadastro(s) com os termos digitados.");
        }
        
        connFiliais.desconecta();
        
        return mod;
    }
    
}
