
package tiendaonline;

import java.util.List;

public class VerificarProductos {
    public static void main(String[] args) {
        PersistenciaProducto persistenciaProducto = new PersistenciaProducto();
        List<Producto> productos = persistenciaProducto.cargarProductos();

        for (Producto p : productos) {
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Descripción: " + p.getDescripcion());
            System.out.println("Precio: " + p.getPrecio());
            System.out.println("Stock: " + p.getCantidad());
            System.out.println("Imagen: " + p.getImagen());
            System.out.println("Categoria: " + p.getCategoria());
            System.out.println();
        }
    }
}
