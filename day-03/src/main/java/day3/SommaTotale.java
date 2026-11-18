package day3;

import java.util.Scanner;

public class SommaTotale {
    public static void main(String[] args) {

        // Inizializza lo Scanner per leggere i numeri.
        Scanner scanner = new Scanner(System.in);

        int numero;
        // La somma accumulata determina quando terminare il ciclo.
        int somma = 0;

        // Il blocco viene eseguito almeno una volta.
        do{
            System.out.println("Digita un numero: ");
            numero = scanner.nextInt();

            somma += numero;
            System.out.println("Somma è: " + somma);
        } while (somma <= 100);

        System.out.println("Hai superato 100!");

        scanner.close();
    }

}
