import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== CUARTEL DE HEROES =====");

        Heroe recluta = new Heroe();
        recluta.presentarse();

        System.out.print("Nombre del nuevo heroe: ");
        String nombre = sc.nextLine();
        System.out.print("Origen: ");
        String origen = sc.nextLine();
        System.out.print("Nivel de poder (entero): ");
        int poder = sc.nextInt();
        Heroe nuevo = new Heroe(nombre, origen, poder);
        nuevo.presentarse();
        sc.close();
    }
}
