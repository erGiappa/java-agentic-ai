package day3;

import java.util.Scanner;

public class Tabellina {
    public static void main(String[] args) {

        // Inizializza lo Scanner per leggere il numero della tabellina.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero:");
        int n = scanner.nextInt();

        // Moltiplica il numero inserito per i valori da 1 a 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }
}