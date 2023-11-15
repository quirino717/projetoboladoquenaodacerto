package telas;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import projeto.Pedido;
import projeto.Produto;
import projeto.Manufatura;
import projeto.Ingrediente;

public class Controle extends javax.swing.JFrame {

    //Instancia as listas que serão usadas
    ArrayList<Pedido> lista;
    ArrayList<Produto> listaprod;
    ArrayList<Manufatura> listamanu;
    ArrayList<Ingrediente> listaingr;

    
    public Controle() {
        initComponents();
    }

    ////Construtores para receber as listas
    public Controle(ArrayList<Pedido> lista) {
        this.lista = lista;
        initComponents();
    }
    
    public Controle(ArrayList<Pedido> lista, ArrayList<Produto> listaprod) {
        this.lista = lista;
        this.listaprod = listaprod;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela inicial");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setText("Listar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton3.setText("Consultar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        jButton4.setText("Sobre");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Sair");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });

        jLabel1.setText("O que deseja fazer?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Quando o usuario pressionar o botao "sair" fechara esta tela
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    //Quando o usuario pressionar o botao "sobre" ira abrir a tela Sobre e fechara esta
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Sobre(this.lista).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    //Quando o usuario pressionar o botao "cadastrar" ira abrir a tela de Cadastro e fechara esta
    //Alem disso, ira iniciar as listas que serao usadas nas interfaces caso elas nao estejam criadas
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.lista == null) {
            this.lista = new ArrayList<>();
        }
        if (this.listaprod == null) {
            this.listaprod = new ArrayList<>();
        }
        if (this.listamanu == null) {
            this.listamanu = new ArrayList<>();
        }
        if (this.listaingr == null) {
            this.listaingr = new ArrayList<>();
        }
        new CadastrarProduto(this.lista, this.listaprod, this.listamanu, this.listaingr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Quando o usuario pressionar o botao "consultar" ira abrir a tela de Consultar e fechar esta
    //Alem disso, ira iniciar as listas que serao usadas nas interfaces caso elas nao estejam criadas
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (this.lista == null) {
            this.lista = new ArrayList<>();
        }
        if (this.listaprod == null) {
            this.listaprod = new ArrayList<>();
        }
        if (this.listamanu == null) {
            this.listamanu = new ArrayList<>();
        }
        if (this.listaingr == null) {
            this.listaingr = new ArrayList<>();
        }
        new Consultar(this.lista).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    //Quando o usuario pressionar o botao "listar" ira abrir a tela de Listar e fechar esta
    //Alem disso, ira iniciar a lista de pedido caso ela nao esteja criada
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (this.lista == null) {
            this.lista = new ArrayList<>();
        }
        new Listar(this.lista).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    //Caso o usuario pressione "enter" e o botao "cadastrar" esjeta selecionado, ira abrir a tela de CadastrarProduto e fechar esta
    //Alem disso, ira criar as listas que serao usadas caso elas nao estejam criadas
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.lista == null) {
                this.lista = new ArrayList<>();
            }
            if (this.listaprod == null) {
                this.listaprod = new ArrayList<>();
            }
            if (this.listamanu == null) {
                this.listamanu = new ArrayList<>();
            }
            if (this.listaingr == null) {
                this.listaingr = new ArrayList<>();
            }
            new CadastrarProduto(this.lista, this.listaprod, this.listamanu, this.listaingr).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    //Caso o usuario pressionar "enter" e esteja selecionado o botao "listar", ira abrir a tela Listar e fechar esta
    //Alem disso, ira criar a lista de produto caso nao esteja criada
    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.lista == null) {
                this.lista = new ArrayList<>();
            }
            new Listar(this.lista).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2KeyPressed

    //Caso o usuario pressionar "enter" e esteja selecionado o botao "Consultar", ira abrir a tela Consultar e fechar esta
    //Alem disso, ira criar as listas que serao usadas caso nao estejam criadas
    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.lista == null) {
                this.lista = new ArrayList<>();
            }
            if (this.listaprod == null) {
                this.listaprod = new ArrayList<>();
            }
            if (this.listamanu == null) {
                this.listamanu = new ArrayList<>();
            }
            if (this.listaingr == null) {
                this.listaingr = new ArrayList<>();
            }
            new Consultar(this.lista).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton3KeyPressed

    //Caso o usuario pressione "enter" e o botao "Sobre" esteja selecionado, ira abrir a tela Sobre e fechar esta
    //Alem disso, ira salvar a lista de pedidos para nao perde-la
    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new Sobre(this.lista).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton4KeyPressed
    
    //Caso o usuario pressione "enter" e o botao "Sair" esteja selecionado, ira fechar esta tela
    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton5KeyPressed

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
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
