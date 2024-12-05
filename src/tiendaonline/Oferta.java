
package tiendaonline;

public class Oferta extends Producto{
    private int descuento;
    private double precio_descuento;
    
    public Oferta(String nombre, String url_imagen, double precio , int cantidad, double precio_descuento){
        super(nombre, url_imagen, precio, cantidad);
        this.precio_descuento = precio_descuento;
    }
    
    public Oferta(String nombre, String descripcion, String url_imagen, double precio , int cantidad, String dimensiones, String categoria, int descuento, double precio_descuento){
        super(nombre, descripcion, url_imagen, precio, cantidad, dimensiones, categoria);
        this.descuento = descuento;
        this.precio_descuento = precio_descuento;
    }
    
    public int getDescuento() {
        return descuento;
    }
    
    public double getPrecioDescuento(){
        return precio_descuento;
    }
    
    public void setDescuento(int descuento){
        this.descuento = descuento;
    }
    
    
}
