package telas;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import projeto.Data;
import projeto.Pessoa;
import projeto.Pedido;
import java.time.LocalDate;
import projeto.Endereco;
import projeto.Ingrediente;
import projeto.Manufatura;
import projeto.Produto;

public class CadastrarPedido extends javax.swing.JFrame {

    //Instancia as listas necessárias
    ArrayList<Pedido> lista;
    ArrayList<Produto> listaprod;
    ArrayList<Manufatura> listamanu;
    ArrayList<Ingrediente> listaingr;

    public CadastrarPedido() {
        initComponents();
    }

    //Construtor para receber as listas
    public CadastrarPedido(ArrayList<Pedido> lista, ArrayList<Produto> listaprod) {
        this.lista = lista;
        this.listaprod = listaprod;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnumped = new javax.swing.JTextField();
        txtdia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtano = new javax.swing.JTextField();
        txtvalorped = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnomeclin = new javax.swing.JTextField();
        txtdia1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtmes1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtano1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbestado = new javax.swing.JComboBox<>();
        txtcidade = new javax.swing.JTextField();
        txtbairro = new javax.swing.JTextField();
        txtrua = new javax.swing.JTextField();
        txtcomp = new javax.swing.JTextField();
        txtnum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de pedidos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do pedido:"));
        jPanel1.setToolTipText("Infor,a");

        jLabel2.setText("Número do pedido:");

        jLabel3.setText("Data do pedido:");

        jLabel4.setText("Valor do pedido:");

        txtdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiaActionPerformed(evt);
            }
        });

        jLabel5.setText("/");

        jLabel6.setText("/");

        txtano.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtanoFocusLost(evt);
            }
        });

        txtvalorped.setEditable(false);
        txtvalorped.setBackground(new java.awt.Color(204, 204, 204));
        txtvalorped.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtvalorpedFocusGained(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\quiri\\Downloads\\9402144 (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnumped, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtvalorped))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnumped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtvalorped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do cliente:"));
        jPanel2.setToolTipText("Infor,a");

        jLabel8.setText("Nome:");

        jLabel9.setText("Data de nascimento:");

        txtnomeclin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeclinActionPerformed(evt);
            }
        });

        jLabel11.setText("/");

        jLabel12.setText("/");

        txtano1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtano1FocusLost(evt);
            }
        });

        jLabel10.setText("Idade:");

        txtidade.setEditable(false);
        txtidade.setBackground(new java.awt.Color(204, 204, 204));
        txtidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidadeFocusGained(evt);
            }
        });
        txtidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidadeActionPerformed(evt);
            }
        });

        jLabel13.setText("CPF:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnomeclin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdia1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmes1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtano1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtnomeclin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(txtano1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdia1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(txtmes1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço de entrega:"));

        jLabel15.setText("Estado:");

        jLabel16.setText("Cidade:");

        jLabel17.setText("Bairro:");

        jLabel18.setText("Rua:");

        jLabel19.setText("Número:");

        jLabel20.setText("Complemento:");

        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbairro))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcomp))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnum))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrua, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
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

        jButton3.setText("Fechar");
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Retorna para tela de controle com as informações de todas as listas
        new Controle(this.lista).setVisible(true);
        //Fecha tela de cadastro de pedido
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Informações do pedido
        int numped = Integer.parseInt(txtnumped.getText());
        int diaped = Integer.parseInt(txtdia.getText());
        int mesped = Integer.parseInt(txtmes.getText());
        int anoped = Integer.parseInt(txtano.getText());
        float valorped = Float.parseFloat(txtvalorped.getText());
        //Limpa as caixas de texto
        txtnumped.setText("");
        txtdia.setText("");
        txtmes.setText("");
        txtano.setText("");
        txtvalorped.setText("");

        //Informações do Cliente
        String nomecli = txtnomeclin.getText();
        int diacli = Integer.parseInt(txtdia1.getText());
        int mescli = Integer.parseInt(txtmes1.getText());
        int anocli = Integer.parseInt(txtano1.getText());
        int idadecli = Integer.parseInt(txtidade.getText());
        String cpfcli = txtcpf.getText();
        //Limpa as caixas de texto
        txtnomeclin.setText("");
        txtdia1.setText("");
        txtmes1.setText("");
        txtano1.setText("");
        txtcpf.setText("");
        txtidade.setText("");

        //Endereço da entrega
        String estadoped = (String) cbestado.getSelectedItem();
        String cidadeped = txtcidade.getText();
        String bairroped = txtbairro.getText();
        String ruaped = txtrua.getText();
        int numendped = Integer.parseInt(txtnum.getText());
        String comped = txtcomp.getText();
        //Limpa as caixas de texto
        cbestado.setSelectedIndex(0); //Faz com que a combobox volte a exibir o primeiro item da lista após salvar o valor
        txtcidade.setText("");
        txtbairro.setText("");
        txtrua.setText("");
        txtnum.setText("");
        txtcomp.setText("");
        
        //Como nem todos os endereços possuem um complemento, não é obrigatorio realizar o preenchimento desse campo
        if (comped == null){ //Então pare que não haja erro, ao identificar que a variavel está "nula", ela recebera uma String vazia
            comped = "";
        }

        //Adiciona informações à classe Pedido
        Pedido p = new Pedido(numped,
                new Pessoa(nomecli,
                        new Data(diacli, mescli, anocli),
                        idadecli, cpfcli,
                        new Endereco(estadoped, cidadeped, bairroped, ruaped, numendped, comped)),
                new Data(diaped, mesped, anoped), this.listaprod, valorped);
        //Adiciona objeto p na lista
        this.lista.add(p);

        //Após cadastrar, exibe uma mensagem que o cadastro do pedido foi realizado com sucesso
        String msg = "Pedido cadastrado!";  //Variavel para mudar o que é exibido na label
        jLabel1.setText(msg); //Seta o texto da label para o texto da variavel

        System.out.println(p.imprimir());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiaActionPerformed

    private void txtnomeclinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeclinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeclinActionPerformed

    private void txtidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidadeActionPerformed

    }//GEN-LAST:event_txtidadeActionPerformed

    private void txtano1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtano1FocusLost
        int diacli = Integer.parseInt(txtdia1.getText()); //Armazena o valor da caixa de texto na variavel diacli, que representa o dia do nascimento do cliente
        int diaatual = LocalDate.now().getDayOfMonth(); //Armanena o valor do dia de hoje na variavel diaatual
        int mescli = Integer.parseInt(txtmes1.getText()); //Armazena o valor da caixa de texto na variavel mescli, que representa o mes de nascimento do cliente
        int mesatual = LocalDate.now().getMonthValue(); //Armanena o valor do mês em que estamos na variavel mesatual
        int anocli = Integer.parseInt(txtano1.getText()); //Armazena o valor da caixa de texto na variavel anocli, que representa o ano de nascimento do cliente
        int idadecli = 0; //Uma variavel que ira receber o valor da idade
        if (mescli <= mesatual && diacli <= diaatual) {
            //Caso o dia e o mês sejam menores ou iguais à data atual, a idade será a diferença entre o ano atual e o ano de nascimento do cliente
            idadecli = LocalDate.now().getYear() - anocli;
        } else if (mescli < mesatual) {
            //Caso o mês seja menor ao mes atual a idade será a subtração de 1 da diferença entre o ano atual e o ano de nascimento do cliente
            idadecli = LocalDate.now().getYear() - anocli;
        } else { //Caso o dia e o mês sejam maiores à data atual, a idade será a subtração de 1 da diferença entre o ano atual e o ano de nascimento do cliente
            idadecli = LocalDate.now().getYear() - anocli - 1;
        }
        txtidade.setText(String.valueOf(idadecli)); //Exibe idade na caixa de texto designada
    }//GEN-LAST:event_txtano1FocusLost

    private void txtanoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtanoFocusLost
        //Quando a caixa de ano da data de entrega perde foco reaiza as ações abaixo
        float valor = 0; //Cria variavel para armazenar informação
        for (Produto listaprod : listaprod) { //"for" para rodar de acordo com o tamanho da lista importada de produto
            valor += listaprod.getCusto(); //Soma os valores dos produtos para formular o preço total do pedido
        }
        txtvalorped.setText(String.valueOf(valor)); //Exibe o valor na caixa de texto
    }//GEN-LAST:event_txtanoFocusLost

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        //Nessa seção o botão foi programado para realizar o cadastro ao apertar a tecla enter, quando está selecionado
        //Todo o código dessa sessão é o mesmo visto na sessão jButton1ActionPerformed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //Informações do pedido
            int numped = Integer.parseInt(txtnumped.getText());
            int diaped = Integer.parseInt(txtdia.getText());
            int mesped = Integer.parseInt(txtmes.getText());
            int anoped = Integer.parseInt(txtano.getText());
            float valorped = Float.parseFloat(txtvalorped.getText());
            //Limpa as caixas de texto
            txtnumped.setText("");
            txtdia.setText("");
            txtmes.setText("");
            txtano.setText("");
            txtvalorped.setText("");

            //Informações do Cliente
            String nomecli = txtnomeclin.getText();
            int diacli = Integer.parseInt(txtdia1.getText());
            int mescli = Integer.parseInt(txtmes1.getText());
            int anocli = Integer.parseInt(txtano1.getText());
            int idadecli = Integer.parseInt(txtidade.getText());
            //Limpa as caixas de texto
            String cpfcli = txtcpf.getText();
            txtnomeclin.setText("");
            txtdia1.setText("");
            txtmes1.setText("");
            txtano1.setText("");
            txtcpf.setText("");
            txtidade.setText("");

            //Endereço da entrega
            String estadoped = (String) cbestado.getSelectedItem();
            String cidadeped = txtcidade.getText();
            String bairroped = txtbairro.getText();
            String ruaped = txtrua.getText();
            int numendped = Integer.parseInt(txtnum.getText());
            String comped = txtcomp.getText();
            //Limpa as caixas de texto
            cbestado.setSelectedIndex(0); //Faz com que a combobox volte a exibir o primeiro item da lista após salvar o valor
            txtcidade.setText("");
            txtbairro.setText("");
            txtrua.setText("");
            txtnum.setText("");
            txtcomp.setText("");

            //Adiciona informações à classe Pedido
            Pedido p = new Pedido(numped,
                    new Pessoa(nomecli,
                            new Data(diacli, mescli, anocli),
                            idadecli, cpfcli,
                            new Endereco(estadoped, cidadeped, bairroped, ruaped, numendped, comped)),
                    new Data(diaped, mesped, anoped), this.listaprod, valorped);
            //Adiciona objeto p na lista
            this.lista.add(p);

            //Após cadastrar, exibe uma mensagem que o cadastro do pedido foi realizado com sucesso
            String msg = "Pedido cadastrado!";  //Variavel para mudar o que é exibido na label
            jLabel1.setText(msg); //Seta o texto da label para o texto da variavel

            System.out.println(p.imprimir());
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        //Nessa seção o botão foi programado para retornar a tela de controle, com as listas, e fechar a tela de cadastro, quando está selecionado
        //Todo o código dessa sessão é o mesmo visto na sessão jButton3ActionPerformed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new Controle(this.lista).setVisible(true); //Retorna para tela de controle
            this.dispose(); //Fecha tela de cadastro de pedido
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void txtvalorpedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtvalorpedFocusGained
        //Quando a caixa de texto de valor do pedido ganha foco, passa o foco para a caixa de texto de nome do cliente
        txtnomeclin.requestFocus();
    }//GEN-LAST:event_txtvalorpedFocusGained

    private void txtidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidadeFocusGained
        //Quando a caixa de texto de idade ganha foco, passa o foco para a caixa de texto do cpf
        txtcpf.requestFocus();
    }//GEN-LAST:event_txtidadeFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (this.lista == null) {
            this.lista = new ArrayList<>();
        }
        if (this.listaprod == null) {
            this.listaprod = new ArrayList<>();
        }
        new CadastrarProduto(this.lista, this.listaprod).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbestado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtano;
    private javax.swing.JTextField txtano1;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcomp;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtdia;
    private javax.swing.JTextField txtdia1;
    private javax.swing.JTextField txtidade;
    private javax.swing.JTextField txtmes;
    private javax.swing.JTextField txtmes1;
    private javax.swing.JTextField txtnomeclin;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtnumped;
    private javax.swing.JTextField txtrua;
    private javax.swing.JTextField txtvalorped;
    // End of variables declaration//GEN-END:variables
}
