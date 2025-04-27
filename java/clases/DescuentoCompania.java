package clases;

public class DescuentoCompania implements Descuento{
    private static final double PORCENTAJE_DESCUENTO = 0.2;
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto*(1 - PORCENTAJE_DESCUENTO);
    }
    
}
