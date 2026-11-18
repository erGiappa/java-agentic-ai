package day3;

import java.util.Scanner;

public class InserimentoArray {

    public static void main(String[] args) {

        // Inizializza lo Scanner per acquisire cinque numeri.
        Scanner scanner = new Scanner(System.in);

        // Crea un array monodimensionale composto da cinque elementi.
        int[] numeri = new int[5];

        // Inserisce ogni numero nella posizione identificata dall'indice i.
        for (int i = 0; i < 5; i++){
            System.out.println("Inserisci il numero " + (i + 1)+ ": ");
            numeri[i] = scanner.nextInt();
        }
        System.out.println("\nNumeri inseriti:");

        // Scorre l'array e stampa tutti i valori nell'ordine inserito.
        for(int i = 0; i < 5; i++){
            System.out.println(numeri[i]);
        }
        scanner.close();
    }
}
