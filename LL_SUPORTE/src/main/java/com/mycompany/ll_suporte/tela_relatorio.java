/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ll_suporte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author felip
 */
public class tela_relatorio extends javax.swing.JFrame {
    /*conexao = DriverManager.getConnection(url, usuario, senha);
    statement = conexao.prepareStatement(sql);
    statement.execute();*/
    /**
     * Creates new form tela_relatorio
     */
    public tela_relatorio() {
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
        jLabel1 = new javax.swing.JLabel();
        lbNomeNovos = new javax.swing.JLabel();
        lbNumeroNovos = new javax.swing.JLabel();
        lbNomeEmAnalise = new javax.swing.JLabel();
        lbNumeroEmAnalise = new javax.swing.JLabel();
        lbNomeEmAndamento = new javax.swing.JLabel();
        lbNumeroEmAndamento = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        lbNomeResolvido = new javax.swing.JLabel();
        lbNumeroResolvido = new javax.swing.JLabel();
        lbNomeEncerrado = new javax.swing.JLabel();
        lbNomeCancelado = new javax.swing.JLabel();
        lbNumeroEncerrado = new javax.swing.JLabel();
        lbNumeroCancelado = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbNovoChamado = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(123, 150, 212));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("RELATÓRIO DE CHAMADOS");

        lbNomeNovos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNomeNovos.setText("NOVOS:");

        lbNumeroNovos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNumeroNovos.setText("0");

        lbNomeEmAnalise.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNomeEmAnalise.setText("EM ANÁLISE:");

        lbNumeroEmAnalise.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNumeroEmAnalise.setText("0");

        lbNomeEmAndamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNomeEmAndamento.setText("EM ANDAMENTO: ");

        lbNumeroEmAndamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNumeroEmAndamento.setText("0");

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));

        lbNomeResolvido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNomeResolvido.setText("RESOLVIDO:");

        lbNumeroResolvido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNumeroResolvido.setText("0");

        lbNomeEncerrado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNomeEncerrado.setText("ENCERRADO:");

        lbNomeCancelado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNomeCancelado.setText("CANCELADO:");

        lbNumeroEncerrado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNumeroEncerrado.setText("0");

        lbNumeroCancelado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNumeroCancelado.setText("0");

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Users\\MDEOLINDO\\Desktop\\PROG_APP_GIT\\sistema_chamado\\LL_SUPORTE\\src\\main\\java\\com\\mycompany\\ll_suporte\\imagem\\icon_emanalise.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Users\\MDEOLINDO\\Desktop\\PROG_APP_GIT\\sistema_chamado\\LL_SUPORTE\\src\\main\\java\\com\\mycompany\\ll_suporte\\imagem\\icon_novo.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Users\\MDEOLINDO\\Desktop\\PROG_APP_GIT\\sistema_chamado\\LL_SUPORTE\\src\\main\\java\\com\\mycompany\\ll_suporte\\imagem\\em-andamento.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Users\\MDEOLINDO\\Desktop\\PROG_APP_GIT\\sistema_chamado\\LL_SUPORTE\\src\\main\\java\\com\\mycompany\\ll_suporte\\imagem\\icon_,resolvido.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Users\\MDEOLINDO\\Desktop\\PROG_APP_GIT\\sistema_chamado\\LL_SUPORTE\\src\\main\\java\\com\\mycompany\\ll_suporte\\imagem\\icon_fechadas.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Users\\MDEOLINDO\\Desktop\\PROG_APP_GIT\\sistema_chamado\\LL_SUPORTE\\src\\main\\java\\com\\mycompany\\ll_suporte\\imagem\\icon_cancelar.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(lbNomeEmAnalise)
                        .addGap(26, 26, 26)
                        .addComponent(lbNumeroEmAnalise))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                                .addComponent(jSeparator9)
                                .addComponent(jSeparator11)
                                .addComponent(jSeparator12))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4)
                                .addGap(44, 44, 44)
                                .addComponent(lbNomeNovos)
                                .addGap(18, 18, 18)
                                .addComponent(lbNumeroNovos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(lbNomeEncerrado)
                        .addGap(18, 18, 18)
                        .addComponent(lbNumeroEncerrado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(lbNomeEmAndamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNumeroEmAndamento)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(lbNomeCancelado)
                        .addGap(25, 25, 25)
                        .addComponent(lbNumeroCancelado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(lbNomeResolvido)
                        .addGap(18, 18, 18)
                        .addComponent(lbNumeroResolvido))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomeNovos)
                            .addComponent(lbNumeroNovos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomeResolvido)
                            .addComponent(lbNumeroResolvido)))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomeEmAnalise)
                            .addComponent(lbNumeroEmAnalise)
                            .addComponent(lbNomeEncerrado)
                            .addComponent(lbNumeroEncerrado))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomeEmAndamento)
                            .addComponent(lbNumeroEmAndamento)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbNomeCancelado)
                                    .addComponent(lbNumeroCancelado)))
                            .addComponent(jLabel7))))
                .addGap(28, 28, 28)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        lbLogo.setIcon(new javax.swing.ImageIcon("D:\\Users\\MDEOLINDO\\Desktop\\PROG_APP_GIT\\sistema_chamado\\LL_SUPORTE\\src\\main\\java\\com\\mycompany\\ll_suporte\\imagem\\logo canto superior.png")); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lbNovoChamado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNovoChamado.setText("NOVO CHAMADO");
        lbNovoChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoChamadoMouseClicked(evt);
            }
        });

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lbLogo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lbNovoChamado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lbNovoUsuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lbNovoColaborador))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(lbRelatorio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(lbConsultar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lbListaColaborador))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lbMenu)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbLogo)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNovoChamado)
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNovoUsuario)
                .addGap(13, 13, 13)
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
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMenu)
                .addGap(7, 7, 7)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        tela_relatorio.this.dispose();
        tela_abertura_chamados lbNovoChamado = new tela_abertura_chamados();
        lbNovoChamado.setVisible(true);
    }//GEN-LAST:event_lbNovoChamadoMouseClicked

    private void lbNovoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoUsuarioMouseClicked
        // TODO add your handling code here:
        tela_relatorio.this.dispose();
        tela_cadastro_usuario lbNovoUsuario = new tela_cadastro_usuario();
        lbNovoUsuario.setVisible(true);
    }//GEN-LAST:event_lbNovoUsuarioMouseClicked

    private void lbNovoColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoColaboradorMouseClicked
        // TODO add your handling code here:
        tela_relatorio.this.dispose();
        tela_cadastro_colaborador lbNovoColaborador = new tela_cadastro_colaborador();
        lbNovoColaborador.setVisible(true);
    }//GEN-LAST:event_lbNovoColaboradorMouseClicked

    private void lbRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRelatorioMouseClicked
        // TODO add your handling code here:
        tela_relatorio.this.dispose();
        tela_relatorio lbRelatorio = new tela_relatorio();
        lbRelatorio.setVisible(true);
    }//GEN-LAST:event_lbRelatorioMouseClicked

    private void lbConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsultarMouseClicked
        // TODO add your handling code here:
        tela_relatorio.this.dispose();
        tela_lista_chamados lbConsultar = new tela_lista_chamados();
        lbConsultar.setVisible(true);
    }//GEN-LAST:event_lbConsultarMouseClicked

    private void lbListaColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaColaboradorMouseClicked
        // TODO add your handling code here:
        tela_relatorio.this.dispose();
        tela_lista_colaborador lbListaColaborador = new tela_lista_colaborador();
        lbListaColaborador.setVisible(true);
    }//GEN-LAST:event_lbListaColaboradorMouseClicked

    private void lbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseClicked
        // TODO add your handling code here:
        tela_relatorio.this.dispose();
        tela_menu_rapido lbMenu = new tela_menu_rapido();
        lbMenu.setVisible(true);
    }//GEN-LAST:event_lbMenuMouseClicked

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
            java.util.logging.Logger.getLogger(tela_relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbConsultar;
    private javax.swing.JLabel lbListaColaborador;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JLabel lbNomeCancelado;
    private javax.swing.JLabel lbNomeEmAnalise;
    private javax.swing.JLabel lbNomeEmAndamento;
    private javax.swing.JLabel lbNomeEncerrado;
    private javax.swing.JLabel lbNomeNovos;
    private javax.swing.JLabel lbNomeResolvido;
    private javax.swing.JLabel lbNovoChamado;
    private javax.swing.JLabel lbNovoColaborador;
    private javax.swing.JLabel lbNovoUsuario;
    private javax.swing.JLabel lbNumeroCancelado;
    private javax.swing.JLabel lbNumeroEmAnalise;
    private javax.swing.JLabel lbNumeroEmAndamento;
    private javax.swing.JLabel lbNumeroEncerrado;
    private javax.swing.JLabel lbNumeroNovos;
    private javax.swing.JLabel lbNumeroResolvido;
    private javax.swing.JLabel lbRelatorio;
    // End of variables declaration//GEN-END:variables
}
