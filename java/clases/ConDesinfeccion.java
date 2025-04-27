package clases;

public class ConDesinfeccion extends ServicioAdicional{

    public ConDesinfeccion(String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        return precioBase + 20;
    }

    @Override
    public String getDescripcion() {
        return "Servicio de Desinfección añadido con un cargo de $20";
    }
    
}