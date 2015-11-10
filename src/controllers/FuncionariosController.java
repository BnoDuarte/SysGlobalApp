
package controllers;

import configs.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.FuncionariosModel;

/**
 *
 * @author Bruno Duarte
 * @email bduarte2010@gmail.com
 */
public class FuncionariosController {
    
    ConectaBanco connFuncionarios = new ConectaBanco();
    ConectaBanco connCargos = new ConectaBanco();
    ConectaBanco connFiliais = new ConectaBanco();
    
    int codCargo;
    String nomeCargo;
    
    int codFilial;
    String nomeFilial;
    
    public void Inserir(FuncionariosModel mod) {
        connFuncionarios.conexao();
        
        try {
            PreparedStatement pst = connFuncionarios.conn.prepareStatement("INSERT INTO funcionarios (cargo_id, filial_id, nome, sobrenome, cpf, rg, sexo, estado_civil, dt_nasc, mae, telefone, celular, email, obs, dt_admissao, dt_demissao, usuario, senha, banco, agencia, conta, cep, logradouro, numero, bairro, localidade, uf, complemento, status, created) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())");

            pst.setInt(1, mod.getCargo_id());
            pst.setInt(2, mod.getFilial_id());
            pst.setString(3, mod.getNome());
            pst.setString(4, mod.getSobrenome());
            pst.setString(5, mod.getCpf());
            pst.setString(6, mod.getRg());
            pst.setString(7, mod.getSexo());
            pst.setString(8, mod.getEstado_civil());

            String nasc_dia = mod.getDt_nasc().substring(0, 2);
            String nasc_mes = mod.getDt_nasc().substring(3, 5);
            String nasc_ano = mod.getDt_nasc().substring(6);
            String dt_nascDB = nasc_ano + "-" + nasc_mes + "-" + nasc_dia;
            pst.setString(9, dt_nascDB);

            pst.setString(10, mod.getMae());
            pst.setString(11, mod.getTelefone());
            pst.setString(12, mod.getCelular());
            pst.setString(13, mod.getEmail());
            pst.setString(14, mod.getObs());

            String admissao_dia = mod.getDt_admissao().substring(0, 2);
            String admissao_mes = mod.getDt_admissao().substring(3, 5);
            String admissao_ano = mod.getDt_admissao().substring(6);
            String dt_admissaoDB = admissao_ano + "-" + admissao_mes + "-" + admissao_dia;
            pst.setString(15, dt_admissaoDB);

            String demissao_dia = mod.getDt_demissao().substring(0, 2);
            String demissao_mes = mod.getDt_demissao().substring(3, 5);
            String demissao_ano = mod.getDt_demissao().substring(6);
            String dt_demissaoDB = demissao_ano + "-" + demissao_mes + "-" + demissao_dia;
            pst.setString(16, dt_demissaoDB);

            pst.setString(17, mod.getUsuario());
            pst.setString(18, mod.getSenha());
            pst.setString(19, mod.getBanco());
            pst.setString(20, mod.getAgencia());
            pst.setString(21, mod.getConta());
            pst.setString(22, mod.getCep());
            pst.setString(23, mod.getLogradouro());
            pst.setString(24, mod.getNumero());
            pst.setString(25, mod.getBairro());
            pst.setString(26, mod.getLocalidade());
            pst.setString(27, mod.getUf());
            pst.setString(28, mod.getComplemento());
            pst.setString(29, mod.getStatus());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados.\n ERRO: " + ex);
        }
        
        connFuncionarios.desconecta();
    }
    
    public void Editar(FuncionariosModel mod) {
        
        connFuncionarios.conexao();
        
        try {
            PreparedStatement pst = connFuncionarios.conn.prepareStatement("UPDATE funcionarios SET cargo_id = ?, filial_id = ?, nome = ?, sobrenome = ?, cpf = ?, rg = ?, sexo = ?, estado_civil = ?, dt_nasc = ?, mae = ?, telefone = ?, celular = ?, email = ?, obs = ?, dt_admissao = ?, dt_demissao = ?, usuario = ?, banco = ?, agencia = ?, conta = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, localidade = ?, uf = ?, complemento = ?, status = ?, banco = ?, agencia = ?, conta = ? WHERE id = ?");
            
            pst.setInt(1, mod.getCargo_id());
            pst.setInt(2, mod.getFilial_id());
            pst.setString(3, mod.getNome());
            pst.setString(4, mod.getSobrenome());
            pst.setString(5, mod.getCpf());
            pst.setString(6, mod.getRg());
            pst.setString(7, mod.getSexo());
            pst.setString(8, mod.getEstado_civil());
            
            String nasc_dia = mod.getDt_nasc().substring(0, 2);
            String nasc_mes = mod.getDt_nasc().substring(3, 5);
            String nasc_ano = mod.getDt_nasc().substring(6);
            String dt_nascDB = nasc_ano+"-"+nasc_mes+"-"+nasc_dia;
            pst.setString(9, dt_nascDB);
            
            pst.setString(10, mod.getMae());
            pst.setString(11, mod.getTelefone());
            pst.setString(12, mod.getCelular());
            pst.setString(13, mod.getEmail());
            pst.setString(14, mod.getObs());
            
            String admissao_dia = mod.getDt_admissao().substring(0, 2);
            String admissao_mes = mod.getDt_admissao().substring(3, 5);
            String admissao_ano = mod.getDt_admissao().substring(6);
            String dt_admissaoDB = admissao_ano+"-"+admissao_mes+"-"+admissao_dia;
            pst.setString(15, dt_admissaoDB);
            
            String demissao_dia = mod.getDt_demissao().substring(0, 2);
            String demissao_mes = mod.getDt_demissao().substring(3, 5);
            String demissao_ano = mod.getDt_demissao().substring(6);
            String dt_demissaoDB = demissao_ano+"-"+demissao_mes+"-"+demissao_dia;
            pst.setString(16, dt_demissaoDB);
            
            pst.setString(17, mod.getUsuario());
            pst.setString(18, mod.getBanco());
            pst.setString(19, mod.getAgencia());
            pst.setString(20, mod.getConta());
            pst.setString(21, mod.getCep());
            pst.setString(22, mod.getLogradouro());
            pst.setString(23, mod.getNumero());
            pst.setString(24, mod.getBairro());
            pst.setString(25, mod.getLocalidade());
            pst.setString(26, mod.getUf());
            pst.setString(27, mod.getComplemento());
            pst.setString(28, mod.getStatus());
            pst.setString(29, mod.getBanco());
            pst.setString(30, mod.getAgencia());
            pst.setString(31, mod.getConta());
            pst.setInt(32, mod.getId());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o cadastro.\n ERRO: "+ex);
        }
    }
    
    public void Excluir(FuncionariosModel mod) {
        connFuncionarios.conexao();
        
        try {
            PreparedStatement pst = connFuncionarios.conn.prepareStatement("DELETE FROM funcionarios WHERE id = ?");
            
            pst.setInt(1, mod.getId());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o funcionário.\n ERRO: "+ex);
        }
        connFuncionarios.desconecta();
    }
    
    public FuncionariosModel buscaFuncionariosId(FuncionariosModel mod){
        connFuncionarios.conexao();
        
        connFuncionarios.executaSQL("SELECT * FROM funcionarios WHERE id like '%"+ mod.getPesquisa() +"%'");
        
        try {
            connFuncionarios.rs.first();
            
            buscaNomeCargo(connFuncionarios.rs.getInt("cargo_id"));
            buscaNomeFilial(connFuncionarios.rs.getInt("filial_id"));
            
            mod.setId(connFuncionarios.rs.getInt("id"));
            mod.setNome(connFuncionarios.rs.getString("nome"));
            mod.setSobrenome(connFuncionarios.rs.getString("sobrenome"));
            mod.setSexo(connFuncionarios.rs.getString("sexo"));
            
            //Preencher campo formatado com dados do banco
            String datanascDB = connFuncionarios.rs.getString("dt_nasc");
            String nasc_ano = datanascDB.substring(0, 4);
            String nasc_mes = datanascDB.substring(5, 7);
            String nasc_dia = datanascDB.substring(8);
            String dt_nasc = nasc_dia+"/"+nasc_mes+"/"+nasc_ano;
            mod.setDt_nasc(dt_nasc);
            
            mod.setCpf(connFuncionarios.rs.getString("cpf"));
            mod.setRg(connFuncionarios.rs.getString("rg"));
            mod.setMae(connFuncionarios.rs.getString("mae"));
            mod.setEstado_civil(connFuncionarios.rs.getString("estado_civil"));
            mod.setTelefone(connFuncionarios.rs.getString("telefone"));
            mod.setCelular(connFuncionarios.rs.getString("celular"));
            mod.setEmail(connFuncionarios.rs.getString("email"));
            mod.setCep(connFuncionarios.rs.getString("cep"));
            mod.setLogradouro(connFuncionarios.rs.getString("logradouro"));
            mod.setNumero(connFuncionarios.rs.getString("numero"));
            mod.setComplemento(connFuncionarios.rs.getString("complemento"));
            mod.setBairro(connFuncionarios.rs.getString("bairro"));
            mod.setLocalidade(connFuncionarios.rs.getString("localidade"));
            mod.setUf(connFuncionarios.rs.getString("uf"));
            
            //Preencher campo formatado com dados do banco
            String dt_admissaoDB = connFuncionarios.rs.getString("dt_admissao");
            String adm_ano = dt_admissaoDB.substring(0, 4);
            String adm_mes = dt_admissaoDB.substring(5, 7);
            String adm_dia = dt_admissaoDB.substring(8);
            String dt_admissao = adm_dia+"/"+adm_mes+"/"+adm_ano;
            mod.setDt_admissao(dt_admissao);
            
            //Preencher campo formatado com dados do banco
            String dt_demissaoDB = connFuncionarios.rs.getString("dt_demissao");
            String dem_ano = dt_demissaoDB.substring(0, 4);
            String dem_mes = dt_demissaoDB.substring(5, 7);
            String dem_dia = dt_demissaoDB.substring(8);
            String dt_demissao = dem_dia+"/"+dem_mes+"/"+dem_ano;
            mod.setDt_demissao(dt_demissao);
            
            mod.setUsuario(connFuncionarios.rs.getString("usuario"));
            mod.setSenha(connFuncionarios.rs.getString("senha"));
            mod.setStatus(connFuncionarios.rs.getString("status"));
            mod.setBanco(connFuncionarios.rs.getString("banco"));
            mod.setAgencia(connFuncionarios.rs.getString("agencia"));
            mod.setConta(connFuncionarios.rs.getString("conta"));
            mod.setObs(connFuncionarios.rs.getString("obs"));
            mod.setCargofuncionario(nomeCargo);
            mod.setFilialfuncionario(nomeFilial);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não existe cadastro com o código digitado.");
        }
        
        connFuncionarios.desconecta();
        
        return mod;
    }
    
    public void buscaNomeCargo(int cod) {

        try {
            connCargos.conexao();
            connCargos.executaSQL("SELECT * FROM cargos WHERE id =" + cod + "");
            connCargos.rs.first();
            nomeCargo = connCargos.rs.getString("nome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar código do Cargo\nERRO:" + ex);
        }
        connCargos.desconecta();
    }
    
    public void buscaNomeFilial(int cod) {

        try {
            connFiliais.conexao();
            connFiliais.executaSQL("SELECT * FROM filiais WHERE id =" + cod + "");
            connFiliais.rs.first();
            nomeFilial = connFiliais.rs.getString("nome_fantasia");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar código da Filial\nERRO:" + ex);
        }
        connFiliais.desconecta();
    }
    
}
