package tiendaonline;

public abstract class ComponenteElectronico extends Producto {

    public ComponenteElectronico(String nombre, String descripcion, String imagen, double precio, double precioMayoreo, int cantidad, String dimensiones) {
        super(nombre, descripcion, imagen, precio, precioMayoreo, cantidad, dimensiones);
    }
    public abstract void calcularPorcentajeDescuento3();
}
