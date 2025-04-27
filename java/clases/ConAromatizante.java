package clases;

public class ConAromatizante extends ServicioAdicional{

    public ConAromatizante(String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        return precioBase + 10;
    }

    @Override
    public String getDescripcion() {
        return "Servicio de Aromatizante añadido con un cargo de $10";
    }
    
}
