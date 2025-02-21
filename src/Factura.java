public class Factura implements ICalcularPago {
    static int horasRentadas;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private double precioAPagar;

    @Override
    public void calcularPago(){
        double pago;
        pago = horasRentadas * Vehiculo.precioHora;
        precioAPagar = pago;

    }

    static void setHorasRentadas(int horasRentadas) {
        Factura.horasRentadas = horasRentadas;
    }
}
