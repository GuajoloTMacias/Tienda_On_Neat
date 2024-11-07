package tiendaonline;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private double precioMayoreo;
    private int cantidad;
    private String dimensiones;

    public Producto(String nombre, String descripcion, String imagen, double precio, double precioMayoreo, int cantidad, String dimensiones) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.precioMayoreo = precioMayoreo;
        this.cantidad = cantidad;
        this.dimensiones = dimensiones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioMayoreo() {
        return precioMayoreo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDimensiones() {
        return dimensiones;
    }
}

