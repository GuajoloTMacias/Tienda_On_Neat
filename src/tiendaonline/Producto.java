package tiendaonline;

import java.io.Serializable;

public class Producto implements Serializable{
    private String nombre;
    private String descripcion;
    private String url_imagen;
    private double precio;
    private double precioMayoreo;
    private int cantidad;
    private String dimensiones; 
    private String categoria;

    public Producto(String nombre, String descripcion, String url_imagen, double precio, double precioMayoreo, int cantidad, String dimensiones, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.precioMayoreo = precioMayoreo;
        this.cantidad = cantidad;
        this.dimensiones = dimensiones;
        this.url_imagen = url_imagen;
        this.categoria = categoria;
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
    
    public String getImagen() {
        return this.url_imagen;
    }
    
    public String getCategoria(){
        return this.categoria;
    }
        
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

