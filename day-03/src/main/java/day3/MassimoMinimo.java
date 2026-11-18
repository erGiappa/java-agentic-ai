package day3;

import java.util.Scanner;

public class MassimoMinimo{
    public static void main(String[] args) {

        // Inizializza lo Scanner per acquisire i valori dell'array.
        Scanner input = new Scanner(System.in);

        // Crea un array in cui memorizzare cinque numeri.
        int[] numeri = new int[5];

        // Acquisisce i numeri e li salva nelle posizioni dell'array.
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il numero " + (i + 1) + ":");
            numeri[i] = input.nextInt();
        }
        // Usa il primo elemento come valore iniziale per massimo e minimo.
        int massimo = numeri[0];
        int minimo = numeri[0];

        // Confronta gli elementi successivi con i valori correnti.
        for (int i = 1; i < 5; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }

            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
        }

        System.out.println("Massimo: " + massimo);
        System.out.println("Minimo: " + minimo);
        input.close();
    }
}






