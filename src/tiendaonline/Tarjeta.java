package tiendaonline;

public abstract class Tarjeta {
    private String titular;
    private String numeroTarjeta;
    private String fechaNacimiento;
    private String cvv;

    public Tarjeta(String titular, String numeroTarjeta, String fechaNacimiento, String cvv) {
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaNacimiento = fechaNacimiento;
        this.cvv = cvv;
    }

    public String getTitular() { return titular; }
    public String getNumeroTarjeta() { return numeroTarjeta; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public String getCvv() { return cvv; }

    @Override
    public String toString() {
        return "Titular: " + titular + "\nNúmero de Tarjeta: " + numeroTarjeta + "\nFecha de Nacimiento: " + fechaNacimiento + "\nCVV: " + cvv;
    }
}
