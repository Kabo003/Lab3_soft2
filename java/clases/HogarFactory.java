package clases;

public class HogarFactory implements ServicioFactory{

    @Override
    public ServicioLimpieza DarServicio() {
        return new ServicioHogar(esApartamento, direccionCliente, duraciónHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

}
