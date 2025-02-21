public class Factura implements ICalcularPago, ICalcularIngresos {
    private static int horasRentadas;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private double precioAPagar;
    public Factura(int horasRentadas, Vehiculo vehiculo, Cliente cliente, double precioAPagar){
        this.horasRentadas = horasRentadas;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.precioAPagar = precioAPagar;
    }

    public int getHorasRentadas() {
        return horasRentadas;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void calcularPago(){
        double pago;
        pago = horasRentadas * Vehiculo.precioHora;
        this.precioAPagar = pago;

    }

    public static void setHorasRentadas(int horas){
         horasRentadas = horas;
    }
    public void crearFactura(int horasRentadas, Vehiculo vehiculo,Cliente cliente, double precioAPagar){
        Factura factura = new Factura(horasRentadas, vehiculo, cliente, precioAPagar);
    }
    @Override
    public void calcularIngresos(){


    }
}
