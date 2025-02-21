import java.util.*;

public class GestorCliente implements IRegistrarCliente {
    private Map<String, Cliente> clientes;
    private Scanner scanner;

    public GestorCliente() {
        this.clientes = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void registrarCliente() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del cliente: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el ID del cliente: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (clientes.containsKey(id)) {
            throw new IllegalArgumentException("Cliente ya registrado con el ID: " + id);
        }

        System.out.print("Ingrese la edad del cliente: ");
        int edad = Integer.parseInt(scanner.nextLine());

        Cliente nuevoCliente = new Cliente(nombre, apellido, id, edad);
        clientes.put(String.valueOf(id), nuevoCliente);
        System.out.println("Cliente registrado exitosamente con saldo inicial de 0.");
    }

    public Cliente obtenerCliente(String clienteId) {
        return clientes.get(clienteId);
    }
}
