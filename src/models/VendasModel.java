
package models;

/**
 *
 * @author Bruno Duarte
 * @email bduarte2010@gmail.com
 */
public class VendasModel {

    private int id;
    private int funcionario_id;
    private int cliente_id;
    private int produto_id;
    private int servico_id;
    private String formapagto;
    private int iccid;
    private int imei;
    private String tipo_venda;
    private String port_movel;
    private String port_fixo;
    private String ntc_fixo;
    private String ntc_movel;
    private String ntc_movel_portado;
    private String operadora_port_movel;
    private String operadora_port_fixo;
    private String dt_port_fixo;
    private String dt_port_movel;
    private String dt_venda;
    private String protocolo_contrato;
    private String status;
    private String created;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the funcionario_id
     */
    public int getFuncionario_id() {
        return funcionario_id;
    }

    /**
     * @param funcionario_id the funcionario_id to set
     */
    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    /**
     * @return the cliente_id
     */
    public int getCliente_id() {
        return cliente_id;
    }

    /**
     * @param cliente_id the cliente_id to set
     */
    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    /**
     * @return the formapagto
     */
    public String getFormapagto() {
        return formapagto;
    }

    /**
     * @param formapagto the formapagto to set
     */
    public void setFormapagto(String formapagto) {
        this.formapagto = formapagto;
    }

    /**
     * @return the iccid
     */
    public int getIccid() {
        return iccid;
    }

    /**
     * @param iccid the iccid to set
     */
    public void setIccid(int iccid) {
        this.iccid = iccid;
    }

    /**
     * @return the imei
     */
    public int getImei() {
        return imei;
    }

    /**
     * @param imei the imei to set
     */
    public void setImei(int imei) {
        this.imei = imei;
    }

    /**
     * @return the tipo_venda
     */
    public String getTipo_venda() {
        return tipo_venda;
    }

    /**
     * @param tipo_venda the tipo_venda to set
     */
    public void setTipo_venda(String tipo_venda) {
        this.tipo_venda = tipo_venda;
    }

    /**
     * @return the port_movel
     */
    public String getPort_movel() {
        return port_movel;
    }

    /**
     * @param port_movel the port_movel to set
     */
    public void setPort_movel(String port_movel) {
        this.port_movel = port_movel;
    }

    /**
     * @return the port_fixo
     */
    public String getPort_fixo() {
        return port_fixo;
    }

    /**
     * @param port_fixo the port_fixo to set
     */
    public void setPort_fixo(String port_fixo) {
        this.port_fixo = port_fixo;
    }

    /**
     * @return the ntc_fixo
     */
    public String getNtc_fixo() {
        return ntc_fixo;
    }

    /**
     * @param ntc_fixo the ntc_fixo to set
     */
    public void setNtc_fixo(String ntc_fixo) {
        this.ntc_fixo = ntc_fixo;
    }

    /**
     * @return the ntc_movel
     */
    public String getNtc_movel() {
        return ntc_movel;
    }

    /**
     * @param ntc_movel the ntc_movel to set
     */
    public void setNtc_movel(String ntc_movel) {
        this.ntc_movel = ntc_movel;
    }

    /**
     * @return the ntc_movel_portado
     */
    public String getNtc_movel_portado() {
        return ntc_movel_portado;
    }

    /**
     * @param ntc_movel_portado the ntc_movel_portado to set
     */
    public void setNtc_movel_portado(String ntc_movel_portado) {
        this.ntc_movel_portado = ntc_movel_portado;
    }

    /**
     * @return the operadora_port_movel
     */
    public String getOperadora_port_movel() {
        return operadora_port_movel;
    }

    /**
     * @param operadora_port_movel the operadora_port_movel to set
     */
    public void setOperadora_port_movel(String operadora_port_movel) {
        this.operadora_port_movel = operadora_port_movel;
    }

    /**
     * @return the operadora_port_fixo
     */
    public String getOperadora_port_fixo() {
        return operadora_port_fixo;
    }

    /**
     * @param operadora_port_fixo the operadora_port_fixo to set
     */
    public void setOperadora_port_fixo(String operadora_port_fixo) {
        this.operadora_port_fixo = operadora_port_fixo;
    }

    /**
     * @return the dt_port_fixo
     */
    public String getDt_port_fixo() {
        return dt_port_fixo;
    }

    /**
     * @param dt_port_fixo the dt_port_fixo to set
     */
    public void setDt_port_fixo(String dt_port_fixo) {
        this.dt_port_fixo = dt_port_fixo;
    }

    /**
     * @return the dt_port_movel
     */
    public String getDt_port_movel() {
        return dt_port_movel;
    }

    /**
     * @param dt_port_movel the dt_port_movel to set
     */
    public void setDt_port_movel(String dt_port_movel) {
        this.dt_port_movel = dt_port_movel;
    }

    /**
     * @return the dt_venda
     */
    public String getDt_venda() {
        return dt_venda;
    }

    /**
     * @param dt_venda the dt_venda to set
     */
    public void setDt_venda(String dt_venda) {
        this.dt_venda = dt_venda;
    }

    /**
     * @return the protocolo_contrato
     */
    public String getProtocolo_contrato() {
        return protocolo_contrato;
    }

    /**
     * @param protocolo_contrato the protocolo_contrato to set
     */
    public void setProtocolo_contrato(String protocolo_contrato) {
        this.protocolo_contrato = protocolo_contrato;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the created
     */
    public String getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * @return the produto_id
     */
    public int getProduto_id() {
        return produto_id;
    }

    /**
     * @param produto_id the produto_id to set
     */
    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    /**
     * @return the servico_id
     */
    public int getServico_id() {
        return servico_id;
    }

    /**
     * @param servico_id the servico_id to set
     */
    public void setServico_id(int servico_id) {
        this.servico_id = servico_id;
    }

    
}
