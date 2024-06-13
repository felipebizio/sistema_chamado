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
public class tela_lista_chamados extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement statement = null;
    
    String url = "jdbc:mysql://localhost/ll_suporte";
    String usuario = "root";
    String senha = "154869"; // 154869
    
    public static String id;
    
    public tela_lista_chamados() {
        initComponents();
        
    }
    
    public void PopulartbListaChamados(String sql){
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            statement = conexao.prepareStatement(sql);
            statement.execute();
            ResultSet resultado = statement.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) tbListaChamados.getModel();
            model.setNumRows(0);
            
            while(resultado.next()){
                model.addRow(new Object[]{
                    resultado.getString("status_chamado"),
                    resultado.getString("id_chamado"), 
                    resultado.getString("data_formatada"), //****FORMATAR A DATA****
                    resultado.getString("cpf_clien"), // usuario
                    resultado.getString("titulo_chamado"),
                    resultado.getString("grupo_chamado"),
                    resultado.getString("prioridade_chamado"),
                    resultado.getString("prazo_chamado"),
                    resultado.getString("id_fun")//responsavel --> id_fun
                });
            }
            // id_fun
            conexao.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(tela_lista_chamados.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaChamados = new javax.swing.JTable();
        txtPesquisarChamado = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lbNovoChamado = new javax.swing.JLabel();
        lbConsultar = new javax.swing.JLabel();
        lbNovoUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbNovoColaborador = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbRelatorio = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lbListaColaboradores = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(123, 150, 212));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE CHAMADOS");

        tbListaChamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Chamado", "Abertura", "Usuario", "Titulo", "Grupo", "Prioridade", "Prazo", "Responsavel"
            }
        ));
        tbListaChamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaChamadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbListaChamados);

        txtPesquisarChamado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPesquisarChamado.setForeground(new java.awt.Color(204, 204, 204));
        txtPesquisarChamado.setText("Pesquise um chamado...");

        btnPesquisar.setBackground(new java.awt.Color(123, 150, 212));
        btnPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPesquisar.setText("PESQUISAR");

        btnVoltar.setBackground(new java.awt.Color(123, 150, 212));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnVoltar.setText("VOLTAR");
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
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPesquisarChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addGap(79, 79, 79))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        lbNovoChamado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNovoChamado.setText("NOVO CHAMADO");
        lbNovoChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoChamadoMouseClicked(evt);
            }
        });

        lbConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbConsultar.setText("CONSULTAR");
        lbConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbConsultarMouseClicked(evt);
            }
        });

        lbNovoUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNovoUsuario.setText("NOVO USUARIO");
        lbNovoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoUsuarioMouseClicked(evt);
            }
        });

        lbNovoColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNovoColaborador.setText("NOVO COLABORADOR");
        lbNovoColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoColaboradorMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lbRelatorio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbRelatorio.setText("RELATÓRIOS");
        lbRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRelatorioMouseClicked(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        lbListaColaboradores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbListaColaboradores.setText("LISTA DE COLABORADORES");
        lbListaColaboradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaColaboradoresMouseClicked(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        lbMenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbMenu.setText("MENU");
        lbMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbMenuMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbMenuMouseMoved(evt);
            }
        });
        lbMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbNovoColaborador)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(lbNovoChamado))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(lbNovoUsuario)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lbRelatorio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lbListaColaboradores))
                            .addComponent(jSeparator7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(lbMenu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lbConsultar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNovoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNovoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNovoColaborador)
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRelatorio)
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbListaColaboradores)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMenu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbNovoChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoChamadoMouseClicked
        // TODO add your handling code here:
        tela_lista_chamados.this.dispose();
        tela_abertura_chamados lbNovoChamado = new tela_abertura_chamados();
        lbNovoChamado.setVisible(true);
    }//GEN-LAST:event_lbNovoChamadoMouseClicked

    private void lbNovoColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoColaboradorMouseClicked
        // TODO add your handling code here:
        tela_lista_chamados.this.dispose();
        tela_cadastro_colaborador lbNovoColaborador = new tela_cadastro_colaborador();
        lbNovoColaborador.setVisible(true);
    }//GEN-LAST:event_lbNovoColaboradorMouseClicked

    private void lbConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsultarMouseClicked
        // TODO add your handling code here:
        tela_lista_chamados.this.dispose();
        tela_lista_chamados lbConsultar = new tela_lista_chamados();
        lbConsultar.setVisible(true);
    }//GEN-LAST:event_lbConsultarMouseClicked

    private void lbNovoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoUsuarioMouseClicked
        // TODO add your handling code here:
        tela_lista_chamados.this.dispose();
        tela_cadastro_usuario lbNovoUsuario = new tela_cadastro_usuario();
        lbNovoUsuario.setVisible(true);
    }//GEN-LAST:event_lbNovoUsuarioMouseClicked

    private void lbRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRelatorioMouseClicked
        // TODO add your handling code here:
        tela_lista_chamados.this.dispose();
        tela_relatorio lbRelatorio = new tela_relatorio();
        lbRelatorio.setVisible(true);
    }//GEN-LAST:event_lbRelatorioMouseClicked

    private void lbListaColaboradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaColaboradoresMouseClicked
        // TODO add your handling code here:
        tela_lista_chamados.this.dispose();
        tela_lista_colaborador lbListaColaboradores = new tela_lista_colaborador();
        lbListaColaboradores.setVisible(true);
    }//GEN-LAST:event_lbListaColaboradoresMouseClicked

    private void lbMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseDragged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_lbMenuMouseDragged

    private void lbMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lbMenuMouseMoved

    private void lbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseClicked
        // TODO add your handling code here:
        tela_lista_chamados.this.dispose();
        tela_menu_rapido lbMenu = new tela_menu_rapido();
        lbMenu.setVisible(true);
    }//GEN-LAST:event_lbMenuMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        tela_lista_chamados.this.dispose();
        tela_menu_rapido btnVoltar = new tela_menu_rapido();
        btnVoltar.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        this.PopulartbListaChamados ("SELECT *, DATE_FORMAT(data_abertura_chamado, '%d/%m/%Y') AS data_formatada from chamado");

    }//GEN-LAST:event_formWindowOpened

    private void tbListaChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaChamadosMouseClicked
        // TODO add your handling code here:
                                                    
     
            int linha = tbListaChamados.getSelectedRow(); // Selecionar a linha

            id = tbListaChamados.getValueAt(linha, 1).toString();//Pegar ID como referencia na tabela

            tela_lista_chamados.this.dispose();
            tela_detalhe_chamado objeto2 = new tela_detalhe_chamado();
            objeto2.setVisible(true);
        
           
        
    
    }//GEN-LAST:event_tbListaChamadosMouseClicked

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
            java.util.logging.Logger.getLogger(tela_lista_chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_lista_chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_lista_chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_lista_chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_lista_chamados().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel lbConsultar;
    private javax.swing.JLabel lbListaColaboradores;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JLabel lbNovoChamado;
    private javax.swing.JLabel lbNovoColaborador;
    private javax.swing.JLabel lbNovoUsuario;
    private javax.swing.JLabel lbRelatorio;
    private javax.swing.JTable tbListaChamados;
    private javax.swing.JTextField txtPesquisarChamado;
    // End of variables declaration//GEN-END:variables
}
