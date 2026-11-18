package day3;

import java.util.Scanner;

public class Divisibilità {
    public static void main(String[] args) {

        // Inizializza lo Scanner per leggere il divisore.
        Scanner scanner = new Scanner(System.in);

        // Acquisisce il numero da utilizzare nei controlli di divisibilità.
        System.out.print("Inserisci un numero:");
        int m = scanner.nextInt();

        // Scorre i numeri da 1 a 100.
        for (int i = 1; i <= 100; i++) {
            // Il resto della divisione è zero solo se i è multiplo di m.
            if (i % m == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
