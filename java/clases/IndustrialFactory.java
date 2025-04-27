package clases;

public class IndustrialFactory implements ServicioFactory{

    @Override
    public ServicioLimpieza DarServicio() {
        return new ServicioIndustrial(multiplicadorRiesgo, direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

}
