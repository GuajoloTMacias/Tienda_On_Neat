package tiendaonline;

public class Sesion {
    private static Usuario usuarioActual;  // Usuario logueado

    // Método para obtener el usuario logueado
    public static Usuario getUsuarioActual() {
        return usuarioActual;
    }

    // Método para verificar si hay un usuario logueado
    public static boolean estaLogueado() {
        return usuarioActual != null;
    }

    // Método para cerrar sesión
    public static void cerrarSesion() {
        usuarioActual = null;  // Limpia la sesión
    }

    // Método para establecer el usuario logueado
    public static void setUsuarioActual(Usuario usuario) {
        usuarioActual = usuario;
    }

    public static Registrado getUsuarioActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
