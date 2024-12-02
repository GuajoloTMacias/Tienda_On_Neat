package tiendaonline;

public class Puntos extends Tarjeta {
    private int puntos;

    public Puntos(String titular, String numeroTarjeta, String fechaNacimiento, String cvv) {
        super(titular, numeroTarjeta, fechaNacimiento, cvv);
        this.puntos = 0; // Inicialmente, 0 puntos
    }

    public int getPuntos() { return puntos; }

    public void acumularPuntos(int cantidad) {
        if (cantidad > 0) {
            puntos += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Tarjeta de Puntos\n" + super.toString() + "\nPuntos acumulados: " + puntos;
    }
}
