package telas;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import projeto.Ingrediente;
import projeto.Manufatura;
import projeto.Pedido;
import projeto.Produto;

public class Consultar extends javax.swing.JFrame {

    //Instancia as listas que serão usadas
    ArrayList<Pedido> lista;
    ArrayList<Produto> listaprod;
    ArrayList<Manufatura> listamanu;
    ArrayList<Ingrediente> listaingr;

    public Consultar() {
        initComponents();
    }

    //Construtor para receber a lista
    public Consultar(ArrayList<Pedido> lista) {
        this.lista = lista;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtconsultanum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtconsultaval = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtconsultadia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtconsultames = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtconsultaano = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtconsultanome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtconsultadiac = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtconsultamesc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtconsultaanoc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtconsultaidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtconsultacpf = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtconsultacidade = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtconsultabairro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtconsultarua = new javax.swing.JTextField();
        txtconsultanumend = new javax.swing.JTextField();
        txtconsultacomp = new javax.swing.JTextField();
        txtconsultaestado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfop = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtinfoing = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtinfomanu = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar pedido");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do pedido:"));

        jLabel2.setText("Número:");

        txtconsultanum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtconsultanumFocusGained(evt);
            }
        });
        txtconsultanum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtconsultanumKeyPressed(evt);
            }
        });

        jLabel3.setText("Valor do pedido:");

        txtconsultaval.setEditable(false);
        txtconsultaval.setBackground(new java.awt.Color(204, 204, 204));
        txtconsultaval.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtconsultavalFocusGained(evt);
            }
        });

        jLabel9.setText("Data do pedido:");

        txtconsultadia.setEditable(false);
        txtconsultadia.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setText("/");

        txtconsultames.setEditable(false);
        txtconsultames.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setText("/");

        txtconsultaano.setEditable(false);
        txtconsultaano.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\quiri\\Downloads\\1200px-Magnifying_glass_icon.svg (3).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconsultanum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconsultaval, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconsultadia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconsultames, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconsultaano, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtconsultanum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtconsultaval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtconsultadia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtconsultames, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtconsultaano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente:"));
        jPanel2.setToolTipText("");

        jLabel5.setText("Nome:");

        txtconsultanome.setEditable(false);
        txtconsultanome.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setText("Data de nascimento:");

        txtconsultadiac.setEditable(false);
        txtconsultadiac.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setText("/");

        txtconsultamesc.setEditable(false);
        txtconsultamesc.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setText("/");

        txtconsultaanoc.setEditable(false);
        txtconsultaanoc.setBackground(new java.awt.Color(204, 204, 204));

        jLabel15.setText("Idade:");

        txtconsultaidade.setEditable(false);
        txtconsultaidade.setBackground(new java.awt.Color(204, 204, 204));

        jLabel16.setText("CPF:");

        txtconsultacpf.setEditable(false);
        txtconsultacpf.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtconsultanome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtconsultadiac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtconsultamesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtconsultaanoc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtconsultaidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtconsultacpf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtconsultanome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtconsultadiac, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtconsultamesc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtconsultaanoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtconsultaidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtconsultacpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));

        jLabel17.setText("Estado:");

        jLabel18.setText("Cidade:");

        txtconsultacidade.setEditable(false);
        txtconsultacidade.setBackground(new java.awt.Color(204, 204, 204));

        jLabel19.setText("Bairro:");

        txtconsultabairro.setEditable(false);
        txtconsultabairro.setBackground(new java.awt.Color(204, 204, 204));

        jLabel20.setText("Complemento:");

        jLabel21.setText("Número:");

        jLabel22.setText("Rua:");

        txtconsultarua.setEditable(false);
        txtconsultarua.setBackground(new java.awt.Color(204, 204, 204));

        txtconsultanumend.setEditable(false);
        txtconsultanumend.setBackground(new java.awt.Color(204, 204, 204));

        txtconsultacomp.setEditable(false);
        txtconsultacomp.setBackground(new java.awt.Color(204, 204, 204));

        txtconsultaestado.setEditable(false);
        txtconsultaestado.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtconsultaestado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtconsultabairro))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtconsultacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtconsultacomp))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtconsultarua, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtconsultanumend)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22)
                    .addComponent(txtconsultarua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtconsultaestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(txtconsultacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtconsultanumend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(txtconsultabairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtconsultacomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do produto:"));

        txtinfop.setEditable(false);
        txtinfop.setColumns(20);
        txtinfop.setRows(5);
        jScrollPane1.setViewportView(txtinfop);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do ingrediente:"));

        txtinfoing.setEditable(false);
        txtinfoing.setColumns(20);
        txtinfoing.setRows(5);
        jScrollPane2.setViewportView(txtinfoing);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações da manufatura:"));

        txtinfomanu.setEditable(false);
        txtinfomanu.setColumns(20);
        txtinfomanu.setRows(5);
        jScrollPane3.setViewportView(txtinfomanu);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setText("Consultar");
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(114, 114, 114)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton1))
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Abre uma nova tela de controle e envia a lista para ela
        new Controle(this.lista).setVisible(true);
        //Fecha a tela
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int numped = Integer.parseInt(txtconsultanum.getText()); //Salva o valor do número inserido e o transforma em String
        String msg = "Pedido inexistente!"; //String para exibir mensagem de pedido não encontrado na Label designada
        String produto = ""; //String vazia que irá receber as informações dos produtos
        String ingrediente = ""; //String vazia que irá receber as informações dos ingredientes
        String manufatura = ""; //String vazia que irá receber as informações das manufaturas

        for (Pedido p : lista) { //"for" criado para checar todas as informações da lista de pedidos
            if (String.valueOf(p.getNum()).equals(String.valueOf(numped))) { //Caso haja um pedido equivalente ao valor inserido na caixa de texto "txtconsultanum", irá realizar as ações abaixo
                //Exibe as informações de valor do pedido e data de entrega nas caixas de texto designadas
                txtconsultaval.setText(String.valueOf(p.getTotalPedido()));
                txtconsultadia.setText(String.valueOf(p.getData().getDia()));
                txtconsultames.setText(String.valueOf(p.getData().getMes()));
                txtconsultaano.setText(String.valueOf(p.getData().getAno()));

                //Exibe as informações de dados do cliente nas caixas de texto designadas
                txtconsultanome.setText(p.getCliente().getNome());
                txtconsultadiac.setText(String.valueOf(p.getCliente().getDatanasc().getDia()));
                txtconsultamesc.setText(String.valueOf(p.getCliente().getDatanasc().getMes()));
                txtconsultaanoc.setText(String.valueOf(p.getCliente().getDatanasc().getAno()));
                txtconsultaidade.setText(String.valueOf(p.getCliente().getIdade()));
                txtconsultacpf.setText(p.getCliente().getCpf());

                //Exibe as informações de endereço de entrega nas caixas de texto designadas
                txtconsultaestado.setText(p.getCliente().getEndereco().getEstado());
                txtconsultacidade.setText(p.getCliente().getEndereco().getCidade());
                txtconsultabairro.setText(p.getCliente().getEndereco().getBairro());
                txtconsultarua.setText(p.getCliente().getEndereco().getRua());
                txtconsultanumend.setText(String.valueOf(p.getCliente().getEndereco().getNum()));
                txtconsultacomp.setText(p.getCliente().getEndereco().getComplemento());

                for (Produto pr : p.getProdutos()) { //"for" criado para coletar todas as informações de produto de um pedido 
                    produto += pr.imprimir(); //Armazena as informações do(s) produto(s) na variavel designada por meio da função imprimir()
                }

                for (Produto pr : p.getProdutos()) { //"for" criado para coletar todas as informações de ingrediente e manufatura de um produto
                    for (Ingrediente I : pr.getIngrediente()) {
                        ingrediente += I.materiaprima.imprimir(); //Armazena as informações do(s) ingrediente(s) na variavel designada por meio da função imprimir()
                    }

                    for (Manufatura m : pr.getManufatura()) {
                        manufatura += m.processo.imprimir(); //Armazena as informações da(s) manufaturas(s) na variavel designada por meio da função imprimir()
                    }
                    
                }

                msg = "Pedido encontrado!"; //String para exibir mensagem de pedido na Label designada
                jLabel1.setForeground(new java.awt.Color(0, 255, 0)); //Muda a cor da Label de aviso para verde, quando o produto não existe

                break;//Encerra o "for"
            } else {
                jLabel1.setForeground(new java.awt.Color(255, 0, 0)); //Muda a cor da Label de aviso para vermelho, quando o produto não existe
            }
        }

        txtinfop.setText(produto); //Exibe na caixa de texto as informações de produto
        txtinfoing.setText(ingrediente); //Exibe na caixa de texto as informações de ingrediente
        txtinfomanu.setText(manufatura); //Exibe na caixa de texto as informações de manufatura

        jLabel1.setText(msg); //Label imprime a mensagem designada caso haja, ou não um pedido valido
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtconsultanumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconsultanumFocusGained
        //Essa seção foi programada para apagar todas as informações da label de aviso e das caixas e áreas de texto da tela consultar, para que fique limpo para a próxima consulta
        //A ação é realizada assim que a caixa de texto "txtconsultanum" ganha foco
        txtconsultanum.setText("");

        txtconsultaval.setText("");
        txtconsultadia.setText("");
        txtconsultames.setText("");
        txtconsultaano.setText("");

        txtconsultanome.setText("");
        txtconsultadiac.setText("");
        txtconsultamesc.setText("");
        txtconsultaanoc.setText("");
        txtconsultaidade.setText("");
        txtconsultacpf.setText("");

        txtconsultaestado.setText("");
        txtconsultacidade.setText("");
        txtconsultabairro.setText("");
        txtconsultarua.setText("");
        txtconsultanumend.setText("");
        txtconsultacomp.setText("");

        txtinfop.setText("");
        txtinfoing.setText("");
        txtinfomanu.setText("");

        String msg = "";
        jLabel1.setText(msg);
    }//GEN-LAST:event_txtconsultanumFocusGained

    private void txtconsultanumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconsultanumKeyPressed
        //Essa seção foi programada para que o botão de consultar ganhe foco assim que a tecla Enter seja precionada
        //Essa ação só ocorre quando a caixa de texto "txtconsultanum" está selecionada
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.requestFocus();
        }
    }//GEN-LAST:event_txtconsultanumKeyPressed

    private void txtconsultavalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconsultavalFocusGained
        //Essa seção foi programada para que o botão de consultar ganhe foco assim que a caixa de texto "txtconsultaval" ganhe foco
        //A seção foi criada para chegar no botão ao apertar a tecla TAB
        jButton1.requestFocus();
    }//GEN-LAST:event_txtconsultavalFocusGained

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //Abre uma nova tela de controle e envia a lista para ela
            new Controle(this.lista).setVisible(true);
            //Fecha a tela
            this.dispose();
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        //Essa seção realiza a consulta, porem ao invés de clicar no botão com o mouse, a consulta é feita ao apertar a tecla Enter com o botão selecionado
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int numped = Integer.parseInt(txtconsultanum.getText()); //Salva o valor do número inserido e o transforma em String
            String msg = "Pedido inexistente!"; //String para exibir mensagem de pedido não encontrado na Label designada
            String produto = ""; //String vazia que irá receber as informações dos produtos
            String ingrediente = ""; //String vazia que irá receber as informações dos ingredientes
            String manufatura = ""; //String vazia que irá receber as informações das manufaturas

            for (Pedido p : lista) { //"for" criado para checar todas as informações da lista de pedidos
                if (String.valueOf(p.getNum()).equals(String.valueOf(numped))) { //Caso haja um pedido equivalente ao valor inserido na caixa de texto "txtconsultanum", irá realizar as ações abaixo
                    //Exibe as informações de valor do pedido e data de entrega nas caixas de texto designadas
                    txtconsultaval.setText(String.valueOf(p.getTotalPedido()));
                    txtconsultadia.setText(String.valueOf(p.getData().getDia()));
                    txtconsultames.setText(String.valueOf(p.getData().getMes()));
                    txtconsultaano.setText(String.valueOf(p.getData().getAno()));

                    //Exibe as informações de dados do cliente nas caixas de texto designadas
                    txtconsultanome.setText(p.getCliente().getNome());
                    txtconsultadiac.setText(String.valueOf(p.getCliente().getDatanasc().getDia()));
                    txtconsultamesc.setText(String.valueOf(p.getCliente().getDatanasc().getMes()));
                    txtconsultaanoc.setText(String.valueOf(p.getCliente().getDatanasc().getAno()));
                    txtconsultaidade.setText(String.valueOf(p.getCliente().getIdade()));
                    txtconsultacpf.setText(p.getCliente().getCpf());

                    //Exibe as informações de endereço de entrega nas caixas de texto designadas
                    txtconsultaestado.setText(p.getCliente().getEndereco().getEstado());
                    txtconsultacidade.setText(p.getCliente().getEndereco().getCidade());
                    txtconsultabairro.setText(p.getCliente().getEndereco().getBairro());
                    txtconsultarua.setText(p.getCliente().getEndereco().getRua());
                    txtconsultanumend.setText(String.valueOf(p.getCliente().getEndereco().getNum()));
                    txtconsultacomp.setText(p.getCliente().getEndereco().getComplemento());

                    for (Produto pr : p.getProdutos()) { //"for" criado para coletar todas as informações de produto de um pedido 
                        produto += pr.imprimir(); //Armazena as informações do(s) produto(s) na variavel designada por meio da função imprimir()
                    }

                    for (Produto pr : p.getProdutos()) { //"for" criado para coletar todas as informações de ingrediente e manufatura de um produto
                        for (Ingrediente I : pr.getIngrediente()) {
                            ingrediente += I.materiaprima.imprimir(); //Armazena as informações do(s) ingrediente(s) na variavel designada por meio da função imprimir()
                        }

                        for (Manufatura m : pr.getManufatura()) {
                            manufatura += m.processo.imprimir(); //Armazena as informações da(s) manufaturas(s) na variavel designada por meio da função imprimir()
                        }
                        
                    }

                    msg = "Pedido encontrado!"; //String para exibir mensagem de pedido na Label designada
                    jLabel1.setForeground(new java.awt.Color(0, 255, 0)); //Muda a cor da Label de aviso para verde, quando o produto não existe

                    break;//Encerra o "for"
                } else {
                    jLabel1.setForeground(new java.awt.Color(255, 0, 0)); //Muda a cor da Label de aviso para vermelho, quando o produto não existe
                }
            }

            txtinfop.setText(produto); //Exibe na caixa de texto as informações de produto
            txtinfoing.setText(ingrediente); //Exibe na caixa de texto as informações de ingrediente
            txtinfomanu.setText(manufatura); //Exibe na caixa de texto as informações de manufatura

            jLabel1.setText(msg); //Label imprime a mensagem designada caso haja, ou não um pedido valido
        }
    }//GEN-LAST:event_jButton1KeyPressed

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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtconsultaano;
    private javax.swing.JTextField txtconsultaanoc;
    private javax.swing.JTextField txtconsultabairro;
    private javax.swing.JTextField txtconsultacidade;
    private javax.swing.JTextField txtconsultacomp;
    private javax.swing.JTextField txtconsultacpf;
    private javax.swing.JTextField txtconsultadia;
    private javax.swing.JTextField txtconsultadiac;
    private javax.swing.JTextField txtconsultaestado;
    private javax.swing.JTextField txtconsultaidade;
    private javax.swing.JTextField txtconsultames;
    private javax.swing.JTextField txtconsultamesc;
    private javax.swing.JTextField txtconsultanome;
    private javax.swing.JTextField txtconsultanum;
    private javax.swing.JTextField txtconsultanumend;
    private javax.swing.JTextField txtconsultarua;
    private javax.swing.JTextField txtconsultaval;
    private javax.swing.JTextArea txtinfoing;
    private javax.swing.JTextArea txtinfomanu;
    private javax.swing.JTextArea txtinfop;
    // End of variables declaration//GEN-END:variables
}
