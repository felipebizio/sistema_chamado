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
import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class tela_cadastro_colaborador extends javax.swing.JFrame {
// Conexão com o banco
    Connection conexao = null;
    PreparedStatement statement = null;
    
    
    String url = "jdbc:mysql://localhost/ll_suporte";
    String usuario = "root";
    String senha = "154869"; // 154869
    
    
    public tela_cadastro_colaborador() {
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
        lbCadastroColaborador = new javax.swing.JLabel();
        lbNomeCadastro = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        lbNomeCpf = new javax.swing.JLabel();
        txtCpfUsuario = new javax.swing.JTextField();
        lbNomeEmail = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        lbNomeTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btCriar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbLogo = new javax.swing.JLabel();
        lbNomeSenha = new javax.swing.JLabel();
        rbAtendente = new javax.swing.JRadioButton();
        rbDesenvolvedor = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(123, 150, 212));
        setFocusCycleRoot(false);

        jPanel1.setBackground(new java.awt.Color(123, 150, 212));

        lbCadastroColaborador.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbCadastroColaborador.setText("CADASTRO DE COLABORADOR");

        lbNomeCadastro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeCadastro.setText("Nome Completo");

        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });

        lbNomeCpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeCpf.setText("CPF");

        txtCpfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfUsuarioActionPerformed(evt);
            }
        });

        lbNomeEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeEmail.setText("Endereço de E-mail");

        lbNomeTelefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeTelefone.setText("Telefone");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        btCriar.setBackground(new java.awt.Color(65, 82, 179));
        btCriar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCriar.setText("Criar");
        btCriar.setBorder(null);
        btCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(65, 82, 179));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lbNomeSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeSenha.setText("Senha");

        rbAtendente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbAtendente.setText("Atendente");
        rbAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAtendenteActionPerformed(evt);
            }
        });

        rbDesenvolvedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbDesenvolvedor.setText("Desenvolvedor");
        rbDesenvolvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDesenvolvedorActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Documents\\GitHub\\sistema_chamado\\LL_SUPORTE\\src\\main\\java\\com\\mycompany\\ll_suporte\\imagem\\logo maior.png")); // NOI18N

        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(lbCadastroColaborador)
                .addContainerGap(345, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNomeCadastro)
                    .addComponent(txtNomeUsuario)
                    .addComponent(txtCpfUsuario)
                    .addComponent(lbNomeCpf)
                    .addComponent(lbNomeEmail)
                    .addComponent(txtEmailUsuario)
                    .addComponent(txtTelefone)
                    .addComponent(lbNomeTelefone)
                    .addComponent(lbNomeSenha)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rbAtendente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbDesenvolvedor))
                    .addComponent(txtSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLogo)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbCadastroColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbDesenvolvedor)
                            .addComponent(rbAtendente))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNomeCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbNomeSenha)
                                .addGap(12, 12, 12)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbNomeCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbNomeEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbNomeTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        tela_cadastro_colaborador.this.dispose();
        tela_login btnCancelar = new tela_login();
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarActionPerformed
        String opcaoSelecionada = null;
        String cpf = txtCpfUsuario.getText();
        String telefone = txtTelefone.getText();
            // Validação dos campos (CPF/TELEFONE) **SOMENTE NÚMEROS**
            if (!cpf.matches("\\d+") || !telefone.matches("\\d+")) { // Verifica se o texto contém apenas letras
                //JOptionPane.showMessageDialog(null,"Por favor, insira apenas número nos campos CPF ou Telefone.","Entrada Inválida",JOptionPane.ERROR_MESSAGE);
                if (!telefone.matches("\\d*")){
                    JOptionPane.showMessageDialog(null,"Por favor, insira apenas número nos campo Telefone.","Entrada Inválida",JOptionPane.ERROR_MESSAGE);
                    txtTelefone.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null,"Por favor, insira apenas número nos campo CPF.","Entrada Inválida",JOptionPane.ERROR_MESSAGE);
                    txtCpfUsuario.requestFocus(); // Requer foco novamente se a entrada for inválida
                }
                
            } else {
                
                // Salvando o cargo do colaborador pelo Radio Button
                if (rbAtendente.isSelected()){
                    opcaoSelecionada = "Atendente";
                }else if (rbDesenvolvedor.isSelected()){
                    opcaoSelecionada = "Desenvolvedor";
                }else{
                    JOptionPane.showMessageDialog(null,"Por favor, selecione um cargo!", "ERRO",JOptionPane.ERROR_MESSAGE);
                }
                try {
                    //Insert dos campos preenchidos na tabela funcionário
                    conexao = DriverManager.getConnection(url, usuario, senha);
                    String sql = "INSERT INTO funcionario (nome_completo_funcionario, senha_funcionario, cpf_funcionario, email_funcionario, telefone_funcionario, cargo) VALUES (?,?,?,?,?,?);";
                    statement = conexao.prepareStatement(sql);
                    statement.setString(1,txtNomeUsuario.getText()); // nome_completo_funcionario
                    statement.setString(2,txtSenha.getText()); // senha_funcionario
                    statement.setString(3,txtCpfUsuario.getText()); // cpf_funcionario
                    statement.setString(4,txtEmailUsuario.getText()); // email_funcionario
                    statement.setString(5,txtTelefone.getText()); // telefone_funcionario
                    statement.setString(6, opcaoSelecionada); //cargo
                    statement.execute();
                    statement.close();
                    JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");


                    // TODO add your handling code here:
                    tela_cadastro_colaborador.this.dispose();
                    tela_menu_rapido btnCriar = new tela_menu_rapido();
                    btnCriar.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(tela_cadastro_colaborador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_btCriarActionPerformed

    private void txtCpfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfUsuarioActionPerformed

    private void rbAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAtendenteActionPerformed
        // Desmarcar o radio button automaticamente ao selecionar outro radio button 
        rbDesenvolvedor.setSelected(false);
    }//GEN-LAST:event_rbAtendenteActionPerformed

    private void rbDesenvolvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDesenvolvedorActionPerformed
// Desmarcar o radio button automaticamente ao selecionar outro radio button
        rbAtendente.setSelected(false);
    }//GEN-LAST:event_rbDesenvolvedorActionPerformed

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        // TODO add your handling code here:
    
    }//GEN-LAST:event_txtSenhaFocusGained

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
            java.util.logging.Logger.getLogger(tela_cadastro_colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastro_colaborador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCadastroColaborador;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNomeCadastro;
    private javax.swing.JLabel lbNomeCpf;
    private javax.swing.JLabel lbNomeEmail;
    private javax.swing.JLabel lbNomeSenha;
    private javax.swing.JLabel lbNomeTelefone;
    private javax.swing.JRadioButton rbAtendente;
    private javax.swing.JRadioButton rbDesenvolvedor;
    private javax.swing.JTextField txtCpfUsuario;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
