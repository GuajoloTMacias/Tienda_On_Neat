package tiendaonline;

import java.util.ArrayList;
import java.util.List;

public class Registrado extends Usuario {
    private String nombreCompleto;
    private String direccion;
    private int edad;
    private String nombreUsuario;
    private String contraseña;
    private String fechaNacimiento;
    private List<Tarjeta> tarjetas;

    public Registrado() {
        this.tarjetas = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
       
    }

    public void verCarrito() {
        
    }

    public void comprarCarrito() {
        
    }

    @Override
    public void iniciarSesion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cerrarSesion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
