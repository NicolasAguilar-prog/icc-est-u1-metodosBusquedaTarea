import models.Persona;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public static Persona[] generatePersonas(){
        Persona[] personas = new Persona[5];
        personas[0] = new Persona("Juan", 25);
        personas[1] = new Persona("Maria", 30);
        personas[2] = new Persona("Pedro", 20);
        personas[3] = new Persona("Ana", 35);
        personas[4] = new Persona("Luis", 28);
        return personas;
    }
}
