package tiendaonline;

import java.util.ArrayList;
import java.util.List;
import java.security.*;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class TiendaOnline {
    private String nombre;
    private String url;
    private List<Carrito> carritos;
    private Inventario inventario;
    private List<Usuario> usuarios;

    public TiendaOnline(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
        this.carritos = new ArrayList<>();
        this.inventario = new Inventario();
        this.usuarios = new ArrayList<>(); 
        
        try {
 
                // Data dirs
                String current_path = System.getenv("APPDATA");
                Files.createDirectories(Path.of(current_path + "/com.myapp.TiendaOnline/res/images"));
                String data_path = Files.createDirectories(Path.of(current_path + "/com.myapp.TiendaOnline/data/")).toString();
                // Data file
                try (FileWriter fileWriter = new FileWriter(data_path + "/productos.csv")) {
                    // Write headers
                    fileWriter.append("\"ID\",\"PRODUCTO\",\"PRECIO\",\"PATH_IMAGE\",\"CATEGORIA\"");
                    // End data flow
                    fileWriter.flush();
                }catch(Exception e){
                    System.out.println(e.getCause());
                    MsgBox.Show("Error en la incializacion", MsgBox.type.ERROR);
                    MsgBox.Show("reinicie la aplicacion", MsgBox.type.INFO);
                    System.exit(0);
                    
                }
                // Users file
                try (FileWriter fileWriter = new FileWriter(data_path + "/usuarios.csv")) {
                    // Write headers
                    fileWriter.append("\"ID\",\"USUARIO\",\"CONTRASEÑA\",\"NOMBRE_COMPLETO\",\"DIRECCION\",\"EDAD\",\"NACIMIENTO\"");
                    
                    // End data flow
                    fileWriter.flush();
                }catch(Exception e){
                    System.out.println(e.getCause());
                    MsgBox.Show("Error en la incializacion", MsgBox.type.ERROR);
                    MsgBox.Show("reinicie la aplicacion", MsgBox.type.INFO);
                    System.exit(0);
                    
                }
            }catch(IOException ex){
;               MsgBox.Show("Error al incializar la aplicacion.", MsgBox.type.ERROR);
                MsgBox.Show("reinicie la aplicacion", MsgBox.type.INFO);
                System.exit(0);
            }
    }

    public void registrarUsuario(Usuario usuario, String contraseña, String nombre, int edad,String direccion , String nombre_usuario, Date nacimiento) {
        // Almacenar usuario en la db
        String data_path = System.getenv("APPDATA") + "/com.myapp.TiendaOnline/data/usuarios.csv";
        byte[] passb = contraseña.getBytes();
        MessageDigest md;
        String passenc = null;
        
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] passMD5b = md.digest(passb);
            
            // byte to hex
            StringBuilder sb = new StringBuilder(passMD5b.length * 2);
            for(byte b: passMD5b){
                sb.append(String.format("%02x", b));
            }
            passenc = sb.toString();
            
        } catch (NoSuchAlgorithmException ex) {
            MsgBox.Show("Error en la applicacion.", MsgBox.type.ERROR);    
            return;
        }
        
        // Write data in db
        if(passenc != null){
            try (FileWriter fileWriter = new FileWriter(data_path)) {
            // insert user in db
            int last_id = csv.getMaxID(data_path)+1;
            fileWriter.append(last_id + "," + usuario + ","+passenc+ "," + nombre + ","+direccion+ "," + edad + ","+nacimiento );                
                
            // End data flow
            fileWriter.flush();
            }catch(Exception e){
                System.out.println(e.getCause());
                MsgBox.Show("Error en la incializacion", MsgBox.type.ERROR);
                MsgBox.Show("reinicie la aplicacion", MsgBox.type.INFO);
                System.exit(0);
                
            }
        }else{
            MsgBox.Show("Error en el sistema interno.", MsgBox.type.ERROR);
        }
        
    }

    public void iniciarSesion(String nombreUsuario, String contraseña) {
       
    }

    public void busqueda(String query) {
        
    }

    public void ofertas() {
        
    }
}
