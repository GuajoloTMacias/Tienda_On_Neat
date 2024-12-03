package tiendaonline;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Registrado extends Usuario {
    // Atributos
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public String nombreUsuario;
    public String contrasena;
    public String ciudad;
    public String telefono;

    // Ruta del archivo de usuarios
    private static final String RUTA_ARCHIVO = "usuarios.txt";

    // Constructor
    public Registrado(String nombre, String apellidoPaterno, String apellidoMaterno,
                      String nombreUsuario, String contrasena, String ciudad, String telefono) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    // Métodos Abstractos Implementados
    @Override
    public void iniciarSesion() {
        System.out.println("Usuario " + nombreUsuario + " ha iniciado sesión.");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Usuario " + nombreUsuario + " ha cerrado sesión.");
    }

    @Override
    public void consultarInformacion() {
        System.out.println("Información del usuario: " + this.toString());
    }

    // Método para verificar si un nombre de usuario ya está registrado
    public static boolean esUsuarioDuplicado(String nombreUsuario) {
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 4 && partes[3].equalsIgnoreCase(nombreUsuario)) {
                    return true; // Usuario encontrado
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Usuario no encontrado
    }

    // Método para guardar el usuario en el archivo
    public boolean guardarEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO, true))) {
            // Formato esperado en el archivo: nombre,apellidoPaterno,apellidoMaterno,nombreUsuario,contrasena,ciudad,telefono
            writer.write(this.nombre + "," + this.apellidoPaterno + "," + this.apellidoMaterno + "," +
                         this.nombreUsuario + "," + this.contrasena + "," + this.ciudad + "," + this.telefono);
            writer.newLine(); // Agregar una nueva línea para el próximo usuario
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno +
               ", Usuario: " + nombreUsuario + ", Ciudad: " + ciudad + ", Teléfono: " + telefono;
    }
}
