/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import cookTok.Ingrediente;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author ester
 */
public class TelaAdicionar_Ingrediente_Receita extends javax.swing.JFrame {
    /**
     * Creates new form TelaAdicionar_Ingrediente_Receita
     */
    public TelaAdicionar_Ingrediente_Receita() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Poupop = new javax.swing.JDialog();
        mensagem_de_alerta = new javax.swing.JLabel();
        PainelFundo = new javax.swing.JPanel();
        PainelCabecalho = new javax.swing.JPanel();
        cabecalho_Nome = new javax.swing.JLabel();
        PainelNomeReceita = new javax.swing.JPanel();
        txtNome_Receita = new javax.swing.JTextField();
        descricao_nome_receita = new javax.swing.JLabel();
        PainelIngredientes = new javax.swing.JPanel();
        descricao_indgredientes = new javax.swing.JLabel();
        descricao_ingredientes_quantidade = new javax.swing.JLabel();
        descricao_ingredientes_unidadedemedida = new javax.swing.JLabel();
        txtCombo_Box_ingredientes = new javax.swing.JComboBox<>();
        txtIngrediente_Quantidade = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        Button_Adicionar_Ingrediente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_de_ingredientes = new javax.swing.JTable();
        Button_Excluir_Ingrediente_Tabela = new javax.swing.JButton();
        PainelRodapé = new javax.swing.JPanel();
        Button_Continuar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Poupop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout PoupopLayout = new javax.swing.GroupLayout(Poupop.getContentPane());
        Poupop.getContentPane().setLayout(PoupopLayout);
        PoupopLayout.setHorizontalGroup(
            PoupopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PoupopLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(mensagem_de_alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        PoupopLayout.setVerticalGroup(
            PoupopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PoupopLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(mensagem_de_alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelFundo.setBackground(new java.awt.Color(204, 204, 255));

        PainelCabecalho.setBackground(new java.awt.Color(204, 204, 255));
        PainelCabecalho.setForeground(new java.awt.Color(204, 204, 255));

        cabecalho_Nome.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        cabecalho_Nome.setForeground(new java.awt.Color(255, 255, 255));
        cabecalho_Nome.setText("Cook Tok");

        javax.swing.GroupLayout PainelCabecalhoLayout = new javax.swing.GroupLayout(PainelCabecalho);
        PainelCabecalho.setLayout(PainelCabecalhoLayout);
        PainelCabecalhoLayout.setHorizontalGroup(
            PainelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCabecalhoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(cabecalho_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelCabecalhoLayout.setVerticalGroup(
            PainelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabecalho_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelNomeReceita.setBackground(new java.awt.Color(204, 204, 255));

        descricao_nome_receita.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_nome_receita.setForeground(new java.awt.Color(255, 255, 255));
        descricao_nome_receita.setText("Nome da Receita:");

        javax.swing.GroupLayout PainelNomeReceitaLayout = new javax.swing.GroupLayout(PainelNomeReceita);
        PainelNomeReceita.setLayout(PainelNomeReceitaLayout);
        PainelNomeReceitaLayout.setHorizontalGroup(
            PainelNomeReceitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNomeReceitaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PainelNomeReceitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricao_nome_receita)
                    .addComponent(txtNome_Receita, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelNomeReceitaLayout.setVerticalGroup(
            PainelNomeReceitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNomeReceitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descricao_nome_receita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome_Receita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        PainelIngredientes.setBackground(new java.awt.Color(204, 204, 255));

        descricao_indgredientes.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_indgredientes.setForeground(new java.awt.Color(255, 255, 255));
        descricao_indgredientes.setText("Ingrediente:");

        descricao_ingredientes_quantidade.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_ingredientes_quantidade.setForeground(new java.awt.Color(255, 255, 255));
        descricao_ingredientes_quantidade.setText("Quantidade");

        descricao_ingredientes_unidadedemedida.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descricao_ingredientes_unidadedemedida.setForeground(new java.awt.Color(255, 255, 255));
        descricao_ingredientes_unidadedemedida.setText("Unidade de Medida");

        txtCombo_Box_ingredientes.setBackground(new java.awt.Color(204, 204, 255));
        txtCombo_Box_ingredientes.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtCombo_Box_ingredientes.setForeground(new java.awt.Color(255, 255, 255));
        txtCombo_Box_ingredientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma opção", "Item 2", "Item 3", "Item 4" }));

        txtIngrediente_Quantidade.setBackground(new java.awt.Color(204, 204, 255));
        txtIngrediente_Quantidade.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtIngrediente_Quantidade.setForeground(new java.awt.Color(255, 255, 255));
        txtIngrediente_Quantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIngrediente_Quantidade.setText("0");

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));

        Button_Adicionar_Ingrediente.setBackground(new java.awt.Color(204, 204, 255));
        Button_Adicionar_Ingrediente.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Button_Adicionar_Ingrediente.setForeground(new java.awt.Color(255, 255, 255));
        Button_Adicionar_Ingrediente.setText("Adicionar");

        tabela_de_ingredientes.setBackground(new java.awt.Color(204, 204, 255));
        tabela_de_ingredientes.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabela_de_ingredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ingredientes", "Quntidade", "Unidade de Medida"
            }
        ));
        jScrollPane2.setViewportView(tabela_de_ingredientes);

        Button_Excluir_Ingrediente_Tabela.setBackground(new java.awt.Color(204, 204, 255));
        Button_Excluir_Ingrediente_Tabela.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Button_Excluir_Ingrediente_Tabela.setForeground(new java.awt.Color(255, 255, 255));
        Button_Excluir_Ingrediente_Tabela.setText("Excluir");

        javax.swing.GroupLayout PainelIngredientesLayout = new javax.swing.GroupLayout(PainelIngredientes);
        PainelIngredientes.setLayout(PainelIngredientesLayout);
        PainelIngredientesLayout.setHorizontalGroup(
            PainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelIngredientesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelIngredientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PainelIngredientesLayout.createSequentialGroup()
                        .addGroup(PainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao_indgredientes)
                            .addComponent(txtCombo_Box_ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(PainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao_ingredientes_quantidade)
                            .addGroup(PainelIngredientesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtIngrediente_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(PainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelIngredientesLayout.createSequentialGroup()
                                .addComponent(descricao_ingredientes_unidadedemedida)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelIngredientesLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(PainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button_Excluir_Ingrediente_Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_Adicionar_Ingrediente, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addGap(70, 70, 70))))))
        );
        PainelIngredientesLayout.setVerticalGroup(
            PainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelIngredientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricao_indgredientes)
                    .addComponent(descricao_ingredientes_quantidade)
                    .addComponent(descricao_ingredientes_unidadedemedida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCombo_Box_ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIngrediente_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1)
                    .addComponent(Button_Adicionar_Ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PainelIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelIngredientesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Button_Excluir_Ingrediente_Tabela)))
                .addGap(20, 20, 20))
        );

        PainelRodapé.setBackground(new java.awt.Color(204, 204, 255));

        Button_Continuar.setBackground(new java.awt.Color(204, 204, 255));
        Button_Continuar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Button_Continuar.setForeground(new java.awt.Color(255, 255, 255));
        Button_Continuar.setText("Continuar");
        Button_Continuar.setToolTipText("");
        Button_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelRodapéLayout = new javax.swing.GroupLayout(PainelRodapé);
        PainelRodapé.setLayout(PainelRodapéLayout);
        PainelRodapéLayout.setHorizontalGroup(
            PainelRodapéLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRodapéLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        PainelRodapéLayout.setVerticalGroup(
            PainelRodapéLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRodapéLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Button_Continuar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelFundoLayout = new javax.swing.GroupLayout(PainelFundo);
        PainelFundo.setLayout(PainelFundoLayout);
        PainelFundoLayout.setHorizontalGroup(
            PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelNomeReceita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelIngredientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelCabecalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelRodapé, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelFundoLayout.setVerticalGroup(
            PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFundoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(PainelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(PainelRodapé, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void Button_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ContinuarActionPerformed
   Ingrediente ingrediente= new Ingrediente ();
   String ingre;
    if (txtNome_Receita.getText().isEmpty()) {
        Poupop.setSize(400, 200);
        mensagem_de_alerta.setText("Digite nome da receita!");
        Poupop.add(mensagem_de_alerta); 
        Poupop.setVisible(true);
        Poupop.setVisible(true);       
    } //else if (tabela_de_ingredientes.getValueAt(1,1).toString().isEmpty()){
//        Poupop.setSize(400, 200);
//        mensagem_de_alerta.setText("Digite um ingrediente!");
//        Poupop.add(mensagem_de_alerta); 
//        Poupop.setVisible(true);
//        Poupop.setVisible(true);
        
 //   }
    else {
        Poupop.setSize(400, 200);
        ingrediente.setNome_Ingred((txtNome_Receita.getText()));
        mensagem_de_alerta.setText(ingrediente.getNome_Ingred());
        Poupop.add(mensagem_de_alerta); 
        Poupop.setVisible(true);
    }//GEN-LAST:event_Button_ContinuarActionPerformed

}
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        //MASSA PARA TESTES 
       //Unidade de Medida
        //INGREDIENTES
        Ingrediente ingre1 = new Ingrediente("Leite Condensado");
        Ingrediente ingre2 = new Ingrediente("Farinha de Trigo");
        Ingrediente ingre3 = new Ingrediente("Leite");
        Ingrediente ingre4 = new Ingrediente("Ovo");
        Ingrediente ingre5 = new Ingrediente("Manteiga");
        Ingrediente ingre6 = new Ingrediente("Oleo");
        Ingrediente ingre7 = new Ingrediente("Granulado");
        Ingrediente ingre8 = new Ingrediente("Creme de Leite");    
       
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
            java.util.logging.Logger.getLogger(TelaAdicionar_Ingrediente_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionar_Ingrediente_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionar_Ingrediente_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionar_Ingrediente_Receita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdicionar_Ingrediente_Receita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Adicionar_Ingrediente;
    private javax.swing.JButton Button_Continuar;
    private javax.swing.JButton Button_Excluir_Ingrediente_Tabela;
    private javax.swing.JPanel PainelCabecalho;
    private javax.swing.JPanel PainelFundo;
    private javax.swing.JPanel PainelIngredientes;
    private javax.swing.JPanel PainelNomeReceita;
    private javax.swing.JPanel PainelRodapé;
    private javax.swing.JDialog Poupop;
    private javax.swing.JLabel cabecalho_Nome;
    private javax.swing.JLabel descricao_indgredientes;
    private javax.swing.JLabel descricao_ingredientes_quantidade;
    private javax.swing.JLabel descricao_ingredientes_unidadedemedida;
    private javax.swing.JLabel descricao_nome_receita;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mensagem_de_alerta;
    private javax.swing.JTable tabela_de_ingredientes;
    private javax.swing.JComboBox<String> txtCombo_Box_ingredientes;
    private javax.swing.JTextField txtIngrediente_Quantidade;
    private javax.swing.JTextField txtNome_Receita;
    // End of variables declaration//GEN-END:variables
}
