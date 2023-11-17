package Telas;

import DatabaseConnection.DBConnection;

public class TelaListaModelos extends javax.swing.JFrame {
    
    DBConnection db = new DBConnection();

    public TelaListaModelos() {
        
        initComponents();
    }
    
    public void preencherTabela_Modelos(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbNomeFun = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListaFornecedores = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnoCadastros = new javax.swing.JMenu();
        mnoCliente = new javax.swing.JMenuItem();
        mnoFuncionario = new javax.swing.JMenuItem();
        mnoVeiculo = new javax.swing.JMenuItem();
        mnoModelo = new javax.swing.JMenuItem();
        mnoRelatorio = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        mnoSobre = new javax.swing.JMenuItem();
        mnoManual = new javax.swing.JMenuItem();
        mnoLogout = new javax.swing.JMenuItem();
        mnoSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(0, 176, 103));
        jPanel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jLabel10.setText("Bem vindo,");

        lbNomeFun.setText("NomeFuncionario");

        lbData.setText("13/12/3000");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomeFun)
                .addGap(18, 18, 18)
                .addComponent(lbData)
                .addGap(37, 37, 37))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbNomeFun)
                    .addComponent(lbData))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        TabelaListaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TabelaListaFornecedores);

        btEditar.setBackground(new java.awt.Color(255, 122, 0));
        btEditar.setText("Editar");

        btDeletar.setBackground(new java.awt.Color(255, 122, 0));
        btDeletar.setText("Deletar");

        btVoltar.setBackground(new java.awt.Color(255, 122, 0));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btEditar)
                        .addGap(28, 28, 28)
                        .addComponent(btDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar)
                        .addContainerGap())))
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
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoClienteActionPerformed
        TelaCadastroCliente tcc = new TelaCadastroCliente();
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
        // TODO add your handling code here:
    }//GEN-LAST:event_mnoManualActionPerformed

    private void mnoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnoSairActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaPerfil tp=new TelaPerfil();
        tp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListaModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaModelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaListaFornecedores;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNomeFun;
    private javax.swing.JMenu mnoCadastros;
    private javax.swing.JMenuItem mnoCliente;
    private javax.swing.JMenuItem mnoFuncionario;
    private javax.swing.JMenuItem mnoLogout;
    private javax.swing.JMenuItem mnoManual;
    private javax.swing.JMenuItem mnoModelo;
    private javax.swing.JMenu mnoRelatorio;
    private javax.swing.JMenuItem mnoSair;
    private javax.swing.JMenuItem mnoSobre;
    private javax.swing.JMenuItem mnoVeiculo;
    // End of variables declaration//GEN-END:variables
}
