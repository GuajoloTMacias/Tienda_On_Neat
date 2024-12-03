
package tiendaonline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static tiendaonline.PersistenciaCarrito.cargarCarritos;

public class VerificarProductos {
    public static void main(String[] args) {
        // Obtener el usuario de la sesión actual
        Registrado usuarioLogueado = (Registrado) Sesion.getUsuarioActual();
        
        if (usuarioLogueado != null) {
            String nombreUsuario = usuarioLogueado.getNombreUsuario();
            imprimirCarrito(nombreUsuario);
        } else {
            System.out.println("No hay ningún usuario logueado en la sesión.");
        }
    }
    public static void imprimirCarrito(String nombreUsuario) {
        Map<String, List<Producto>> usuariosCarritos = PersistenciaCarrito.cargarCarritos();
        List<Producto> carrito = usuariosCarritos.getOrDefault(nombreUsuario, new ArrayList<>());

        System.out.println("Carrito de " + nombreUsuario + ":");
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (Producto p : carrito) {
                System.out.println("- " + p.getNombre() + " (Cantidad: " + p.getCantidad() + ")");
            }
        }
    }

}



