package tiendaonline;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class PersistenciaProducto {

    private static final String ARCHIVO_PRODUCTOS = "productos.bin";
    private static final String ARCHIVO_OFERTAS = "ofertas.bin";

    // Guardar lista de productos en el archivo
    public static void guardarProductos(List<Producto> productos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_PRODUCTOS))) {
            oos.writeObject(productos);
            JOptionPane.showMessageDialog(null, "Productos guardados correctamente.");
        } catch (IOException e) {
        }
    }
    
    
    //Productos de oferta
    public static void guardarOfertas(List<Oferta> ofertas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_OFERTAS))) {
            oos.writeObject(ofertas);
            JOptionPane.showMessageDialog(null, "Productos de oferta guardados correctamente.");
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
    
    //Cargar lista de ofertas
    @SuppressWarnings("unchecked") 
    public static List<Oferta> cargarOfertas() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_OFERTAS))) {
            return (List<Oferta>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar el archivo.");
            return new ArrayList<>();
        }    
    }

    public static List<Producto> filtrarPorCategoria(List<Producto> productos, String categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }
}
