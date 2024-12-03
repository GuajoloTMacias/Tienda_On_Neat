
package tiendaonline;


import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import main.java.Producto_panel;
import main.java.Producto_panel_oferta;

public class PersistenciaCarrito {
    private static final String ARCHIVO_CARRITOS = "carrito.bin";
    private static final String ARCHIVO_OFERTAS = "carritoOfertas.bin";

    // Cargar carritos
    public static Map<String, List<Producto>> cargarCarritos() {
        Map<String, List<Producto>> usuariosCarritos = new HashMap<>();
        File archivo = new File(ARCHIVO_CARRITOS);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                usuariosCarritos = (Map<String, List<Producto>>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al cargar los carritos: " + e.getMessage());
            }
        }
        return usuariosCarritos;
    }

    // Guardar carritos
    public static void guardarCarritos(Map<String, List<Producto>> usuariosCarritos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_CARRITOS))) {
            oos.writeObject(usuariosCarritos);
        } catch (IOException e) {
            System.out.println("Error al guardar los carritos: " + e.getMessage());
        }
    }

    // Cargar carritos ofertas
    public static Map<String, List<Oferta>> cargarOfertas() {
        Map<String, List<Oferta>> usuariosOfertas = new HashMap<>();
        File archivo = new File(ARCHIVO_OFERTAS);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                usuariosOfertas = (Map<String, List<Oferta>>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al cargar las ofertas: " + e.getMessage());
            }
        }
        return usuariosOfertas;
    }

    // Guardar carritos ofertas
    public static void guardarOfertas(Map<String, List<Oferta>> usuariosOfertas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_OFERTAS))) {
            oos.writeObject(usuariosOfertas);
        } catch (IOException e) {
            System.out.println("Error al guardar las ofertas: " + e.getMessage());
        }
    }

    // Agregar un producto
    public static void agregarProductoAlCarrito(Registrado usuario, Producto producto, Producto_panel productopanel) {
        int cantidadSolicitada = productopanel.getCantidad();

        List<Producto> productos = PersistenciaProducto.cargarProductos();
        Producto productoSeleccionado = null;
// Asginar el paramtetro de producto en producto seleccionado
        productoSeleccionado = producto;
        /*
        for (Producto p : productos) {
            if (p.equals(producto)) {
                productoSeleccionado = p;
                break;
            }
        }*/
        if (productoSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
            return;
        }

        // Verificar stock
        if (productoSeleccionado.getCantidad() >= cantidadSolicitada) {
            productoSeleccionado.setCantidad(productoSeleccionado.getCantidad() - cantidadSolicitada);
            PersistenciaProducto.guardarProductos(productos);

            Map<String, List<Producto>> usuariosCarritos = cargarCarritos();
            List<Producto> carrito = usuariosCarritos.getOrDefault(usuario, new ArrayList<>());

            for (int i = 0; i < cantidadSolicitada; i++) {
                carrito.add(productoSeleccionado);
            }

            usuariosCarritos.put(usuario.nombreUsuario, carrito);
            guardarCarritos(usuariosCarritos);
            JOptionPane.showMessageDialog(null, "Producto agregado al carrito con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible.");
        }
    }

    // Agregar una oferta al carrito
    public static void agregarOfertaAlCarrito(Registrado usuario, Oferta oferta, Producto_panel_oferta productopanelOferta) {
        int cantidadSolicitada = productopanelOferta.getCantidad();

        List<Oferta> ofertas = PersistenciaProducto.cargarOfertas();
        Producto productoSeleccionado = null;
        productoSeleccionado = (Producto)oferta;
/*
        for (Oferta o : ofertas) {
            if (o.equals(oferta)) {
                productoSeleccionado = o;
                break;
            }
        }
        */
        if (productoSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
            return;
        }
        
        if (oferta.getCantidad() >= cantidadSolicitada) {
            oferta.setCantidad(oferta.getCantidad() - cantidadSolicitada);

            Map<String, List<Oferta>> usuariosOfertas = cargarOfertas();
            List<Oferta> carritoOfertas = usuariosOfertas.getOrDefault(usuario.nombreUsuario, new ArrayList<>());

            for (int i = 0; i < cantidadSolicitada; i++) {
                carritoOfertas.add(oferta);
            }

            usuariosOfertas.put(usuario.nombreUsuario, carritoOfertas);
            guardarOfertas(usuariosOfertas);
            JOptionPane.showMessageDialog(null, "Oferta agregada al carrito con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible en la oferta.");
        }
    }

    // Obtener carrito de un usuario
    public static List<Producto> obtenerCarritoUsuario(String nombreUsuario) {
        Map<String, List<Producto>> usuariosCarritos = cargarCarritos();
        return usuariosCarritos.getOrDefault(nombreUsuario, new ArrayList<>());
    }

    // Obtener  carrito de un usuario
    public static List<Oferta> obtenerOfertasUsuario(String nombreUsuario) {
        Map<String, List<Oferta>> usuariosOfertas = cargarOfertas();
        return usuariosOfertas.getOrDefault(nombreUsuario, new ArrayList<>());
    }
    
    
}
