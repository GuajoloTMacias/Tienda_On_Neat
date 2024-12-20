package main.java;

import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import tiendaonline.Carrito;
import java.awt.GridLayout;
import java.io.InputStream;
import java.util.List;
import tiendaonline.Oferta;
import tiendaonline.PersistenciaCarrito;
import tiendaonline.Registrado;
import tiendaonline.Sesion;

public class Producto_panel_oferta extends javax.swing.JPanel {

    /**
     * Creates new form Producto_panel
     * @param nombre
     * @param descripcion
     * @param url_imagen
     * @param precio
     * @param precio_descuento
     * @param descuento
     */
    
    private Oferta oferta;
    private int cantidad = 0;
    
    public Producto_panel_oferta(String nombre, String descripcion, String url_imagen, double precio, double precio_descuento, int descuento) {
        initComponents();
        
        oferta = new Oferta(nombre,precio,cantidad,precio_descuento);
        
        this.Nombre_producto.setText("<html><p style='width:130px;'>" + nombre + "</p></html>");
        this.Descripcion_producto.setText("<html><p style='width:140px;'>" + descripcion + "</p></html>");
        
        try {
            InputStream imgStream = getClass().getResourceAsStream(url_imagen);
            if (imgStream != null) {
                Image img = ImageIO.read(imgStream);
                this.Imagen.setIcon(new ImageIcon(img));
                this.Imagen.setText(""); 
            } else {
                System.out.println("No se encontró la imagen en: " + url_imagen);
                this.Imagen.setIcon(null);
            }
        } catch (IOException e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
            this.Imagen.setIcon(null);
        }
        
        this.Precio.setText(String.format("$%.2f", precio));
        this.Precio_Anterior.setText(String.format("<html><strike>$%.2f</strike></html>", precio_descuento));
        this.Descuento.setText(descuento + "% dto.");

    }
    
    public static void Mostrar_Ofertas(List<Oferta> ofertas,JPanel Contenedor, Component _repaint){

        int columnas = 4; 
        int filas = (int) Math.ceil((double) ofertas.size() / columnas); 
        Contenedor.setLayout(new GridLayout(filas, columnas, 10, 10)); // Espaciado

        Contenedor.removeAll();

        for (Oferta o : ofertas) {
            Producto_panel_oferta panel = new Producto_panel_oferta(o.getNombre(), o.getDescripcion(), o.getImagen(), o.getPrecio(), o.getPrecioDescuento(), o.getDescuento());
            panel.setSize(250, 350); 
            Contenedor.add(panel);  
    }

        _repaint.validate();
        _repaint.repaint();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imagen = new javax.swing.JLabel();
        Nombre_producto = new javax.swing.JLabel();
        Descripcion_producto = new javax.swing.JLabel();
        Panel_botones = new javax.swing.JPanel();
        btn_menos = new javax.swing.JButton();
        Txt_cantidad = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        Precio = new javax.swing.JLabel();
        Precio_Anterior = new javax.swing.JLabel();
        Descuento = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(250, 365));
        setMinimumSize(new java.awt.Dimension(250, 365));
        setPreferredSize(new java.awt.Dimension(250, 365));

        Imagen.setBackground(new java.awt.Color(255, 255, 255));
        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen.setText("IMAGEN");
        Imagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Nombre_producto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nombre_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre_producto.setText("Producto");

        Descripcion_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Descripcion_producto.setText("Descripcion del producto...");

        Panel_botones.setPreferredSize(new java.awt.Dimension(190, 55));

        btn_menos.setText("-");
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });

        Txt_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_cantidad.setText(" 0");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_mas.setText("+");
        btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_botonesLayout = new javax.swing.GroupLayout(Panel_botones);
        Panel_botones.setLayout(Panel_botonesLayout);
        Panel_botonesLayout.setHorizontalGroup(
            Panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_botonesLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btn_menos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_agregar)
                .addGap(26, 26, 26))
        );
        Panel_botonesLayout.setVerticalGroup(
            Panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_menos)
                    .addComponent(Txt_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_mas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Precio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Precio.setText("$");

        Precio_Anterior.setText("$");

        Descuento.setText("-0% dto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_botones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Descripcion_producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Precio_Anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Descuento)
                                .addGap(25, 25, 25)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Descripcion_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio_Anterior)
                    .addComponent(Descuento))
                .addGap(5, 5, 5)
                .addComponent(Panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        agregarOferta();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        if(cantidad > 0){
                cantidad--;
        }
        this.Txt_cantidad.setText(String.valueOf(this.cantidad));
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masActionPerformed
        cantidad++;
        this.Txt_cantidad.setText(String.valueOf(this.cantidad));
    }//GEN-LAST:event_btn_masActionPerformed

    private void agregarOferta() {
        Registrado usuarioLogueado = Sesion.getUsuarioActual();

        if (usuarioLogueado == null) {
            JOptionPane.showMessageDialog(this, "Inicia sesión para agregar ofertas al carrito.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            PersistenciaCarrito.agregarOfertaAlCarritoTXT(oferta, this.getCantidad());
            JOptionPane.showMessageDialog(this, "Oferta agregada al carrito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar la oferta al carrito: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getCantidad() {
        String cant = Txt_cantidad.getText();
        int cantidad = 0;
        cantidad = Integer.parseInt(cant);
        return cantidad;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descripcion_producto;
    private javax.swing.JLabel Descuento;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Nombre_producto;
    private javax.swing.JPanel Panel_botones;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Precio_Anterior;
    private javax.swing.JLabel Txt_cantidad;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    // End of variables declaration//GEN-END:variables
}
