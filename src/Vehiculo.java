public class Vehiculo {
    private String color;
    private String marca;
    private String anio;
    static double precioHora;
    public Vehiculo(String color, String marca, String anio, double precioHora){
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        Vehiculo.precioHora = precioHora;
    }
}
