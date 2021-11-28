/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TrabalhoC3.Execucao;

import java.util.ArrayList;
import TrabalhoC3.Classes.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class Aplicativo extends javax.swing.JFrame {

    /**
     * Creates new form Aplicativo
     */
    public Aplicativo() {
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
        Titulo = new javax.swing.JLabel();
        MetodoDePesquisa = new javax.swing.JLabel();
        MetodoDePesquisaBox = new javax.swing.JComboBox<>();
        Arquivo1 = new javax.swing.JLabel();
        ArquivoBox = new javax.swing.JComboBox<>();
        CPF = new javax.swing.JLabel();
        CPFTextField = new javax.swing.JTextField();
        BotaoPesquisar = new javax.swing.JButton();
        BotaoCreditos = new javax.swing.JButton();
        SPDados = new javax.swing.JScrollPane();
        TableDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Trabalho C3 - Neumann Software");

        MetodoDePesquisa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MetodoDePesquisa.setText("Método de pesquisa");

        MetodoDePesquisaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"", "Árvore ABB", "Árvore AVL", "Lista Hash" }));
        MetodoDePesquisaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodoDePesquisaBoxActionPerformed(evt);
            }
        });

        Arquivo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Arquivo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Arquivo1.setText("Arquivo");

        ArquivoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"", "500 Elementos Aleatórios", "500 Elementos Invertidos", "500 Elementos Ordenados", "1000 Elementos Aleatórios", "1000 Elementos Invertidos", "1000 Elementos Ordenados", "5000 Elementos Aleatórios", "5000 Elementos Invertidos", "5000 Elementos Ordenados", "10000 Elementos Aleatórios", "10000 Elementos Invertidos", "10000 Elementos Ordenados", "50000 Elementos Aleatórios", "50000 Elementos Invertidos", "50000 Elementos Ordenados" }));
        ArquivoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArquivoBoxActionPerformed(evt);
            }
        });

        CPF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CPF.setText("CPF");

        BotaoPesquisar.setText("Pesquisar");
        BotaoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoPesquisarMouseClicked(evt);
            }
        });

        BotaoCreditos.setText("Créditos");
        BotaoCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCreditosMouseClicked(evt);
            }
        });

        TableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Data", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        SPDados.setViewportView(TableDados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPDados)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoCreditos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoPesquisar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(MetodoDePesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Arquivo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MetodoDePesquisaBox, 0, 557, Short.MAX_VALUE)
                                    .addComponent(ArquivoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CPFTextField))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MetodoDePesquisa)
                    .addComponent(MetodoDePesquisaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ArquivoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Arquivo1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CPFTextField))
                .addGap(18, 18, 18)
                .addComponent(SPDados, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoCreditos)
                    .addComponent(BotaoPesquisar))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCreditosMouseClicked
        new Creditos().setVisible(true);
    }//GEN-LAST:event_BotaoCreditosMouseClicked

    private void BotaoPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoPesquisarMouseClicked

        ArrayList<Compra> retornoCompras = new ArrayList<>();
        String CPF = CPFTextField.getText();

        DefaultTableModel tabela = (DefaultTableModel) TableDados.getModel();
        tabela.getDataVector().removeAllElements();
        tabela.fireTableDataChanged();

        try {

            if (CPFTextField.getText().length() != 0) {

                retornoCompras = ExecutarPesquisas.pesquisarCPF(tipoPesquisa, quantidadeDados, CPF);
                tabelaDados(retornoCompras);
            
            } else {

                switch (tipoPesquisa) {
                    
                    case 1:
                            retornoCompras = ExecutarPesquisas.pesquisaABB(quantidadeDados);
                            tabelaDados(retornoCompras);
                        break;

                    case 2:
                            retornoCompras = ExecutarPesquisas.pesquisaAVL(quantidadeDados);
                            tabelaDados(retornoCompras);
                        break;

                    case 3: 
                            retornoCompras = ExecutarPesquisas.pesquisaHash(quantidadeDados);
                            tabelaDados(retornoCompras);  
                        break;

                    default: 
                }
            }

        } catch (StackOverflowError erro) {
            
            System.out.print("\nErro na Árvore ABB de StackOverflow.\n");
        }
    }//GEN-LAST:event_BotaoPesquisarMouseClicked

    private void MetodoDePesquisaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodoDePesquisaBoxActionPerformed
 
        String escolha = (String) MetodoDePesquisaBox.getSelectedItem();

        switch (escolha) {

            case "Árvore ABB":
                    System.out.print("\nOpção 01");
                    tipoPesquisa = 1;
                break;

            case "Árvore AVL":
                    System.out.print("\nOpção 02");
                    tipoPesquisa = 2;
                break;

            case "Lista Hash":
                    System.out.print("\nOpção 03");
                    tipoPesquisa = 3;
                break;

            default:
        }

        //escolhaPesquisa();
    }//GEN-LAST:event_MetodoDePesquisaBoxActionPerformed

    private void ArquivoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArquivoBoxActionPerformed
        
        String escolha = (String) ArquivoBox.getSelectedItem();

        switch (escolha) {

            case "500 Elementos Aleatórios":
                    System.out.print("\nOpção 01");
                    quantidadeDados = 1;
                break;

            case "500 Elementos Invertidos":
                    System.out.print("\nOpção 02");
                    quantidadeDados = 2;
                break;

            case "500 Elementos Ordenados":
                    System.out.print("\nOpção 03");
                    quantidadeDados = 3;
                break;
            
             case "1000 Elementos Aleatórios":
                    System.out.print("\nOpção 04");
                    quantidadeDados = 4;
                break;

            case "1000 Elementos Invertidos":
                    System.out.print("\nOpção 05");
                    quantidadeDados = 5;
                break;

            case "1000 Elementos Ordenados":
                    System.out.print("\nOpção 06");
                    quantidadeDados = 6;
                break;
            
            case "5000 Elementos Aleatórios":
                    System.out.print("\nOpção 07");
                    quantidadeDados = 7;
                break;

            case "5000 Elementos Invertidos":
                    System.out.print("\nOpção 08");
                    quantidadeDados = 8;
                break;

            case "5000 Elementos Ordenados":
                    System.out.print("\nOpção 09");
                    quantidadeDados = 9;
                break;
            
            case "10000 Elementos Aleatórios":
                    System.out.print("\nOpção 10");
                    quantidadeDados = 10;
                break;

            case "10000 Elementos Invertidos":
                    System.out.print("\nOpção 11");
                    quantidadeDados = 11;
                break;

            case "10000 Elementos Ordenados":
                    System.out.print("\nOpção 12");
                    quantidadeDados = 12;
                break;
                
            case "50000 Elementos Aleatórios":
                    System.out.print("\nOpção 13");
                    quantidadeDados = 13;
                break;

            case "50000 Elementos Invertidos":
                    System.out.print("\nOpção 14");
                    quantidadeDados = 14;
                break;

            case "50000 Elementos Ordenados":
                    System.out.print("\nOpção 15");
                    quantidadeDados = 15;
                break;
            
            default:
        }

        //escolhaPesquisa();
    }//GEN-LAST:event_ArquivoBoxActionPerformed

    /*private void adicionarTabela() {

        String nome = "Gabriel", data = "01/01/2000";   
        long cpf = 5;
        double valor = 50;

        DefaultTableModel test = (DefaultTableModel) TableDados.getModel();
        test.setNumRows(0);
        test.addRow(new Object[] {nome, cpf, data, valor});
    }

    private void escolhaPesquisa () {

        ArrayList<Compra> retornoCompras = new ArrayList<>();

        switch (tipoPesquisa) {

            case 1://ABB
                
                
                switch (quantidadeDados) {

                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15:
                            retornoCompras = ExecutarPesquisas.pesquisaABB(quantidadeDados);
                            tabelaDados(retornoCompras);
                        break;
                    
                    default:
                }


                switch (quantidadeDados) {
                        
                    case 1:
                        
                        adicionarTabela();
                        System.out.print("\nMétodo Árvore ABB e Base 500 Ordenados");                     
                        break;

                    default:
                }

                break;

            case 2://AVL
                    switch (quantidadeDados) {

                        case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15:
                            retornoCompras = ExecutarPesquisas.pesquisaAVL(quantidadeDados);
                            tabelaDados(retornoCompras);
                            break;

                        default:
                    }
                break;

            case 3://Lista Hash
                    switch (quantidadeDados) {

                        case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15:
                                retornoCompras = ExecutarPesquisas.pesquisaHash(quantidadeDados);
                                tabelaDados(retornoCompras);
                            break;
                        
                        default:
                    }
                break;
            
            default:
        }
    }*/


    private void tabelaDados (ArrayList<Compra> retornoCompras) {

        /*
            DefaultTableModel test = (DefaultTableModel) TableDados.getModel();
            test.setNumRows(0);
            test.addRow(new Object[] {nome, cpf, data, valor});
        */

        //tabela.setNumRows(retornoCompras.size());
            
            String nome = "", data = "";   
            long cpf = 0;
            double valor = 0;
            SimpleDateFormat dataSimples = new SimpleDateFormat("dd/MM/yyyy");
            DefaultTableModel tabela = (DefaultTableModel) TableDados.getModel();
            tabela.setNumRows(0);

            //if (retornoCompras.size() > 0) {

                for (int contador = 0; contador < retornoCompras.size(); contador++) {

                    nome = retornoCompras.get(contador).getCliente().getNome();
                    data = dataSimples.format(retornoCompras.get(contador).getData().getTime());
                    cpf = retornoCompras.get(contador).getCliente().getCPF();
                    valor = retornoCompras.get(contador).getValor();

                    tabela.addRow(new Object[] {nome, cpf, data, valor});
                }
            
            /*} else {

                tabela.getDataVector().removeAllElements();
                tabela.fireTableDataChanged();
            }*/
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arquivo1;
    private javax.swing.JComboBox<String> ArquivoBox;
    private javax.swing.JButton BotaoCreditos;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JLabel CPF;
    private javax.swing.JTextField CPFTextField;
    private javax.swing.JLabel MetodoDePesquisa;
    private javax.swing.JComboBox<String> MetodoDePesquisaBox;
    private javax.swing.JScrollPane SPDados;
    private javax.swing.JTable TableDados;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables    
    private static byte tipoPesquisa;
    private static byte quantidadeDados;
}
