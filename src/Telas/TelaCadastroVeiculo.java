package Telas;

import Classes.AnoFabricacao;
import Classes.AnoModelo;
import Classes.Cambios;
import Classes.Combustiveis;
import Classes.Cores;
import Classes.Modelos;
import Classes.Veiculos;
import DatabaseConnection.DBConnection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaCadastroVeiculo extends javax.swing.JFrame {
    
    DBConnection db = new DBConnection();
    ArrayList<Modelos> listaModelos = new ArrayList();
    ArrayList<Cores> listaCores = new ArrayList();
    ArrayList<AnoFabricacao> listaAno_Fab = new ArrayList();
    ArrayList<AnoModelo> listaAno_Modelo = new ArrayList();
    ArrayList<Combustiveis> listaCombustiveis = new ArrayList();
    ArrayList<Cambios> listaCambios = new ArrayList();

    public TelaCadastroVeiculo() {
        initComponents();
        preencherCbCor();
    }

    public void preencherCbModelo() {
        listaModelos = db.readAllModelos();
        for(int i = 0; i < listaModelos.size(); i++) {
            cbModelo.addItem(listaModelos.get(i).getNome_modelo());
        }
        
    }
    
    public void preencherCbCor() {
        listaCores = db.readAllCores();
        for(int i = 0; i < listaCores.size(); i++) {
            cbCor.addItem(listaCores.get(i).getNome_cor());
        }
        
    }
    
    public void preencherCbAno_Fab() {
        listaAno_Fab = db.readAllAnoFabricacao();
        for(int i = 0; i < listaAno_Fab.size(); i++) {
            cbFabricacao.addItem(String.valueOf(listaAno_Fab.get(i).getAno_fabricacao()));
        }
        
    }
    
    public void preencherCbAno_Modelo() {

        listaAno_Modelo = db.readAllAnoModelo();
        for(int i = 0; i < listaAno_Modelo.size(); i++) {
            cbAnoModelo.addItem(String.valueOf(listaAno_Modelo.get(i).getAno_modelo()));
        }
        
    }
    
    public void preencherCbCombustivel() {
        
        listaCombustiveis = db.readAllCombustiveis();
        for(int i = 0; i < listaAno_Fab.size(); i++) {
            cbCombustivel.addItem(listaCombustiveis.get(i).getTipo_combustivel());
        }
        
    }
    
    public void preencherCbCambio() {
        
        listaCambios = db.readAllCambios();
        for(int i = 0; i < listaAno_Fab.size(); i++) {
            cbCambio.addItem(listaCambios.get(i).getTipo_cambio());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNomeFun = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtChassi = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbCor = new javax.swing.JComboBox<>();
        cbAnoModelo = new javax.swing.JComboBox<>();
        cbFabricacao = new javax.swing.JComboBox<>();
        cbCombustivel = new javax.swing.JComboBox<>();
        cbCambio = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        btVoltar = new javax.swing.JButton();
        txtPreco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbModelo = new javax.swing.JComboBox<>();
        btAddCor = new javax.swing.JButton();
        btAddAnoModelo = new javax.swing.JButton();
        btAddAnoFab = new javax.swing.JButton();
        btAddCombustivel = new javax.swing.JButton();
        btAddCambio = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnoCadastros = new javax.swing.JMenu();
        mnoCliente = new javax.swing.JMenuItem();
        mnoFuncionario = new javax.swing.JMenuItem();
        mnoVeiculo = new javax.swing.JMenuItem();
        mnoModelo = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 176, 103));
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jLabel1.setText("Bem vindo,");

        lbNomeFun.setText("NomeFuncionario");

        lbData.setText("13/12/3000");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomeFun)
                .addGap(18, 18, 18)
                .addComponent(lbData)
                .addGap(37, 37, 37))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbNomeFun)
                    .addComponent(lbData))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ano Modelo");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ano fabricação");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cor");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Preço");

        btCadastrar.setBackground(new java.awt.Color(255, 122, 0));
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status Atual");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cambio");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Chassi");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Combustível");

        cbFabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFabricacaoActionPerformed(evt);
            }
        });

        cbCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCombustivelActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Em manutenção", "Vendido" }));

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Modelo");

        btAddCor.setText("+");
        btAddCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCorActionPerformed(evt);
            }
        });

        btAddAnoModelo.setText("+");
        btAddAnoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAnoModeloActionPerformed(evt);
            }
        });

        btAddAnoFab.setText("+");
        btAddAnoFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAnoFabActionPerformed(evt);
            }
        });

        btAddCombustivel.setText("+");

        btAddCambio.setText("+");
        btAddCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAddCor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAddAnoModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAddCambio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btVoltar)
                                .addGap(206, 206, 206))
                            .addComponent(btCadastrar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(cbAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbCor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbCambio, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtChassi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbModelo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbCombustivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbFabricacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAddAnoFab)
                                    .addComponent(btAddCombustivel))))
                        .addGap(33, 33, 33))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddCor))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddAnoModelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddCambio)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddAnoFab))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddCombustivel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        mnoCadastros.setText("Cadastros");
        mnoCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoCadastrosActionPerformed(evt);
            }
        });

        mnoCliente.setText("Cliente");
        mnoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoClienteActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoCliente);

        mnoFuncionario.setText("Funcionário");
        mnoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoFuncionarioActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoFuncionario);

        mnoVeiculo.setText("Veículo");
        mnoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoVeiculoActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoVeiculo);

        mnoModelo.setText("Modelo");
        mnoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoModeloActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoModelo);

        jMenuBar1.add(mnoCadastros);

        jMenu6.setText("Relatório");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu5.setText("Opções");

        jMenuItem5.setText("Sobre");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Manual do sistema");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Logout");
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Sair");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoFuncionarioActionPerformed
        TelaCadastroFuncionario tcf= new TelaCadastroFuncionario();
        tcf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoFuncionarioActionPerformed

    private void mnoCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoCadastrosActionPerformed

    }//GEN-LAST:event_mnoCadastrosActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
       TelaPerfil tp=new TelaPerfil();
       tp.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void mnoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoClienteActionPerformed
        TelaCadastroCliente tcc= new TelaCadastroCliente();
        tcc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoClienteActionPerformed

    private void mnoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoModeloActionPerformed
       TelaCadastroModelo tcm= new TelaCadastroModelo();
        tcm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoModeloActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        TelaPerfil tp = new TelaPerfil();
        tp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Veiculos veiculo = new Veiculos();
        veiculo.setChassi_veiculo(txtChassi.getText());
        veiculo.setPreco_veiculo(Float.parseFloat(txtPreco.getText()));
        veiculo.setStatus_veiculo(cbStatus.getSelectedItem().toString());
        
        veiculo.setId_modelo(Integer.parseInt(cbModelo.getSelectedItem().toString()));
        veiculo.setId_cor(Integer.parseInt(cbCor.getSelectedItem().toString()));
        veiculo.setId_ano_fabricacao(Integer.parseInt(cbFabricacao.getSelectedItem().toString()));
        veiculo.setId_ano_modelo(Integer.parseInt(cbAnoModelo.getSelectedItem().toString()));
        veiculo.setId_combustivel(Integer.parseInt(cbCombustivel.getSelectedItem().toString()));
        veiculo.setId_cambio(Integer.parseInt(cbCambio.getSelectedItem().toString()));
        
        db.createVeiculos(veiculo);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void mnoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnoVeiculoActionPerformed

    private void btAddCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCorActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Insira a nova cor:");
        Cores novaCor = new Cores();
        novaCor.setNome_cor(input);
        db.createCores(novaCor);
        
    }//GEN-LAST:event_btAddCorActionPerformed

    private void btAddAnoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAnoModeloActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Insira o novo ano de modelo:");
        AnoModelo novoAnoModelo = new AnoModelo();
        novoAnoModelo.setAno_modelo(Integer.parseInt(input));
        db.createAnoModelo(novoAnoModelo);
    }//GEN-LAST:event_btAddAnoModeloActionPerformed

    private void btAddCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCambioActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Insira a nova cor:");
        Cambios novoCambio = new Cambios();
        novoCambio.setTipo_cambio(input);
        db.createCambios(novoCambio);
    }//GEN-LAST:event_btAddCambioActionPerformed

    private void cbFabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFabricacaoActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Insira a nova cor:");
        AnoFabricacao novoAnoFabricacao = new AnoFabricacao();
        novoAnoFabricacao.setAno_fabricacao(Integer.parseInt(input));
        db.createAnoFabricacao(novoAnoFabricacao);
    }//GEN-LAST:event_cbFabricacaoActionPerformed

    private void cbCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCombustivelActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Insira a nova cor:");
        Combustiveis novoCombustivel = new Combustiveis();
        novoCombustivel.setTipo_combustivel(input);
        db.createCombustiveis(novoCombustivel);
    }//GEN-LAST:event_cbCombustivelActionPerformed

    private void btAddAnoFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAnoFabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAddAnoFabActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddAnoFab;
    private javax.swing.JButton btAddAnoModelo;
    private javax.swing.JButton btAddCambio;
    private javax.swing.JButton btAddCombustivel;
    private javax.swing.JButton btAddCor;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbAnoModelo;
    private javax.swing.JComboBox<String> cbCambio;
    private javax.swing.JComboBox<String> cbCombustivel;
    private javax.swing.JComboBox<String> cbCor;
    private javax.swing.JComboBox<String> cbFabricacao;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNomeFun;
    private javax.swing.JMenu mnoCadastros;
    private javax.swing.JMenuItem mnoCliente;
    private javax.swing.JMenuItem mnoFuncionario;
    private javax.swing.JMenuItem mnoModelo;
    private javax.swing.JMenuItem mnoVeiculo;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables

}
