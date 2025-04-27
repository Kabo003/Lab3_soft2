package clases;

public abstract class ServicioLimpieza {
    protected String direccionCliente;
    protected double duraciónHoras;
    protected double tarifaHora;
    protected boolean incluyeMateriales;
    protected String nombreCliente;
    
    public ServicioLimpieza(String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        this.direccionCliente = direccionCliente;
        this.duraciónHoras = duraciónHoras;
        this.tarifaHora = tarifaHora;
        this.incluyeMateriales = incluyeMateriales;
        this.nombreCliente = nombreCliente;
    }
    
    public double calcularPrecioBase(){
        return this.duraciónHoras*this.tarifaHora;
    }
    
    public abstract double calcularPrecioFinal();

}
