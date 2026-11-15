package day2;

import java.util.Scanner;

public class VotoIntervallo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Inserisci un voto da 0 a 18100): ");
        int voto = scanner.nextInt();

        // Prima verifichiamo che il voto appartenga
        // all'intervallo consentito.
        if (voto < 0 || voto > 100) {
            System.out.println("Voto non valido!");
        } else {

            // La divisione tra interi elimina la parte decimale.
            // Esempi:
            // 95 / 10 = 9
            // 73 / 10 = 7
            // 60 / 10 = 6
            // In questo modo possiamo utilizzare lo switch
            // per classificare gli intervalli di voto.
            switch (voto / 10) {
                case 10:
                case 9:
                    System.out.println("Voto: A");
                    break;
                case 8:
                    System.out.println("Voto: B");
                    break;
                case 7:
                    System.out.println("Voto: C");
                    break;
                case 6:
                    System.out.println("Voto: D");
                    break;
                default:
                    System.out.println("Voto: F");
            }
        }

        scanner.close();
    }
}
