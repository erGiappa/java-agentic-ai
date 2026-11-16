package day3;

import java.util.Scanner;

public class MassimoMatrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creo una matrice con 3 righe e 4 colonne
        int[][] matrice = new int[3][4];
        // Inizializzo il massimo al valore intero più piccolo possibile
        int massimo = Integer.MIN_VALUE;

        // Scorro tutte le righe della matrice
        for (int i = 0; i < 3; i++) {
            // Scorro tutte le colonne della matrice
            for (int j = 0; j < 4; j++) {
                System.out.print("Inserisci il valore [" + i + "][" + j + "]: ");
                // Leggo e salvo il numero
                matrice[i][j] = scanner.nextInt();

                // Controllo se il numero inserito è maggiore del massimo
                if (matrice[i][j] > massimo) {
                    // Se è maggiore, aggiorno il massimo
                    massimo = matrice[i][j];
                }
            }
        }

        // Stampo il valore massimo trovato
        System.out.println("Il valore massimo è: " + massimo);

        scanner.close();
    }
}
