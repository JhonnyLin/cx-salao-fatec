
import ClasseBD.ConexaoBD;
import javax.swing.JOptionPane;

public class servprod extends javax.swing.JFrame {

//  ve como funciona o evento para o % em tempo real
    
    public servprod() {
        initComponents();
        txtCod.setEnabled(false);
        txtPercent.setEnabled(false);
        mscVlrComp.setEnabled(false);
    }
    String [] dados = new String[3];
    boolean serv = true;
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxDescricao = new javax.swing.JTextArea();
        mscVlrComp = new javax.swing.JFormattedTextField();
        txtPercent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnAddProdAserv = new javax.swing.JButton();
        txtVlVenda = new javax.swing.JTextField();

        jFormattedTextField3.setText("jFormattedTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(595, 425));
        setPreferredSize(new java.awt.Dimension(595, 425));
        getContentPane().setLayout(null);

        jLabel1.setText("Cód:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 80, 70, 14);
        getContentPane().add(txtCod);
        txtCod.setBounds(60, 100, 76, 28);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(180, 100, 340, 28);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 80, 110, 14);

        atxDescricao.setColumns(20);
        atxDescricao.setRows(5);
        jScrollPane1.setViewportView(atxDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 220, 460, 96);

        mscVlrComp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        getContentPane().add(mscVlrComp);
        mscVlrComp.setBounds(60, 160, 100, 29);
        getContentPane().add(txtPercent);
        txtPercent.setBounds(420, 160, 61, 29);

        jLabel3.setText("Valor de compra:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 130, 140, 26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("%");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 160, 18, 22);

        jLabel5.setText("Valor de Venda:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 140, 130, 14);

        jLabel6.setText("Percentual");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 140, 100, 14);

        jLabel7.setText("Descrição:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 200, 80, 14);

        jButton2.setText("Enviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 340, 110, 23);

        jButton3.setText("Cancelar");
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 340, 110, 23);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Serviço");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(60, 30, 120, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Produto");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(180, 30, 93, 23);

        btnAddProdAserv.setText("jButton1");
        getContentPane().add(btnAddProdAserv);
        btnAddProdAserv.setBounds(530, 20, 40, 40);

        txtVlVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVlVendaActionPerformed(evt);
            }
        });
        getContentPane().add(txtVlVenda);
        txtVlVenda.setBounds(240, 160, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        txtPercent.setEnabled(true);
        mscVlrComp.setEnabled(true);
        serv = false;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        txtPercent.setEnabled(false);
        mscVlrComp.setEnabled(false);
        serv = true;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //pega os dados da caixa de texto
        dados[0] = txtNome.getText();
        dados[1] = txtVlVenda.getText();
        dados[2] = atxDescricao.getText();
         String a,f;
                 
        if(serv){
            a = "INSERT INTO servprod (bl_Serv, nm_ServProd, ds_ServProd, vl_ServProd)";
            f = "VALUES("+ serv +",'"+dados[0]+"','"+dados[2]+"','"+dados[1]+"')";
            System.out.println(a+f);
        }else{
           a = "INSERT INTO servprod (bl_Serv, nm_ServProd, ds_ServProd, vl_ServProd, qt_Prod) ";
           String b = JOptionPane.showInputDialog("Quantidade em estoque", 0);
           f = "VALUES("+ serv +",'"+dados[0]+"','"+dados[2]+"','"+dados[1]+"','"+b+"')";
           System.out.println(a+f);
        }
        ConexaoBD.executar(a+f);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtVlVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVlVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVlVendaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new servprod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxDescricao;
    private javax.swing.JButton btnAddProdAserv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField mscVlrComp;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPercent;
    private javax.swing.JTextField txtVlVenda;
    // End of variables declaration//GEN-END:variables
}
