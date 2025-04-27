package clases;

public class OficinaFactory implements ServicioFactory{

    @Override
    public ServicioLimpieza DarServicio() {
        return new ServicioOficina(cantidadEmpleados, direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

}
