package day3;

import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {

        // Inizializza lo Scanner per acquisire i numeri.
        Scanner scanner = new Scanner(System.in);

        // Crea l'array dei numeri e le variabili per somma e media.
        int[] numeri = new int[5];
        int somma = 0;
        double media = 0;

        // Legge cinque numeri e li memorizza nell'array.
        for(int i = 0; i < numeri.length; i++){
            System.out.println("Inserisci il numero " + (i+1) + ":");

            numeri[i] = scanner.nextInt();
        }

        // Somma tutti gli elementi dell'array.
        for (int i = 0; i < 5; i++){
            somma = somma + numeri[i];
        }

        // La conversione a double mantiene la parte decimale del risultato.
        media = (double) somma/5;

        System.out.println("La somma è: " + somma);
        System.out.println("La media è: " + media);

        scanner.close();
    }
}
