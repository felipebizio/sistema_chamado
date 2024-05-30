/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ll_suporte;

/**
 *
 * @author lbizio
 */
public class tela_lista_colaboradores extends javax.swing.JFrame {

    /**
     * Creates new form tela_lista_colaboradores
     */
    public tela_lista_colaboradores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbNomeListaColaboradores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbNomeNovoChamado = new javax.swing.JLabel();
        lbNomeNovoUsuario = new javax.swing.JLabel();
        lbNomeNovoColaborador = new javax.swing.JLabel();
        lbNomeRelatorio = new javax.swing.JLabel();
        lbNomeConsultar = new javax.swing.JLabel();
        lbNomeListaColaborador = new javax.swing.JLabel();
        lbNomeSair = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(123, 150, 212));

        lbNomeListaColaboradores.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNomeListaColaboradores.setText("LISTA COLABORADORES");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtPesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(204, 204, 204));
        txtPesquisar.setText("Pesquise um colaborador");

        btnPesquisar.setBackground(new java.awt.Color(123, 150, 212));
        btnPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lbNomeListaColaboradores)
                .addContainerGap(482, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addGap(79, 79, 79))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lbNomeListaColaboradores)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Users\\lbizio\\Pictures\\ll suporte canto tela.png")); // NOI18N

        lbNomeNovoChamado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeNovoChamado.setText("NOVO CHAMADO");
        lbNomeNovoChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNomeNovoChamadoMouseClicked(evt);
            }
        });

        lbNomeNovoUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeNovoUsuario.setText("NOVO USUÁRIO");
        lbNomeNovoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNomeNovoUsuarioMouseClicked(evt);
            }
        });

        lbNomeNovoColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeNovoColaborador.setText("NOVO COLABORADOR");
        lbNomeNovoColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNomeNovoColaboradorMouseClicked(evt);
            }
        });

        lbNomeRelatorio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeRelatorio.setText("RELATÓRIOS");
        lbNomeRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNomeRelatorioMouseClicked(evt);
            }
        });

        lbNomeConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeConsultar.setText("CONSULTAR");
        lbNomeConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNomeConsultarMouseClicked(evt);
            }
        });

        lbNomeListaColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeListaColaborador.setText("LISTA DE COLABORADOR");
        lbNomeListaColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNomeListaColaboradorMouseClicked(evt);
            }
        });

        lbNomeSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeSair.setText("SAIR");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8)
                            .addComponent(jSeparator7)
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNomeNovoChamado)
                                    .addComponent(jLabel1)
                                    .addComponent(lbNomeNovoUsuario)
                                    .addComponent(lbNomeConsultar)
                                    .addComponent(lbNomeListaColaborador)
                                    .addComponent(lbNomeRelatorio)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lbNomeSair))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbNomeNovoColaborador)
                        .addGap(32, 32, 32)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeNovoChamado)
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeNovoUsuario)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lbNomeNovoColaborador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeRelatorio)
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeConsultar)
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeListaColaborador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbNomeNovoChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNomeNovoChamadoMouseClicked
        // TODO add your handling code here:
        tela_lista_colaboradores.this.dispose();
        tela_abertura_chamados lbNomeNovoChamado = new tela_abertura_chamados();
        lbNomeNovoChamado.setVisible(true);
    }//GEN-LAST:event_lbNomeNovoChamadoMouseClicked

    private void lbNomeNovoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNomeNovoUsuarioMouseClicked
        // TODO add your handling code here:
        tela_lista_colaboradores.this.dispose();
        tela_cadastro_usuario lbNomeNovoUsuario = new tela_cadastro_usuario();
        lbNomeNovoUsuario.setVisible(true);
    }//GEN-LAST:event_lbNomeNovoUsuarioMouseClicked

    private void lbNomeNovoColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNomeNovoColaboradorMouseClicked
        // TODO add your handling code here:
        tela_lista_colaboradores.this.dispose();
        tela_cadastro_colaborador lbNomeNovoColaborador = new tela_cadastro_colaborador();
        lbNomeNovoColaborador.setVisible(true);
    }//GEN-LAST:event_lbNomeNovoColaboradorMouseClicked

    private void lbNomeRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNomeRelatorioMouseClicked
        // TODO add your handling code here:
        tela_lista_colaboradores.this.dispose();
        tela_relatorio_chamados lbNomeRelatorios = new tela_relatorio_chamados();
        lbNomeRelatorios.setVisible(true);
    }//GEN-LAST:event_lbNomeRelatorioMouseClicked

    private void lbNomeConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNomeConsultarMouseClicked
        // TODO add your handling code here:
        tela_lista_colaboradores.this.dispose();
        tela_lista_chamados lbNomeConsultar = new tela_lista_chamados();
        lbNomeConsultar.setVisible(true);
    }//GEN-LAST:event_lbNomeConsultarMouseClicked

    private void lbNomeListaColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNomeListaColaboradorMouseClicked
        // TODO add your handling code here:
        tela_lista_colaboradores.this.dispose();
        tela_lista_colaboradores lbNomeListaColaborador = new tela_lista_colaboradores();
        lbNomeListaColaborador.setVisible(true);
    }//GEN-LAST:event_lbNomeListaColaboradorMouseClicked

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
            java.util.logging.Logger.getLogger(tela_lista_colaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_lista_colaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_lista_colaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_lista_colaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_lista_colaboradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNomeConsultar;
    private javax.swing.JLabel lbNomeListaColaborador;
    private javax.swing.JLabel lbNomeListaColaboradores;
    private javax.swing.JLabel lbNomeNovoChamado;
    private javax.swing.JLabel lbNomeNovoColaborador;
    private javax.swing.JLabel lbNomeNovoUsuario;
    private javax.swing.JLabel lbNomeRelatorio;
    private javax.swing.JLabel lbNomeSair;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
