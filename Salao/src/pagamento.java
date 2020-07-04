import classe.Imagens;
import javax.swing.JOptionPane;
public class pagamento extends javax.swing.JFrame {

    public pagamento() {
        initComponents();
        //coloca as imgens
        inserirImg();
        configinicializacao();
    }
    
    boolean x =  true;
    String valor;
    Imagens imge = new Imagens();
    double acomulado = 0;
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        cbxTotal = new javax.swing.JCheckBox();
        btnFiado = new javax.swing.JButton();
        btnDinheiro = new javax.swing.JButton();
        btnCartao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamento");
        setMinimumSize(new java.awt.Dimension(421, 266));
        setResizable(false);
        getContentPane().setLayout(null);

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValor.setText("VALOR");
        getContentPane().add(lblValor);
        lblValor.setBounds(70, 60, 60, 40);
        getContentPane().add(txtValor);
        txtValor.setBounds(140, 60, 140, 40);

        cbxTotal.setSelected(true);
        cbxTotal.setText("TOTAL");
        cbxTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTotalActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTotal);
        cbxTotal.setBounds(290, 70, 81, 23);

        btnFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFiado);
        btnFiado.setBounds(270, 140, 73, 70);

        btnDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinheiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnDinheiro);
        btnDinheiro.setBounds(70, 140, 70, 70);

        btnCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartao);
        btnCartao.setBounds(170, 140, 73, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTotalActionPerformed
        estado();
    }//GEN-LAST:event_cbxTotalActionPerformed

    private void btnDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinheiroActionPerformed
        pag();
    }//GEN-LAST:event_btnDinheiroActionPerformed

    private void btnCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoActionPerformed
        pag();
    }//GEN-LAST:event_btnCartaoActionPerformed

    private void btnFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiadoActionPerformed
        JOptionPane.showMessageDialog(null, "modulo ainda n disponivel");
    }//GEN-LAST:event_btnFiadoActionPerformed
    
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
    
    //faz a subitração do valor
    public void pag(){
        //pega o valor que veio do frentecx e transforma em double(vem texto)
        double x = Double.parseDouble(valor);
        //pega um a variavel e soma o valor acomulado mais oq tem no txt pra saber o valor total pago
        double y = acomulado+= Double.parseDouble(txtValor.getText());
        //se o valor total - valor for maior que zero quer dizer que ainda falta uma quantia
        if(x-y > 0){
            //devolve o valor da operação "0.00"
            txtValor.setText(x-y+"");
        }else{
            //printa o valor do troco
            JOptionPane.showMessageDialog(null, "Troco: R$ "+ ((x-y)*-1));
            //zera o acomulado
            acomulado = 0.00;
            txtValor.setText(acomulado+"");
        }
        configinicializacao();
        ativo();
    }
    
    //insere o valor no campo
    public void setValor(String valor){
        txtValor.setText(valor);
        this.valor = valor;
    }
    
    //config do fram
    public void configinicializacao(){
        x =  true;
        cbxTotal.setSelected(x);
        estado();
        
    }
    
    //alterna o valor de x que determina se o txt fica ativo ou não
    public void estado(){
        //se for vdd troca pra false e bloquei
        if(x){
            x = false;
            txtValor.setEnabled(x);
        //se for falsso troca pra true e libera
        }else{
            x = true;
            txtValor.setEnabled(x);
        }
    }
    
    //se o valor é igual a zero ele fecha o pagamentos
    public void ativo(){
        if(txtValor.getText().equals("0.0")){
            dispose();
        }
    }
    
    //insere imagens do frame
    public void inserirImg(){
        btnDinheiro.setIcon(imge.img("/img/money.png"));
        btnCartao.setIcon(imge.img("/img/pay.png"));
        btnFiado.setIcon(imge.img("/img/bill.png"));
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartao;
    private javax.swing.JButton btnDinheiro;
    private javax.swing.JButton btnFiado;
    private javax.swing.JCheckBox cbxTotal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
