package day2;

import java.util.Scanner;

public class Stagione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero del mese (1-12): ");
        int mese = scanner.nextInt();

        // Più case possono essere associati
        // allo stesso blocco di istruzioni.
        switch (mese) {

            // Dicembre, gennaio e febbraio.
            case 12:
            case 1:
            case 2:
                System.out.println("Inverno");
                break;

            // Marzo, aprile e maggio.
            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
                break;

            // Giugno, luglio e agosto.
            case 6:
            case 7:
            case 8:
                System.out.println("Estate");
                break;
            // Settembre, ottobre e novembre.
            case 9:
            case 10:
            case 11:
                System.out.println("Autunno");
                break;
            default:
                System.out.println("Mese non valido!");
        }

        scanner.close();
    }
}
