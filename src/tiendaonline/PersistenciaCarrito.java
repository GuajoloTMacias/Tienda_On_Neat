
package tiendaonline;


import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import main.java.Producto_panel;
import main.java.Producto_panel_oferta;

public class PersistenciaCarrito {
    private static final String DIRECTORIO_CARRITOS = "carritos/";

    static {
        File directorio = new File(DIRECTORIO_CARRITOS);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }
    }

    public static void guardarCarrito(List<Producto> productos) {
        Registrado usuarioActual = Sesion.getUsuarioActual(); // usuario actual
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_carrito.txt"; // Usa getNombreUsuario()
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (Producto producto : productos) {
                    writer.write(producto.getNombre() + ";" + producto.getImagen() + ";" + producto.getPrecio() + ";" + producto.getCantidad());
                    writer.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error al guardar el carrito: " + e.getMessage());
            }
        } else {
            System.out.println("Error: No hay usuario activo en la sesión.");
        }
    }


    public static List<Producto> cargarCarrito() {
        Registrado usuarioActual = Sesion.getUsuarioActual(); // Obtiene el usuario actual
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_carrito.txt"; // Usa getNombreUsuario()
            List<Producto> productos = new ArrayList<>();
            File archivo = new File(fileName);
            if (archivo.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                    String linea;
                    while ((linea = reader.readLine()) != null) {
                        String[] partes = linea.split(";");
                        if (partes.length == 4) {
                            String nombre = partes[0];
                            String urlImagen = partes[1];
                            double precio = Double.parseDouble(partes[2]);
                            int cantidad = Integer.parseInt(partes[3]);
                            productos.add(new Producto(nombre, urlImagen, precio, cantidad));
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error al cargar el carrito: " + e.getMessage());
                }
            }
            return productos;
        } else {
            System.out.println("Error: No hay usuario activo en la sesión.");
            return new ArrayList<>();
        }
    }


    public static void guardarOfertasCarrito(List<Oferta> ofertas) {
        Registrado usuarioActual = Sesion.getUsuarioActual(); // Obtiene el usuario actual
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_ofertas.txt"; // Usa getNombreUsuario()
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (Oferta oferta : ofertas) {
                    writer.write(oferta.getNombre() + ";" + oferta.getImagen() + ";" + oferta.getPrecio() + ";" + oferta.getCantidad() + ";" + oferta.getPrecioDescuento());
                    writer.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error al guardar las ofertas en el carrito: " + e.getMessage());
            }
        } else {
            System.out.println("Error: No hay usuario activo en la sesión.");
        }
    }


    public static List<Oferta> cargarOfertasCarrito() {
        Registrado usuarioActual = Sesion.getUsuarioActual(); // Obtiene el usuario actual
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_ofertas.txt"; // Usa getNombreUsuario()
            List<Oferta> ofertas = new ArrayList<>();
            File archivo = new File(fileName);
            if (archivo.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                    String linea;
                    while ((linea = reader.readLine()) != null) {
                        String[] partes = linea.split(";");
                        if (partes.length == 5) {
                            String nombre = partes[0];
                            String urlImagen = partes[1];
                            double precio = Double.parseDouble(partes[2]);
                            int cantidad = Integer.parseInt(partes[3]);
                            double precioDescuento = Double.parseDouble(partes[4]);
                            ofertas.add(new Oferta(nombre, urlImagen, precio, cantidad, precioDescuento));
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error al cargar las ofertas del carrito: " + e.getMessage());
                }
            }
            return ofertas;
        } else {
            System.out.println("Error: No hay usuario activo en la sesión.");
            return new ArrayList<>();
        }
    }

    
    public static void agregarProductoAlCarritoTXT(Producto producto, int cantidad) throws IOException {
        Registrado usuarioActual = Sesion.getUsuarioActual(); // Obtiene el usuario actual
        if (usuarioActual != null) { // Verifica que haya un usuario activo
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_productos.txt"; // Usa getNombreUsuario()
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(producto.getNombre() + ";" + producto.getImagen() + ";" + producto.getPrecio() + ";" + cantidad);
                writer.newLine();
            }
        } else {
            System.out.println("Error: No hay usuario activo en la sesión.");
        }
    }



    public static void agregarOfertaAlCarritoTXT(Oferta oferta, int cantidad) throws IOException {
        Registrado usuarioActual = Sesion.getUsuarioActual(); // Obtiene el usuario actual
        if (usuarioActual != null) { // Verifica que haya un usuario activo
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_ofertas.txt"; // Usa getNombreUsuario()
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(oferta.getNombre() + ";" + oferta.getImagen() + ";" + oferta.getPrecio() + ";" + cantidad + ";" + oferta.getPrecioDescuento());
                writer.newLine();
            }
        } else {
            System.out.println("Error: No hay usuario activo en la sesión.");
        }
    }
    
    
    public static void eliminarCarrito() {
        Registrado usuarioActual = Sesion.getUsuarioActual(); // Obtiene el usuario actual
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_carrito.txt"; // Usa getNombreUsuario()
            File archivo = new File(fileName);
            if (archivo.exists()) {
                if (archivo.delete()) {
                    System.out.println("Productos del carrito eliminados correctamente.");
                } else {
                    System.out.println("Error al intentar eliminar los productos del carrito.");
                }
            } else {
                System.out.println("El archivo de ofertas no existe.");
            }
        } else {
            System.out.println("Error: No hay usuario activo en la sesión.");
        }
    }

    
    public static void eliminarOfertasCarrito() {
        Registrado usuarioActual = Sesion.getUsuarioActual(); 
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_ofertas.txt"; 
            File archivo = new File(fileName);
            if (archivo.exists()) {
                if (archivo.delete()) {
                    System.out.println("Ofertas del carrito eliminadas correctamente.");
                } else {
                    System.out.println("Error al intentar eliminar las ofertas del carrito.");
                }
            } else {
                System.out.println("El archivo de ofertas no existe.");
            }
        } else {
            System.out.println("Error: No hay usuario activo en la sesión.");
        }
    }



    
}
