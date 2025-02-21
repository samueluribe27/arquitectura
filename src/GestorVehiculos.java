import java.util.*;
import java.lang.*;


public class GestorVehiculos implements IAgregarVehiculo, IEliminarVehiculo{
    static List<Bicicleta> bicicletasCreadas = new ArrayList<>();
    List<Scooter> scootersCreadas = new ArrayList<>();
    List<Vehiculo> vehiculosCreados = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public List<Vehiculo> getVehiculosCreados() {
        return vehiculosCreados;
    }

    public List<Scooter> getScootersCreadas() {
        return scootersCreadas;
    }

    public static List<Bicicleta> getBicicletasCreadas() {
        return bicicletasCreadas;
    }

    @Override
    public void agregarVehiculo() {


        boolean estado = true;
        System.out.println("Ingrese el color del vehículo: ");
        String color = in.nextLine();
        System.out.println("Ingrese la marca del vehículo: ");
        String marca = in.nextLine();
        System.out.println("Ingrese el año del vehiculo: ");
        String anio = in.nextLine();
        System.out.println("Ingrese el precio por hora del vehiculo: ");
        double precioHora = Double.parseDouble(in.nextLine());
        vehiculosCreados.add(new Vehiculo(color, marca, anio, precioHora));
        while(estado){
            System.out.println("Ingrese el tipo de vehiculo (1. scooter o 2. bicicleta): ");
            int tipo = Integer.parseInt(in.nextLine());
            if (tipo == 1) {
                System.out.println("Ingrese el tipo de bicicleta: ");
                String tipoBicicleta = in.nextLine();
                System.out.println("Ingrese la capacidad de pasajeros: ");
                int cantidadPasajeros = Integer.parseInt(in.nextLine());
                System.out.println("Ingrese el material de la bicicleta: ");
                String material = in.nextLine();
                System.out.println("¿La bicicleta es de cambios (1. si/2. no)? ");
                int opcionCambios = Integer.parseInt(in.nextLine());
                boolean cambios = true;
                if(opcionCambios == 1){
                    cambios = true;
                } else if (opcionCambios == 2) {
                    cambios = false;

                }
                else{
                    System.out.println("valor no valido");
                }
                bicicletasCreadas.add(new Bicicleta(tipoBicicleta, cantidadPasajeros, material, cambios));

            }
            else if(tipo == 2){
                System.out.println("Ingrese la potencia del motor de la scooter: ");
                double potenciaMotor = Double.parseDouble(in.nextLine());
                System.out.println("Ingrese la autonomia del scooter: ");
                int autonomia = Integer.parseInt(in.nextLine());
                System.out.println("Ingrese la velocidad maxima del scooter: ");
                int velocidadMaxima = Integer.parseInt(in.nextLine());
                scootersCreadas.add(new Scooter(potenciaMotor, autonomia, velocidadMaxima));
            }
            else {
                estado = false;
            }

        }


    }
    @Override
    public void eliminarVehiculo(List<Vehiculo> vehiculosCreados, Vehiculo vehiculo){
        if(vehiculosCreados.remove(vehiculo)){
            System.out.println("Vehículo eliminado: " + vehiculo);
        }
        else {
            System.out.println("Vehículo no encontrado en la lista.");
        }

    }
}
