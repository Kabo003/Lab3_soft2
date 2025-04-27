package clases;

public class ServicioOficina extends ServicioLimpieza{
    private int cantidadEmpleados;

    public ServicioOficina(int cantidadEmpleados, String direccionCliente, double duraciónHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public double calcularPrecioFinal() {
        
        double duracionTotal = this.duraciónHoras + (this.cantidadEmpleados*0.1);
        double base = duracionTotal * this.tarifaHora;
        return base*1.18;
        /*
        double precioBase = calcularPrecioBase();
        double totalHoras = 0.1*this.cantidadEmpleados;
        precioBase*=totalHoras*1.18;
        return precioBase;
        */
    }
    
}
