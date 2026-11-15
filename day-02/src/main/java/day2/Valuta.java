package day2;

import java.util.Scanner;

public class Valuta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci importo in euro: ");
        // nextDouble() permette di acquisire un numero decimale.
        double importo = scanner.nextDouble();

        // Conversione utilizzando un tasso di cambio fisso.
        // Il risultato viene memorizzato in una variabile double.
        double dollaro = importo * 1.10;

        System.out.println("Importo in dollaro: " + dollaro + " $");
        scanner.close();
    }
}
