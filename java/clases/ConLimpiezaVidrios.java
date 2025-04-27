package clases;

public class ConLimpiezaVidrios extends ServicioAdicional{

    public ConLimpiezaVidrios(String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        return precioBase + 50;
    }

    @Override
    public String getDescripcion() {
        return "Servicio de Limpieza de vidrios añadido con un cargo de $50";
    }
    
}
