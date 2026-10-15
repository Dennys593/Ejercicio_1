public class Heroe {
    private String nombre;
    private String origen;
    private int nivelPoder;

    // Constructor por defecto: sin parametros
    public Heroe() {
        this.nombre = "Desconocido";
        this.origen = "Tierra-616";
        this.nivelPoder = 1;
    }
    // Constructor con parametros: el objeto nace con valores propios
    public Heroe(String nombre, String origen, int nivelPoder) {
        this.nombre = nombre;
        this.origen = origen;
        this.nivelPoder = nivelPoder;
    }
    // Metodo normal: muestra el estado actual del objeto
    public void presentarse() {
        System.out.println("Soy " + nombre + " de " + origen + " (poder " + nivelPoder + ")");
    }
}
