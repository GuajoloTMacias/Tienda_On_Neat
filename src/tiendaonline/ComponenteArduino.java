package tiendaonline;

public class ComponenteArduino extends Producto {
    private double porcentajeDescuento10;

    public ComponenteArduino(String nombre, String descripcion, String imagen, double precio, double precioMayoreo, int cantidad, String dimensiones) {
        super(nombre, descripcion, imagen, precio, precioMayoreo, cantidad, dimensiones);
    }

    public void calcularPorcentajeDescuento10() {

    }
}
