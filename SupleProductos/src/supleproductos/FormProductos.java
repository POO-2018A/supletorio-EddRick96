/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supleproductos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ESFOT
 */
public class FormProductos extends javax.swing.JFrame {
    ArrayList<Object> productos = new ArrayList<>();
    int cont = 0;
    
    Controlador control = new Controlador();
    /**
     * Creates new form FormProductos
     */
    public FormProductos() {
        initComponents();
        productos = control.extraerObjetos("productos.dat");
        fullCombo();
        llenarTbl();
        vaciarPanel();
        
    }
    public void vaciarPanel(){
        pnlAcc.setVisible(false);
        pnlCompo.setVisible(false);
        pnlComputador.setVisible(false);
        btnAgregar.setEnabled(false);
    }
    public void llenarTbl(){
        if(productos.size() > 0){
            SupleProductos product = new SupleProductos();
            DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();
            for(int i = 0; i < productos.size(); i ++){
                product = (SupleProductos) productos.get(i);
                Object productosG [] = {product.getNombre(),product.getPrecio(),product.getMarca(),product.getCategoria()};
                model.insertRow(i, productosG);
            }
        }
    }
    public void fullCombo(){
        if(productos.size() > 0){
            cmbProductos.setEnabled(true);
            SupleProductos.cat=false;
            productos = control.extraerObjetos("productos.dat");
            
            cmbProductos.setModel(new javax.swing.DefaultComboBoxModel(productos.toArray()));
        }else{
            cmbProductos.setEnabled(false);
        }
    }
    
    public Double formatDec(Double numer, Integer numerDec) {
        return Math.round(numer * Math.pow(10, numerDec)) / Math.pow(10, numerDec);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        pnlComputador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbTipoComp = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCapComp = new javax.swing.JTextField();
        txtRamComp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtProcComp = new javax.swing.JTextField();
        pnlAcc = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtColorAcc = new javax.swing.JTextField();
        txtTipoAcc = new javax.swing.JTextField();
        pnlCompo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTipoCompo = new javax.swing.JTextField();
        txtCapCompo = new javax.swing.JTextField();
        txtVelCompo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        cmbProductos = new javax.swing.JComboBox<>();
        lblCaract = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        jLabel2.setText("Precio:");

        jLabel3.setText("Categoria:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computador", "Accesorio", "Componente" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        jLabel4.setText("Marca:");

        pnlComputador.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setText("COMPUTADOR");

        jLabel5.setText("Tipo:");

        cmbTipoComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "PC" }));

        jLabel6.setText("Capacidad:");

        jLabel7.setText("RAM:");

        txtCapComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapCompKeyTyped(evt);
            }
        });

        txtRamComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamCompKeyTyped(evt);
            }
        });

        jLabel8.setText("Procesador:");

        javax.swing.GroupLayout pnlComputadorLayout = new javax.swing.GroupLayout(pnlComputador);
        pnlComputador.setLayout(pnlComputadorLayout);
        pnlComputadorLayout.setHorizontalGroup(
            pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComputadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlComputadorLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtProcComp, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addGroup(pnlComputadorLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlComputadorLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(pnlComputadorLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(cmbTipoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlComputadorLayout.createSequentialGroup()
                        .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(22, 22, 22)
                        .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRamComp, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtCapComp))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnlComputadorLayout.setVerticalGroup(
            pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComputadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbTipoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCapComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRamComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtProcComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnlAcc.setBackground(new java.awt.Color(204, 0, 0));

        jLabel9.setText("ACCESORIO");

        jLabel10.setText("Tipo:");

        jLabel11.setText("Color:");

        javax.swing.GroupLayout pnlAccLayout = new javax.swing.GroupLayout(pnlAcc);
        pnlAcc.setLayout(pnlAccLayout);
        pnlAccLayout.setHorizontalGroup(
            pnlAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccLayout.createSequentialGroup()
                .addGroup(pnlAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAccLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel9))
                    .addGroup(pnlAccLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAccLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtColorAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAccLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtTipoAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlAccLayout.setVerticalGroup(
            pnlAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(pnlAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTipoAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtColorAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlCompo.setBackground(new java.awt.Color(0, 153, 153));

        jLabel12.setText("COMPONENTE");

        jLabel13.setText("Tipo:");

        jLabel14.setText("Capacidad:");

        jLabel15.setText("Velocidad:");

        txtCapCompo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapCompoKeyTyped(evt);
            }
        });

        txtVelCompo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVelCompoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlCompoLayout = new javax.swing.GroupLayout(pnlCompo);
        pnlCompo.setLayout(pnlCompoLayout);
        pnlCompoLayout.setHorizontalGroup(
            pnlCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCompoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(pnlCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCompoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(52, 52, 52))
                    .addComponent(txtCapCompo)
                    .addComponent(txtVelCompo)
                    .addComponent(txtTipoCompo))
                .addGap(26, 26, 26))
        );
        pnlCompoLayout.setVerticalGroup(
            pnlCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCompoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(pnlCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTipoCompo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCapCompo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCompoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtVelCompo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Marca", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cmbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProductosItemStateChanged(evt);
            }
        });
        cmbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductosActionPerformed(evt);
            }
        });

        lblCaract.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPrecio)
                                .addComponent(txtNombre)
                                .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pnlComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlCompo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(pnlAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCaract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(pnlComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCaract))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCompo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(pnlAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        String categoria = cmbCategoria.getSelectedItem().toString();
       
        if(categoria.equals("Computador")){
            pnlComputador.setVisible(true);
            pnlAcc.setVisible(false);
            pnlCompo.setVisible(false);
        }else if (categoria.equals("Accesorio")){
            pnlComputador.setVisible(false);
            pnlAcc.setVisible(true);
            pnlCompo.setVisible(false);
            
        }else if(categoria.equals("Componente")){
            pnlComputador.setVisible(false);
            pnlAcc.setVisible(false);
            pnlCompo.setVisible(true);
        }
         btnAgregar.setEnabled(true);
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText();
        String precio = txtPrecio.getText();
        String marca = txtMarca.getText();
        String categoria = cmbCategoria.getSelectedItem().toString();
                        
        if(!nombre.equals("") && !precio.equals("") && !marca.equals("")){
            SupleProductos product = new SupleProductos(nombre,formatDec(Double.valueOf(precio),2),marca, categoria);
            categoriaS(nombre,formatDec(Double.valueOf(precio),2),marca, categoria);//Agrega las diferentes caracteristicas de los productos 
            
            /*productos.add(product);
            control.escribirObjeto("productos.dat", productos);
            productos = control.extraerObjetos("productos.dat");*/
            
            txtNombre.setText("");
            txtPrecio.setText("");
            txtMarca.setText("");
            fullCombo();
            Object productosG [] = {product.getNombre(),product.getPrecio(),product.getMarca(),product.getCategoria()};
            DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();
            model.addRow(productosG);
            vaciarPanel();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor, llene todos los campos.", "¡Alerta!", 0);
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed
//crea un control a través del tipeo del usuario bloqueando las letras o numero del teclado
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && (caracter != 32)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != ',')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCapCompKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapCompKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCapCompKeyTyped

    private void txtRamCompKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamCompKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRamCompKeyTyped

    private void txtCapCompoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapCompoKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCapCompoKeyTyped

    private void txtVelCompoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVelCompoKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtVelCompoKeyTyped

    private void cmbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductosActionPerformed
        int cate = cmbProductos.getSelectedIndex();
        SupleProductos p1 = (SupleProductos) productos.get(cate);
        //categoriaS(p1.getNombre(), p1.getPrecio(), p1.getMarca(), p1.getCategoria);
        if(p1.getCategoria().equals("Computador")){
                        
            p1 = (Computador) productos.get(cate);
            SupleProductos.cat = true;
            lblCaract.setText(p1.toString());
        }else if (p1.getCategoria().equals("Accesorio")){
                      
            p1 = (Accesorio) productos.get(cate);
            SupleProductos.cat = true;
            lblCaract.setText(p1.toString());
        }else if(p1.getCategoria().equals("Componente")){
                        
            p1 = (Componente) productos.get(cate);
            SupleProductos.cat = true;
            lblCaract.setText(p1.toString());
        }
        SupleProductos.cat = false;
        //lblCaract.setText("");
    }//GEN-LAST:event_cmbProductosActionPerformed

    private void cmbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProductosItemStateChanged
        /*String filtro = cmbProductos.getSelectedItem().toString();
        
        TableRowSorter<DefaultTableModel> tblFiltro = new TableRowSorter<DefaultTableModel>();
        tblProductos.setRowSorter(tblFiltro);
        
        if(!filtro.equals("Todos")){
            tblFiltro.setRowFilter(RowFilter.regexFilter(filtro,2));
        }else{
            tblProductos.setRowSorter(tblFiltro);
        }*/
    }//GEN-LAST:event_cmbProductosItemStateChanged

    public void categoriaS(String nombre, double precio, String marca, String categoria){
        //String cat;
        SupleProductos p1;
        if(categoria.equals("Computador")){
            String tipo = cmbTipoComp.getSelectedItem().toString();
            String capacidad = txtCapComp.getText();//int
            String ram = txtRamComp.getText();//int
            String procesador = txtProcComp.getText();
            
            p1 = new Computador(nombre,precio, marca, categoria, tipo, Integer.valueOf(capacidad),Integer.valueOf(ram), procesador);
            productos.add(p1);
            control.escribirObjeto("productos.dat", productos);
            productos = control.extraerObjetos("productos.dat");
            
        }else if (categoria.equals("Accesorio")){
            
            String tipo =txtTipoAcc.getText();
            String color = txtColorAcc.getText();
            
            p1 = new Accesorio(nombre, precio, marca, categoria, tipo, color);
            productos.add(p1);
            control.escribirObjeto("productos.dat", productos);
            productos = control.extraerObjetos("productos.dat");
        }else if(categoria.equals("Componente")){
            String tipo = txtTipoCompo.getText();
            String capacidad = txtCapCompo.getText();//int
            String velocidad = txtVelCompo.getText();//int
            
            p1 = new Componente(nombre, precio, marca, categoria, tipo, Integer.valueOf(capacidad), Integer.valueOf(velocidad));
            productos.add(p1);
            control.escribirObjeto("productos.dat", productos);
            productos = control.extraerObjetos("productos.dat");
            
        }
        
        txtCapComp.setText("");
        txtRamComp.setText("");
        txtProcComp.setText("");
        
        txtTipoAcc.setText("");
        txtColorAcc.setText("");
        
        txtTipoCompo.setText("");
        txtCapCompo.setText("");
        txtVelCompo.setText("");
        
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbProductos;
    private javax.swing.JComboBox<String> cmbTipoComp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaract;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlAcc;
    private javax.swing.JPanel pnlCompo;
    private javax.swing.JPanel pnlComputador;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCapComp;
    private javax.swing.JTextField txtCapCompo;
    private javax.swing.JTextField txtColorAcc;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProcComp;
    private javax.swing.JTextField txtRamComp;
    private javax.swing.JTextField txtTipoAcc;
    private javax.swing.JTextField txtTipoCompo;
    private javax.swing.JTextField txtVelCompo;
    // End of variables declaration//GEN-END:variables
}
