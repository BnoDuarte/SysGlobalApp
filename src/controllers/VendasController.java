
package controllers;

import configs.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.VendasModel;

/**
 *
 * @author Bruno Duarte
 * @email bduarte2010@gmail.com
 */
public class VendasController {
    
    ConectaBanco connVendas = new ConectaBanco();
    
    public void Inserir(VendasModel mod) {
        connVendas.conexao();
        
        try {
            PreparedStatement pst = connVendas.conn.prepareStatement("INSERT INTO vendas (funcionario_id, cliente_id, produto_id, servico_id, formapagto, iccid, imei, tipo_venda, port_movel, port_fixo, ntc_fixo, ntc_movel, ntc_movel_portado, operadora_port_movel, operadora_port_fixo, dt_port_fixo, dt_port_movel, dt_venda, protocolo_contrato, status, created) VALUES (?, ?, 1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())");
            
            pst.setInt(1, mod.getFuncionario_id());
            pst.setInt(2, mod.getCliente_id());
            pst.setInt(3, mod.getProduto_id());
            pst.setInt(4, mod.getServico_id());
            pst.setString(5, mod.getFormapagto());
            pst.setInt(6, mod.getIccid());
            pst.setInt(7, mod.getImei());
            pst.setString(8, mod.getTipo_venda());
            pst.setString(9, mod.getPort_movel());
            pst.setString(10, mod.getPort_fixo());
            pst.setString(11, mod.getNtc_fixo());
            pst.setString(12, mod.getNtc_movel());
            pst.setString(13, mod.getNtc_movel_portado());
            pst.setString(14, mod.getOperadora_port_movel());
            pst.setString(15, mod.getOperadora_port_fixo());
            pst.setString(16, mod.getDt_port_fixo());
            pst.setString(17, mod.getDt_port_movel());
            
            String venda_dia = mod.getDt_venda().substring(0, 2);
            String venda_mes = mod.getDt_venda().substring(3, 5);
            String venda_ano = mod.getDt_venda().substring(6);
            String dt_vendaBD = venda_ano + "-" + venda_mes + "-" + venda_dia;
            pst.setString(18, dt_vendaBD);
            
            pst.setString(19, mod.getProtocolo_contrato());
            pst.setString(20, mod.getStatus());
            pst.execute();      
            
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar os dados.\nERRO: "+ex);
        }
        
        connVendas.desconecta();
    }
}
