package day3;

import java.util.Scanner;

public class RicercaValore {
    public static void main(String[] args) {

        // Inizializza lo Scanner per leggere il valore da cercare.
        Scanner scanner = new Scanner(System.in);

        // Matrice 3x3 contenente i valori predefiniti.
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Inserisci un numero da cercare: ");
        int numero = scanner.nextInt();

        // Il flag indica se la matrice contiene almeno una volta il valore.
        boolean trovato = false;

        // Le coordinate i e j identificano riga e colonna dell'elemento.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrice[i][j] == numero) {
                    System.out.println("Numero trovato!");
                    System.out.println("Riga: " + (i + 1));
                    System.out.println("Colonna: " + (j + 1));

                    trovato = true;
                }
            }
        }

        if (!trovato) {
            System.out.println("Numero non presente nella matrice.");
        }

        scanner.close();
    }
}
