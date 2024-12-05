package main.java;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import tiendaonline.Carrito;
import tiendaonline.Oferta;
import tiendaonline.PersistenciaCarrito;
import tiendaonline.Producto;
import tiendaonline.Registrado;
import tiendaonline.Sesion;

public class Carrito_1 extends javax.swing.JFrame {
    double envio = 89.0;
    private String nombreUsuario; 

    public Carrito_1() {
        this.nombreUsuario = Sesion.getUsuarioActual().nombreUsuario;
        initComponents();
        imprimirProductosUsuarioActivo();
        inicializarTotales();
        cargarProductosCarrito();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
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

        Panel_Productos_Seleccionados.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel_Productos_SeleccionadosLayout = new javax.swing.GroupLayout(Panel_Productos_Seleccionados);
        Panel_Productos_Seleccionados.setLayout(Panel_Productos_SeleccionadosLayout);
        Panel_Productos_SeleccionadosLayout.setHorizontalGroup(
            Panel_Productos_SeleccionadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
        );
        Panel_Productos_SeleccionadosLayout.setVerticalGroup(
            Panel_Productos_SeleccionadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(Panel_Productos_Seleccionados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_Resumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Panel_Resumen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        Homepage_Inicio_sesion newpagina = new Homepage_Inicio_sesion();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void jButton_PagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PagarMouseClicked

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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
    public static void imprimirProductosUsuarioActivo() {
        Registrado usuarioActual = Sesion.getUsuarioActual(); 
        if (usuarioActual == null) {
            System.out.println("No hay usuario activo en la sesión.");
            return;
        }

        String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_carrito.txt";
        File archivo = new File(fileName);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe para el usuario: " + usuarioActual.getNombreUsuario());
            return;
        }

        System.out.println("Productos del carrito de " + usuarioActual.getNombreUsuario() + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int contador = 1;
            while ((linea = reader.readLine()) != null) {
                System.out.println(contador + ". " + linea);
                contador++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

   
    
    private void cargarProductosCarrito() {
        
        // Cargar productos y ofertas del usuario actual
        Registrado usuarioActivo = Sesion.getUsuarioActual();
        if (usuarioActivo == null) {
            JOptionPane.showMessageDialog(this, "No hay un usuario activo. Inicia sesión para ver tu carrito.");
            return;
        }

        // Cargar productos normales
        List<Producto> productosCarrito = PersistenciaCarrito.cargarCarrito();
        // Cargar ofertas
        List<Oferta> ofertasCarrito = PersistenciaCarrito.cargarOfertasCarrito();

        if (productosCarrito.isEmpty() && ofertasCarrito.isEmpty()) {
            System.out.println("No hay productos ni ofertas en el carrito de " + usuarioActivo.getNombreUsuario());
            JOptionPane.showMessageDialog(this, "Tu carrito está vacío.");
            return;
        }

        mostrarProductos(productosCarrito, ofertasCarrito);
    }

    
    private void mostrarProductos(List<Producto> productosCarrito, List<Oferta> ofertasCarrito) {
        

        
        for (Producto producto : productosCarrito) {
            
            panel_producto_agregado panelProducto = new panel_producto_agregado();
            panelProducto.setNombreProducto(producto.getNombre());
            panelProducto.setPrecioProducto(String.format("$%.2f", producto.getPrecio()));
            panelProducto.setCantidadProducto(String.valueOf(producto.getCantidad()));

            Panel_Productos_Seleccionados.add(panelProducto);
        }

        // Mostrar ofertas
        for (Oferta oferta : ofertasCarrito) {
            panel_producto_agregado panelOferta = new panel_producto_agregado();
            panelOferta.setNombreProducto(oferta.getNombre());
            panelOferta.setPrecioProducto(String.format("$%.2f", oferta.getPrecioDescuento()));
            panelOferta.setCantidadProducto(String.valueOf(oferta.getCantidad()));

            Panel_Productos_Seleccionados.add(panelOferta);
        }

        Panel_Productos_Seleccionados.revalidate();
        Panel_Productos_Seleccionados.repaint();
    }

  
    private void inicializarTotales() {
        TF_Envio.setText("$89.0");
        calcularSubTotal();
        calcularTotal();  
    }
    
    public void calcularSubTotal() {
        double subtotal = 0.0;

        // Calcular el subtotal de productos
        List<Producto> productosCarrito = PersistenciaCarrito.cargarCarrito();
        for (Producto producto : productosCarrito) {
            subtotal += producto.getPrecio() * producto.getCantidad();
        }

        // Calcular el subtotal de ofertas
        List<Oferta> ofertasCarrito = PersistenciaCarrito.cargarOfertasCarrito();
        for (Oferta oferta : ofertasCarrito) {
            subtotal += oferta.getPrecioDescuento() * oferta.getCantidad();
        }

        // Mostrar el subtotal
        TF_SubTotal.setText(String.format("%.2f", subtotal));
    }


    public double calcularTotal() {
        calcularSubTotal(); 
        double subtotal = Double.parseDouble(TF_SubTotal.getText());
        double total = subtotal + envio; // Agrega envío
        TF_Total.setText(String.format("%.2f", total)); // Muestra el total
        return total;
    }

 
}


