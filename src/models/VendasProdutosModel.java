
package models;

/**
 *
 * @author Bruno Duarte
 * @email bduarte2010@gmail.com
 */
public class VendasProdutosModel {

    private int id;
    private int venda_id;
    private int produto_id;
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
     * @return the venda_id
     */
    public int getVenda_id() {
        return venda_id;
    }

    /**
     * @param venda_id the venda_id to set
     */
    public void setVenda_id(int venda_id) {
        this.venda_id = venda_id;
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
    
}
