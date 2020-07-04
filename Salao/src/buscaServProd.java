
import ClasseBD.ConexaoBD;
import classe.Imagens;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

//cod pode fazer pra pegar linha pelo numero do cod
public class buscaServProd extends javax.swing.JFrame {

    public buscaServProd() {
        initComponents();
        inserirImg();
    }
    Imagens imge = new Imagens();
    DefaultTableModel dtm = new DefaultTableModel();
    ResultSet rsresultado ;
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
        setMinimumSize(new java.awt.Dimension(700, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        buttonGroup1.add(rbnServ);
        rbnServ.setText("Serviços");
        rbnServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnServActionPerformed(evt);
            }
        });
        getContentPane().add(rbnServ);
        rbnServ.setBounds(30, 20, 110, 23);

        buttonGroup1.add(rbnProd);
        rbnProd.setText("Produtos");
        rbnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnProdActionPerformed(evt);
            }
        });
        getContentPane().add(rbnProd);
        rbnProd.setBounds(180, 20, 120, 23);
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
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(170, 430, 100, 30);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(390, 430, 100, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqNomeActionPerformed
        String texto = txtNome.getText();
    }//GEN-LAST:event_btnPesqNomeActionPerformed

    private void btnPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCodActionPerformed
        String texto = txtCod.getText();
        pCod(texto);
    }//GEN-LAST:event_btnPesqCodActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void rbnServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnServActionPerformed
        criarTabelas();
    }//GEN-LAST:event_rbnServActionPerformed

    private void rbnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnProdActionPerformed
        criarTabelas1();
    }//GEN-LAST:event_rbnProdActionPerformed

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
    //minhas classes
   
    //pesquisar na tabela
    public void pCod(String a){
        
        
    }
    
    public void pNome(String a){
    
    
    }
    
    //inserindo imagens nos componentes do frame
     public void inserirImg(){
        btnPesqCod.setIcon(imge.img("/img/buscar16.png"));
        btnPesqNome.setIcon(imge.img("/img/buscar16.png"));
        btnEnviar.setIcon(imge.img("/img/verifica.png"));
        btnCancelar.setIcon(imge.img("/img/remover.png"));
    }
     
    //criei dos metodos para conseguir ativar de outra classe
    //dtm esta se sobreescrevendo, assim consigo mudar a tabela pra serviço ou produto
    public void criarTabelas(){
        String qServ = "SELECT cd_ServProd, nm_ServProd, ds_ServProd, vl_ServProd FROM servprod WHERE bl_Serv= '1'";
        //prepara model para tabela
        dtm = new DefaultTableModel();
        tblServProd.setModel(dtm);
        //qtd colunas
        String [] nomes = {"Cód", "Nome", "Descrição", "Valor"};  
        //add as colunas na tabela
        for(int i =0; i<nomes.length; i++){
            //adiciona os nomes no dtm que é o model
            //ele é quem adiciona os dados na tabela
            dtm.addColumn(nomes[i]);
        }
        inserirST(qServ, nomes.length);
    }
    
    private void inserirST(String q, int col){
        
        try{
            //a execução do comando será feita pelo método rsexecutar, na classe AcesspBD
            //o retorno do metodo sera um Resulset que sera armazenado em rsresultado
            
            rsresultado = ConexaoBD.rsexecutar(q);
           
            //adicionar as linhas
            //array que guarda os dados de cada linha
            String [] row = new String[col];
            while(rsresultado.next()){
                for(int i=0;i<row.length;i++){
                    //adcionaos dados no array
                    row[i] = rsresultado.getString(i+1);
                }
                //adicionar a linha toda na tabela
                dtm.addRow(row);
            }
            }catch(Exception e){e.printStackTrace();}  
        }
     
    public void criarTabelas1(){
        String qProd = "SELECT cd_ServProd, qt_Prod,nm_ServProd, ds_ServProd, vl_ServProd FROM servprod WHERE bl_Serv= '0'";
        dtm = new DefaultTableModel();
        tblServProd.setModel(dtm);
        String [] nomes = {"Cód","Qntd", "Nome", "Descrição", "Valor", "valor Estoque"}; 
        for(int i =0; i<nomes.length; i++){
            dtm.addColumn(nomes[i]);
        } 
        inserirSP(qProd, nomes.length);
    }
    
    private void inserirSP(String q, int col){
        try{
            rsresultado = ConexaoBD.rsexecutar(q);
            String [] row = new String[col];
            while(rsresultado.next()){
                for(int i=0;i<col-1;i++){
                   row[i] = rsresultado.getString(i+1);
                }
                int x = Integer.parseInt(row[1])*Integer.parseInt(row[4]);
                row[row.length-1] = ""+x;
                dtm.addRow(row);
            }
        }catch(Exception e){e.printStackTrace();}  
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
    public javax.swing.JRadioButton rbnProd;
    public javax.swing.JRadioButton rbnServ;
    private javax.swing.JTable tblServProd;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
