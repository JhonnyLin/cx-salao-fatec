
import classe.Imagens;


public class buscaServProd extends javax.swing.JFrame {

    public buscaServProd() {
        initComponents();
        inserirImg();
    }
     Imagens imge = new Imagens();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbnServ = new javax.swing.JRadioButton();
        rbnProd = new javax.swing.JRadioButton();
        txtCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPesqNome = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnPesqCod = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServProd = new javax.swing.JTable();
        btnEnviar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca");
        setMaximumSize(new java.awt.Dimension(700, 550));
        setMinimumSize(new java.awt.Dimension(700, 550));
        getContentPane().setLayout(null);

        buttonGroup1.add(rbnServ);
        rbnServ.setSelected(true);
        rbnServ.setText("Serviços");
        getContentPane().add(rbnServ);
        rbnServ.setBounds(30, 20, 110, 23);

        buttonGroup1.add(rbnProd);
        rbnProd.setText("Produtos");
        getContentPane().add(rbnProd);
        rbnProd.setBounds(180, 20, 120, 23);

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        getContentPane().add(txtCod);
        txtCod.setBounds(30, 80, 90, 30);

        jLabel1.setText("Cód:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 90, 14);

        btnPesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqNomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqNome);
        btnPesqNome.setBounds(610, 80, 26, 26);
        getContentPane().add(txtNome);
        txtNome.setBounds(190, 80, 410, 30);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 60, 210, 14);

        btnPesqCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCodActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqCod);
        btnPesqCod.setBounds(130, 80, 26, 26);

        tblServProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblServProd.setToolTipText("");
        jScrollPane1.setViewportView(tblServProd);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 142, 610, 260);

        btnEnviar.setText("Enviar");
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(200, 433, 100, 30);

        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(400, 433, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqNomeActionPerformed
        String texto = txtNome.getText();
    }//GEN-LAST:event_btnPesqNomeActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void btnPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCodActionPerformed
        String texto = txtCod.getText();
    }//GEN-LAST:event_btnPesqCodActionPerformed

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
            java.util.logging.Logger.getLogger(buscaServProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscaServProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscaServProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscaServProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscaServProd().setVisible(true);
            }
        });
    }
    //inserindo imagens nos componentes do frame
     public void inserirImg(){
        btnPesqCod.setIcon(imge.img("/img/buscar16.png"));
        btnPesqNome.setIcon(imge.img("/img/buscar16.png"));
        btnEnviar.setIcon(imge.img("/img/verifica.png"));
        btnCancelar.setIcon(imge.img("/img/remover.png"));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnPesqNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbnProd;
    private javax.swing.JRadioButton rbnServ;
    private javax.swing.JTable tblServProd;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
