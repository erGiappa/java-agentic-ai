package day3;

import java.util.Scanner;

public class Trasposta {
    public static void main(String[] args) {

        // Inizializza lo Scanner per acquisire la matrice originale.
        Scanner scanner = new Scanner(System.in);

        // La matrice originale è 2x3 e la trasposta deve essere 3x2.
        int[][] matrice = new int[2][3];
        int[][] trasposta = new int[3][2];

        // Inserisce i valori nella matrice originale.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Inserisci il valore [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }


        // Scambia gli indici per calcolare la matrice trasposta.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                trasposta[j][i] = matrice[i][j];
            }
        }

        System.out.println("Matrice trasposta:");

        // Stampa la trasposta riga per riga.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(trasposta[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
