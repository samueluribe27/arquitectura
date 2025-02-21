public class Factura implements ICalcularPago {
    static int horasRentadas;
    private Vehiculo vehiculo;
    private Cliente cliente;
    static double precioAPagar;

    @Override
    public void calcularPago(){
        double pago;
        pago = horasRentadas * Vehiculo.precioHora;
        Factura.precioAPagar = pago;

    }

    static void setHorasRentadas(int horasRentadas) {
        Factura.horasRentadas = horasRentadas;
    }
    public void crearFactura(){
        System.out.println("**** Factura ****\n horas rentadas: "+ Factura.horasRentadas +"\n Precio a pagar "+ Factura.precioAPagar);
    }
}
