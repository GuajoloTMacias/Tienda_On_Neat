
import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import tiendaonline.Carrito;
import tiendaonline.Producto;
import java.awt.GridLayout;
import java.io.InputStream;
import java.util.List;




public class Producto_panel extends javax.swing.JPanel {

    /**
     * Creates new form Producto_panel
     * @param nombre
     * @param descripcion
     * @param url_imagen
     */
    
    private Carrito carrito;
    private Producto producto;
    
    public Producto_panel(String nombre, String descripcion, String url_imagen) {
        initComponents();
                
        this.Descripcion_producto.setText(descripcion);
        this.Nombre_producto.setText(nombre);
        
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

        
    }
    public static void Mostrar_productos(List<Producto> productos,JPanel Contenedor, Component _repaint){
        
        // Configurar el layout
        int columnas = 4; 
        int filas = (int) Math.ceil((double) productos.size() / columnas); 
        Contenedor.setLayout(new GridLayout(filas, columnas, 10, 10)); // Espaciado

        Contenedor.removeAll();

        // Agregar los productos 
        for (Producto p : productos) {
            Producto_panel panel = new Producto_panel(p.getNombre(), p.getDescripcion(), p.getImagen());
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
        btn_mas = new javax.swing.JButton();
        Txt_cantidad = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(250, 350));
        setMinimumSize(new java.awt.Dimension(250, 350));
        setPreferredSize(new java.awt.Dimension(250, 350));

        Imagen.setBackground(new java.awt.Color(255, 255, 255));
        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen.setText("IMAGEN");
        Imagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Nombre_producto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nombre_producto.setText("Producto");

        Descripcion_producto.setText("Descripcion del producto...");

        Panel_botones.setPreferredSize(new java.awt.Dimension(190, 55));

        btn_menos.setText("-");

        btn_mas.setText("+");

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
                .addContainerGap()
                .addComponent(btn_menos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mas)
                .addGap(18, 18, 18)
                .addComponent(btn_agregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Panel_botones, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Nombre_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(Descripcion_producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Descripcion_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void agregarProducto() {
        
        String cant = Txt_cantidad.getText();
        int cantidad = Integer.parseInt(cant);
        
        carrito.agregarProducto(producto, cantidad); 
        JOptionPane.showMessageDialog(this, "Producto agregado: " + producto.getNombre());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descripcion_producto;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Nombre_producto;
    private javax.swing.JPanel Panel_botones;
    private javax.swing.JLabel Txt_cantidad;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    // End of variables declaration//GEN-END:variables
}
