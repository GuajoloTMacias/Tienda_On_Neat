package tiendaonline;

public class Credito extends Tarjeta {
    public Credito(String titular, String numeroTarjeta, String fechaNacimiento, String cvv) {
        super(titular, numeroTarjeta, fechaNacimiento, cvv);
    }

    @Override
    public String toString() {
        return super.toString() + ", Crédito";
    }
}
