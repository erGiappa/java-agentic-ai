package day3;

import java.util.Scanner;

public class SommaMatrice {
    public static void main(String[] args) {

        // Inizializza lo Scanner per acquisire gli elementi della matrice.
        Scanner input = new Scanner(System.in);

        // Crea una matrice 3x3 e l'accumulatore della somma.
        int [][] matrice = new int[3][3];
        int somma = 0;

        // I due cicli annidati visitano tutte le righe e tutte le colonne.
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Inserisci il valore ["+i+","+j+"]:");
                matrice[i][j] = input.nextInt();
                somma += matrice[i][j];

            }
        }
        System.out.println("La somma totale è: " + somma);
        input.close();
    }
}
