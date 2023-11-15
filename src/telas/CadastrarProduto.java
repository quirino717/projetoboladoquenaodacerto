package telas;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.time.LocalDate;
import projeto.Data;
import projeto.Endereco;
import projeto.Produto;
import projeto.Ingrediente;
import projeto.Manufatura;
import projeto.Processo;
import projeto.Operador;
import projeto.Equipamento;
import projeto.MateriaPrima;
import projeto.Pedido;

public class CadastrarProduto extends javax.swing.JFrame {

    //Instancia todas as listas que serão usadas
    ArrayList<Pedido> lista;
    ArrayList<Produto> listaprod;
    ArrayList<Manufatura> listamanu;
    ArrayList<Ingrediente> listaingr;

    public CadastrarProduto() {
        initComponents();
    }

    //Construtor para receber as listas
    public CadastrarProduto(ArrayList<Pedido> lista, ArrayList<Produto> listaprod, ArrayList<Manufatura> listamanu, ArrayList<Ingrediente> listaingr) {
        this.lista = lista;
        this.listaprod = listaprod;
        this.listamanu = listamanu;
        this.listaingr = listaingr;
        initComponents();
    }

    public ArrayList<Produto> getListaprod() {
        return listaprod;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnomeprod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcustoprod = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtnomein = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtforne = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtuni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprecoing = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtqtd = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtcargo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtsalhr = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtnomeop = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtdiaop1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtmesop1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtanoop1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtidadeop = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtcpfop = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cbestadoop = new javax.swing.JComboBox<>();
        txtcidadeop = new javax.swing.JTextField();
        txtbairroop = new javax.swing.JTextField();
        txtruaop = new javax.swing.JTextField();
        txtcompop = new javax.swing.JTextField();
        txtnumop = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtprocesso = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcustohr = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtqtdpro = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtcustopro = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtnomeequip = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtfabricante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtdiaeq = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtmeseq = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtanoeq = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtdepre = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar produto");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Informe o produto:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Custo total do(s) produto(s):");

        txtcustoprod.setEditable(false);
        txtcustoprod.setBackground(new java.awt.Color(204, 204, 204));
        txtcustoprod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcustoprodFocusGained(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrediente:"));

        jLabel4.setText("Nome:");

        jLabel5.setText("Fornecedor:");

        jLabel6.setText("Unidade:");

        jLabel7.setText("Preço:");

        txtprecoing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoingActionPerformed(evt);
            }
        });

        jLabel8.setText("Quantidade:");

        jButton3.setText("Cadastrar Ingrediente");
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

        jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Users\\quiri\\Downloads\\985515 (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnomein, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtforne, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtuni, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprecoing))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnomein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtforne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecoing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setText("Informações do pedido");
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

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Registrar produto");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Manufatura"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operador:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel16.setText("Cargo:");

        txtcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcargoActionPerformed(evt);
            }
        });

        jLabel17.setText("Sálario por hora:");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais:"));

        jLabel18.setText("Nome:");

        jLabel19.setText("Data de nascimento:");

        jLabel20.setText("/");

        jLabel21.setText("/");

        txtanoop1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtanoop1FocusLost(evt);
            }
        });
        txtanoop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanoop1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Idade:");

        txtidadeop.setEditable(false);
        txtidadeop.setBackground(new java.awt.Color(204, 204, 204));
        txtidadeop.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidadeopFocusGained(evt);
            }
        });
        txtidadeop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidadeopActionPerformed(evt);
            }
        });

        jLabel23.setText("CPF:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnomeop))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcpfop, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdiaop1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmesop1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtanoop1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidadeop, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtnomeop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtdiaop1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtmesop1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtanoop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtidadeop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtcpfop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));

        jLabel24.setText("Estado:");

        jLabel25.setText("Cidade:");

        jLabel26.setText("Bairro:");

        jLabel27.setText("Rua:");

        jLabel28.setText("Número:");

        jLabel29.setText("Complemento:");

        cbestadoop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbestadoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbairroop))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcidadeop, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcompop, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtnumop))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtruaop, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(cbestadoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtruaop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtcidadeop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtnumop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtbairroop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtcompop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\quiri\\Downloads\\3031452 (2).png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsalhr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtsalhr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Processo:"));

        jLabel10.setText("Nome:");

        txtprocesso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtprocessoFocusLost(evt);
            }
        });

        jLabel11.setText("Custo por hora:");

        txtcustohr.setEditable(false);
        txtcustohr.setBackground(new java.awt.Color(204, 204, 204));
        txtcustohr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcustohrFocusGained(evt);
            }
        });
        txtcustohr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustohrActionPerformed(evt);
            }
        });

        jLabel30.setText("Duração do processo:");

        txtqtdpro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtqtdproFocusLost(evt);
            }
        });

        jLabel31.setText("Custo do processo:");

        txtcustopro.setEditable(false);
        txtcustopro.setBackground(new java.awt.Color(204, 204, 204));
        txtcustopro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcustoproFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprocesso))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtqtdpro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcustohr, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcustopro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtprocesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtcustohr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtqtdpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txtcustopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipamento:"));

        jLabel3.setText("Nome:");

        jLabel9.setText("Fabricante:");

        jLabel12.setText("Data de fabricação:");

        jLabel13.setText("/");

        jLabel14.setText("/");

        jLabel15.setText("Depreciação:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnomeequip, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdiaeq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmeseq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtanoeq, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdepre, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtfabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnomeequip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtdiaeq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtmeseq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtanoeq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtdepre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setText("Cadastrar Manufatura");
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

        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\quiri\\Downloads\\3659942 (1).png")); // NOI18N

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\quiri\\Downloads\\6634715 (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(253, 253, 253)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 255));

        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\quiri\\Downloads\\1573145 (1).png")); // NOI18N

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnomeprod, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcustoprod, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel34)
                                .addGap(3, 3, 3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnomeprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtcustoprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)))
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Crias as listas para caso de não terem sido criadas antes da próxima tela
        if (this.lista == null) {
            this.lista = new ArrayList<>();
        }
        if (this.listaprod == null) {
            this.listaprod = new ArrayList<>();
        }
        //Abre a tela de cadastro das informações de pedido e envia as listas
        new CadastrarPedido(this.lista, this.listaprod).setVisible(true);
        //Fecha a tela
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Cadastro do produto:

        //Salva as informações das caixas de texto nas variaveis designadas
        String nomeprod = txtnomeprod.getText();
        float custo = Float.parseFloat(txtcustoprod.getText());

        //Todas as informações sobre o produto são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Produto
        Produto pr = new Produto(nomeprod, listaingr, listamanu, custo);
        //O objeto é adicionado à lista de produtos
        this.listaprod.add(pr);

        //Depois de salvar os valores na lista, limpa as caixas de texto para o próximo registro
        txtnomeprod.setText("");
        txtcustoprod.setText("");

        //Após cadastrar, exibe uma mensagem que o cadastro foi realizado com sucesso
        String msg = "Produto registrado!"; //Variavel para mudar o que é exibido na label
        jLabel38.setText(msg); //Seta o texto da label para o texto da variavel

        System.out.println(pr.imprimir());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Abre uma nova tela de controle e envia a lista para ela
        new Controle(this.lista).setVisible(true);
        //Fecha a tela
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Cadastro do ingrediente:

        //Salva as informações das caixas de texto nas variaveis designadas
        String nomein = txtnomein.getText();
        String fornecedor = txtforne.getText();
        String unidade = txtuni.getText();
        int qtd = Integer.parseInt(txtqtd.getText());
        float preco = Float.parseFloat(txtprecoing.getText());

        //Todas as informações sobre o ingrediente são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Ingrediente
        Ingrediente I = new Ingrediente(qtd, new MateriaPrima(nomein, unidade, fornecedor, preco));
        //O objeto é adicionado à lista de ingredientes referentes ao produto atual
        this.listaingr.add(I);

        //Calculo total do produto
        float valor = 0;
        for (Ingrediente listaingr : listaingr) {
            valor = valor + listaingr.getQtd() * listaingr.materiaprima.getPreco();
            //break;
        }
        for (Manufatura listamanu : listamanu) {
            valor = valor + listamanu.getQtde() * listamanu.processo.calcCusto();
            //break;
        }
        txtcustoprod.setText(String.valueOf(valor));

        //Depois de salvar os valores na lista, limpa as caixas de texto para o próximo registro
        txtnomein.setText("");
        txtforne.setText("");
        txtuni.setText("");
        txtqtd.setText("");
        txtprecoing.setText("");

        //Após cadastrar, exibe uma mensagem que o cadastro do ingrediente foi realizado com sucesso
        String msg = "Ingrediente cadastrado!"; //Variavel para mudar o que é exibido na label
        jLabel38.setText(msg); //Seta o texto da label para o texto da variavel

        System.out.println(I.materiaprima.imprimir());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcargoActionPerformed

    private void txtanoop1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtanoop1FocusLost
        int diaop = Integer.parseInt(txtdiaop1.getText()); //Armazena o valor da caixa de texto na variavel diaop, que representa o dia do nascimento do operador
        int diaatual = LocalDate.now().getDayOfMonth(); //Armanena o valor do dia de hoje na variavel diaatual
        int mesop = Integer.parseInt(txtmesop1.getText()); //Armazena o valor da caixa de texto na variavel mesop, que representa o mes de nascimento do operador
        int mesatual = LocalDate.now().getMonthValue(); //Armanena o valor do mês em que estamos na variavel mesatual
        int anoop = Integer.parseInt(txtanoop1.getText()); //Armazena o valor da caixa de texto na variavel anoop, que representa o ano de nascimento do operador
        int idadeop = 0; //Uma variavel que ira receber o valor da idade

        if (mesop <= mesatual && diaop <= diaatual) {
            //Caso o dia e o mês sejam menores ou iguais à data atual, a idade será a diferença entre o ano atual e o ano de nascimento do operador
            idadeop = LocalDate.now().getYear() - anoop;
        } else if (mesop < mesatual) {
            //Caso o mês seja menor ao mes atual a idade será a subtração de 1 da diferença entre o ano atual e o ano de nascimento do operador
            idadeop = LocalDate.now().getYear() - anoop;
        } else {
            //Caso o dia e o mês sejam maiores à data atual, a idade será a subtração de 1 da diferença entre o ano atual e o ano de nascimento do operador
            idadeop = LocalDate.now().getYear() - anoop - 1;
        }

        txtidadeop.setText(String.valueOf(idadeop)); //Exibe idade na caixa de texto designada
    }//GEN-LAST:event_txtanoop1FocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Cadastro do operador:

        //Salva as informações das caixas de texto nas variaveis designadas
        String cargo = txtcargo.getText();
        float salhr = Float.parseFloat(txtsalhr.getText());
        String nomeop = txtnomeop.getText();
        int diaop = Integer.parseInt(txtdiaop1.getText());
        int mesop = Integer.parseInt(txtmesop1.getText());
        int anoop = Integer.parseInt(txtanoop1.getText());
        int idadeop = Integer.parseInt(txtidadeop.getText());
        String cpfop = txtcpfop.getText();
        String estadoop = String.valueOf(cbestadoop.getSelectedItem());
        String cidadeop = txtcidadeop.getText();
        String bairroop = txtbairroop.getText();
        String ruaop = txtruaop.getText();
        int numenop = Integer.parseInt(txtnumop.getText());
        String comop = txtcompop.getText();

        //Como nem todos os endereços possuem um complemento, não é obrigatorio realizar o preenchimento desse campo
        if (comop == null) { //Então pare que não haja erro, ao identificar que a variavel está "nula", ela recebera uma String vazia
            comop = "";
        }

        //Todas as informações sobre o operador são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Operador
        Operador o = new Operador(cargo, salhr, nomeop,
                new Data(diaop, mesop, anoop), idadeop, cpfop,
                new Endereco(estadoop, cidadeop, bairroop, ruaop, numenop, comop));

        //Cadastro do equipamento:
        //Salva as informações das caixas de texto nas variaveis designadas
        String equip = txtnomeequip.getText();
        String fabricante = txtfabricante.getText();
        int diaeq = Integer.parseInt(txtdiaeq.getText());
        int meseq = Integer.parseInt(txtmeseq.getText());
        int anoeq = Integer.parseInt(txtanoeq.getText());
        float depre = Float.parseFloat(txtdepre.getText());

        //Todas as informações sobre o equipamento são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Equipamento
        Equipamento e = new Equipamento(equip, fabricante, new Data(diaeq, meseq, anoeq), depre);

        //Cadastro do processo:
        //Salva as informações das caixas de texto nas variaveis designadas
        String processo = txtprocesso.getText();
        float custohr = Float.parseFloat(txtcustohr.getText());
        float horas = Float.parseFloat(txtqtdpro.getText());
        float custopro = horas * custohr;

        //Todas as informações sobre o processo são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Processo
        Processo p = new Processo(processo, custohr, o, e);

        //Registrar manufatura
        float duracao = Float.parseFloat(txtqtdpro.getText());
        //Todas as informações sobre a manufatura são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Manufatura
        Manufatura m = new Manufatura(p, duracao);
        //O objeto é adicionado à lista de manufatura referente ao produto atual
        this.listamanu.add(m);

        //Calculo total do produto
        float valor = 0;
        for (Manufatura listamanu : listamanu) {
            valor = valor + listamanu.getQtde() * listamanu.processo.calcCusto();
            //break;
        }
        for (Ingrediente listaingr : listaingr) {
            valor = valor + listaingr.getQtd() * listaingr.materiaprima.getPreco();
            //break;
        }
        txtcustoprod.setText(String.valueOf(valor));

        //Depois de salvar os valores na lista, limpa as caixas de texto para o próximo registro
        txtcargo.setText("");
        txtsalhr.setText("");
        txtnomeop.setText("");
        txtdiaop1.setText("");
        txtmesop1.setText("");
        txtanoop1.setText("");
        txtcpfop.setText("");
        cbestadoop.setSelectedIndex(0); //Faz com que a combobox volte a exibir o primeiro item da lista após salvar o valor
        txtidadeop.setText("");
        txtcidadeop.setText("");
        txtbairroop.setText("");
        txtruaop.setText("");
        txtnumop.setText("");
        txtcompop.setText("");
        txtnomeequip.setText("");
        txtfabricante.setText("");
        txtdiaeq.setText("");
        txtmeseq.setText("");
        txtanoeq.setText("");
        txtdepre.setText("");
        txtprocesso.setText("");
        txtcustohr.setText("");
        txtqtdpro.setText("");
        txtcustopro.setText("");

        //Após cadastrar, exibe uma mensagem que o cadastro da manufatura foi realizado com sucesso
        String msg = "Manufatura cadastrada!"; //Variavel para mudar o que é exibido na label
        jLabel38.setText(msg); //Seta o texto da label para o texto da variavel

        System.out.println(m.processo.imprimir());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtidadeopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidadeopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidadeopActionPerformed

    private void txtcustohrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustohrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcustohrActionPerformed

    private void txtanoop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanoop1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanoop1ActionPerformed

    private void txtprocessoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtprocessoFocusLost
        float depre = Float.parseFloat(txtdepre.getText());
        float salhr = Float.parseFloat(txtsalhr.getText());
        float valor = depre + salhr;
        txtcustohr.setText(String.valueOf(valor));
    }//GEN-LAST:event_txtprocessoFocusLost

    private void txtqtdproFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtqtdproFocusLost
        float horas = Float.parseFloat(txtqtdpro.getText());
        float custohr = Float.parseFloat(txtcustohr.getText());
        txtcustopro.setText(String.valueOf(horas * custohr));
    }//GEN-LAST:event_txtqtdproFocusLost

    private void txtprecoingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecoingActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Executa o mesmo código visto em jButton4ActionPerformed quando a tecla Enter é precionada
            //Cadastro do operador:

            //Salva as informações das caixas de texto nas variaveis designadas
            String cargo = txtcargo.getText();
            float salhr = Float.parseFloat(txtsalhr.getText());
            String nomeop = txtnomeop.getText();
            int diaop = Integer.parseInt(txtdiaop1.getText());
            int mesop = Integer.parseInt(txtmesop1.getText());
            int anoop = Integer.parseInt(txtanoop1.getText());
            int idadeop = Integer.parseInt(txtidadeop.getText());
            String cpfop = txtcpfop.getText();
            String estadoop = String.valueOf(cbestadoop.getSelectedItem());
            String cidadeop = txtcidadeop.getText();
            String bairroop = txtbairroop.getText();
            String ruaop = txtruaop.getText();
            int numenop = Integer.parseInt(txtnumop.getText());
            String comop = txtcompop.getText();

            //Todas as informações sobre o operador são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Operador
            Operador o = new Operador(cargo, salhr, nomeop,
                    new Data(diaop, mesop, anoop), idadeop, cpfop,
                    new Endereco(estadoop, cidadeop, bairroop, ruaop, numenop, comop));

            //Cadastro do equipamento:
            //Salva as informações das caixas de texto nas variaveis designadas
            String equip = txtnomeequip.getText();
            String fabricante = txtfabricante.getText();
            int diaeq = Integer.parseInt(txtdiaeq.getText());
            int meseq = Integer.parseInt(txtmeseq.getText());
            int anoeq = Integer.parseInt(txtanoeq.getText());
            float depre = Float.parseFloat(txtdepre.getText());

            //Todas as informações sobre o equipamento são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Equipamento
            Equipamento e = new Equipamento(equip, fabricante, new Data(diaeq, meseq, anoeq), depre);

            //Cadastro do processo:
            //Salva as informações das caixas de texto nas variaveis designadas
            String processo = txtprocesso.getText();
            float custohr = Float.parseFloat(txtcustohr.getText());
            float horas = Float.parseFloat(txtqtdpro.getText());
            float custopro = horas * custohr;

            //Todas as informações sobre o processo são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Processo
            Processo p = new Processo(nomeop, custohr, o, e);

            //Registrar manufatura
            float duracao = Float.parseFloat(txtqtdpro.getText());
            //Todas as informações sobre a manufatura são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Manufatura
            Manufatura m = new Manufatura(p, duracao);
            //O objeto é adicionado à lista de manufatura referente ao produto atual
            this.listamanu.add(m);

            //Calculo total do produto
            float valor = 0;
            for (Manufatura listamanu : listamanu) {
                valor = valor + listamanu.getQtde() * listamanu.processo.calcCusto();
            }
            for (Ingrediente listaingr : listaingr) {
                valor = valor + listaingr.getQtd() * listaingr.materiaprima.getPreco();
            }
            txtcustoprod.setText(String.valueOf(valor));

            //Depois de salvar os valores na lista, limpa as caixas de texto para o próximo registro
            txtcargo.setText("");
            txtsalhr.setText("");
            txtnomeop.setText("");
            txtdiaop1.setText("");
            txtmesop1.setText("");
            txtanoop1.setText("");
            txtcpfop.setText("");
            cbestadoop.setSelectedIndex(0); //Faz com que a combobox volte a exibir o primeiro item da lista após salvar o valor
            txtidadeop.setText("");
            txtcidadeop.setText("");
            txtbairroop.setText("");
            txtruaop.setText("");
            txtnumop.setText("");
            txtcompop.setText("");
            txtnomeequip.setText("");
            txtfabricante.setText("");
            txtdiaeq.setText("");
            txtmeseq.setText("");
            txtanoeq.setText("");
            txtdepre.setText("");
            txtprocesso.setText("");
            txtcustohr.setText("");
            txtqtdpro.setText("");
            txtcustopro.setText("");

            //Após cadastrar, exibe uma mensagem que o cadastro da manufatura foi realizado com sucesso
            String msg = "Manufatura cadastrada!"; //Variavel para mudar o que é exibido na label
            jLabel38.setText(msg); //Seta o texto da label para o texto da variavel
        }
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Executa o mesmo código visto em jButton3ActionPerformed quando a tecla Enter é precionada
            //Cadastro do ingrediente:

            //Salva as informações das caixas de texto nas variaveis designadas
            String nomein = txtnomein.getText();
            String fornecedor = txtforne.getText();
            String unidade = txtuni.getText();
            int qtd = Integer.parseInt(txtqtd.getText());
            float preco = Float.parseFloat(txtprecoing.getText());

            //Todas as informações sobre o ingrediente são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Ingrediente
            Ingrediente I = new Ingrediente(qtd, new MateriaPrima(nomein, unidade, fornecedor, preco));
            //O objeto é adicionado à lista de ingredientes referentes ao produto atual
            this.listaingr.add(I);

            //Calculo total do produto
            float valor = 0;
            for (Ingrediente listaingr : listaingr) {
                valor = valor + listaingr.getQtd() * listaingr.materiaprima.getPreco();
            }
            for (Manufatura listamanu : listamanu) {
                valor = valor + listamanu.getQtde() * listamanu.processo.calcCusto();
            }
            txtcustoprod.setText(String.valueOf(valor));

            //Depois de salvar os valores na lista, limpa as caixas de texto para o próximo registro
            txtnomein.setText("");
            txtforne.setText("");
            txtuni.setText("");
            txtqtd.setText("");
            txtprecoing.setText("");

            //Após cadastrar, exibe uma mensagem que o cadastro do ingrediente foi realizado com sucesso
            String msg = "Ingrediente cadastrado!"; //Variavel para mudar o que é exibido na label
            jLabel38.setText(msg); //Seta o texto da label para o texto da variavel
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Executa o mesmo código visto em jButton1ActionPerformed quando a tecla Enter é precionada
            //Cadastro do produto:

            //Salva as informações das caixas de texto nas variaveis designadas
            String nomeprod = txtnomeprod.getText();
            float custo = Float.parseFloat(txtcustoprod.getText());

            //Todas as informações sobre o produto são armazenados no novo objeto da classe, de acordo com o construtor criando em projeto.Produto
            Produto pr = new Produto(nomeprod, listaingr, listamanu, custo);
            //O objeto é adicionado à lista de produtos
            this.listaprod.add(pr);

            //Depois de salvar os valores na lista, limpa as caixas de texto para o próximo registro
            txtnomeprod.setText("");
            txtcustoprod.setText("");

            //Após cadastrar, exibe uma mensagem que o cadastro foi realizado com sucesso
            String msg = "Produto registrado!"; //Variavel para mudar o que é exibido na label
            jLabel38.setText(msg); //Seta o texto da label para o texto da variavel
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Executa o mesmo código visto em jButton5ActionPerformed quando a tecla Enter é precionada
            //Crias as listas para caso de não terem sido criadas antes da próxima tela
            if (this.lista == null) {
                this.lista = new ArrayList<>();
            }
            if (this.listaprod == null) {
                this.listaprod = new ArrayList<>();
            }
            //Abre a tela de cadastro das informações de pedido e envia as listas
            new CadastrarPedido(this.lista, this.listaprod).setVisible(true);
            //Fecha a tela
            this.dispose();
        }
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Executa o mesmo código visto em jButton2ActionPerformed quando a tecla Enter é precionada
            //Abre uma nova tela de controle e envia a lista para ela
            new Controle(this.lista).setVisible(true);
            //Fecha a tela
            this.dispose();
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void txtcustoprodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcustoprodFocusGained
        //Quando a caixa de texto de custo do produto ganha foco, a caixa de texto de cargo recebe esse foco
        txtcargo.requestFocus();
    }//GEN-LAST:event_txtcustoprodFocusGained

    private void txtidadeopFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidadeopFocusGained
        //Quando a caixa de texto de idade do operador ganha foco, a caixa de texto de cpf recebe esse foco
        txtcpfop.requestFocus();
    }//GEN-LAST:event_txtidadeopFocusGained

    private void txtcustohrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcustohrFocusGained
        //Quando a caixa de texto de custo por hora ganha foco, a caixa de texto de quantidade de horas recebe esse foco
        txtqtdpro.requestFocus();
    }//GEN-LAST:event_txtcustohrFocusGained

    private void txtcustoproFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcustoproFocusGained
        //Quando a caixa de texto de custo do processo ganha foco, o botão de cadastro da manufatura recebe esse foco
        jButton4.requestFocus();
    }//GEN-LAST:event_txtcustoproFocusGained

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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbestadoop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtanoeq;
    private javax.swing.JTextField txtanoop1;
    private javax.swing.JTextField txtbairroop;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtcidadeop;
    private javax.swing.JTextField txtcompop;
    private javax.swing.JTextField txtcpfop;
    private javax.swing.JTextField txtcustohr;
    private javax.swing.JTextField txtcustopro;
    private javax.swing.JTextField txtcustoprod;
    private javax.swing.JTextField txtdepre;
    private javax.swing.JTextField txtdiaeq;
    private javax.swing.JTextField txtdiaop1;
    private javax.swing.JTextField txtfabricante;
    private javax.swing.JTextField txtforne;
    private javax.swing.JTextField txtidadeop;
    private javax.swing.JTextField txtmeseq;
    private javax.swing.JTextField txtmesop1;
    private javax.swing.JTextField txtnomeequip;
    private javax.swing.JTextField txtnomein;
    private javax.swing.JTextField txtnomeop;
    private javax.swing.JTextField txtnomeprod;
    private javax.swing.JTextField txtnumop;
    private javax.swing.JTextField txtprecoing;
    private javax.swing.JTextField txtprocesso;
    private javax.swing.JTextField txtqtd;
    private javax.swing.JTextField txtqtdpro;
    private javax.swing.JTextField txtruaop;
    private javax.swing.JTextField txtsalhr;
    private javax.swing.JTextField txtuni;
    // End of variables declaration//GEN-END:variables
}
