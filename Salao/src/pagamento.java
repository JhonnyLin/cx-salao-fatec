import classe.Imagens;
public class pagamento extends javax.swing.JFrame {

    public pagamento() {
        initComponents();
        inserirImg();
    }
    Imagens imge = new Imagens();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPagamento = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        cbxTotal = new javax.swing.JCheckBox();
        btnFiado = new javax.swing.JButton();
        btnDinheiro = new javax.swing.JButton();
        btnCartao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(421, 266));
        setMinimumSize(new java.awt.Dimension(421, 266));
        getContentPane().setLayout(null);

        lblPagamento.setText("Pagamento");
        getContentPane().add(lblPagamento);
        lblPagamento.setBounds(10, 10, 120, 30);

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValor.setText("VALOR");
        getContentPane().add(lblValor);
        lblValor.setBounds(70, 60, 60, 40);
        getContentPane().add(txtValor);
        txtValor.setBounds(140, 60, 140, 40);

        cbxTotal.setText("TOTAL");
        cbxTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTotalActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTotal);
        cbxTotal.setBounds(290, 70, 81, 23);
        getContentPane().add(btnFiado);
        btnFiado.setBounds(270, 140, 73, 70);
        getContentPane().add(btnDinheiro);
        btnDinheiro.setBounds(70, 140, 70, 70);
        getContentPane().add(btnCartao);
        btnCartao.setBounds(170, 140, 73, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTotalActionPerformed
        //bloquear a caixa de texto
        
    }//GEN-LAST:event_cbxTotalActionPerformed
 public void inserirImg(){
        btnDinheiro.setIcon(imge.img("/img/money.png"));
        btnCartao.setIcon(imge.img("/img/pay.png"));
        btnFiado.setIcon(imge.img("/img/bill.png"));
        
 }
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
            java.util.logging.Logger.getLogger(pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartao;
    private javax.swing.JButton btnDinheiro;
    private javax.swing.JButton btnFiado;
    private javax.swing.JCheckBox cbxTotal;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
