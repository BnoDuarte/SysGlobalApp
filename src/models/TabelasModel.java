
package models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Bruno Duarte
 * @email bduarte2010@gmail.com
 */
public class TabelasModel extends AbstractTableModel {
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public TabelasModel(ArrayList lin, String[] col) {
        setLinhas(lin);
        setColunas(col);
    }
    
    public ArrayList getLinhas() {
        return linhas;
    }
    
    public void setLinhas(ArrayList dados) {
        linhas = dados;
    }
    
    public String[] getColunas() {
        return colunas;
    }
    
    public void setColunas(String[] nomes) {
        colunas = nomes;
    }
    
    public int getColumnCount() {
        return colunas.length;
    }
    
    public int getRowCount() {
        return linhas.size();
    }
    
    public String getColumnName(int numCol) {
        return colunas[numCol];
    }
    
    public Object getValueAt(int numLin, int numCol) {
        Object[] linha = (Object[])getLinhas().get(numLin);
        
        return linha[numCol];
    }
    
    public void removeRow(int row) {
        getLinhas().remove(0);
    // informa a jtable que houve dados deletados passando a   
        // linha reovida  
        fireTableRowsDeleted(row, row);
    }
}
