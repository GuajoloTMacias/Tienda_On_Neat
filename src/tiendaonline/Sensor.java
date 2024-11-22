package tiendaonline;

public abstract class Sensor extends Producto {

    public Sensor(String nombre, String descripcion, String imagen, double precio, double precioMayoreo, int cantidad, String dimensiones, String categoria) {
        super(nombre, descripcion, imagen, precio, precioMayoreo, cantidad, dimensiones,categoria);
    }
    public abstract void calcularPorcentajeDescuento5();
}
