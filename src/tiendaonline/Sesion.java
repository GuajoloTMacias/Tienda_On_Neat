package tiendaonline;

public class Sesion {
    private static Registrado usuarioActual;  // Usuario logueado

    // Método para obtener el usuario logueado
    public static Registrado getUsuarioActual() {
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
    public static void setUsuarioActual(Registrado usuario) {
        usuarioActual = usuario;
    }

}
