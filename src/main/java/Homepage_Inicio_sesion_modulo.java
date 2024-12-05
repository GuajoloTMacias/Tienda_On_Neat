package main.java;


import java.util.List;
import tiendaonline.PersistenciaProducto;
import tiendaonline.Producto;


public class Homepage_Inicio_sesion_modulo extends javax.swing.JFrame {

    public Homepage_Inicio_sesion_modulo() {
        initComponents();
        List<Producto> productos = PersistenciaProducto.cargarProductos();
        if (productos.isEmpty()) {
            System.out.println("No se encontraron productos en el archivo.");
        } else {
            Producto_panel.Mostrar_Modulo(productos, this.panel_producto_contenedor, this);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Txt_buscar_categorias = new javax.swing.JTextField();
        btn_inicio_Homepage = new javax.swing.JButton();
        btn_ofertas_Homepage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_producto_contenedor = new javax.swing.JPanel();
        btn_arduino = new javax.swing.JButton();
        btn_componente = new javax.swing.JButton();
        btn_sensor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_configurciones_inicio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);

        Contenedor.setBackground(new java.awt.Color(238, 238, 238));
        Contenedor.setMaximumSize(new java.awt.Dimension(900, 500));
        Contenedor.setMinimumSize(new java.awt.Dimension(900, 500));
        Contenedor.setPreferredSize(new java.awt.Dimension(900, 500));

        Logo.setText("Logo");

        Txt_buscar_categorias.setText("Buscar");
        Txt_buscar_categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_buscar_categoriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_buscar_categoriasMouseEntered(evt);
            }
        });

        btn_inicio_Homepage.setBackground(new java.awt.Color(242, 242, 242));
        btn_inicio_Homepage.setText("Inicio");
        btn_inicio_Homepage.setBorder(null);
        btn_inicio_Homepage.setBorderPainted(false);
        btn_inicio_Homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_HomepageActionPerformed(evt);
            }
        });

        btn_ofertas_Homepage.setBackground(new java.awt.Color(242, 242, 242));
        btn_ofertas_Homepage.setText("Ofertas");
        btn_ofertas_Homepage.setBorder(null);
        btn_ofertas_Homepage.setBorderPainted(false);
        btn_ofertas_Homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ofertas_HomepageActionPerformed(evt);
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

        btn_arduino.setBackground(new java.awt.Color(242, 242, 242));
        btn_arduino.setText("Arduino");
        btn_arduino.setBorder(null);
        btn_arduino.setBorderPainted(false);
        btn_arduino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_arduinoActionPerformed(evt);
            }
        });

        btn_componente.setBackground(new java.awt.Color(242, 242, 242));
        btn_componente.setText("Componentes");
        btn_componente.setBorder(null);
        btn_componente.setBorderPainted(false);
        btn_componente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_componenteActionPerformed(evt);
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

        jLabel1.setText("Nombre de usuario");

        jLabel2.setText("Nombre de usuario");

        btn_configurciones_inicio.setText("Configuraciones");
        btn_configurciones_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configurciones_inicioActionPerformed(evt);
            }
        });

        jButton1.setText("Carrito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_buscar_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_arduino)
                .addGap(28, 28, 28)
                .addComponent(btn_componente)
                .addGap(46, 46, 46)
                .addComponent(btn_inicio_Homepage)
                .addGap(35, 35, 35)
                .addComponent(btn_sensor)
                .addGap(28, 28, 28)
                .addComponent(btn_ofertas_Homepage)
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_configurciones_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_buscar_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_inicio_Homepage)
                    .addComponent(btn_ofertas_Homepage)
                    .addComponent(btn_arduino)
                    .addComponent(btn_componente)
                    .addComponent(btn_sensor)
                    .addComponent(jLabel2)
                    .addComponent(btn_configurciones_inicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_buscar_categoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_buscar_categoriasMouseEntered
        Txt_buscar_categorias.setText("Buscar");
    }//GEN-LAST:event_Txt_buscar_categoriasMouseEntered

    private void Txt_buscar_categoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_buscar_categoriasMouseClicked
        Txt_buscar_categorias.setText("");
    }//GEN-LAST:event_Txt_buscar_categoriasMouseClicked

    private void btn_inicio_HomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_HomepageActionPerformed
        Homepage_Inicio_sesion newpagina = new Homepage_Inicio_sesion();
        newpagina.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_btn_inicio_HomepageActionPerformed

    private void btn_ofertas_HomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ofertas_HomepageActionPerformed
        Homepage_Inicio_sesion_ofertas newpagina = new Homepage_Inicio_sesion_ofertas();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ofertas_HomepageActionPerformed

    private void btn_arduinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_arduinoActionPerformed
        Homepage_Inicio_sesion_arduino newpagina = new Homepage_Inicio_sesion_arduino();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_arduinoActionPerformed

    private void btn_componenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_componenteActionPerformed
        Homepage_Inicio_sesion_componente newpagina = new Homepage_Inicio_sesion_componente();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_componenteActionPerformed

    private void btn_sensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sensorActionPerformed
        Homepage_Inicio_sesion_sensor newpagina = new Homepage_Inicio_sesion_sensor();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_sensorActionPerformed

    private void btn_configurciones_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configurciones_inicioActionPerformed
        Configuracion newpagina = new Configuracion();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_configurciones_inicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Carrito_1 newpagina = new Carrito_1();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
 
    
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
    private javax.swing.JTextField Txt_buscar_categorias;
    private javax.swing.JButton btn_arduino;
    private javax.swing.JButton btn_componente;
    private javax.swing.JButton btn_configurciones_inicio;
    private javax.swing.JButton btn_inicio_Homepage;
    private javax.swing.JButton btn_ofertas_Homepage;
    private javax.swing.JButton btn_sensor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_producto_contenedor;
    // End of variables declaration//GEN-END:variables
}
