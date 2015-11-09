
package views;

import configs.ConectaBanco;
import javax.swing.ImageIcon;

/**
 * @author Bruno Duarte
 * @email  bduarte2010@gmail.com
 */
public class SysGlobalAppView extends javax.swing.JFrame {
   
    ConectaBanco conecta = new ConectaBanco();
    
    /**
     * Creates new form SysGlobalAppView
     */
    public SysGlobalAppView() {
        initComponents();
        conecta.conexao();
        
        this.setIconImage(new ImageIcon(getClass().getResource("../imagens/icones/global2-32px.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuComercial = new javax.swing.JMenu();
        jMenuOperacional = new javax.swing.JMenu();
        jMenuFornecedores = new javax.swing.JMenuItem();
        jMenuProdutos = new javax.swing.JMenuItem();
        jMenuServiços = new javax.swing.JMenuItem();
        jMenuRH = new javax.swing.JMenu();
        jMenuCargos = new javax.swing.JMenuItem();
        jMenuFiliais = new javax.swing.JMenuItem();
        jMenuFuncionarios = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        btnMenuSair = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysGlobal - Sistema de Gerenciamento de Revendas Telecom");
        setExtendedState(MAXIMIZED_BOTH);
        setSize(new java.awt.Dimension(800, 600));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 70));

        jMenuComercial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/comercial32px.png"))); // NOI18N
        jMenuComercial.setText("Comercial");
        jMenuComercial.setBorderPainted(true);
        jMenuComercial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuComercial.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuComercial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenuComercial);

        jMenuOperacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/settings32px.png"))); // NOI18N
        jMenuOperacional.setText("Operacional");
        jMenuOperacional.setBorderPainted(true);
        jMenuOperacional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuOperacional.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuOperacional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuFornecedores.setText("Fornecedores");
        jMenuFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFornecedoresActionPerformed(evt);
            }
        });
        jMenuOperacional.add(jMenuFornecedores);

        jMenuProdutos.setText("Produtos");
        jMenuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutosActionPerformed(evt);
            }
        });
        jMenuOperacional.add(jMenuProdutos);

        jMenuServiços.setText("Serviços");
        jMenuServiços.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuServiçosActionPerformed(evt);
            }
        });
        jMenuOperacional.add(jMenuServiços);

        jMenuBar1.add(jMenuOperacional);

        jMenuRH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/rh32px.png"))); // NOI18N
        jMenuRH.setText("Rec. Humanos");
        jMenuRH.setToolTipText("");
        jMenuRH.setBorderPainted(true);
        jMenuRH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuRH.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuRH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuCargos.setText("Cargos");
        jMenuCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCargosActionPerformed(evt);
            }
        });
        jMenuRH.add(jMenuCargos);

        jMenuFiliais.setText("Filiais");
        jMenuFiliais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFiliaisActionPerformed(evt);
            }
        });
        jMenuRH.add(jMenuFiliais);

        jMenuFuncionarios.setText("Funcionários");
        jMenuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFuncionariosActionPerformed(evt);
            }
        });
        jMenuRH.add(jMenuFuncionarios);

        jMenuBar1.add(jMenuRH);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/graficos32px.png"))); // NOI18N
        jMenu10.setText("Relatórios");
        jMenu10.setBorderPainted(true);
        jMenu10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu10.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenu10);

        btnMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/sair32px.png"))); // NOI18N
        btnMenuSair.setText("Sair");
        btnMenuSair.setBorderPainted(true);
        btnMenuSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenuSair.setMargin(new java.awt.Insets(20, 20, 20, 20));
        btnMenuSair.setName("menuSair"); // NOI18N
        btnMenuSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1080, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnMenuSairMouseClicked

    private void jMenuCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCargosActionPerformed
        CargosView frm = new CargosView();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuCargosActionPerformed

    private void jMenuFiliaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFiliaisActionPerformed
        FiliaisView filiais = new FiliaisView();
        filiais.setVisible(true);
    }//GEN-LAST:event_jMenuFiliaisActionPerformed

    private void jMenuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFuncionariosActionPerformed
        FuncionariosView funcionarios = new FuncionariosView();
        funcionarios.setVisible(true);
    }//GEN-LAST:event_jMenuFuncionariosActionPerformed

    private void jMenuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutosActionPerformed
        ProdutosView produtos = new ProdutosView();
        produtos.setVisible(true);
    }//GEN-LAST:event_jMenuProdutosActionPerformed

    private void jMenuFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFornecedoresActionPerformed
        FornecedoresView fornecedores = new FornecedoresView();
        fornecedores.setVisible(true);
    }//GEN-LAST:event_jMenuFornecedoresActionPerformed

    private void jMenuServiçosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuServiçosActionPerformed
        ServicosView servicos = new ServicosView();
        servicos.setVisible(true);
    }//GEN-LAST:event_jMenuServiçosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SysGlobalAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SysGlobalAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SysGlobalAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SysGlobalAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SysGlobalAppView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnMenuSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCargos;
    private javax.swing.JMenu jMenuComercial;
    private javax.swing.JMenuItem jMenuFiliais;
    private javax.swing.JMenuItem jMenuFornecedores;
    private javax.swing.JMenuItem jMenuFuncionarios;
    private javax.swing.JMenu jMenuOperacional;
    private javax.swing.JMenuItem jMenuProdutos;
    private javax.swing.JMenu jMenuRH;
    private javax.swing.JMenuItem jMenuServiços;
    // End of variables declaration//GEN-END:variables
}
