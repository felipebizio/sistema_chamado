/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ll_suporte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class tela_cadastro_usuario extends javax.swing.JFrame {

    /**
     * Creates new form tela_cadastro_usuario
     */
    Connection conexao = null;
    PreparedStatement statement = null;
    
    
    String url = "jdbc:mysql://localhost/ll_suporte";
    String usuario = "root";
    String senha = "154869";
            
    
    
    
    public tela_cadastro_usuario() {
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
        lbCadastroUsuario = new javax.swing.JLabel();
        lbNomeNomeCompleto = new javax.swing.JLabel();
        lbNomeCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lbEnderecoEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbNomeTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCriar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        txtNomeCompleto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(123, 150, 212));

        lbCadastroUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbCadastroUsuario.setText("CADASTRO DE USUÁRIO");

        lbNomeNomeCompleto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeNomeCompleto.setText("Nome Completo");

        lbNomeCPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeCPF.setText("CPF");

        txtCPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbEnderecoEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbEnderecoEmail.setText("Endereço de E-mail");

        lbNomeTelefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeTelefone.setText("Telefone");

        btnCancelar.setBackground(new java.awt.Color(65, 82, 179));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCriar.setBackground(new java.awt.Color(65, 82, 179));
        btnCriar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCriar.setText("Criar");
        btnCriar.setBorder(null);
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        lbLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Desktop\\TRABALHO_TEC_NIGTH\\icones_tec_nigth\\logo menu menor.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(lbCadastroUsuario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNomeTelefone)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lbEnderecoEmail)
                            .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lbNomeCPF)
                            .addComponent(lbNomeNomeCompleto)
                            .addComponent(txtNomeCompleto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(lbLogo)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lbCadastroUsuario)
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbNomeNomeCompleto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addComponent(lbNomeCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbEnderecoEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNomeTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLogo)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
            
            try {
            // TODO add your handling code here:
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            
            
            String sql = "INSERT INTO clientes (nome_completo_cliente, cpf_cliente, email_cliente, tel_cliente) VALUES (?,?,?,?)";
            
            
           String cpf = txtCPF.getText();
            if (!cpf.matches("\\d*")){ // Verifica se o texto contém apenas letras
                JOptionPane.showMessageDialog(null,"Por favor, insira apenas número.","Entrada Inválida",JOptionPane.ERROR_MESSAGE);
                txtCPF.requestFocus(); // Requer foco novamente se a entrada for inválida
            }
            
            String telefone = txtTelefone.getText();
            if (!telefone.matches("\\d*")){ // Verifica se o texto contém apenas letras
                JOptionPane.showMessageDialog(null,"Por favor, insira apenas número.","Entrada Inválida",JOptionPane.ERROR_MESSAGE);
                txtTelefone.requestFocus(); // Requer foco novamente se a entrada for inválida
            }
            
            statement = conexao.prepareStatement(sql);
            statement.setString(1, txtNomeCompleto.getText());
            statement.setString(2, cpf);
            statement.setString(3, txtEmail.getText());
            statement.setString(4, telefone);
            
            
            statement.execute();
            statement.close();
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
            
            
            tela_cadastro_usuario.this.dispose();
            tela_abertura_chamados btnCriar = new tela_abertura_chamados();
            btnCriar.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        tela_cadastro_usuario.this.dispose();
        tela_menu_rapido btnCancelar = new tela_menu_rapido();
        btnCancelar.setVisible(true);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastro_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCadastroUsuario;
    private javax.swing.JLabel lbEnderecoEmail;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNomeCPF;
    private javax.swing.JLabel lbNomeNomeCompleto;
    private javax.swing.JLabel lbNomeTelefone;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
