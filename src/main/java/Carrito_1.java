
import tiendaonline.Carrito;
import tiendaonline.Producto;

public class Carrito_1 extends javax.swing.JFrame {
    double envio = 89.0;

    public Carrito_1() {
        initComponents();
        
        inicializarTotales();
        
        //cargarProductosUsuario();
        //mostrarProductosUsuario();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Resumen = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton_Pagar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        TF_SubTotal = new javax.swing.JTextField();
        TF_Total = new javax.swing.JTextField();
        TF_Envio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Borrar_Productos = new javax.swing.JButton();
        jScrollPane_Productos = new javax.swing.JScrollPane();
        Panel_Productos_Seleccionados = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(906, 500));

        Panel_Resumen.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Resumen");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Subtotal: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Envío: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel7.setText("Total: ");

        jButton_Pagar.setBackground(new java.awt.Color(204, 0, 0));
        jButton_Pagar.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        jButton_Pagar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Pagar.setText("Pagar");
        jButton_Pagar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_Pagar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_PagarMouseClicked(evt);
            }
        });
        jButton_Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PagarActionPerformed(evt);
            }
        });

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        TF_SubTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TF_SubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TF_SubTotal.setText("$0");
        TF_SubTotal.setBorder(null);

        TF_Total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TF_Total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TF_Total.setText("$0");
        TF_Total.setBorder(null);

        TF_Envio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TF_Envio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TF_Envio.setText("$0");
        TF_Envio.setBorder(null);

        javax.swing.GroupLayout Panel_ResumenLayout = new javax.swing.GroupLayout(Panel_Resumen);
        Panel_Resumen.setLayout(Panel_ResumenLayout);
        Panel_ResumenLayout.setHorizontalGroup(
            Panel_ResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ResumenLayout.createSequentialGroup()
                .addGroup(Panel_ResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_ResumenLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Panel_ResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_ResumenLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ResumenLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_Envio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ResumenLayout.createSequentialGroup()
                                .addGroup(Panel_ResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(TF_SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))
                    .addGroup(Panel_ResumenLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_regresar)
                        .addGap(24, 24, 24)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ResumenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        Panel_ResumenLayout.setVerticalGroup(
            Panel_ResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ResumenLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(Panel_ResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TF_SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_ResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TF_Envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(Panel_ResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_regresar)
                .addGap(17, 17, 17))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cesta");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("(0)");

        jButton_Borrar_Productos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton_Borrar_Productos.setForeground(new java.awt.Color(0, 102, 153));
        jButton_Borrar_Productos.setText("Borrar artículos");
        jButton_Borrar_Productos.setBorder(null);
        jButton_Borrar_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Borrar_ProductosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Borrar_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Borrar_Productos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane_Productos.setViewportView(null);

        Panel_Productos_Seleccionados.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Productos_Seleccionados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout Panel_Productos_SeleccionadosLayout = new javax.swing.GroupLayout(Panel_Productos_Seleccionados);
        Panel_Productos_Seleccionados.setLayout(Panel_Productos_SeleccionadosLayout);
        Panel_Productos_SeleccionadosLayout.setHorizontalGroup(
            Panel_Productos_SeleccionadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );
        Panel_Productos_SeleccionadosLayout.setVerticalGroup(
            Panel_Productos_SeleccionadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        jScrollPane_Productos.setViewportView(Panel_Productos_Seleccionados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane_Productos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Resumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Resumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane_Productos)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        Homepage_Inicio_sesion newpagina = new Homepage_Inicio_sesion();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void jButton_PagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PagarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_PagarMouseClicked

    private void jButton_Borrar_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Borrar_ProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Borrar_ProductosMouseClicked

    private void jButton_PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PagarActionPerformed
        double total = calcularTotal(); // Obtén el total del carrito
        Pago pago = new Pago(total);  
        pago.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_PagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Productos_Seleccionados;
    private javax.swing.JPanel Panel_Resumen;
    private javax.swing.JTextField TF_Envio;
    private javax.swing.JTextField TF_SubTotal;
    private javax.swing.JTextField TF_Total;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton jButton_Borrar_Productos;
    private javax.swing.JButton jButton_Pagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane_Productos;
    // End of variables declaration//GEN-END:variables

    
    private void inicializarTotales() {
        calcularSubTotal();
        calcularTotal();  
        TF_Envio.setText("$89.0");
    }
    
    public void calcularSubTotal() {
        Carrito carrito = Carrito.getInstance("usuario123"); // Obtén la instancia del carrito
        double SubTotal = carrito.calcularTotal();
        String SubTotal_txt = String.format("%.2f", SubTotal);
        TF_Total.setText(SubTotal_txt);
    }
    
    public double calcularTotal() {
        Carrito carrito = Carrito.getInstance("usuario123"); // Obtén la instancia del carrito
        double Total = carrito.calcularTotal() + envio;
        String Total_txt = String.format("%.2f", Total);
        TF_Total.setText(Total_txt);
        return Total;
    }

    /*
    
    private void cargarProductosUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void mostrarProductosUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
*/

    

    
 
}


