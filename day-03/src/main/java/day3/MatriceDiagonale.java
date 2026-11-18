package day3;

import java.util.Scanner;

public class MatriceDiagonale {

        public static void main(String[] args) {

            // Inizializza lo Scanner per acquisire gli elementi della matrice.
            Scanner scanner = new Scanner(System.in);

            // Crea una matrice quadrata composta da quattro righe e quattro colonne.
            int[][] matrice = new int[4][4];

            // Scorre righe e colonne per inserire tutti i valori.
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Inserisci il valore [" + i + "][" + j + "]: ");
                    matrice[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Diagonale:");

            // Gli elementi della diagonale principale hanno indice di riga e colonna uguale.
            for (int i = 0; i < 4; i++) {
                System.out.println(matrice[i][i]);
            }

            scanner.close();
        }
    }


