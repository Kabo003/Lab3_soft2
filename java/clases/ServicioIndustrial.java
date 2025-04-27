
package clases;

public class ServicioIndustrial extends ServicioLimpieza{
    private double multiplicadorRiesgo;

    public ServicioIndustrial(double multiplicadorRiesgo, String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.multiplicadorRiesgo = multiplicadorRiesgo;
    }

    @Override
    public double calcularPrecioFinal() {
        if(!incluyeMateriales)
            throw new IllegalArgumentException("Los servicios industriales requieren materiales");
        return calcularPrecioBase()*this.multiplicadorRiesgo;
    }
    
    
}
