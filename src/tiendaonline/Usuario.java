package tiendaonline;

public abstract class Usuario {
    protected int numUsuario;

    public abstract void iniciarSesion();
    public abstract void cerrarSesion();
    public abstract void consultarInformacion();
}
