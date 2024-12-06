
package tiendaonline;


import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


public class PersistenciaCarrito {
    private static final String DIRECTORIO_CARRITOS = "carritos/";

    static {
        File directorio = new File(DIRECTORIO_CARRITOS);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }
    }

    public static void guardarCarrito(List<Producto> productos) {
        Registrado usuarioActual = Sesion.getUsuarioActual(); 
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_productos.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (Producto producto : productos) {
                    writer.write(producto.getNombre() + "," + producto.getPrecio() + "," + producto.getCantidad());
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
        Registrado usuarioActual = Sesion.getUsuarioActual(); 
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_productos.txt"; 
            List<Producto> productos = new ArrayList<>();
            File archivo = new File(fileName);
            if (archivo.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                    String linea;
                    while ((linea = reader.readLine()) != null) {
                        String[] partes = linea.split(",");
                        if (partes.length == 3) {
                            String nombre = partes[0];
                            double precio = Double.parseDouble(partes[1]);
                            int cantidad = Integer.parseInt(partes[2]);
                            productos.add(new Producto(nombre, precio, cantidad));
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
        Registrado usuarioActual = Sesion.getUsuarioActual(); 
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_ofertas.txt"; 
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (Oferta oferta : ofertas) {
                    writer.write(oferta.getNombre() + "," + oferta.getPrecio() + "," + oferta.getCantidad() + "," + oferta.getPrecioDescuento());
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
        Registrado usuarioActual = Sesion.getUsuarioActual();
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_ofertas.txt"; 
            List<Oferta> ofertas = new ArrayList<>();
            File archivo = new File(fileName);
            if (archivo.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                    String linea;
                    while ((linea = reader.readLine()) != null) {
                        String[] partes = linea.split(",");
                        if (partes.length == 4) {
                            String nombre = partes[0];
                            double precio = Double.parseDouble(partes[1]);
                            int cantidad = Integer.parseInt(partes[2]);
                            double precioDescuento = Double.parseDouble(partes[3]);
                            ofertas.add(new Oferta(nombre, precio, cantidad, precioDescuento));
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
        Registrado usuarioActual = Sesion.getUsuarioActual(); 
        if (usuarioActual != null) {
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_productos.txt"; 
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(producto.getNombre() + "," + producto.getPrecio() + "," + cantidad);
                writer.newLine();
            }
        } else {
            System.out.println("Error: No hay usuario activo en la sesión.");
        }
    }



    public static void agregarOfertaAlCarritoTXT(Oferta oferta, int cantidad) throws IOException {
        Registrado usuarioActual = Sesion.getUsuarioActual(); 
        if (usuarioActual != null) { 
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_ofertas.txt"; 
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(oferta.getNombre() + "," + oferta.getPrecioDescuento() + "," + cantidad + "," + oferta.getPrecioDescuento());
                writer.newLine();
            }
        } else {
            System.out.println("Error: No hay usuario activo en la sesión.");
        }
    }
    
    
    public static void eliminarCarrito() throws FileNotFoundException {
        Registrado usuarioActual = Sesion.getUsuarioActual(); 
        if (usuarioActual != null) {
            
            String fileName = "carritos/" + usuarioActual.getNombreUsuario() + "_productos.txt"; 
            File archivo = new File(fileName);
            
            String ofertasFileName = "carritos/" + usuarioActual.getNombreUsuario() + "_ofertas.txt"; 
            File archivoOfertas = new File(ofertasFileName);
            
            
            if (archivo.exists() && archivoOfertas.exists()) {
                
                PrintWriter  pw = new PrintWriter(archivo);
                pw.write("");
                pw.close();
                PrintWriter  pwOfertas = new PrintWriter(archivoOfertas);
                pwOfertas.write("");
                pwOfertas.close();
                
                JOptionPane.showMessageDialog(null, "Productos del carrito eliminados correctamente.");

            } else {
                System.out.println("El archivo de productos no existe.");
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
