
package tiendaonline;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PersistenciaProducto {

    private static final String ARCHIVO_PRODUCTOS = "productos.bin";

    // Guardar lista de productos en el archivo
    public static void guardarProductos(List<Producto> productos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_PRODUCTOS))) {
            oos.writeObject(productos);
            JOptionPane.showMessageDialog(null, "Productos guardados correctamente.");
        } catch (IOException e) {
        }
    }
    
    // Cargar lista de productos desde el archivo 
    @SuppressWarnings("unchecked") 
    public static List<Producto> cargarProductos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_PRODUCTOS))) {
            return (List<Producto>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar el archivo.");
            return new ArrayList<>();
        }
    }
}
