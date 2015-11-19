
package controllers;

import configs.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.VendasModel;

/**
 *
 * @author Bruno Duarte
 * @email bduarte2010@gmail.com
 */
public class VendasController {
    
    ConectaBanco connVendas = new ConectaBanco();
    VendasModel mod = new VendasModel();
    
    String categProduto;
    
    public void abrirVenda(VendasModel mod) {
        connVendas.conexao();
        
        try {
            PreparedStatement pst = connVendas.conn.prepareStatement("INSERT INTO vendas (funcionario_id, cliente_id, formapagto, iccid, imei, tipo_venda, port_movel, port_fixo, ntc_fixo, ntc_movel, ntc_movel_portado, operadora_port_movel, operadora_port_fixo, dt_port_fixo, dt_port_movel, dt_venda, protocolo_contrato, status, created) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())");
            
            pst.setInt(1, mod.getFuncionario_id());
            pst.setInt(2, mod.getCliente_id());
            pst.setString(3, mod.getFormapagto());
            pst.setString(4, mod.getIccid());
            pst.setString(5, mod.getImei());
            pst.setString(6, mod.getTipo_venda());
            pst.setString(7, mod.getPort_movel());
            pst.setString(8, mod.getPort_fixo());
            pst.setString(9, mod.getNtc_fixo());
            pst.setString(10, mod.getNtc_movel());
            pst.setString(11, mod.getNtc_movel_portado());
            pst.setString(12, mod.getOperadora_port_movel());
            pst.setString(13, mod.getOperadora_port_fixo());
            pst.setString(14, mod.getDt_port_fixo());
            pst.setString(15, mod.getDt_port_movel());
            
            String venda_dia = mod.getDt_venda().substring(0, 2);
            String venda_mes = mod.getDt_venda().substring(3, 5);
            String venda_ano = mod.getDt_venda().substring(6);
            String dt_vendaBD = venda_ano + "-" + venda_mes + "-" + venda_dia;
            pst.setString(16, dt_vendaBD);
            
            pst.setString(17, mod.getProtocolo_contrato());
            pst.setString(18, mod.getStatus());
            pst.execute();      
            
            JOptionPane.showMessageDialog(null, "Venda aberta com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a venda.\nERRO: "+ex);
        }
        
        connVendas.desconecta();
    }
    
    public void finalizarVenda(VendasModel mod) {
        connVendas.conexao();
        
        try {
            PreparedStatement pst = connVendas.conn.prepareStatement("UPDATE vendas SET formapagto = ?, iccid = ?, imei = ?, tipo_venda = ?, port_movel = ?, port_fixo = ?, ntc_fixo = ?, ntc_movel = ?, protocolo_contrato = ? WHERE id = ?");
            
            pst.setString(1, mod.getFormapagto());
            pst.setString(2, mod.getIccid());
            pst.setString(3, mod.getImei());
            pst.setString(4, mod.getTipo_venda());
            pst.setString(5, mod.getPort_movel());
            pst.setString(6, mod.getPort_fixo());
            pst.setString(7, mod.getNtc_fixo());
            pst.setString(8, mod.getNtc_movel());            
            pst.setString(9, mod.getProtocolo_contrato());
            pst.setInt(10, mod.getId());
            pst.execute();      
            
            JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível finalizar a venda.\nERRO: "+ex);
        }
        
        connVendas.desconecta();
    }
    
    public void finalizarVendaPortFixo(VendasModel mod) {
        connVendas.conexao();
        
        try {
            PreparedStatement pst = connVendas.conn.prepareStatement("UPDATE vendas SET formapagto = ?, iccid = ?, imei = ?, tipo_venda = ?, port_movel = ?, port_fixo = ?, ntc_fixo = ?, ntc_movel = ?, protocolo_contrato = ?, dt_port_fixo = ?, operadora_port_fixo = ? WHERE id = ?");
            
            pst.setString(1, mod.getFormapagto());
            pst.setString(2, mod.getIccid());
            pst.setString(3, mod.getImei());
            pst.setString(4, mod.getTipo_venda());
            pst.setString(5, mod.getPort_movel());
            pst.setString(6, mod.getPort_fixo());
            pst.setString(7, mod.getNtc_fixo());
            pst.setString(8, mod.getNtc_movel());            
            pst.setString(9, mod.getProtocolo_contrato());
            
            String portfixo_dia = mod.getDt_port_fixo().substring(0, 2);
            String portfixo_mes = mod.getDt_port_fixo().substring(3, 5);
            String portfixo_ano = mod.getDt_port_fixo().substring(6);
            String dt_portfixoBD = portfixo_ano + "-" + portfixo_mes + "-" + portfixo_dia;
            pst.setString(10, dt_portfixoBD);
            
            pst.setString(11, mod.getOperadora_port_fixo());
            pst.setInt(12, mod.getId());
            pst.execute();      
            
            JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível finalizar a venda.\nERRO: "+ex);
        }
        
        connVendas.desconecta();
    }
    
    public void finalizarVendaPortMovel(VendasModel mod) {
        connVendas.conexao();
        
        try {
            PreparedStatement pst = connVendas.conn.prepareStatement("UPDATE vendas SET formapagto = ?, iccid = ?, imei = ?, tipo_venda = ?, port_movel = ?, port_fixo = ?, ntc_fixo = ?, ntc_movel = ?, protocolo_contrato = ?, ntc_movel_portado = ?, operadora_port_movel = ?, dt_port_movel = ? WHERE id = ?");
            
            pst.setString(1, mod.getFormapagto());
            pst.setString(2, mod.getIccid());
            pst.setString(3, mod.getImei());
            pst.setString(4, mod.getTipo_venda());
            pst.setString(5, mod.getPort_movel());
            pst.setString(6, mod.getPort_fixo());
            pst.setString(7, mod.getNtc_fixo());
            pst.setString(8, mod.getNtc_movel());            
            pst.setString(9, mod.getProtocolo_contrato());            
            pst.setString(10, mod.getNtc_movel_portado());
            pst.setString(11, mod.getOperadora_port_movel());
            
            String portmovel_dia = mod.getDt_port_movel().substring(0, 2);
            String portmovel_mes = mod.getDt_port_movel().substring(3, 5);
            String portmovel_ano = mod.getDt_port_movel().substring(6);
            String dt_portmovelBD = portmovel_ano + "-" + portmovel_mes + "-" + portmovel_dia;
            pst.setString(12, dt_portmovelBD);
            
            pst.setInt(13, mod.getId());
            pst.execute();      
            
            JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível finalizar a venda.\nERRO: "+ex);
        }
        
        connVendas.desconecta();
    }
    
    public void finalizarVendaAll(VendasModel mod) {
        connVendas.conexao();
        
        try {
            PreparedStatement pst = connVendas.conn.prepareStatement("UPDATE vendas SET funcionario_id = ?, cliente_id = ?, formapagto = ?, iccid = ?, imei = ?, tipo_venda = ?, port_movel = ?, port_fixo = ?, ntc_fixo = ?, ntc_movel = ?, ntc_movel_portado = ?, operadora_port_movel = ?, operadora_port_fixo = ?, dt_port_fixo = ?, dt_port_movel = ?, dt_venda = ?, protocolo_contrato = ? WHERE id = ?");
            
            pst.setInt(1, mod.getFuncionario_id());
            pst.setInt(2, mod.getCliente_id());
            pst.setString(3, mod.getFormapagto());
            pst.setString(4, mod.getIccid());
            pst.setString(5, mod.getImei());
            pst.setString(6, mod.getTipo_venda());
            pst.setString(7, mod.getPort_movel());
            pst.setString(8, mod.getPort_fixo());
            pst.setString(9, mod.getNtc_fixo());
            pst.setString(10, mod.getNtc_movel());
            pst.setString(11, mod.getNtc_movel_portado());
            pst.setString(12, mod.getOperadora_port_movel());
            pst.setString(13, mod.getOperadora_port_fixo());
            pst.setString(14, mod.getDt_port_fixo());
            pst.setString(15, mod.getDt_port_movel());
            
            String venda_dia = mod.getDt_venda().substring(0, 2);
            String venda_mes = mod.getDt_venda().substring(3, 5);
            String venda_ano = mod.getDt_venda().substring(6);
            String dt_vendaBD = venda_ano + "-" + venda_mes + "-" + venda_dia;
            pst.setString(16, dt_vendaBD);
            
            pst.setString(17, mod.getProtocolo_contrato());
            pst.setInt(18, mod.getId());
            pst.execute();      
            
            JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível finalizar a venda.\nERRO: "+ex);
        }
        
        connVendas.desconecta();
    }
    
    public void adicionaProduto(VendasModel mod) {
        connVendas.conexao();
        
        try {
            PreparedStatement pst = connVendas.conn.prepareStatement("INSERT INTO vendas_produtos (venda_id, produto_id, created) VALUES (?, ?, NOW())");
            
            pst.setInt(1, mod.getId());
            pst.setInt(2, mod.getProduto_id());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Produto adicionado.");
            
            connVendas.desconecta();
            
        } catch (SQLException ex) {
            connVendas.desconecta();
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o Produto."+ ex);
        }
    }
    
    public void adicionaServico(VendasModel mod) {
        connVendas.conexao();
        
        try {
            PreparedStatement pst = connVendas.conn.prepareStatement("INSERT INTO vendas_servicos (venda_id, servico_id, created) VALUES (?, ?, NOW())");
            
            pst.setInt(1, mod.getId());
            pst.setInt(2, mod.getServico_id());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Serviço adicionado.");
            
            connVendas.desconecta();
            
        } catch (SQLException ex) {
            connVendas.desconecta();
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o Serviço."+ ex);
        }
    }
    
    public String buscaCategProduto(String id) {
        connVendas.conexao();
        connVendas.executaSQL("SELECT * FROM produtos WHERE id ='"+id+"'");
        try {
            connVendas.rs.first();
            categProduto = connVendas.rs.getString("categoria");
            connVendas.desconecta();
        } catch (SQLException ex) {
            connVendas.desconecta();
            JOptionPane.showMessageDialog(null, "Erro ao buscar categoria do produto." +ex);
        }
        return categProduto;
    }
    
    public void cancelaVenda(VendasModel mod) {
        connVendas.conexao();
        
        try {
            PreparedStatement pst = connVendas.conn.prepareStatement("DELETE FROM vendas WHERE id = ?");
            
            pst.setInt(1, mod.getId());
            pst.execute();
            
            connVendas.desconecta();
            JOptionPane.showMessageDialog(null, "Venda cancelada com sucesso.");
            
        } catch (SQLException ex) {
            connVendas.desconecta();
            JOptionPane.showMessageDialog(null, "Não foi possível cancelar a venda.\nERRO: " + ex);
        }
    }
}
