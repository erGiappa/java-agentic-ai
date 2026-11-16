package day3;

import java.util.Scanner;

public class CreareMatrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creo una matrice composta da 3 righe e 3 colonne
        int[][] matrice = new int[3][3];

        // Ciclo per inserire i valori nelle righe
        for (int i = 0; i < 3; i++){
            // Ciclo per inserire i valori nelle colonne
            for (int j = 0; j < 3; j++){
                // Chiedo il valore da inserire nella posizione i,j
                System.out.print("Inserisci il valore [" + i + "][" + j + "]: ");
                // Salvo il numero nella matrice
                matrice[i][j] = scanner.nextInt();
            }
        }
        System.out.println("La matrice inserita è:");

        // Ciclo per stampare tutte le righe
        for (int i = 0; i < 3; i++){
            // Ciclo per stampare tutte le colonne
            for (int j = 0; j < 3; j++){
                // Stampo il valore senza andare a capo
                System.out.print(matrice[i][j] + " ");
            }
            // Vado a capo dopo aver stampato una riga
            System.out.println();
        }
        scanner.close();

    }
}
