
package tiendaonline;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersistenciaCarrito {
    private static final String ARCHIVO_CARRITOS = "carrito.bin";

    // Guardar los carritos de todos los usuarios
    public void guardarCarritos(Map<String, List<Producto>> carritos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_CARRITOS))) {
            oos.writeObject(carritos);
        } catch (IOException e) {
        }
    }

    // Cargar carritos de todos los usuarios
    @SuppressWarnings("unchecked")
    public Map<String, List<Producto>> cargarCarritos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_CARRITOS))) {
            return (Map<String, List<Producto>>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new HashMap<>();
        }
    }

    // Guardar el carrito de un usuario
    public void guardarCarrito(String idUsuario, List<Producto> carrito) {
        Map<String, List<Producto>> carritos = cargarCarritos();
        carritos.put(idUsuario, carrito);
        guardarCarritos(carritos);
    }

    // Cargar el carrito de un usuario
    public List<Producto> cargarCarrito(String idUsuario) {
        Map<String, List<Producto>> carritos = cargarCarritos();
        return carritos.getOrDefault(idUsuario, null);
    }
}
