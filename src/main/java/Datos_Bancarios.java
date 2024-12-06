package main.java;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import tiendaonline.Credito;
import tiendaonline.Debito;
import tiendaonline.Puntos;
import tiendaonline.Registrado;
import tiendaonline.Sesion;
import tiendaonline.Tarjeta;


public class Datos_Bancarios extends javax.swing.JFrame {

    

    public Datos_Bancarios() {
        initComponents();
        // Establecer las opciones del JComboBox
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crédito", "Débito" }));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_regesar_datos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Datos Bancarios");

        jLabel2.setText("Ingresa los datos de tu tarjeta:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nombre del titular:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Numero de Tarjeta:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("CVV:");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_regesar_datos.setText("Regresar");
        btn_regesar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regesar_datosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btn_regesar_datos)
                                .addGap(51, 51, 51)
                                .addComponent(btn_agregar))
                            .addComponent(jLabel6))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_regesar_datos))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regesar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regesar_datosActionPerformed
        Registrarse newpagina = new Registrarse();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regesar_datosActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

    String usuario = Sesion.getUsuarioActual().nombreUsuario;
// Obtener los datos ingresados
    String titular = jTextField1.getText();
    String numeroTarjeta = jTextField2.getText();
    String fechaNacimiento = jTextField3.getText();
    String cvv = jTextField4.getText();
    String tipoTarjeta = (String) jComboBox1.getSelectedItem();

    // Validar que no estén vacíos
    if (titular.isEmpty() || numeroTarjeta.isEmpty() || fechaNacimiento.isEmpty() || cvv.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validación del nombre del titular (no debe contener números)
    if (!titular.matches("[a-zA-Z\\s]+")) {
        javax.swing.JOptionPane.showMessageDialog(this, "El nombre del titular no debe contener números.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validación del número de tarjeta (13-19 dígitos)
    if (!numeroTarjeta.matches("\\d{13,19}")) {
        javax.swing.JOptionPane.showMessageDialog(this, "El número de tarjeta debe tener entre 13 y 19 dígitos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validación del CVV (3-4 dígitos)
    if (!cvv.matches("\\d{3,4}")) {
        javax.swing.JOptionPane.showMessageDialog(this, "El CVV debe tener 3 o 4 dígitos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validación de la fecha de nacimiento (Formato: dd/mm/yyyy)
    try {
        String[] fechaParts = fechaNacimiento.split("/");
        if (fechaParts.length != 3) {
            throw new Exception("Formato de fecha incorrecto.");
        }
        int dia = Integer.parseInt(fechaParts[0]);
        int mes = Integer.parseInt(fechaParts[1]);
        int anio = Integer.parseInt(fechaParts[2]);

        // Validar si la fecha es válida
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || (anio < 1900 || anio > 2004)) {
            throw new Exception("Fecha de nacimiento inválida.");
        }

        // Comprobar si la fecha es en el futuro
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int currentYear = cal.get(java.util.Calendar.YEAR);
        int currentMonth = cal.get(java.util.Calendar.MONTH) + 1;
        int currentDay = cal.get(java.util.Calendar.DAY_OF_MONTH);

        if (anio > currentYear || (anio == currentYear && mes > currentMonth) || (anio == currentYear && mes == currentMonth && dia > currentDay)) {
            throw new Exception("La fecha de nacimiento no puede ser en el futuro.");
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Fecha de nacimiento inválida. Formato correcto: dd/mm/yyyy.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Crear el objeto de tarjeta correspondiente
    Tarjeta tarjeta;
    switch (tipoTarjeta) {
        case "Crédito":
            tarjeta = new Credito(titular, numeroTarjeta, fechaNacimiento, cvv);
            break;
        case "Débito":
            tarjeta = new Debito(titular, numeroTarjeta, fechaNacimiento, cvv);
            break;
        default:
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona un tipo de tarjeta válido.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
    }

    // Guardar los datos en un archivo en una sola línea
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos_bancarios.txt", true))) {
        writer.write(usuario+","+titular + "," + numeroTarjeta + "," + fechaNacimiento + "," + cvv + "," + tipoTarjeta);
        writer.newLine();
        javax.swing.JOptionPane.showMessageDialog(this, "Datos bancarios guardados correctamente.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar los datos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    // Ir a la siguiente ventana
    Homepage newpagina = new Homepage();
    newpagina.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_btn_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(Datos_Bancarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_Bancarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_Bancarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_Bancarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_Bancarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_regesar_datos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
