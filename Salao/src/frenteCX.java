import javax.swing.JButton;
import classe.Imagens;
import javax.swing.JFrame;
import ClasseBD.ConexaoBD;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//fazer uma classe só pra chamadas
public class frenteCX extends javax.swing.JFrame {

    public frenteCX() {
        initComponents();
        inserirImg();
        txtNmCliente.setEnabled(false);
        txtCdCliente.setEnabled(false);
        txtTotais.setEnabled(false);
        rbtServicoActionPerformed(null);
        ConexaoBD.connect();
        criarTabela();
        tblCarrinho.setEnabled(false);
    }
    
    Imagens imge =  new Imagens();
    cliente c = new cliente();
    buscaServProd bsp = new buscaServProd();
    fornecedor f = new fornecedor();
    pagamento p = new pagamento();
    servprod s = new servprod();
    ConexaoBD cxbd = new ConexaoBD();
    //prepara model para tabela
    DefaultTableModel dtm = new DefaultTableModel(); 
    //a execução do comando será feita pelo método rsexecutar, na classe AcesspBD
    //o retorno do metodo sera um Resulset que sera armazenado em rsresultado
    ResultSet rsresultado ;
    

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
        imnCadastro = new javax.swing.JMenuItem();
        imnProdutos = new javax.swing.JMenuItem();
        imnUsuario = new javax.swing.JMenuItem();
        imnAjuda = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 700));

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
        btnRapido7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido7ActionPerformed(evt);
            }
        });

        btnRapido2.setText("jButton3");
        btnRapido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido2ActionPerformed(evt);
            }
        });

        btnRapido3.setText("jButton4");
        btnRapido3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido3ActionPerformed(evt);
            }
        });

        btnRapido4.setText("jButton5");
        btnRapido4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido4ActionPerformed(evt);
            }
        });

        btnRapido5.setText("jButton5");
        btnRapido5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido5ActionPerformed(evt);
            }
        });

        btnRapido6.setText("jButton7");
        btnRapido6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido6ActionPerformed(evt);
            }
        });

        btnRapido13.setText("jButton8");
        btnRapido13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido13ActionPerformed(evt);
            }
        });

        btnRapido9.setText("jButton9");
        btnRapido9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido9ActionPerformed(evt);
            }
        });

        btnRapido10.setText("jButton2");
        btnRapido10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido10ActionPerformed(evt);
            }
        });

        btnRapido1.setText("jButton1");
        btnRapido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido1ActionPerformed(evt);
            }
        });

        btnRapido8.setText("jButton2");
        btnRapido8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido8ActionPerformed(evt);
            }
        });

        btnRapido12.setText("jButton2");
        btnRapido12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido12ActionPerformed(evt);
            }
        });

        btnRapido14.setText("jButton2");
        btnRapido14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido14ActionPerformed(evt);
            }
        });

        btnRapido15.setText("jButton2");
        btnRapido15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido15ActionPerformed(evt);
            }
        });

        btnRapido16.setText("jButton2");
        btnRapido16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido16ActionPerformed(evt);
            }
        });

        btnRapido11.setText("jButton2");
        btnRapido11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido11ActionPerformed(evt);
            }
        });

        btnRapido17.setText("jButton2");
        btnRapido17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido17ActionPerformed(evt);
            }
        });

        btnRapido18.setText("jButton2");
        btnRapido18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido18ActionPerformed(evt);
            }
        });

        btnRapido19.setText("jButton2");
        btnRapido19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido19ActionPerformed(evt);
            }
        });

        btnRapido20.setText("jButton2");
        btnRapido20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapido20ActionPerformed(evt);
            }
        });

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

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCarrinho);

        javax.swing.GroupLayout PnlTabelaLayout = new javax.swing.GroupLayout(PnlTabela);
        PnlTabela.setLayout(PnlTabelaLayout);
        PnlTabelaLayout.setHorizontalGroup(
            PnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );
        PnlTabelaLayout.setVerticalGroup(
            PnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTabelaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        imnCadastro.setText("Cadastro");
        imnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadastroActionPerformed(evt);
            }
        });
        imnConfig.add(imnCadastro);

        imnProdutos.setText("Produtos");
        imnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnProdutosActionPerformed(evt);
            }
        });
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtServico)
                                .addGap(54, 54, 54)
                                .addComponent(rbtProdutos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPesquisaSP)
                            .addComponent(pnlMenuSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PnlTabela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
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
                            .addComponent(rbtProdutos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlMenuSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btnPesquisaSP)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(lblInfSistema))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNmClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNmClienteActionPerformed

    private void txtCdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdClienteActionPerformed

    private void btnRapido3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido3ActionPerformed
        confgTabela("3","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '3'");
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
        String x = txtTotais.getText();
        if(tblCarrinho.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Não há produtos...");
        }else{
            chamadaFram(p);
            p.setValor(txtTotais.getText());
            p.configinicializacao();
            limparTabela();
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void rbtProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtProdutosActionPerformed
        ProdServ(true);
    }//GEN-LAST:event_rbtProdutosActionPerformed

    private void btnPesquisaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaSPActionPerformed
        //se rbnProdutos estiver selecionado
        if(rbtProdutos.isSelected()){
           //chamar esses metodos do frame buscaSP 
           bsp.rbnProd.setSelected(true);
           bsp.criarTabelas1();
           chamadaFram(bsp);
       }else{
            bsp.rbnServ.setSelected(true);
            bsp.criarTabelas();       
            chamadaFram(bsp);         
        }
    }//GEN-LAST:event_btnPesquisaSPActionPerformed

    private void rbtServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtServicoActionPerformed
        ProdServ(false);
    }//GEN-LAST:event_rbtServicoActionPerformed

    private void btnRapido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido1ActionPerformed
       confgTabela( "1","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '1'");
       if(rbtServico.isSelected() == true){
           JOptionPane.showMessageDialog(null, "serviço");
       }else{
           JOptionPane.showMessageDialog(null, "produto");
       }
    }//GEN-LAST:event_btnRapido1ActionPerformed

    private void btnRapido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido2ActionPerformed
       confgTabela("2","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '2'");
    }//GEN-LAST:event_btnRapido2ActionPerformed

    private void imnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadastroActionPerformed
        chamadaFram(s);
    }//GEN-LAST:event_imnCadastroActionPerformed

    private void imnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnProdutosActionPerformed
        chamadaFram(bsp);
    }//GEN-LAST:event_imnProdutosActionPerformed

    private void btnRapido4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido4ActionPerformed
        confgTabela("4","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '4'");
    }//GEN-LAST:event_btnRapido4ActionPerformed

    private void btnRapido5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido5ActionPerformed
        confgTabela("5","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '5'");
    }//GEN-LAST:event_btnRapido5ActionPerformed

    private void btnRapido6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido6ActionPerformed
        confgTabela("6","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '6'");
    }//GEN-LAST:event_btnRapido6ActionPerformed

    private void btnRapido7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido7ActionPerformed
        confgTabela("7","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '7'");
    }//GEN-LAST:event_btnRapido7ActionPerformed

    private void btnRapido8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido8ActionPerformed
        confgTabela("8","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '8'");
    }//GEN-LAST:event_btnRapido8ActionPerformed

    private void btnRapido9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido9ActionPerformed
        confgTabela("9","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '9'");
    }//GEN-LAST:event_btnRapido9ActionPerformed

    private void btnRapido10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido10ActionPerformed
        confgTabela("10","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '10'");
    }//GEN-LAST:event_btnRapido10ActionPerformed

    private void btnRapido11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido11ActionPerformed
        confgTabela("11","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '11'");
    }//GEN-LAST:event_btnRapido11ActionPerformed

    private void btnRapido12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido12ActionPerformed
        confgTabela("12","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '12'");
    }//GEN-LAST:event_btnRapido12ActionPerformed

    private void btnRapido13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido13ActionPerformed
        confgTabela("13","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '13'");
    }//GEN-LAST:event_btnRapido13ActionPerformed

    private void btnRapido14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido14ActionPerformed
        confgTabela("14","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '14'");
    }//GEN-LAST:event_btnRapido14ActionPerformed

    private void btnRapido15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido15ActionPerformed
        confgTabela("15","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '15'");
    }//GEN-LAST:event_btnRapido15ActionPerformed

    private void btnRapido16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido16ActionPerformed
        confgTabela("16","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '16'");
    }//GEN-LAST:event_btnRapido16ActionPerformed

    private void btnRapido17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido17ActionPerformed
        confgTabela("17","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '17'");
    }//GEN-LAST:event_btnRapido17ActionPerformed

    private void btnRapido18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido18ActionPerformed
        confgTabela("18","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '18'");
    }//GEN-LAST:event_btnRapido18ActionPerformed

    private void btnRapido19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido19ActionPerformed
        confgTabela("19","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '19'");
    }//GEN-LAST:event_btnRapido19ActionPerformed

    private void btnRapido20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapido20ActionPerformed
        confgTabela("20","SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '20'");
    }//GEN-LAST:event_btnRapido20ActionPerformed

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
    public void limparTabela(){
        dtm = new DefaultTableModel();
        criarTabela();
        txtTotais.setText("");
    }
    
    private void criarTabela(){   
            //adiciona as colunas
            tblCarrinho.setModel(dtm);
            //qtd colunas
            int qtdcoluna = 5;
            String [] nomes = {"Cód","Descrição", "Qtde", "Vl Un.", "Vl Total"};  
            //add as colunas na tabela
            for(int i =0; i<qtdcoluna; i++){
                //adiciona os nomes no dtm que é o model
                //ele é quem adiciona os dados na tabela
                dtm.addColumn(nomes[i]);
            }
           
    }
    
    private void confgTabela(String cod, String q){
        boolean fdp = true;
        if(dtm.getRowCount() != 0){
            //posso colocar return para melhorar o processamento
            for(int i =0; i<dtm.getRowCount(); i++ ){
                if(dtm.getValueAt(i, 0).equals(cod)){
                    int a = Integer.parseInt(dtm.getValueAt(i, 2).toString());
                    a++;
                    dtm.setValueAt(a, i, 2);
                    fdp = false;
                    valorQt(i);
                }
            }
        }
        if(fdp){
            inserirSP(q);
            valorQt(dtm.getRowCount()-1);
        }
        somaTotal();
    }
    
    private void somaTotal(){
        double b = 0;
        for(int i = 0; i<dtm.getRowCount(); i++){
            String a = dtm.getValueAt(i, 4).toString();
            double c = Double.parseDouble(a);
            b = b + c;
            txtTotais.setText(""+b);
        }
    }
    
    private void inserirSP(String q){
        
        try{
            //a execução do comando será feita pelo método rsexecutar, na classe AcesspBD
            //o retorno do metodo sera um Resulset que sera armazenado em rsresultado
            rsresultado = ConexaoBD.rsexecutar(q);
           
            //adicionar as linhas
            //array que guarda os dados de cada linha
            String [] row = new String[5];
            while(rsresultado.next()){
                int y = 1;
                for(int i=0;i<row.length;i++){
                    //adcionaos dados no array
                    if(i!=2 && i != 4){
                        row[i] = rsresultado.getString(y);
                        y++;
                    }else{
                        if(i==2){
                            row[i] = "1";
                        }
                    }  
                }
                //adicionar a linha toda na tabela
                dtm.addRow(row);
            }
            }catch(Exception e){e.printStackTrace();}  
        }
    
    private void valorQt(int i){
        double c = Double.parseDouble(dtm.getValueAt(i, 3).toString());
        double b = Double.parseDouble(dtm.getValueAt(i, 2).toString());
        b = b * c;
        dtm.setValueAt(b, i, 4);
    }
 
    private void chamadaFram(JFrame x){
        x.setVisible(true);
    }
   
    public void inserirImg(){
        btnPerfil.setIcon(imge.img("/img/woman1.png"));
        btnPesquisaSP.setIcon(imge.img("/img/url.png"));
        
    }
         
    public void ProdServ(Boolean sP){
        JButton [] btn = {btnRapido1, btnRapido2, btnRapido3, btnRapido4, btnRapido5, btnRapido6, btnRapido7, btnRapido8, btnRapido9, btnRapido10,btnRapido11, btnRapido12, btnRapido13, btnRapido14, btnRapido15, btnRapido16, btnRapido17, btnRapido18, btnRapido19, btnRapido20 };
        String [] codProduto = {"exp1P","exp2P","exp3P","exp4P","exp5P","exp6P","exp7P","exp8P","exp9P","exp10P","exp11P","exp12P","exp13P","exp14P","exp15P","exp16P","exp17P","exp18P","exp19P","exp20P"};
        String [] codServico = {"exp1","exp2","exp3","exp4","exp5","exp6","exp7","exp8","exp9","exp10","exp11","exp12","exp13","exp14","exp15","exp16","exp17","exp18","exp19","exp20"};
        //serviços
        if(sP){
            for(int i =0; i<btn.length;i++){
                btn[i].setText(codProduto[i]);
            }
        }else{
            for(int i =0; i<btn.length;i++){
                btn[i].setText(codServico[i]);
            }
        }
    }
    
    public void setCliente(String nome, String cod){
        this.txtCdCliente.setText(cod);
        this.txtNmCliente.setText(nome);
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
    private javax.swing.JMenuItem imnCadastro;
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
    public javax.swing.JTextField txtCdCliente;
    public javax.swing.JTextField txtNmCliente;
    private javax.swing.JTextField txtTotais;
    // End of variables declaration//GEN-END:variables
}
