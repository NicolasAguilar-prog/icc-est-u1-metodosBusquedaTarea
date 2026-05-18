import models.Persona;

public class BusquedaBinaria {
    public void sortByEdad(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }


    public int findByEdad(Persona[] personas, int edad){
        int left = 0;
        int right = personas.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            for (Persona persona : personas) {
                System.out.print(" | " + persona.getEdad());
            }
            System.out.println("\n left: " + left + ", mid: " + mid + ", right: " + right + ", edad en mid: " + personas[mid].getEdad());
            if (personas[mid].getEdad() == edad) {
                return mid; 
            } else if (personas[mid].getEdad() < edad) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1;
    }
}
