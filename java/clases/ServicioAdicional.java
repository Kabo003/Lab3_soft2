package clases;

public abstract class ServicioAdicional extends ServicioLimpieza{

    public ServicioAdicional(String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

    @Override
    public abstract double calcularPrecioFinal();
    public abstract String getDescripcion();
    
}
