package main.java;


import java.util.List;
import tiendaonline.PersistenciaProducto;
import tiendaonline.Producto;


public class Homepage extends javax.swing.JFrame {

   
    public Homepage() {
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
        btn_Registrate = new javax.swing.JButton();
        btn_iniciar_sesion = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        Txt_buscar = new javax.swing.JTextField();
        btn_arduino = new javax.swing.JButton();
        btn_ofertas = new javax.swing.JButton();
        btn_carrito = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_producto_contenedor = new javax.swing.JPanel();
        btn_componente = new javax.swing.JButton();
        btn_modulo = new javax.swing.JButton();
        btn_sensor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);

        Contenedor.setBackground(new java.awt.Color(238, 238, 238));
        Contenedor.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        Contenedor.setMinimumSize(new java.awt.Dimension(900, 500));

        btn_Registrate.setText("Registrarse");
        btn_Registrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrateActionPerformed(evt);
            }
        });

        btn_iniciar_sesion.setText("Iniciar sesion");
        btn_iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar_sesionActionPerformed(evt);
            }
        });

        Logo.setText("Logo");

        Txt_buscar.setText("Buscar");
        Txt_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Txt_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_buscarMouseEntered(evt);
            }
        });

        btn_arduino.setBackground(new java.awt.Color(242, 242, 242));
        btn_arduino.setText("Arduino");
        btn_arduino.setBorder(null);
        btn_arduino.setBorderPainted(false);
        btn_arduino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_arduinoActionPerformed(evt);
            }
        });

        btn_ofertas.setBackground(new java.awt.Color(242, 242, 242));
        btn_ofertas.setText("Ofertas");
        btn_ofertas.setBorder(null);
        btn_ofertas.setBorderPainted(false);
        btn_ofertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertasActionPerformed(evt);
            }
        });

        btn_carrito.setText("Carrito");
        btn_carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carritoActionPerformed(evt);
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

        btn_componente.setBackground(new java.awt.Color(242, 242, 242));
        btn_componente.setText("Componentes");
        btn_componente.setBorder(null);
        btn_componente.setBorderPainted(false);
        btn_componente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_componenteActionPerformed(evt);
            }
        });

        btn_modulo.setBackground(new java.awt.Color(242, 242, 242));
        btn_modulo.setText("Módulos");
        btn_modulo.setBorder(null);
        btn_modulo.setBorderPainted(false);
        btn_modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moduloActionPerformed(evt);
            }
        });

        btn_sensor.setBackground(new java.awt.Color(242, 242, 242));
        btn_sensor.setText("Sensores");
        btn_sensor.setBorder(null);
        btn_sensor.setBorderPainted(false);
        btn_sensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sensorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_arduino)
                        .addGap(31, 31, 31)
                        .addComponent(btn_componente)
                        .addGap(29, 29, 29)
                        .addComponent(btn_modulo)
                        .addGap(34, 34, 34)
                        .addComponent(btn_sensor)
                        .addGap(31, 31, 31)
                        .addComponent(btn_ofertas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_iniciar_sesion)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Registrate)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                                .addComponent(btn_carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iniciar_sesion)
                    .addComponent(btn_Registrate)
                    .addComponent(Txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_arduino)
                    .addComponent(btn_ofertas)
                    .addComponent(btn_componente)
                    .addComponent(btn_modulo)
                    .addComponent(btn_sensor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_buscarMouseEntered
        Txt_buscar.setText("Buscar");
    }//GEN-LAST:event_Txt_buscarMouseEntered

    private void Txt_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_buscarMouseClicked
        Txt_buscar.setText("");
    }//GEN-LAST:event_Txt_buscarMouseClicked

    private void btn_iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar_sesionActionPerformed
        Iniciar_sesion newpagina = new Iniciar_sesion();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_iniciar_sesionActionPerformed

    private void btn_RegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrateActionPerformed
        Registrarse newpagina = new Registrarse();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegistrateActionPerformed

    private void btn_arduinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_arduinoActionPerformed
        Homepago_arduino newpagina = new Homepago_arduino();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_arduinoActionPerformed

    private void btn_carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carritoActionPerformed
        Iniciar_sesion newpagina = new Iniciar_sesion();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_carritoActionPerformed

    private void btn_ofertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertasActionPerformed
        Homepage_ofertas newpagina = new Homepage_ofertas();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertasActionPerformed

    private void btn_componenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_componenteActionPerformed
        Homepage_componente newpagina = new Homepage_componente();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_componenteActionPerformed

    private void btn_moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moduloActionPerformed
        Homepage_modulo newpagina = new Homepage_modulo();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_moduloActionPerformed

    private void btn_sensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sensorActionPerformed
        Homepage_sensor newpagina = new Homepage_sensor();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_sensorActionPerformed
 
    
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
    private javax.swing.JTextField Txt_buscar;
    private javax.swing.JButton btn_Registrate;
    private javax.swing.JButton btn_arduino;
    private javax.swing.JButton btn_carrito;
    private javax.swing.JButton btn_componente;
    private javax.swing.JButton btn_iniciar_sesion;
    private javax.swing.JButton btn_modulo;
    private javax.swing.JButton btn_ofertas;
    private javax.swing.JButton btn_sensor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_producto_contenedor;
    // End of variables declaration//GEN-END:variables
}
