package tiendaonline;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Carrito {
    private List<Producto> productos;
    private List<Producto> productosCarrito;
    private PersistenciaProducto persistenciaProducto;
    private double totalPagar;
    private String metodoPago;
    private PersistenciaCarrito persistenciaCarrito;
    private String usuario;
    
    public Carrito(String usuario) {
        this.productos = new ArrayList<>();
        this.totalPagar = 0.0;
        productosCarrito = new ArrayList<>();
        persistenciaProducto = new PersistenciaProducto();
        this.usuario = usuario;
        this.persistenciaCarrito = new PersistenciaCarrito();
        this.productosCarrito = persistenciaCarrito.cargarCarrito(usuario);
        if (this.productosCarrito == null) {
            this.productosCarrito = new ArrayList<>();
        }
        
    }

    public void calcularTotal() {
         totalPagar = 0.0;
    }

    public void eliminarProducto(Producto producto) {
        
    }
    
    
    
    public void agregarProducto(Producto producto, int cantidad) {
    // Cargar los productos disponibles
    List<Producto> productosDisponibles = PersistenciaProducto.cargarProductos();

    // Verificar si el producto existe en los disponibles
    for (Producto prodDisponible : productosDisponibles) {
        if (prodDisponible.getNombre().equals(producto.getNombre())) {
            // Verificar cantidad
            if (prodDisponible.getCantidad() >= cantidad) {
                boolean existeEnCarrito = false;

                // Ver si ya está en el carrito
                for (Producto prodCarrito : productosCarrito) {
                    if (prodCarrito.getNombre().equals(producto.getNombre())) {
                        prodCarrito.setCantidad(prodCarrito.getCantidad() + cantidad);
                        existeEnCarrito = true;
                        break;
                    }
                }

                
                if (!existeEnCarrito) {
                    productosCarrito.add(new Producto(
                            producto.getNombre(),
                            producto.getDescripcion(),
                            producto.getImagen(),
                            producto.getPrecio(),
                            producto.getPrecioMayoreo(),
                            producto.getCantidad(),
                            producto.getDimensiones(),
                            producto.getCategoria()
                            ));
                }

                // Reducir cantidad
                prodDisponible.setCantidad(prodDisponible.getCantidad() - cantidad);
                PersistenciaProducto.guardarProductos(productosDisponibles);
                guardarCarrito();

                JOptionPane.showMessageDialog(null,"Producto agregado: " + producto.getNombre());
            } else {
                JOptionPane.showMessageDialog(null,"No hay suficiente stock de: " + producto.getNombre());
            }
            return;
        }
    }
}

    public void guardarCarrito() {
        persistenciaCarrito.guardarCarrito(usuario, productosCarrito);
    }
    
    public List<Producto> getProductosCarrito() {
        return productosCarrito;
    }

   
}
