
package models;

/**
 *
 * @author Bruno Duarte
 * @email bduarte2010@gmail.com
 */
public class ProdutosModel {
    
    private int id;
    private int fornecedor_id;
    private String nome;
    private String descricao;
    private String categoria;
    private String fabricante;
    private String cor;
    private String rede;
    private String sistema_operacional;
    private int qte_minima;
    private Double valor;
    private String foto;
    private String status;
    private String pesquisa;

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
     * @return the fornecedor_id
     */
    public int getFornecedor_id() {
        return fornecedor_id;
    }

    /**
     * @param fornecedor_id the fornecedor_id to set
     */
    public void setFornecedor_id(int fornecedor_id) {
        this.fornecedor_id = fornecedor_id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the rede
     */
    public String getRede() {
        return rede;
    }

    /**
     * @param rede the rede to set
     */
    public void setRede(String rede) {
        this.rede = rede;
    }

    /**
     * @return the sistema_operacional
     */
    public String getSistema_operacional() {
        return sistema_operacional;
    }

    /**
     * @param sistema_operacional the sistema_operacional to set
     */
    public void setSistema_operacional(String sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }

    /**
     * @return the qte_minima
     */
    public int getQte_minima() {
        return qte_minima;
    }

    /**
     * @param qte_minima the qte_minima to set
     */
    public void setQte_minima(int qte_minima) {
        this.qte_minima = qte_minima;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
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
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
