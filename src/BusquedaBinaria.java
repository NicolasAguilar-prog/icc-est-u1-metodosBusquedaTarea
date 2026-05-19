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


    public int findByEdad(Persona[] personas, int edad) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].getEdad();

            for (int i = bajo; i <= alto; i++) {
                if (i == centro) {
                    System.out.print("| " + personas[i].getEdad() + " | ");
                } else {
                    System.out.print(personas[i].getEdad() + " ");
                }
            }

            System.out.println();

            if (valorCentro == edad) {
                System.out.println("bajo=" + bajo + " alto=" + alto +" centro=" + centro + " valorCentro=" + valorCentro +"    --> ENCONTRADO");
                return centro;
            } else if (valorCentro < edad) {
                System.out.println("bajo=" + bajo + " alto=" + alto +" centro=" + centro + " valorCentro=" + valorCentro +"    --> DERECHA");
                bajo = centro + 1;
            } else {
                System.out.println("bajo=" + bajo + " alto=" + alto +" centro=" + centro + " valorCentro=" + valorCentro +"    --> IZQUIERDA");
                alto = centro - 1;
            }

            System.out.println();
        }

        return -1;
}
}
