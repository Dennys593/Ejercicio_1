public class Heroe {
    private String nombre;
    private String origen;
    private int nivelPoder;

    public Heroe() {
        this.nombre = "Desconocido";
        this.origen = "Tierra-616";
        this.nivelPoder = 1;
    }

    public Heroe(String nombre, String origen, int nivelPoder) {
        this.nombre = nombre;
        this.origen = origen;
        this.nivelPoder = nivelPoder;
    }

    public void presentarse() {
        System.out.println("Soy " + nombre + " de " + origen + " (poder " + nivelPoder + ")");
    }
}
