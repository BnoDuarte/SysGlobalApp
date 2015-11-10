
package controllers;

import configs.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ClientesModel;

/**
 * @author Bruno Duarte
 * @email  bduarte2010@gmail.com
 */
public class ClientesController {

    ConectaBanco connClientes = new ConectaBanco();
    
    public void Inserir(ClientesModel mod) {
        connClientes.conexao();
        
        try {
            PreparedStatement pst = connClientes.conn.prepareStatement("INSERT INTO clientes (nome, sobrenome, cpf, rg, sexo, estado_civil, dt_nasc, mae, telefone, celular, email, obs, cep, logradouro, numero, bairro, localidade, uf, complemento, status, created) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())");
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSobrenome());
            pst.setString(3, mod.getCpf());
            pst.setString(4, mod.getRg());
            pst.setString(5, mod.getSexo());
            pst.setString(6, mod.getEstado_civil());
            
            String nasc_dia = mod.getDt_nasc().substring(0, 2);
            String nasc_mes = mod.getDt_nasc().substring(3, 5);
            String nasc_ano = mod.getDt_nasc().substring(6);
            String dt_nascDB = nasc_ano+"-"+nasc_mes+"-"+nasc_dia;
            pst.setString(7, dt_nascDB);
            
            pst.setString(8, mod.getMae());
            pst.setString(9, mod.getTelefone());
            pst.setString(10, mod.getCelular());
            pst.setString(11, mod.getEmail());
            pst.setString(12, mod.getObs());
            pst.setString(13, mod.getCep());
            pst.setString(14, mod.getLogradouro());
            pst.setString(15, mod.getNumero());
            pst.setString(16, mod.getBairro());
            pst.setString(17, mod.getLocalidade());
            pst.setString(18, mod.getUf());
            pst.setString(19, mod.getComplemento());
            pst.setString(20, mod.getStatus());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados.\n ERRO: "+ ex);
        }
        
        connClientes.desconecta();
    }
    
    public ClientesModel buscaFuncionariosId(ClientesModel mod){
        connClientes.conexao();
        
        connClientes.executaSQL("SELECT * FROM clientes WHERE id like '%"+ mod.getPesquisa() +"%'");
        
        try {
            connClientes.rs.first();
                        
            mod.setId(connClientes.rs.getInt("id"));
            mod.setNome(connClientes.rs.getString("nome"));
            mod.setSobrenome(connClientes.rs.getString("sobrenome"));
            mod.setSexo(connClientes.rs.getString("sexo"));
            
            //Preencher campo formatado com dados do banco
            String datanascDB = connClientes.rs.getString("dt_nasc");
            String nasc_ano = datanascDB.substring(0, 4);
            String nasc_mes = datanascDB.substring(5, 7);
            String nasc_dia = datanascDB.substring(8);
            String dt_nasc = nasc_dia+"/"+nasc_mes+"/"+nasc_ano;
            mod.setDt_nasc(dt_nasc);
            
            mod.setCpf(connClientes.rs.getString("cpf"));
            mod.setRg(connClientes.rs.getString("rg"));
            mod.setMae(connClientes.rs.getString("mae"));
            mod.setEstado_civil(connClientes.rs.getString("estado_civil"));
            mod.setTelefone(connClientes.rs.getString("telefone"));
            mod.setCelular(connClientes.rs.getString("celular"));
            mod.setEmail(connClientes.rs.getString("email"));
            mod.setCep(connClientes.rs.getString("cep"));
            mod.setLogradouro(connClientes.rs.getString("logradouro"));
            mod.setNumero(connClientes.rs.getString("numero"));
            mod.setComplemento(connClientes.rs.getString("complemento"));
            mod.setBairro(connClientes.rs.getString("bairro"));
            mod.setLocalidade(connClientes.rs.getString("localidade"));
            mod.setUf(connClientes.rs.getString("uf"));
            mod.setStatus(connClientes.rs.getString("status"));
            mod.setObs(connClientes.rs.getString("obs"));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não existe cadastro com o código digitado.");
        }
        
        connClientes.desconecta();
        
        return mod;
    }
}
