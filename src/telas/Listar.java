package telas;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import projeto.Ingrediente;
import projeto.Manufatura;
import projeto.Pedido;
import projeto.Produto;

public class Listar extends javax.swing.JFrame {

    //Instancia as listas que serão usadas
    ArrayList<Pedido> lista;
    ArrayList<Produto> listaprod;
    ArrayList<Manufatura> listamanu;
    ArrayList<Ingrediente> listaingr;

    public Listar() {
        initComponents();
    }

    //Construtor para receber a lista
    public Listar(ArrayList<Pedido> lista) {
        this.lista = lista;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtlista = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtlista.setEditable(false);
        txtlista.setColumns(20);
        txtlista.setRows(5);
        txtlista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtlista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtlistaFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtlista);

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setText("Listar pedidos");
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

        jButton2.setText("Voltar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Quando o usuario pressionar o botao "voltar" ira iniciar a tela de controle e fechara esta
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Abre uma nova tela de controle e envia a lista para ela
        new Controle(this.lista).setVisible(true);
        //Fecha a tela
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Quando o usuario pressionar o botao "listar" ira checar se a lista esta vazia 
        //Caso não esteja vazia, ira imprimir algumas informacoes de cada pedido registrado no sistema
        String msg = ""; //Variavel de texto vazia para receber as informações
        for (Pedido p : this.lista) { //Coleta as informações de pedido e vai adicionando à variavel msg até que todas tenham sido adicionadas
            msg += p.imprimir(); //Coleta as informações de pedido e vai adicionando à variavel msg até que todas tenham sido adicionadas
        }

        //Caso esteja vazia ira comentar para o usuario que nao foi registrado nenhum pedido
        if (this.lista.isEmpty()) {
            msg = "Não há pedidos registrados!";
        }

        txtlista.setText(msg); //Exibe as informações na caixa de texto
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        //Quando o usuario pressionar o botao "enter" enquanto o botao "listar" estiver selecionado, ira checar se a lista esta vazia.
        //Caso não esteja vazia, ira imprimir algumas informacoes de cada pedido registrado no sistema
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String msg = ""; //Variavel de texto vazia para receber as informações
            for (Pedido p : this.lista) { //Coleta as informações de pedido e vai adicionando à variavel msg até que todas tenham sido adicionadas
                msg += p.imprimir(); //Coleta as informações de pedido e vai adicionando à variavel msg até que todas tenham sido adicionadas
            }

            //Caso esteja vazia ira comentar para o usuario que nao foi registrado nenhum pedido
            if (this.lista.isEmpty()) {
                msg = "Não há pedidos registrados!";
            }

            txtlista.setText(msg); //Exibe as informações na caixa de texto
        }
    }//GEN-LAST:event_jButton1KeyPressed


    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        //Caso o usuario pressionar o botao "enter" quando o botao "voltar" esteja selecionado, ira abrir a tela de controle e fechara esta
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //Abre uma nova tela de controle e envia a lista para ela
            new Controle(this.lista).setVisible(true);
            //Fecha a tela
            this.dispose();
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void txtlistaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlistaFocusGained
        //Quando a caixa de texto ganha foco, o botão de consulta receberá o foco
        jButton1.requestFocus();
    }//GEN-LAST:event_txtlistaFocusGained

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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtlista;
    // End of variables declaration//GEN-END:variables
}
