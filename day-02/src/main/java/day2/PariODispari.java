package day2;

import java.util.Scanner;

public class PariODispari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        // L'operatore % restituisce il resto della divisione.
        // Un numero è pari quando il resto della divisione
        // per 2 è uguale a zero.
        if (numero % 2 == 0) {
            System.out.println("è un numero pari!");
        } else {

            // Se il resto non è zero, il numero è dispari.
            System.out.println("è dispari!");

            scanner.close();

        }
    }
}
