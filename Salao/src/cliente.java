import ClasseBD.ConexaoBD;
import classe.Imagens;
public class cliente extends javax.swing.JFrame {

    
    public cliente() {
        initComponents();
        inserirImg();
    }
    //area de declaraçoes
    Imagens imge = new Imagens();
    String texto;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNmCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmaiCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxEndCliente = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        mcrTelClente = new javax.swing.JFormattedTextField();
        rbtFeminino = new javax.swing.JRadioButton();
        rbtMasculino = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnPesqCod = new javax.swing.JButton();
        btnPesqNome = new javax.swing.JButton();
        btnPesqTel = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        setMinimumSize(new java.awt.Dimension(570, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 121, 148);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 70, 90, 20);
        getContentPane().add(txtNmCliente);
        txtNmCliente.setBounds(150, 90, 320, 30);

        jLabel3.setText("Codigo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 20, 110, 20);
        getContentPane().add(txtCodCliente);
        txtCodCliente.setBounds(150, 40, 60, 30);

        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 120, 110, 20);

        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 170, 100, 20);
        getContentPane().add(txtEmaiCliente);
        txtEmaiCliente.setBounds(150, 190, 380, 30);

        atxEndCliente.setColumns(20);
        atxEndCliente.setRows(5);
        jScrollPane1.setViewportView(atxEndCliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 250, 380, 96);

        jLabel6.setText("Endereço");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 230, 80, 20);

        try {
            mcrTelClente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)###-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(mcrTelClente);
        mcrTelClente.setBounds(150, 140, 320, 30);

        gbtSexo.add(rbtFeminino);
        rbtFeminino.setSelected(true);
        rbtFeminino.setText("Feminino");
        rbtFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemininoActionPerformed(evt);
            }
        });
        getContentPane().add(rbtFeminino);
        rbtFeminino.setBounds(30, 180, 110, 23);

        gbtSexo.add(rbtMasculino);
        rbtMasculino.setText("Masculino");
        rbtMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(rbtMasculino);
        rbtMasculino.setBounds(30, 220, 110, 23);

        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(480, 20, 50, 50);

        btnPesqCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCodActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqCod);
        btnPesqCod.setBounds(230, 40, 26, 26);

        btnPesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqNomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqNome);
        btnPesqNome.setBounds(500, 90, 26, 26);

        btnPesqTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqTelActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesqTel);
        btnPesqTel.setBounds(500, 140, 26, 26);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(340, 380, 90, 30);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(150, 380, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        inicializar(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void rbtFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFemininoActionPerformed
       lblIcon.setIcon(imge.img("/img/woman.png"));
    }//GEN-LAST:event_rbtFemininoActionPerformed

    private void rbtMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMasculinoActionPerformed
       lblIcon.setIcon(imge.img("/img/person.png"));
    }//GEN-LAST:event_rbtMasculinoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        
        String query = inserirCli();
        //só pra teste
        ConexaoBD.connect();
        ConexaoBD.executar(query);
        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCodActionPerformed
        texto = txtCodCliente.getText();
        String query = pesquisaCli(texto,"idcliente");
        ConexaoBD.connect();
        ConexaoBD.rsexecutar(query);
    }//GEN-LAST:event_btnPesqCodActionPerformed

    private void btnPesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqNomeActionPerformed
        texto = txtNmCliente.getText();
        pesquisaCli(texto,"nm_Cliente");
    }//GEN-LAST:event_btnPesqNomeActionPerformed

    private void btnPesqTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqTelActionPerformed
        texto = mcrTelClente.getText();
        pesquisaCli(texto,"cd_Telefone");
    }//GEN-LAST:event_btnPesqTelActionPerformed

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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }
    
    public String pesquisaCli(String texto, String campo){
        String q = "SELECT * FROM cliente WHERE  ";
        String query = q+campo+"= '"+texto+"'";
        System.out.println(query);
        return query;
    }
    
    //quary pronta
    public String inserirCli(){
        //definindo a tabela e os campos para inserir
        String q = "INSERT INTO cliente(nm_Cliente,cd_Telefone,ds_Email,ds_Endereco,bl_Sexo_F) ";
        //declaração dos campos
        String nm_Cliente, cd_Telefone, ds_Email, ds_Endereco;
        Boolean bl_Sexo_F;
        //pegando o valor das caixas de texto
        nm_Cliente = txtNmCliente.getText();
        cd_Telefone = mcrTelClente.getText();
        ds_Email= txtEmaiCliente.getText();
        ds_Endereco = atxEndCliente.getText();
        bl_Sexo_F = rbtFeminino.isSelected();
        //colocando as variaveis na quary
        String a = "VALUES('"+ nm_Cliente +"','"+ cd_Telefone +"','"+ ds_Email +"','"+ ds_Endereco +"',"+ bl_Sexo_F+")";
        //teste
        System.out.println(q+a);
        return q+a;
    }
    
    //habilitando campos de acordo com a ação do usuario
    public void inicializar(boolean psq){
        btnAdd.setVisible(psq);
        btnPesqCod.setVisible(psq);
        txtCodCliente.setEnabled(psq);
        btnPesqTel.setVisible(psq); 
        rbtFemininoActionPerformed(null);
        if(psq){
            txtEmaiCliente.setEnabled(false);
            atxEndCliente.setEditable(false);
        }else{
            txtEmaiCliente.setEnabled(true);
            atxEndCliente.setEditable(true);
        }        
    }
    
    //inserindo imagens nos componentes do frame
     public void inserirImg(){
        btnPesqCod.setIcon(imge.img("/img/buscar16.png"));
        btnPesqNome.setIcon(imge.img("/img/buscar16.png"));
        btnPesqTel.setIcon(imge.img("/img/buscar16.png"));
        btnAdd.setIcon(imge.img("/img/adicionar.png"));
        btnEnviar.setIcon(imge.img("/img/verifica.png"));
        btnCancelar.setIcon(imge.img("/img/remover.png"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxEndCliente;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnPesqNome;
    private javax.swing.JButton btnPesqTel;
    private javax.swing.ButtonGroup gbtSexo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JFormattedTextField mcrTelClente;
    private javax.swing.JRadioButton rbtFeminino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtEmaiCliente;
    private javax.swing.JTextField txtNmCliente;
    // End of variables declaration//GEN-END:variables
}
