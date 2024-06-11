/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ll_suporte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felip
 */
public class tela_lista_colaborador extends javax.swing.JFrame {

        Connection conexao = null;
        PreparedStatement statement = null;


        String url = "jdbc:mysql://localhost/ll_suporte";
        String usuario = "root";
        String senha = ""; // 154869
        
        
    public tela_lista_colaborador() {
        initComponents();
    }
    
    
    public void PopularListaColaborador (String sql){
        
            try {
                conexao = DriverManager.getConnection(url, usuario, senha);
                statement = conexao.prepareStatement(sql);
                statement.execute();
                ResultSet resultado = statement.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) tblTabelaColaborador.getModel();
                model.setNumRows(0);
                
                while(resultado.next()){
                    model.addRow(new Object[]{
                        resultado.getString("nome_completo_funcionario"),
                        resultado.getString("cpf_funcionario"), //****FORMATAR A DATA****
                        resultado.getString("cargo"),
                        resultado.getString("email_funcionario"),
                        resultado.getString("telefone_funcionario")
                    });
                }
                conexao.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(tela_lista_colaborador.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        lbNomeListaColaborador = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisarFuncionario = new javax.swing.JTextField();
        spnTabelaColaborador = new javax.swing.JScrollPane();
        tblTabelaColaborador = new javax.swing.JTable();
        rbtnAtendente = new javax.swing.JRadioButton();
        rbtnDesenvolvedor = new javax.swing.JRadioButton();
        btnVoltar = new javax.swing.JButton();
        lbLogo = new javax.swing.JLabel();
        lbNovoChamado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lbNovoUsuario = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lbNovoColaborador = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbRelatorio = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lbConsultar = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lbListaColaborador = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbMenu = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(123, 150, 212));

        lbNomeListaColaborador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNomeListaColaborador.setText("LISTA DE COLABORADORES");

        btnPesquisar.setBackground(new java.awt.Color(123, 150, 212));
        btnPesquisar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtPesquisarFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPesquisarFuncionario.setForeground(new java.awt.Color(204, 204, 204));
        txtPesquisarFuncionario.setText("Pesquise um funcionário....");

        tblTabelaColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblTabelaColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Cargo", "Email", "Telefone"
            }
        ));
        spnTabelaColaborador.setViewportView(tblTabelaColaborador);

        rbtnAtendente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbtnAtendente.setText("ATENDENTE");

        rbtnDesenvolvedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbtnDesenvolvedor.setText("DESENVOLVEDOR");

        btnVoltar.setBackground(new java.awt.Color(123, 150, 212));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lbNomeListaColaborador)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnTabelaColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbtnAtendente)
                                .addGap(41, 41, 41)
                                .addComponent(rbtnDesenvolvedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(txtPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnPesquisar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbNomeListaColaborador)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnDesenvolvedor)
                    .addComponent(rbtnAtendente))
                .addGap(30, 30, 30)
                .addComponent(spnTabelaColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        lbLogo.setIcon(new javax.swing.ImageIcon("D:\\Users\\lbizio\\Desktop\\TECH_NIGTH_GIT_HUB\\logo canto superior.png")); // NOI18N

        lbNovoChamado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNovoChamado.setText("NOVO CHAMADO");
        lbNovoChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoChamadoMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        lbNovoUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNovoUsuario.setText("NOVO USUÁRIO");
        lbNovoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoUsuarioMouseClicked(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        lbNovoColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNovoColaborador.setText("NOVO COLABORADOR");
        lbNovoColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoColaboradorMouseClicked(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        lbRelatorio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbRelatorio.setText("RELATÓRIOS");
        lbRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRelatorioMouseClicked(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        lbConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbConsultar.setText("CONSULTAR");
        lbConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbConsultarMouseClicked(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        lbListaColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbListaColaborador.setText("LISTA DE COLABORADORES");
        lbListaColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaColaboradorMouseClicked(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        lbMenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbMenu.setText("MENU");
        lbMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMenuMouseClicked(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(lbNovoUsuario))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(lbNovoChamado))
                        .addComponent(jSeparator3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(lbNovoColaborador))
                        .addComponent(jSeparator4)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(lbRelatorio))
                        .addComponent(jSeparator5)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(lbConsultar))
                        .addComponent(jSeparator6)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(lbListaColaborador))
                        .addComponent(jSeparator7)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(lbMenu))
                        .addComponent(jSeparator8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lbLogo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbLogo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lbNovoChamado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNovoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNovoColaborador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbListaColaborador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMenu)
                .addGap(11, 11, 11)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbNovoChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoChamadoMouseClicked
        // TODO add your handling code here:
        tela_lista_colaborador.this.dispose();
        tela_abertura_chamados lbNovoChamado = new tela_abertura_chamados();
        lbNovoChamado.setVisible(true);
    }//GEN-LAST:event_lbNovoChamadoMouseClicked

    private void lbNovoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoUsuarioMouseClicked
        // TODO add your handling code here:
        tela_lista_colaborador.this.dispose();
        tela_cadastro_usuario lbNovoUsuario = new tela_cadastro_usuario();
        lbNovoUsuario.setVisible(true);
    }//GEN-LAST:event_lbNovoUsuarioMouseClicked

    private void lbNovoColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoColaboradorMouseClicked
        // TODO add your handling code here:
        tela_lista_colaborador.this.dispose();
        tela_cadastro_colaborador lbNovoColaborador = new tela_cadastro_colaborador();
        lbNovoColaborador.setVisible(true);
    }//GEN-LAST:event_lbNovoColaboradorMouseClicked

    private void lbRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRelatorioMouseClicked
        // TODO add your handling code here:
        tela_lista_colaborador.this.dispose();
        tela_relatorio lbRelatorio = new tela_relatorio();
        lbRelatorio.setVisible(true);
    }//GEN-LAST:event_lbRelatorioMouseClicked

    private void lbConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsultarMouseClicked
        // TODO add your handling code here:
        tela_lista_colaborador.this.dispose();
        tela_lista_chamados lbConsultar = new tela_lista_chamados();
        lbConsultar.setVisible(true);
    }//GEN-LAST:event_lbConsultarMouseClicked

    private void lbListaColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaColaboradorMouseClicked
        // TODO add your handling code here:
        tela_lista_colaborador.this.dispose();
        tela_lista_colaborador lbListaColaborador = new tela_lista_colaborador();
        lbListaColaborador.setVisible(true);
    }//GEN-LAST:event_lbListaColaboradorMouseClicked

    private void lbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseClicked
        // TODO add your handling code here:
        tela_lista_colaborador.this.dispose();
        tela_menu_rapido lbMenu = new tela_menu_rapido();
        lbMenu.setVisible(true);
    }//GEN-LAST:event_lbMenuMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        tela_lista_colaborador.this.dispose();
        tela_menu_rapido lbMenu = new tela_menu_rapido();
        lbMenu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
            
        this.PopularListaColaborador ("SELECT * from funcionario");
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.PopularListaColaborador ("SELECT * from funcionario");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(tela_lista_colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_lista_colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_lista_colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_lista_colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_lista_colaborador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbConsultar;
    private javax.swing.JLabel lbListaColaborador;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JLabel lbNomeListaColaborador;
    private javax.swing.JLabel lbNovoChamado;
    private javax.swing.JLabel lbNovoColaborador;
    private javax.swing.JLabel lbNovoUsuario;
    private javax.swing.JLabel lbRelatorio;
    private javax.swing.JRadioButton rbtnAtendente;
    private javax.swing.JRadioButton rbtnDesenvolvedor;
    private javax.swing.JScrollPane spnTabelaColaborador;
    private javax.swing.JTable tblTabelaColaborador;
    private javax.swing.JTextField txtPesquisarFuncionario;
    // End of variables declaration//GEN-END:variables
}
