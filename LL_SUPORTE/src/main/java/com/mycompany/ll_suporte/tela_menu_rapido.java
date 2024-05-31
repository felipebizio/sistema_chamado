/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ll_suporte;

/**
 *
 * @author felip
 */
public class tela_menu_rapido extends javax.swing.JFrame {

    /**
     * Creates new form tela_menu_rapido
     */
    public tela_menu_rapido() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        btnNovoChamado = new javax.swing.JButton();
        jbNovoUsuario = new javax.swing.JButton();
        lbNomeMenuIniciar = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnNovoColaborador = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnListaColaborador = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(123, 150, 212));

        lbLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Desktop\\TRABALHO_TEC_NIGTH\\icones_tec_nigth\\logo menu.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(lbLogo)
                .addGap(178, 178, 178))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lbLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovoChamado.setBackground(new java.awt.Color(65, 82, 179));
        btnNovoChamado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNovoChamado.setText("NOVO CHAMADO");
        btnNovoChamado.setBorder(null);
        btnNovoChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoChamadoActionPerformed(evt);
            }
        });

        jbNovoUsuario.setBackground(new java.awt.Color(65, 82, 179));
        jbNovoUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbNovoUsuario.setText("NOVO USUARIO");
        jbNovoUsuario.setBorder(null);
        jbNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoUsuarioActionPerformed(evt);
            }
        });

        lbNomeMenuIniciar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNomeMenuIniciar.setText("MENU INICIAR");

        btnSair.setBackground(new java.awt.Color(65, 82, 179));
        btnSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(null);

        btnNovoColaborador.setBackground(new java.awt.Color(65, 82, 179));
        btnNovoColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNovoColaborador.setText("NOVO COLABORADOR");
        btnNovoColaborador.setBorder(null);
        btnNovoColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoColaboradorActionPerformed(evt);
            }
        });

        btnRelatorio.setBackground(new java.awt.Color(65, 82, 179));
        btnRelatorio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRelatorio.setText("RELATÓRIOS");
        btnRelatorio.setBorder(null);
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnListaColaborador.setBackground(new java.awt.Color(65, 82, 179));
        btnListaColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListaColaborador.setText("LISTA DE COLABORADORES");
        btnListaColaborador.setBorder(null);
        btnListaColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaColaboradorActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(65, 82, 179));
        btnConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setBorder(null);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lbNomeMenuIniciar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNovoChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNovoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNovoColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListaColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(80, 80, 80)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbNomeMenuIniciar)
                .addGap(18, 18, 18)
                .addComponent(btnNovoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoChamadoActionPerformed
        // TODO add your handling code here:
        tela_menu_rapido.this.dispose();
        tela_abertura_chamados btnNovoChamado = new tela_abertura_chamados();
        btnNovoChamado.setVisible(true);
    }//GEN-LAST:event_btnNovoChamadoActionPerformed

    private void btnNovoColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoColaboradorActionPerformed
        // TODO add your handling code here:
        tela_menu_rapido.this.dispose();
        tela_cadastro_colaborador btnNovoColaborador = new tela_cadastro_colaborador();
        btnNovoColaborador.setVisible(true);
    }//GEN-LAST:event_btnNovoColaboradorActionPerformed

    private void jbNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoUsuarioActionPerformed
        // TODO add your handling code here:
        tela_menu_rapido.this.dispose();
        tela_cadastro_usuario btnNovoUsuario = new tela_cadastro_usuario();
        btnNovoUsuario.setVisible(true);
    }//GEN-LAST:event_jbNovoUsuarioActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        tela_menu_rapido.this.dispose();
        tela_lista_chamados btnConsultar = new tela_lista_chamados();
        btnConsultar.setVisible(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
        tela_menu_rapido.this.dispose();
        tela_relatorio btnRelatorio = new tela_relatorio();
        btnRelatorio.setVisible(true);
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnListaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaColaboradorActionPerformed
        // TODO add your handling code here:
        tela_menu_rapido.this.dispose();
        tela_lista_colaborador btnListaColaborador = new tela_lista_colaborador();
        btnListaColaborador.setVisible(true);
    }//GEN-LAST:event_btnListaColaboradorActionPerformed

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
            java.util.logging.Logger.getLogger(tela_menu_rapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_menu_rapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_menu_rapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_menu_rapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_menu_rapido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnListaColaborador;
    private javax.swing.JButton btnNovoChamado;
    private javax.swing.JButton btnNovoColaborador;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbNovoUsuario;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNomeMenuIniciar;
    // End of variables declaration//GEN-END:variables
}
