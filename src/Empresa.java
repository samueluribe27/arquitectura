public class Empresa {
    private String nombre;
    private String pais;
    private String anioFundacion;
    private String direccion;
    private double ingresos = 0;
    private String horario;

    public static double getIngresos() {
        return ingresos;
    }

    public static void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
}
