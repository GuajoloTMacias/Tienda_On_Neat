package main.java;


import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import tiendaonline.Carrito;
import tiendaonline.Producto;
import java.awt.GridLayout;
import java.io.InputStream;
import java.util.List;
import tiendaonline.PersistenciaCarrito;
import tiendaonline.PersistenciaProducto;
import tiendaonline.Registrado;
import tiendaonline.Sesion;

public class Producto_panel extends javax.swing.JPanel {

    /**
     * Creates new form Producto_panel
     * @param nombre
     * @param descripcion
     * @param url_imagen
     * @param precio
     */
    
    private Carrito carrito;
    private Producto producto;
    private int cantidad = 0;
    
    public Producto_panel(String nombre, String descripcion, String url_imagen, double precio, Producto producto) {
        initComponents();
        this.producto = producto;
        this.Nombre_producto.setText(nombre);
        this.Descripcion_producto.setText("<html><p style='width:150px;'>" + descripcion + "</p></html>");

        
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
    }
    
    public static void Mostrar_productos(List<Producto> productos,JPanel Contenedor, Component _repaint){
        
        int columnas = 4; 
        int filas = (int) Math.ceil((double) productos.size() / columnas); 
        Contenedor.setLayout(new GridLayout(filas, columnas, 10, 10)); // Espaciado

        Contenedor.removeAll();

        for (Producto p : productos) {
            Producto_panel panel = new Producto_panel(p.getNombre(), p.getDescripcion(), p.getImagen(), p.getPrecio(),p);
            panel.setSize(250, 350); 
            Contenedor.add(panel);  
        }
        _repaint.validate();
        _repaint.repaint();
    }
    
    
    public static void Mostrar_Arduino(List<Producto> productos,JPanel Contenedor, Component _repaint){     
        
        // Agregar filtrado por categorias
        List<Producto> productosArduino = PersistenciaProducto.filtrarPorCategoria(productos, "arduino");
        int columnas = 4; 
        int filas = (int) Math.ceil((double) productosArduino.size() / columnas); 
        Contenedor.setLayout(new GridLayout(filas, columnas, 10, 10)); // Espaciado
        Contenedor.removeAll();
        
        for (Producto p : productosArduino) {
            Producto_panel productoPanel = new Producto_panel(
                    p.getNombre(),
                    p.getDescripcion(),
                    p.getImagen(), 
                    p.getPrecio(),p
            );
            productoPanel.setSize(250, 350);
            Contenedor.add(productoPanel);
        }      
        _repaint.validate();
        _repaint.repaint();
    }
    
    public static void Mostrar_Componente(List<Producto> productos,JPanel Contenedor, Component _repaint){     
        List<Producto> productosComponente = PersistenciaProducto.filtrarPorCategoria(productos, "componente");

        int columnas = 4; 
        int filas = (int) Math.ceil((double) productosComponente.size() / columnas); 
        Contenedor.setLayout(new GridLayout(filas, columnas, 10, 10)); // Espaciado
        Contenedor.removeAll();

        for (Producto p : productosComponente) {
            Producto_panel productoPanel = new Producto_panel(
                    p.getNombre(),
                    p.getDescripcion(),
                    p.getImagen(), 
                    p.getPrecio(),p
            );
            productoPanel.setSize(250, 350);
            Contenedor.add(productoPanel);
        }    
        _repaint.validate();
        _repaint.repaint();
    }
    
    public static void Mostrar_Modulo(List<Producto> productos,JPanel Contenedor, Component _repaint){     

        List<Producto> productosModulo = PersistenciaProducto.filtrarPorCategoria(productos, "módulo");

        int columnas = 4; 
        int filas = (int) Math.ceil((double) productosModulo.size() / columnas); 
        Contenedor.setLayout(new GridLayout(filas, columnas, 10, 10)); // Espaciado
        Contenedor.removeAll();

        for (Producto p : productosModulo) {
            Producto_panel productoPanel = new Producto_panel(
                    p.getNombre(),
                    p.getDescripcion(),
                    p.getImagen(), 
                    p.getPrecio(),p
            );
            productoPanel.setSize(250, 350);
            Contenedor.add(productoPanel);
        }     
        _repaint.validate();
        _repaint.repaint();
    }
    
    public static void Mostrar_Sensor(List<Producto> productos,JPanel Contenedor, Component _repaint){     

        List<Producto> productosSensores = PersistenciaProducto.filtrarPorCategoria(productos, "sensor");

        int columnas = 4; 
        int filas = (int) Math.ceil((double) productosSensores.size() / columnas); 
        Contenedor.setLayout(new GridLayout(filas, columnas, 10, 10)); // Espaciado
        Contenedor.removeAll();

        for (Producto p : productosSensores) {
            Producto_panel productoPanel = new Producto_panel(
                    p.getNombre(),
                    p.getDescripcion(),
                    p.getImagen(), 
                    p.getPrecio(),p
            );
            productoPanel.setSize(250, 350);
            Contenedor.add(productoPanel);
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
        btn_mas = new javax.swing.JButton();
        Txt_cantidad = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        Precio = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(250, 365));
        setMinimumSize(new java.awt.Dimension(250, 365));
        setPreferredSize(new java.awt.Dimension(250, 365));
        setVerifyInputWhenFocusTarget(false);

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

        btn_mas.setText("+");
        btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masActionPerformed(evt);
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
                    .addComponent(btn_mas)
                    .addComponent(Txt_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Precio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Precio.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_botones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Descripcion_producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(Descripcion_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masActionPerformed
        // TODO add your handling code here:
        cantidad++;
        this.Txt_cantidad.setText(String.valueOf(this.cantidad));
    }//GEN-LAST:event_btn_masActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        // TODO add your handling code here:
        if(cantidad > 0){
                cantidad--;
        }
        this.Txt_cantidad.setText(String.valueOf(this.cantidad));
    }//GEN-LAST:event_btn_menosActionPerformed

    
    private void agregarProducto() {
        Registrado usuarioLogueado = Sesion.getUsuarioActual();

        if (usuarioLogueado == null) {
            JOptionPane.showMessageDialog(this, "Inicia sesión para agregar productos al carrito.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            PersistenciaCarrito.agregarProductoAlCarritoTXT(producto, this.getCantidad());
            JOptionPane.showMessageDialog(this, "Producto agregado al carrito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar el producto al carrito: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Nombre_producto;
    private javax.swing.JPanel Panel_botones;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Txt_cantidad;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    // End of variables declaration//GEN-END:variables
}
