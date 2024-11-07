package tiendaonline;

import java.util.ArrayList;
import java.util.List;

public class TiendaOnline {
    private String nombre;
    private String url;
    private List<Carrito> carritos;
    private Inventario inventario;
    private List<Usuario> usuarios;

    public TiendaOnline(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
        this.carritos = new ArrayList<>();
        this.inventario = new Inventario();
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        
    }

    public void iniciarSesion(String nombreUsuario, String contraseña) {
       
    }

    public void busqueda(String query) {
        
    }

    public void ofertas() {
        
    }
}
