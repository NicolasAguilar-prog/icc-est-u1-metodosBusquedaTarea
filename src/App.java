import models.Persona;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = generatePersonas();
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        busquedaBinaria.sortByEdad(personas);


        System.out.print("Ingrese la edad a buscar: ");
        int edad = scanner.nextInt();


        int edadBuscada = busquedaBinaria.findByEdad(personas, edad);
        if (edadBuscada != -1) {
            System.out.println("Persona encontrada en el índice: " + edadBuscada);
        } else {
            System.out.println("Persona no encontrada.");
        }

    }

    public static Persona[] generatePersonas() {
    Scanner scanner = new Scanner(System.in);
    Persona[] personas = new Persona[9];

    for (int i = 0; i < personas.length; i++) {

        System.out.println("Ingrese Persona:");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        personas[i] = new Persona(nombre, edad);
    }
    return personas;
}
}
