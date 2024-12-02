package tiendaonline;

public class Debito extends Tarjeta {
    public Debito(String titular, String numeroTarjeta, String fechaNacimiento, String cvv) {
        super(titular, numeroTarjeta, fechaNacimiento, cvv);
    }

    @Override
    public String toString() {
        return super.toString() + ", Débito";
    }
}
