package day3;

import java.util.Scanner;

public class ConteggioValori {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creo un array che può contenere 5 numeri interi
        int[] numeri = new int[5];
        // Contatore dei numeri maggiori di 10
        int contatore = 0;

        // Ciclo per inserire i 5 numeri
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci un numero: ");
            // Salvo il numero nella posizione i dell'array
            numeri[i] = scanner.nextInt();

            // Controllo se il numero è maggiore di 10
            if (numeri[i] > 10 ) {

                // Incremento il contatore
                    contatore++;
                }
            }

        // Stampo quanti numeri sono maggiori di 10
            System.out.println("I numeri maggiori di 10 sono:" + contatore);

        scanner.close();
    }
}
