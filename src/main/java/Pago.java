package main.java;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tiendaonline.Oferta;
import tiendaonline.PersistenciaCarrito;
import tiendaonline.Producto;



public class Pago extends javax.swing.JFrame {
    private double total = 0.0;

    public Pago(double total) {
        this.total = total;
        initComponents();
        inicializarDatosPago();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Nombre_titular = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        Numero_Tarjeta = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        MM_YY = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        CVC = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jButton_Pagar_Final = new javax.swing.JButton();
        jButton_regresar = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        TF_Total_final = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Direccion_entrega = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel32.setText("PAGO");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel33.setText("Datos Bancarios");

        jLabel34.setText("Nombre del titular");

        jLabel35.setText("Número de tarjeta");

        Numero_Tarjeta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Numero_Tarjeta.setForeground(new java.awt.Color(153, 153, 153));
        Numero_Tarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Numero_Tarjeta.setText("1234 1234 1234 1234");
        Numero_Tarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Numero_TarjetaNumero_TarjetaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Numero_TarjetaNumero_TarjetaMouseExited(evt);
            }
        });

        jLabel36.setText("Vencimiento");

        MM_YY.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MM_YY.setForeground(new java.awt.Color(153, 153, 153));
        MM_YY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MM_YY.setText("DD/MM/YYYY");
        MM_YY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MM_YYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MM_YYMouseExited(evt);
            }
        });

        jLabel37.setText("CVV");

        CVC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CVC.setForeground(new java.awt.Color(153, 153, 153));
        CVC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CVC.setText("CVV");
        CVC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CVCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CVCMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre_titular, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel32)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(Numero_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(MM_YY, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CVC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_titular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Numero_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CVC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MM_YY, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel38.setText("Resumen");

        jButton_Pagar_Final.setBackground(new java.awt.Color(204, 0, 0));
        jButton_Pagar_Final.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton_Pagar_Final.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Pagar_Final.setText("Finalizar y pagar");
        jButton_Pagar_Final.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Pagar_FinalMouseClicked(evt);
            }
        });
        jButton_Pagar_Final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pagar_FinalActionPerformed(evt);
            }
        });

        jButton_regresar.setText("Regresar");
        jButton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regresarActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setText("Total: ");

        TF_Total_final.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TF_Total_final.setText("$0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_regresar)
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_Total_final))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_Pagar_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(TF_Total_final))
                .addGap(29, 29, 29)
                .addComponent(jButton_Pagar_Final)
                .addGap(32, 32, 32)
                .addComponent(jButton_regresar)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Usuario");

        Direccion_entrega.setText("Usuario");
        Direccion_entrega.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Direccion_entrega, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Direccion_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Numero_TarjetaNumero_TarjetaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero_TarjetaNumero_TarjetaMouseEntered
        if (Numero_Tarjeta.getText().equals("1234 1234 1234 1234")) {
          Numero_Tarjeta.setText("");  
        }
    }//GEN-LAST:event_Numero_TarjetaNumero_TarjetaMouseEntered

    private void Numero_TarjetaNumero_TarjetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero_TarjetaNumero_TarjetaMouseExited
        if (Numero_Tarjeta.getText().isEmpty()) {
            Numero_Tarjeta.setText("1234 1234 1234 1234");
        }
        
    }//GEN-LAST:event_Numero_TarjetaNumero_TarjetaMouseExited

    private void jButton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regresarActionPerformed
        Carrito newpage = new Carrito();
        newpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_regresarActionPerformed

    private void MM_YYMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MM_YYMouseEntered
        if (MM_YY.getText().equals("DD/MM/YYYY")) {
           MM_YY.setText("");
        }
    }//GEN-LAST:event_MM_YYMouseEntered

    private void MM_YYMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MM_YYMouseExited
        if (MM_YY.getText().isEmpty()){
            MM_YY.setText("DD/MM/YYYY");
        }
    }//GEN-LAST:event_MM_YYMouseExited

    private void CVCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CVCMouseEntered
        if (CVC.getText().equals("CVV")) {
            CVC.setText("");
        }
    }//GEN-LAST:event_CVCMouseEntered

    private void CVCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CVCMouseExited
        if (CVC.getText().isEmpty()) {
            CVC.setText("CVV");
        }
    }//GEN-LAST:event_CVCMouseExited

    private void jButton_Pagar_FinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Pagar_FinalMouseClicked
        
        String nombre = Nombre_titular.getText();
        String numeroTarjeta = Numero_Tarjeta.getText();
        String fechaVencimiento = MM_YY.getText();
        String cvv = CVC.getText();

        // Validar los datos
        if (!validarNombreTitular(nombre)) {
            JOptionPane.showMessageDialog(this, "El nombre del titular no coincide con los datos registrados.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!validarNumeroTarjeta(numeroTarjeta)) {
            JOptionPane.showMessageDialog(this, "El número de tarjeta no coincide con los datos registrados.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!validarFechaVencimiento(fechaVencimiento)) {
            JOptionPane.showMessageDialog(this, "La fecha de vencimiento no coincide con los datos registrados.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!validarCVV(cvv)) {
            JOptionPane.showMessageDialog(this, "El CVV no coincide con los datos registrados.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si los datos son válidos, se hace el pago
        TF_Total_final.setText("$ 0.00");
        
        PersistenciaCarrito.eliminarCarrito();
        JOptionPane.showMessageDialog(this, "Pago realizado con éxito.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_jButton_Pagar_FinalMouseClicked

    private void jButton_Pagar_FinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pagar_FinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Pagar_FinalActionPerformed

    
    
    
    
    private void inicializarDatosPago(){ 
        calcularSubTotal(); 
    }
    
    public void calcularSubTotal() {
        double total = 0.0;

        // Calcular el subtotal de productos
        List<Producto> productosCarrito = PersistenciaCarrito.cargarCarrito();
        for (Producto producto : productosCarrito) {
            total += producto.getPrecio() * producto.getCantidad();
        }

        // Calcular el subtotal de ofertas
        List<Oferta> ofertasCarrito = PersistenciaCarrito.cargarOfertasCarrito();
        for (Oferta oferta : ofertasCarrito) {
            total += oferta.getPrecioDescuento() * oferta.getCantidad();
        }
        TF_Total_final.setText(String.format("%.2f", total)); 

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
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago(0.0).setVisible(true);
            }
        });
    }
    
    
    private List<String[]> leerDatosBancarios() {
        List<String[]> datos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("datos_bancarios.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                datos.add(linea.split(",")); 
            }
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al leer los datos bancarios: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }
    
    private boolean validarNombreTitular(String nombre) {
        List<String[]> datos = leerDatosBancarios();
        for (String[] registro : datos) {
            if (registro[0].equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean validarNumeroTarjeta(String numeroTarjeta) {
        List<String[]> datos = leerDatosBancarios();
        for (String[] registro : datos) {
            if (registro[1].equals(numeroTarjeta)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean validarFechaVencimiento(String fecha) {
        List<String[]> datos = leerDatosBancarios();
        for (String[] registro : datos) {
            if (registro[2].equals(fecha)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean validarCVV(String cvv) {
        List<String[]> datos = leerDatosBancarios();
        for (String[] registro : datos) {
            if (registro[3].equals(cvv)) {
                return true;
            }
        }
        return false;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CVC;
    private javax.swing.JTextField Direccion_entrega;
    private javax.swing.JTextField MM_YY;
    private javax.swing.JTextField Nombre_titular;
    private javax.swing.JTextField Numero_Tarjeta;
    private javax.swing.JLabel TF_Total_final;
    private javax.swing.JButton jButton_Pagar_Final;
    private javax.swing.JButton jButton_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
