
import javax.swing.JButton;
import javax.swing.JOptionPane;
import classe.Imagens;
import javax.swing.JFrame;

public class frenteCX extends javax.swing.JFrame {

    public frenteCX() {
        initComponents();
        inserirImg();
        txtNmCliente.setEnabled(false);
        txtCdCliente.setEnabled(false);
        txtTotais.setEnabled(false);
        rbtServicoActionPerformed(null);
    }
    Imagens imge =  new Imagens();
    cliente c = new cliente();
    fornecedor f = new fornecedor();
    pagamento p = new pagamento();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        gbnSP = new javax.swing.ButtonGroup();
        btnPerfil = new javax.swing.JButton();
        txtNmCliente = new javax.swing.JTextField();
        txtCdCliente = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        pnlMenuSP = new javax.swing.JPanel();
        btnRapido7 = new javax.swing.JButton();
        btnRapido2 = new javax.swing.JButton();
        btnRapido3 = new javax.swing.JButton();
        btnRapido4 = new javax.swing.JButton();
        btnRapido5 = new javax.swing.JButton();
        btnRapido6 = new javax.swing.JButton();
        btnRapido13 = new javax.swing.JButton();
        btnRapido9 = new javax.swing.JButton();
        btnRapido10 = new javax.swing.JButton();
        btnRapido1 = new javax.swing.JButton();
        btnRapido8 = new javax.swing.JButton();
        btnRapido12 = new javax.swing.JButton();
        btnRapido14 = new javax.swing.JButton();
        btnRapido15 = new javax.swing.JButton();
        btnRapido16 = new javax.swing.JButton();
        btnRapido11 = new javax.swing.JButton();
        btnRapido17 = new javax.swing.JButton();
        btnRapido18 = new javax.swing.JButton();
        btnRapido19 = new javax.swing.JButton();
        btnRapido20 = new javax.swing.JButton();
        PnlTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrinho = new javax.swing.JTable();
        rbtServico = new javax.swing.JRadioButton();
        rbtProdutos = new javax.swing.JRadioButton();
        btnPesquisaSP = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtTotais = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        lblInfSistema = new javax.swing.JLabel();
        bmnFrente = new javax.swing.JMenuBar();
        imnCliente = new javax.swing.JMenu();
        imnCadC = new javax.swing.JMenuItem();
        imnFiado = new javax.swing.JMenuItem();
        imnFornecedor = new javax.swing.JMenu();
        imnCadF = new javax.swing.JMenuItem();
        imnConF = new javax.swing.JMenuItem();
        imnPedidos = new javax.swing.JMenuItem();
        imnFerramentas = new javax.swing.JMenu();
        imnFechamentoC = new javax.swing.JMenuItem();
        imnHistorico = new javax.swing.JMenuItem();
        imnFinanceiro = new javax.swing.JMenuItem();
        imnConfig = new javax.swing.JMenu();
        imnServico = new javax.swing.JMenuItem();
        imnProdutos = new javax.swing.JMenuItem();
        imnUsuario = new javax.swing.JMenuItem();
        imnAjuda = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        txtNmCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNmClienteActionPerformed(evt);
            }
        });

        txtCdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdClienteActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        lblCod.setText("Codigo:");

        pnlMenuSP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRapido7.setText("jButton2");

        btnRapido2.setText("jButton3");

        btnRapido3.setText("jButton4");
        btnRapido3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido3ActionPerformed(evt);
            }
        });

        btnRapido4.setText("jButton5");

        btnRapido5.setText("jButton5");

        btnRapido6.setText("jButton7");

        btnRapido13.setText("jButton8");

        btnRapido9.setText("jButton9");

        btnRapido10.setText("jButton2");

        btnRapido1.setText("jButton1");

        btnRapido8.setText("jButton2");

        btnRapido12.setText("jButton2");

        btnRapido14.setText("jButton2");

        btnRapido15.setText("jButton2");

        btnRapido16.setText("jButton2");

        btnRapido11.setText("jButton2");

        btnRapido17.setText("jButton2");

        btnRapido18.setText("jButton2");

        btnRapido19.setText("jButton2");

        btnRapido20.setText("jButton2");

        javax.swing.GroupLayout pnlMenuSPLayout = new javax.swing.GroupLayout(pnlMenuSP);
        pnlMenuSP.setLayout(pnlMenuSPLayout);
        pnlMenuSPLayout.setHorizontalGroup(
            pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuSPLayout.createSequentialGroup()
                        .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRapido5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRapido1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                                .addComponent(btnRapido2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnRapido3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                                .addComponent(btnRapido6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRapido7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlMenuSPLayout.createSequentialGroup()
                        .addComponent(btnRapido9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRapido10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnRapido11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuSPLayout.createSequentialGroup()
                        .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                                .addComponent(btnRapido17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRapido18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                                .addComponent(btnRapido13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRapido14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRapido15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRapido19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRapido12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        pnlMenuSPLayout.setVerticalGroup(
            pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuSPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRapido2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRapido5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRapido6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRapido7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRapido8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRapido9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRapido13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRapido17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapido20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PnlTabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCarrinho);

        javax.swing.GroupLayout PnlTabelaLayout = new javax.swing.GroupLayout(PnlTabela);
        PnlTabela.setLayout(PnlTabelaLayout);
        PnlTabelaLayout.setHorizontalGroup(
            PnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTabelaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PnlTabelaLayout.setVerticalGroup(
            PnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        gbnSP.add(rbtServico);
        rbtServico.setSelected(true);
        rbtServico.setText("Serviços");
        rbtServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtServicoActionPerformed(evt);
            }
        });

        gbnSP.add(rbtProdutos);
        rbtProdutos.setText("Produtos");
        rbtProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtProdutosActionPerformed(evt);
            }
        });

        btnPesquisaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaSPActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("Total");

        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        lblInfSistema.setText("info do sistema");

        imnCliente.setText("Cliente");

        imnCadC.setText("Cadastro");
        imnCadC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadCActionPerformed(evt);
            }
        });
        imnCliente.add(imnCadC);

        imnFiado.setText("Fiados");
        imnCliente.add(imnFiado);

        bmnFrente.add(imnCliente);

        imnFornecedor.setText("Fornecedor");

        imnCadF.setText("Cadastro");
        imnCadF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadFActionPerformed(evt);
            }
        });
        imnFornecedor.add(imnCadF);

        imnConF.setText("Consulta");
        imnConF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnConFActionPerformed(evt);
            }
        });
        imnFornecedor.add(imnConF);

        imnPedidos.setText("Pedidos");
        imnFornecedor.add(imnPedidos);

        bmnFrente.add(imnFornecedor);

        imnFerramentas.setText("Ferramentas");

        imnFechamentoC.setText("Fechamento");
        imnFerramentas.add(imnFechamentoC);

        imnHistorico.setText("Historico");
        imnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnHistoricoActionPerformed(evt);
            }
        });
        imnFerramentas.add(imnHistorico);

        imnFinanceiro.setText("Financeiro");
        imnFerramentas.add(imnFinanceiro);

        bmnFrente.add(imnFerramentas);

        imnConfig.setText("Configurações");

        imnServico.setText("Serviço");
        imnConfig.add(imnServico);

        imnProdutos.setText("Produtos");
        imnConfig.add(imnProdutos);

        imnUsuario.setText("Usuarios");
        imnConfig.add(imnUsuario);

        imnAjuda.setText("Ajuda");
        imnConfig.add(imnAjuda);

        bmnFrente.add(imnConfig);

        setJMenuBar(bmnFrente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(txtNmCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlMenuSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtServico)
                        .addGap(54, 54, 54)
                        .addComponent(rbtProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisaSP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(8, 8, 8)
                                .addComponent(txtNmCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtServico)
                            .addComponent(rbtProdutos)
                            .addComponent(btnPesquisaSP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlMenuSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotais, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInfSistema)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNmClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNmClienteActionPerformed

    private void txtCdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdClienteActionPerformed

    private void btnRapido3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRapido3ActionPerformed

    private void imnCadCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadCActionPerformed
        chamadaFram(c);  
        c.inicializar(false);
    }//GEN-LAST:event_imnCadCActionPerformed

    private void imnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnHistoricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imnHistoricoActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        chamadaFram(c);
        c.inicializar(true);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void imnCadFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadFActionPerformed
        chamadaFram(f);
        f.inicializar(false);
    }//GEN-LAST:event_imnCadFActionPerformed

    private void imnConFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnConFActionPerformed
        chamadaFram(f);
        f.inicializar(true);
    }//GEN-LAST:event_imnConFActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        chamadaFram(p);
    }//GEN-LAST:event_btnPagarActionPerformed

    private void rbtProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtProdutosActionPerformed
        ProdServ(true);
    }//GEN-LAST:event_rbtProdutosActionPerformed

    private void btnPesquisaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaSPActionPerformed
        //chamar form configução expecifica
        if(rbtProdutos.isSelected()){
            JOptionPane.showMessageDialog(null, "Produto");
        }else{
            JOptionPane.showMessageDialog(null, "serviço");
        }
    }//GEN-LAST:event_btnPesquisaSPActionPerformed

    private void rbtServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtServicoActionPerformed
        ProdServ(false);
    }//GEN-LAST:event_rbtServicoActionPerformed

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
            java.util.logging.Logger.getLogger(frenteCX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frenteCX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frenteCX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frenteCX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frenteCX().setVisible(true);
            }
        });  
        
        
    }
    
    //minhas clases
    
    private void chamadaFram(JFrame x){
        x.setVisible(true);
    }
   
    public void inserirImg(){
        btnPerfil.setIcon(imge.img("/img/woman1.png"));
        btnPesquisaSP.setIcon(imge.img("/img/url.png"));
    }
         
    public void ProdServ(Boolean sP){
        JButton [] btn = {btnRapido1, btnRapido2, btnRapido3, btnRapido4, btnRapido5, btnRapido6, btnRapido7, btnRapido8, btnRapido9, btnRapido10,btnRapido11, btnRapido12, btnRapido13, btnRapido14, btnRapido15, btnRapido16, btnRapido17, btnRapido18, btnRapido19, btnRapido20 };
        //serviços
        if(sP){
            for(int i =0; i<btn.length;i++){
                btn[i].setText("jhonny");
            }
        }else{
            for(int i =0; i<btn.length;i++){
                btn[i].setText("erika");
            }
        }
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlTabela;
    private javax.swing.JMenuBar bmnFrente;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPesquisaSP;
    private javax.swing.JButton btnRapido1;
    private javax.swing.JButton btnRapido10;
    private javax.swing.JButton btnRapido11;
    private javax.swing.JButton btnRapido12;
    private javax.swing.JButton btnRapido13;
    private javax.swing.JButton btnRapido14;
    private javax.swing.JButton btnRapido15;
    private javax.swing.JButton btnRapido16;
    private javax.swing.JButton btnRapido17;
    private javax.swing.JButton btnRapido18;
    private javax.swing.JButton btnRapido19;
    private javax.swing.JButton btnRapido2;
    private javax.swing.JButton btnRapido20;
    private javax.swing.JButton btnRapido3;
    private javax.swing.JButton btnRapido4;
    private javax.swing.JButton btnRapido5;
    private javax.swing.JButton btnRapido6;
    private javax.swing.JButton btnRapido7;
    private javax.swing.JButton btnRapido8;
    private javax.swing.JButton btnRapido9;
    private javax.swing.ButtonGroup gbnSP;
    private javax.swing.JMenuItem imnAjuda;
    private javax.swing.JMenuItem imnCadC;
    private javax.swing.JMenuItem imnCadF;
    private javax.swing.JMenu imnCliente;
    private javax.swing.JMenuItem imnConF;
    private javax.swing.JMenu imnConfig;
    private javax.swing.JMenuItem imnFechamentoC;
    private javax.swing.JMenu imnFerramentas;
    private javax.swing.JMenuItem imnFiado;
    private javax.swing.JMenuItem imnFinanceiro;
    private javax.swing.JMenu imnFornecedor;
    private javax.swing.JMenuItem imnHistorico;
    private javax.swing.JMenuItem imnPedidos;
    private javax.swing.JMenuItem imnProdutos;
    private javax.swing.JMenuItem imnServico;
    private javax.swing.JMenuItem imnUsuario;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblInfSistema;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlMenuSP;
    private javax.swing.JRadioButton rbtProdutos;
    private javax.swing.JRadioButton rbtServico;
    private javax.swing.JTable tblCarrinho;
    private javax.swing.JTextField txtCdCliente;
    private javax.swing.JTextField txtNmCliente;
    private javax.swing.JTextField txtTotais;
    // End of variables declaration//GEN-END:variables
}
