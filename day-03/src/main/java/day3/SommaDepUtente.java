package day3;

import java.util.Scanner;

public class SommaDepUtente {

    public static void main(String[] args) {

        // Inizializza lo Scanner per leggere i numeri dell'utente.
        Scanner scanner = new Scanner(System.in);

        int numero;
        // Accumula la somma dei numeri inseriti.
        int somma = 0;

        System.out.println("Inserisci un numero (0 per terminare):");
        numero = scanner.nextInt();

        // Lo 0 interrompe il ciclo; gli altri valori vengono sommati.
        while (numero != 0){

            somma += + numero;

            System.out.println("Inserisci un numero (0 per terminare):");
            numero = scanner.nextInt();
        }
        System.out.println("La somma totale è: " + somma);
        scanner.close();

    }
}
