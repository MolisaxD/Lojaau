package Telas;

import DatabaseConnection.DBConnection;

public class TelaPerfil extends javax.swing.JFrame {
    
    DBConnection db = new DBConnection();

    public TelaPerfil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNomeFun = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btEstoque = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btFuncionarios = new javax.swing.JButton();
        btFornecedores = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btVendas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnoCadastros = new javax.swing.JMenu();
        mnoCliente = new javax.swing.JMenuItem();
        mnoFuncionario = new javax.swing.JMenuItem();
        mnoVeiculo = new javax.swing.JMenuItem();
        mnoModelo = new javax.swing.JMenuItem();
        mnoMarca = new javax.swing.JMenuItem();
        mnoCor = new javax.swing.JMenuItem();
        mnoAno_Fab = new javax.swing.JMenuItem();
        mnoAno_Modelo = new javax.swing.JMenuItem();
        mnoCombustivel = new javax.swing.JMenuItem();
        mnoCambio = new javax.swing.JMenuItem();
        mnoRelatorio = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        mnoSobre = new javax.swing.JMenuItem();
        mnoManual = new javax.swing.JMenuItem();
        mnoLogout = new javax.swing.JMenuItem();
        mnoSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 176, 103));
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jLabel1.setText("Bem vindo,");

        lbNomeFun.setText("NomeFuncionario");

        lbData.setText("13/12/3000");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomeFun)
                .addGap(55, 55, 55)
                .addComponent(lbData)
                .addContainerGap(29, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 176, 103));
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btEstoque.setBackground(new java.awt.Color(255, 122, 0));
        btEstoque.setText("Estoque");
        btEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoqueActionPerformed(evt);
            }
        });

        btCliente.setBackground(new java.awt.Color(255, 122, 0));
        btCliente.setText("Clientes");
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        btFuncionarios.setBackground(new java.awt.Color(255, 122, 0));
        btFuncionarios.setText("Funcionários");
        btFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionariosActionPerformed(evt);
            }
        });

        btFornecedores.setBackground(new java.awt.Color(255, 122, 0));
        btFornecedores.setText("Modelos");
        btFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedoresActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("LISTAS");

        btVendas.setBackground(new java.awt.Color(255, 122, 0));
        btVendas.setText("Vendas");
        btVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendasActionPerformed(evt);
            }
        });

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

        mnoMarca.setText("Marca");
        mnoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoMarcaActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoMarca);

        mnoCor.setText("Cor");
        mnoCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoCorActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoCor);

        mnoAno_Fab.setText("Ano de Fabricação");
        mnoAno_Fab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoAno_FabActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoAno_Fab);

        mnoAno_Modelo.setText("Ano de Modelo");
        mnoAno_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoAno_ModeloActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoAno_Modelo);

        mnoCombustivel.setText("Combustível");
        mnoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoCombustivelActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoCombustivel);

        mnoCambio.setText("Câmbio");
        mnoCadastros.add(mnoCambio);

        jMenuBar1.add(mnoCadastros);

        mnoRelatorio.setText("Relatório");
        mnoRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnoRelatorioMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnoRelatorio);

        jMenu5.setText("Opções");

        mnoSobre.setText("Sobre");
        jMenu5.add(mnoSobre);

        mnoManual.setText("Manual do sistema");
        mnoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoManualActionPerformed(evt);
            }
        });
        jMenu5.add(mnoManual);

        mnoLogout.setText("Logout");
        jMenu5.add(mnoLogout);

        mnoSair.setText("Sair");
        mnoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoSairActionPerformed(evt);
            }
        });
        jMenu5.add(mnoSair);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(btCliente)
                .addGap(18, 18, 18)
                .addComponent(btEstoque)
                .addGap(18, 18, 18)
                .addComponent(btFuncionarios)
                .addGap(18, 18, 18)
                .addComponent(btFornecedores)
                .addGap(18, 18, 18)
                .addComponent(btVendas)
                .addGap(93, 93, 93))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedoresActionPerformed
       TelaListaModelos tf = new TelaListaModelos();
       tf.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_btFornecedoresActionPerformed

    private void btEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoqueActionPerformed
       TelaListaEstoque tle = new TelaListaEstoque();
       tle.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_btEstoqueActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
       TelaListaClientes tcc = new TelaListaClientes();
       tcc.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_btClienteActionPerformed

    private void btFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionariosActionPerformed
       TelaListaFuncionarios tfun = new TelaListaFuncionarios();
       tfun.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_btFuncionariosActionPerformed

    private void mnoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoClienteActionPerformed
        TelaCadastroCliente tcc= new TelaCadastroCliente();
        tcc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoClienteActionPerformed

    private void mnoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoFuncionarioActionPerformed
        TelaCadastroFuncionario tcf= new TelaCadastroFuncionario();
        tcf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoFuncionarioActionPerformed

    private void mnoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoVeiculoActionPerformed
        TelaCadastroVeiculo tcv= new TelaCadastroVeiculo();
        tcv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoVeiculoActionPerformed

    private void mnoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoModeloActionPerformed
        TelaCadastroModelo tcm= new TelaCadastroModelo();
        tcm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoModeloActionPerformed

    private void mnoCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoCadastrosActionPerformed

    }//GEN-LAST:event_mnoCadastrosActionPerformed

    private void mnoRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnoRelatorioMouseClicked
        TelaPerfil tp = new TelaPerfil();
        tp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoRelatorioMouseClicked

    private void mnoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoManualActionPerformed

    }//GEN-LAST:event_mnoManualActionPerformed

    private void mnoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoSairActionPerformed

    }//GEN-LAST:event_mnoSairActionPerformed

    private void btVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendasActionPerformed
        TelaVendasVeiculos tvv = new TelaVendasVeiculos();
        tvv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btVendasActionPerformed

    private void mnoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoMarcaActionPerformed
        String marca = javax.swing.JOptionPane.showInputDialog("Insira o nome da marca:");
        //Esperando finalizar a classe DBConnection
        //db.createMarca(marca);
        /**/
        
    }//GEN-LAST:event_mnoMarcaActionPerformed

    private void mnoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoCorActionPerformed
        String cor = javax.swing.JOptionPane.showInputDialog("Insira o nome da cor:");
        //Esperando finalizar a classe DBConnection
        //db.createMarca(cor);
        /**/
    }//GEN-LAST:event_mnoCorActionPerformed

    private void mnoAno_FabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoAno_FabActionPerformed
        String ano_fab = javax.swing.JOptionPane.showInputDialog("Insira o novo ano de fabricação:");
        //Esperando finalizar a classe DBConnection
        //db.createMarca(ano_fab);
        /**/
    }//GEN-LAST:event_mnoAno_FabActionPerformed

    private void mnoAno_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoAno_ModeloActionPerformed
        String ano_model = javax.swing.JOptionPane.showInputDialog("Insira o novo ano de modelo:");
        //Esperando finalizar a classe DBConnection
        //db.createMarca(ano_model);
        /**/
    }//GEN-LAST:event_mnoAno_ModeloActionPerformed

    private void mnoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoCombustivelActionPerformed
        String combustivel = javax.swing.JOptionPane.showInputDialog("Insira o nome do combustível novo:");
        //Esperando finalizar a classe DBConnection
        //db.createMarca(combustivel);
        /**/
    }//GEN-LAST:event_mnoCombustivelActionPerformed
    
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
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btEstoque;
    private javax.swing.JButton btFornecedores;
    private javax.swing.JButton btFuncionarios;
    private javax.swing.JButton btVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNomeFun;
    private javax.swing.JMenuItem mnoAno_Fab;
    private javax.swing.JMenuItem mnoAno_Modelo;
    private javax.swing.JMenu mnoCadastros;
    private javax.swing.JMenuItem mnoCambio;
    private javax.swing.JMenuItem mnoCliente;
    private javax.swing.JMenuItem mnoCombustivel;
    private javax.swing.JMenuItem mnoCor;
    private javax.swing.JMenuItem mnoFuncionario;
    private javax.swing.JMenuItem mnoLogout;
    private javax.swing.JMenuItem mnoManual;
    private javax.swing.JMenuItem mnoMarca;
    private javax.swing.JMenuItem mnoModelo;
    private javax.swing.JMenu mnoRelatorio;
    private javax.swing.JMenuItem mnoSair;
    private javax.swing.JMenuItem mnoSobre;
    private javax.swing.JMenuItem mnoVeiculo;
    // End of variables declaration//GEN-END:variables
}
