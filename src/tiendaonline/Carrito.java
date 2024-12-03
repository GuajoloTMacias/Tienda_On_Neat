package tiendaonline;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Carrito {
    private List<Producto> productos;
    private List<Producto> productosCarrito;
    private double subTotalPagar;
    private String metodoPago;
    private String usuario;
    private static Carrito instancia;
    
    private Carrito(String usuario) {
        this.productos = new ArrayList<>();
        this.subTotalPagar = 0.0;
        this.usuario = usuario;

        
    }
    
    public static Carrito getInstance(String usuario) {
        if (instancia == null) {
            instancia = new Carrito(usuario);
        }
        return instancia;
    }

    public double calcularTotal() {
        subTotalPagar = 0.0;     
        List<Producto> carrito = getProductosCarrito();
        for (Producto producto : carrito) {
            subTotalPagar += producto.getPrecio() * producto.getCantidad();
        }
        return subTotalPagar;   
    }

    public void eliminarProducto(Producto producto) {
        
    }
    

    
    public List<Producto> getProductosCarrito() {
        return productosCarrito;
    }

   
}
