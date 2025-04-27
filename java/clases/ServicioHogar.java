
package clases;

public class ServicioHogar extends ServicioLimpieza{
    
    private boolean esApartamento;

    public ServicioHogar(boolean esApartamento, String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.esApartamento = esApartamento;
    }
    
    
    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        if(esApartamento){
            precioBase*=0.90;
        }
        return precioBase;
    }
    
}
