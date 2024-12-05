package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import tiendaonline.Registrado;
import tiendaonline.Sesion;
import tiendaonline.Usuario;

public class Iniciar_sesion extends javax.swing.JFrame {
     private static final String RUTA_ARCHIVO = "usuarios.txt";  // Ruta del archivo con usuarios
    
    public Iniciar_sesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_iniciar_sesion = new javax.swing.JLabel();
        Txt_usuario = new javax.swing.JTextField();
        Txt_contraseña = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        btn_crear_cuenta = new javax.swing.JButton();
        btn_regresar_inicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Txt_iniciar_sesion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Txt_iniciar_sesion.setText("Iniciar Sesión");

        Txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_usuarioActionPerformed(evt);
            }
        });

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_crear_cuenta.setText("¿No tienes cuenta? Crear cuenta");
        btn_crear_cuenta.setBorder(null);
        btn_crear_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_cuentaActionPerformed(evt);
            }
        });

        btn_regresar_inicio.setText("Regresar");
        btn_regresar_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar_inicioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombre de usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_usuario)
                    .addComponent(Txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btn_crear_cuenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btn_aceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(Txt_iniciar_sesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btn_regresar_inicio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Txt_iniciar_sesion)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_aceptar)
                .addGap(52, 52, 52)
                .addComponent(btn_crear_cuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btn_regresar_inicio)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresar_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar_inicioActionPerformed
        Homepage newpagina = new Homepage();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresar_inicioActionPerformed

    private void Txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_usuarioActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
   String usuario = Txt_usuario.getText(); 
    String contrasena = Txt_contraseña.getText(); 

    if (usuario.isEmpty() || contrasena.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) { 
        String linea;
        boolean encontrado = false;
        Registrado usuarioLogueado = null;

        // Leer línea por línea el archivo de usuarios
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length == 7) { // Verifica que la línea tiene los campos necesarios
                String nombre = partes[0];
                String apellidoPaterno = partes[1];
                String apellidoMaterno = partes[2];
                String nombreUsuario = partes[3];
                String contrasenaArchivo = partes[4];
                String ciudad = partes[5];
                String telefono = partes[6];

                // Validar usuario y contraseña
                if (usuario.equals(nombreUsuario) && contrasena.equals(contrasenaArchivo)) {
                    encontrado = true;
                    // Crear el objeto Registrado con los datos obtenidos
                    usuarioLogueado = new Registrado(nombre, apellidoPaterno, apellidoMaterno, 
                                                     nombreUsuario, contrasenaArchivo, ciudad, telefono);
                    break;
                }
            }
        }

        if (encontrado && usuarioLogueado != null) {
            Sesion.setUsuarioActual(usuarioLogueado);

            javax.swing.JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            Homepage_Inicio_sesion nuevaPagina = new Homepage_Inicio_sesion();
            nuevaPagina.setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al leer el archivo de usuarios.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }                                           
 
    

// Método para validar si el usuario y la contraseña coinciden con los registrados
    private boolean validarUsuario(String usuario, String contrasena) {
        try {
            File archivo = new File(RUTA_ARCHIVO);
            if (!archivo.exists()) {
                // Si el archivo no existe, retorna false
                return false;
            }

            // Leer el archivo de texto
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String usuarioRegistrado = datos[0];
                String contrasenaRegistrada = datos[1];

                // Compara si el usuario y la contraseña coinciden
                if (usuarioRegistrado.equals(usuario) && contrasenaRegistrada.equals(contrasena)) {
                    br.close();
                    return true;  // Usuario y contraseña encontrados
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;  // Si no se encuentra el usuario y la contraseña   
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_crear_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_cuentaActionPerformed
        Registrarse newpagina = new Registrarse();
        newpagina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_crear_cuentaActionPerformed

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
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_contraseña;
    private javax.swing.JLabel Txt_iniciar_sesion;
    private javax.swing.JTextField Txt_usuario;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_crear_cuenta;
    private javax.swing.JButton btn_regresar_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
