/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ll_suporte;

/**
 *
 * @author felip
 */
public class tela_abertura_chamados extends javax.swing.JFrame {

    /**
     * Creates new form tela_abertura_chamados
     */
    public tela_abertura_chamados() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbNomeUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lbNomeGrupo = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lbNomeCategoria = new javax.swing.JLabel();
        lbPrazo = new javax.swing.JLabel();
        lbPrioridade = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtPrazo = new javax.swing.JTextField();
        txtPrioridade = new javax.swing.JTextField();
        lbDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        lbNomeNovoChamado = new javax.swing.JLabel();
        btnCriarUsuario = new javax.swing.JButton();
        lbNovoChamado = new javax.swing.JLabel();
        lbNovoColaborador = new javax.swing.JLabel();
        lbConsultar = new javax.swing.JLabel();
        lbRelatorios = new javax.swing.JLabel();
        lbListaColaborador = new javax.swing.JLabel();
        lbNovoUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(123, 150, 212));

        lbNomeUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeUsuario.setText("Usuário:");

        lbNomeGrupo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeGrupo.setText("Grupo:");

        lbTitulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbTitulo.setText("Título:");

        lbNomeCategoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNomeCategoria.setText("Categoria:");

        lbPrazo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbPrazo.setText("Prazo:");

        lbPrioridade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbPrioridade.setText("Prioridade:");

        lbDescricao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbDescricao.setText("Descrição:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        btnCancelar.setBackground(new java.awt.Color(123, 150, 212));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(123, 150, 212));
        btnConfirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lbNomeNovoChamado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNomeNovoChamado.setText("NOVO CHAMADO");

        btnCriarUsuario.setBackground(new java.awt.Color(123, 150, 212));
        btnCriarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCriarUsuario.setText("+");
        btnCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addGap(114, 114, 114))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lbNomeUsuario)
                            .addGap(31, 31, 31)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCriarUsuario)))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbPrazo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbPrioridade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbNomeCategoria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(67, 67, 67)))
                    .addComponent(lbTitulo)
                    .addComponent(lbDescricao)
                    .addComponent(lbNomeGrupo))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbNomeNovoChamado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbNomeNovoChamado)
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCriarUsuario)
                        .addComponent(lbNomeUsuario)
                        .addComponent(lbNomeCategoria))
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeGrupo)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrazo)
                    .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitulo)
                    .addComponent(txtPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrioridade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDescricao)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addGap(72, 72, 72))
        );

        lbNovoChamado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNovoChamado.setText("NOVO CHAMADO");
        lbNovoChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoChamadoMouseClicked(evt);
            }
        });

        lbNovoColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNovoColaborador.setText("NOVO COLABORADOR");
        lbNovoColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoColaboradorMouseClicked(evt);
            }
        });

        lbConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbConsultar.setText("CONSULTAR");
        lbConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbConsultarMouseClicked(evt);
            }
        });

        lbRelatorios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbRelatorios.setText("RELATÓRIOS");
        lbRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRelatoriosMouseClicked(evt);
            }
        });

        lbListaColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbListaColaborador.setText("LISTA DE COLABORADOR");
        lbListaColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaColaboradorMouseClicked(evt);
            }
        });

        lbNovoUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNovoUsuario.setText("NOVO USUARIO");
        lbNovoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoUsuarioMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Users\\lbizio\\Pictures\\ll suporte canto tela.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Users\\lbizio\\Pictures\\PESQUISAR.png")); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Users\\lbizio\\Desktop\\TECH_NIGTH_GIT_HUB\\adicionar-usuario.png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("SAIR");

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Users\\lbizio\\Desktop\\TECH_NIGTH_GIT_HUB\\pessoas.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Users\\lbizio\\Desktop\\TECH_NIGTH_GIT_HUB\\mecanismo-de-busca.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\Users\\lbizio\\Desktop\\TECH_NIGTH_GIT_HUB\\sair.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Users\\lbizio\\Desktop\\TECH_NIGTH_GIT_HUB\\relatorio.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNovoChamado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNovoUsuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNovoColaborador))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRelatorios)
                                    .addComponent(lbConsultar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lbListaColaborador))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addComponent(jSeparator8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbNovoChamado))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbNovoUsuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNovoColaborador))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRelatorios))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbConsultar))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbListaColaborador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbNovoChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoChamadoMouseClicked
        // TODO add your handling code here:
        tela_abertura_chamados.this.dispose();
        tela_abertura_chamados lbNovoChamado = new tela_abertura_chamados();
        lbNovoChamado.setVisible(true);
    }//GEN-LAST:event_lbNovoChamadoMouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        tela_abertura_chamados.this.dispose();
        tela_detalhe_chamado btnConfirmar = new tela_detalhe_chamado();
        btnConfirmar.setVisible(true);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        tela_abertura_chamados.this.dispose();
        tela_menu_rapido btnCancelar = new tela_menu_rapido();
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void lbNovoColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoColaboradorMouseClicked
        // TODO add your handling code here:
        tela_abertura_chamados.this.dispose();
        tela_cadastro_colaborador lbNovoColaborador = new tela_cadastro_colaborador();
        lbNovoColaborador.setVisible(true);
    }//GEN-LAST:event_lbNovoColaboradorMouseClicked

    private void lbConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsultarMouseClicked
        // TODO add your handling code here:
        tela_abertura_chamados.this.dispose();
        tela_lista_chamados lbConsultar = new tela_lista_chamados();
        lbConsultar.setVisible(true);
    }//GEN-LAST:event_lbConsultarMouseClicked

    private void lbNovoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoUsuarioMouseClicked
        // TODO add your handling code here:
        tela_abertura_chamados.this.dispose();
        tela_cadastro_usuario lbNovoUsuario = new tela_cadastro_usuario();
        lbNovoUsuario.setVisible(true);
    }//GEN-LAST:event_lbNovoUsuarioMouseClicked

    private void btnCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarUsuarioActionPerformed
        // TODO add your handling code here:
        tela_abertura_chamados.this.dispose();
        tela_cadastro_usuario btnCriar = new tela_cadastro_usuario();
        btnCriar.setVisible(true);
    }//GEN-LAST:event_btnCriarUsuarioActionPerformed

    private void lbRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRelatoriosMouseClicked
        // TODO add your handling code here:
        tela_abertura_chamados.this.dispose();
        tela_relatorio_chamados lbRelatorios = new tela_relatorio_chamados();
        lbRelatorios.setVisible(true);
    }//GEN-LAST:event_lbRelatoriosMouseClicked

    private void lbListaColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaColaboradorMouseClicked
        // TODO add your handling code here:
        tela_abertura_chamados.this.dispose();
        tela_lista_colaboradores lbListaColaborador = new tela_lista_colaboradores();
        lbListaColaborador.setVisible(true);
    }//GEN-LAST:event_lbListaColaboradorMouseClicked

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
            java.util.logging.Logger.getLogger(tela_abertura_chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_abertura_chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_abertura_chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_abertura_chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_abertura_chamados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnCriarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JLabel lbConsultar;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbListaColaborador;
    private javax.swing.JLabel lbNomeCategoria;
    private javax.swing.JLabel lbNomeGrupo;
    private javax.swing.JLabel lbNomeNovoChamado;
    private javax.swing.JLabel lbNomeUsuario;
    private javax.swing.JLabel lbNovoChamado;
    private javax.swing.JLabel lbNovoColaborador;
    private javax.swing.JLabel lbNovoUsuario;
    private javax.swing.JLabel lbPrazo;
    private javax.swing.JLabel lbPrioridade;
    private javax.swing.JLabel lbRelatorios;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtPrazo;
    private javax.swing.JTextField txtPrioridade;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
