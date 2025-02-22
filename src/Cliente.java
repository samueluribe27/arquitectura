import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Cliente implements IRecargarSaldo, IClienteAlquilar, IClienteRegresar {
    private String nombre;
    private String apellido;
    private int id;
    private int edad;
    private double saldo;
    private boolean vehiculoAlquilado;
    private static Scanner scanner = new Scanner(System.in);

    public Cliente(String nombre, String apellido, int id, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
        this.vehiculoAlquilado = false;
        this.saldo = 0.0;
    }

    public int getId() {
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int edad(){
        return edad;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean setVehiculoAlquilado(){return vehiculoAlquilado;}

    @Override
    public void recargarSaldo(Map<Integer, Cliente> clientes) {
        System.out.print("Ingrese el ID del cliente para recargar saldo: ");
        int clienteId = Integer.parseInt(scanner.nextLine());

        Cliente cliente = clientes.get(clienteId);
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente no encontrado con el ID: " + clienteId);
        }

        System.out.print("Ingrese el monto a recargar: ");
        double monto = Double.parseDouble(scanner.nextLine());

        if (monto <= 0) {
            System.out.println("El monto a recargar debe ser mayor a 0.");
            return;
        }

        cliente.setSaldo(cliente.getSaldo() + monto);
        System.out.println("Saldo recargado exitosamente. Nuevo saldo: " + cliente.getSaldo());
    }


    @Override
    public void alquilarVehiculo(List<Cliente> clientes, GestorVehiculos gestorVehiculos) {

    }

    @Override
    public void regresarVehiculo(List<Cliente> clientes) {

    }


}
