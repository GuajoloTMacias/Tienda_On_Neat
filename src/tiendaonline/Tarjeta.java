package tiendaonline;

public abstract class Tarjeta {
    protected String institucion;
    protected String fechaVencimiento;
    protected String numeracion;

    public abstract void verificarVigencia();
}
