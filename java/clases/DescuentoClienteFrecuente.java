package clases;

public class DescuentoClienteFrecuente implements Descuento{
    private static final double PORCENTAJE_DESCUENTO = 0.15;
    //final (en mayuscula) son para constantes
    //static es para referenciar al atributo o metodo sin instanciar la clase

    @Override
    public double aplicarDescuento(double monto) {
        return monto*(1 - PORCENTAJE_DESCUENTO);
    }
    
}
