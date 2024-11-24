
import java.util.List;
import tiendaonline.PersistenciaProducto;
import tiendaonline.Producto;


public class Homepage_Inicio_administrador extends javax.swing.JFrame {

    public Homepage_Inicio_administrador() {
        initComponents();
        // Cargar productos desde el archivo productos.bin
        List<Producto> productos = PersistenciaProducto.cargarProductos();
        if (productos.isEmpty()) {
            System.out.println("No se encontraron productos en el archivo.");
        } else {
            Producto_panel.Mostrar_productos(productos, this.panel_producto_contenedor, this);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Txt_buscar_inicio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_categorias_inicio_administrador = new javax.swing.JButton();
        btn_ofertas_inicio_administrador = new javax.swing.JButton();
        btn_inicio_administrador = new javax.swing.JButton();
        btn_inicio_administrador_carrito_admin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_producto_contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 500));

        Contenedor.setBackground(new java.awt.Color(238, 238, 238));
        Contenedor.setMaximumSize(new java.awt.Dimension(900, 500));
        Contenedor.setMinimumSize(new java.awt.Dimension(900, 500));
        Contenedor.setPreferredSize(new java.awt.Dimension(1059, 500));

        Logo.setBackground(java.awt.Color.white);
        Logo.setText("Logo");

        Txt_buscar_inicio.setText("Buscar");
        Txt_buscar_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_buscar_inicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_buscar_inicioMouseEntered(evt);
            }
        });

        jLabel1.setText("Nombre de usuario");

        btn_categorias_inicio_administrador.setBackground(new java.awt.Color(242, 242, 242));
        btn_categorias_inicio_administrador.setText("Categorias");
        btn_categorias_inicio_administrador.setBorder(null);
        btn_categorias_inicio_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categorias_inicio_administradorActionPerformed(evt);
            }
        });

        btn_ofertas_inicio_administrador.setBackground(new java.awt.Color(242, 242, 242));
        btn_ofertas_inicio_administrador.setText("Ofertas");
        btn_ofertas_inicio_administrador.setBorder(null);
        btn_ofertas_inicio_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertas_inicio_administradorActionPerformed(evt);
            }
        });

        btn_inicio_administrador.setText("Administrador");
        btn_inicio_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_administradorActionPerformed(evt);
            }
        });

        btn_inicio_administrador_carrito_admin.setText("Carrito");
        btn_inicio_administrador_carrito_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_administrador_carrito_adminActionPerformed(evt);
            }
        });

        panel_producto_contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_producto_contenedorLayout = new javax.swing.GroupLayout(panel_producto_contenedor);
        panel_producto_contenedor.setLayout(panel_producto_contenedorLayout);
        panel_producto_contenedorLayout.setHorizontalGroup(
            panel_producto_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
        );
        panel_producto_contenedorLayout.setVerticalGroup(
            panel_producto_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panel_producto_contenedor);

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_buscar_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btn_categorias_inicio_administrador)
                .addGap(36, 36, 36)
                .addComponent(btn_ofertas_inicio_administrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn_inicio_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_inicio_administrador_carrito_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_buscar_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_categorias_inicio_administrador)
                    .addComponent(btn_ofertas_inicio_administrador)
                    .addComponent(btn_inicio_administrador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addComponent(btn_inicio_administrador_carrito_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_buscar_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_buscar_inicioMouseClicked
        Txt_buscar_inicio.setText("");
    }//GEN-LAST:event_Txt_buscar_inicioMouseClicked

    private void Txt_buscar_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_buscar_inicioMouseEntered
        Txt_buscar_inicio.setText("Buscar");
    }//GEN-LAST:event_Txt_buscar_inicioMouseEntered

    private void btn_categorias_inicio_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categorias_inicio_administradorActionPerformed
        Homepage_Inicio_administrador_categorias newpagina = new Homepage_Inicio_administrador_categorias();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_categorias_inicio_administradorActionPerformed

    private void btn_ofertas_inicio_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertas_inicio_administradorActionPerformed
        Homepage_Inicio_administrador_ofertas newpagina = new Homepage_Inicio_administrador_ofertas();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertas_inicio_administradorActionPerformed

    private void btn_inicio_administrador_carrito_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_administrador_carrito_adminActionPerformed
        Carrito_administrador newpagina = new Carrito_administrador();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_inicio_administrador_carrito_adminActionPerformed

    private void btn_inicio_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_administradorActionPerformed
        Administrador newpagina = new Administrador();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_inicio_administradorActionPerformed
 
    
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField Txt_buscar_inicio;
    private javax.swing.JButton btn_categorias_inicio_administrador;
    private javax.swing.JButton btn_inicio_administrador;
    private javax.swing.JButton btn_inicio_administrador_carrito_admin;
    private javax.swing.JButton btn_ofertas_inicio_administrador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_producto_contenedor;
    // End of variables declaration//GEN-END:variables
}
