
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
            PreparedStatement pst = connVendas.conn.prepareStatement("INSERT INTO vendas (funcionario_id, cliente_id, produto_id, servico_id, formapagto, iccid, imei, tipo_venda, port_movel, port_fixo, ntc_fixo, ntc_movel, ntc_movel_portado, operadora_portada, dt_port_fixo, dt_port_movel, dt_venda, protocolo_contrato, status, created) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())");
            
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
            pst.setString(14, mod.getOperadora_portada());
            pst.setDate(15, mod.getDt_port_fixo());
            pst.setDate(16, mod.getDt_port_movel());
            pst.setDate(17, mod.getDt_venda());
            pst.setString(18, mod.getProtocolo_contrato());
            pst.setString(19, mod.getStatus());
            pst.execute();      
            
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados.\nERRO: "+ex);
        }
        
        connVendas.desconecta();
    }
}
