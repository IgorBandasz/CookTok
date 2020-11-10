package com.mycompany.testando.telas;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JLabel;
public class TelaAdicionarReceita extends javax.swing.JFrame {
    private  static TelaAdicionarReceita tela = new TelaAdicionarReceita();
    public TelaAdicionarReceita() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonContinuar = new javax.swing.JButton();
        jButtonNovosIngredientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        descricao_nome_receita = new javax.swing.JLabel();
        txtNomeReceita = new javax.swing.JTextField();
        jAvisoReceita = new javax.swing.JLabel();
        jAvisoReceita1 = new javax.swing.JLabel();
        JPainelIngredientes = new javax.swing.JPanel();
        jOpcoesincredientes = new javax.swing.JComboBox<>();
        descricao_ingredientes = new javax.swing.JLabel();
        descricao_quantidade = new javax.swing.JLabel();
        jQuanIngre = new javax.swing.JTextField();
        jTipoUnidade = new javax.swing.JComboBox<>();
        descricao_unidade_de_medida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Cook Tok"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jButtonContinuar.setText("Continuar");
        jButtonContinuar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });

        jButtonNovosIngredientes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonNovosIngredientes.setText("+");
        jButtonNovosIngredientes.setToolTipText("");
        jButtonNovosIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovosIngredientesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cook Tok");

        descricao_nome_receita.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_nome_receita.setForeground(new java.awt.Color(255, 255, 255));
        descricao_nome_receita.setText("Nome da Receita:");

        jAvisoReceita.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jAvisoReceita.setForeground(new java.awt.Color(153, 204, 255));
        jAvisoReceita.setText("Digite o nome da Receita");

        jAvisoReceita1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jAvisoReceita1.setForeground(new java.awt.Color(153, 204, 255));
        jAvisoReceita1.setText("Digite o nome da Receita");

        JPainelIngredientes.setBackground(new java.awt.Color(153, 204, 255));

        jOpcoesincredientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um opção" }));
        jOpcoesincredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcoesincredientesActionPerformed(evt);
            }
        });

        descricao_ingredientes.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_ingredientes.setForeground(new java.awt.Color(255, 255, 255));
        descricao_ingredientes.setText("Ingredientes:");

        descricao_quantidade.setBackground(new java.awt.Color(255, 255, 255));
        descricao_quantidade.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_quantidade.setForeground(new java.awt.Color(255, 255, 255));
        descricao_quantidade.setText("Quant.");

        jQuanIngre.setText("0");

        jTipoUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        descricao_unidade_de_medida.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_unidade_de_medida.setForeground(new java.awt.Color(255, 255, 255));
        descricao_unidade_de_medida.setText("Unidade de Medida");

        javax.swing.GroupLayout JPainelIngredientesLayout = new javax.swing.GroupLayout(JPainelIngredientes);
        JPainelIngredientes.setLayout(JPainelIngredientesLayout);
        JPainelIngredientesLayout.setHorizontalGroup(
            JPainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                .addGroup(JPainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                        .addComponent(descricao_ingredientes)
                        .addGap(213, 213, 213))
                    .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                        .addComponent(jOpcoesincredientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(JPainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(descricao_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(descricao_unidade_de_medida)
                        .addGap(49, 49, 49))
                    .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jQuanIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jTipoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPainelIngredientesLayout.setVerticalGroup(
            JPainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                .addGroup(JPainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricao_ingredientes)
                    .addComponent(descricao_unidade_de_medida)
                    .addComponent(descricao_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOpcoesincredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQuanIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao_nome_receita)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNovosIngredientes, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(283, 283, 283)
                                .addComponent(jAvisoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JPainelIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAvisoReceita1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(547, 547, 547)
                .addComponent(jButtonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(descricao_nome_receita)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAvisoReceita))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jAvisoReceita1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JPainelIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButtonNovosIngredientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonContinuar)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOpcoesincredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcoesincredientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOpcoesincredientesActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        if (txtNomeReceita.getText() == null){
            JDialog jdialog = new JDialog(tela, true);
            jdialog.setSize(200, 200);
            JLabel alerta = new JLabel( );
            alerta.setText("Digite nome da receita!");
            jdialog.add(alerta); 
            jdialog.setVisible(true);
        } else {
            JDialog jdialog = new JDialog(tela, true);
            jdialog.setSize(200, 200);
            JLabel palavra = new JLabel(txtNomeReceita.getText());
            jdialog.add(palavra); 
            jdialog.setVisible(true);
        }
    }//GEN-LAST:event_jButtonContinuarActionPerformed
    //adionar novos botões de ingredientes.
    private void jButtonNovosIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovosIngredientesActionPerformed
        //Tenho que trocar o nome dos componentes para que apareça novos e não substitua os mesmo
        // tenho que arrumar a posição dos intens.
        JPainelIngredientes = new javax.swing.JPanel();
        descricao_nome_receita = new javax.swing.JLabel();
        descricao_unidade_de_medida = new javax.swing.JLabel();
        txtNomeReceita = new javax.swing.JTextField();
        jQuanIngre = new javax.swing.JTextField();
        descricao_ingredientes = new javax.swing.JLabel();
        jOpcoesincredientes = new javax.swing.JComboBox<>();
        
        JPainelIngredientes.setBackground(new java.awt.Color(153, 204, 255));
        
        jTipoUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
     
        descricao_quantidade.setBackground(new java.awt.Color(255, 255, 255));
        descricao_quantidade.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_quantidade.setForeground(new java.awt.Color(255, 255, 255));
        descricao_quantidade.setText("Quant.");

        descricao_nome_receita.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_nome_receita.setForeground(new java.awt.Color(255, 255, 255));
        descricao_nome_receita.setText("Nome da Receita:");

        descricao_unidade_de_medida.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_unidade_de_medida.setForeground(new java.awt.Color(255, 255, 255));
        descricao_unidade_de_medida.setText("Unidade de Medida");

        jQuanIngre.setText("0");

        descricao_ingredientes.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_ingredientes.setForeground(new java.awt.Color(255, 255, 255));
        descricao_ingredientes.setText("Ingredientes:");

        jOpcoesincredientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um opção" }));
        jOpcoesincredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcoesincredientesActionPerformed(evt);
            }
        });

        jAvisoReceita.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jAvisoReceita.setForeground(new java.awt.Color(153, 204, 255));
        jAvisoReceita.setText("Digite o nome da Receita");
        JPainelIngredientes.setLocation(600, 600);
        javax.swing.GroupLayout JPainelIngredientesLayout = new javax.swing.GroupLayout(JPainelIngredientes);
        JPainelIngredientes.setLayout(JPainelIngredientesLayout);
        
            JPainelIngredientesLayout.setHorizontalGroup(
            JPainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                .addGroup(JPainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                .addComponent(descricao_ingredientes)
                .addGap(213, 213, 213))
                .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                .addComponent(jOpcoesincredientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(JPainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(descricao_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(descricao_unidade_de_medida)
                .addGap(49, 49, 49))
                .addGroup(JPainelIngredientesLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jQuanIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jTipoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }//GEN-LAST:event_jButtonNovosIngredientesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdicionarReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tela.getContentPane().setBackground(Color.cyan);
                tela.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPainelIngredientes;
    private javax.swing.JLabel descricao_ingredientes;
    private javax.swing.JLabel descricao_nome_receita;
    private javax.swing.JLabel descricao_quantidade;
    private javax.swing.JLabel descricao_unidade_de_medida;
    private javax.swing.JLabel jAvisoReceita;
    private javax.swing.JLabel jAvisoReceita1;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JButton jButtonNovosIngredientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jOpcoesincredientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jQuanIngre;
    private javax.swing.JComboBox<String> jTipoUnidade;
    private javax.swing.JTextField txtNomeReceita;
    // End of variables declaration//GEN-END:variables

    private static class getContentPane {

        public getContentPane() {
        }

        private void setBackground(Color cyan) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
