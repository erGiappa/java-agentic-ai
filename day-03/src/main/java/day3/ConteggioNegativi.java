package day3;

import java.util.Scanner;

public class ConteggioNegativi {
    public static void main(String[] args) {

        // Creo lo Scanner
        Scanner scanner = new Scanner(System.in);

        // Creo una matrice di 3 righe e 3 colonne
        int[][] matrice = new int[3][3];
        // Contatore dei numeri negativi
        int contatore = 0;

        // Ciclo per scorrere le righe
        for (int i = 0; i < 3; i++) {
            // Ciclo per scorrere le colonne
            for (int j = 0; j < 3; j++) {
                System.out.print("Inserisci un numero: ");
                // Inserisco il valore nella posizione corrente
                matrice[i][j] = scanner.nextInt();

                // Controllo se il valore è negativo
                if (matrice[i][j] < 0) {
                    // Incremento il contatore
                    contatore++;
                }
            }
        }

        // Stampo il numero totale di valori negativi
        System.out.println("I valori negativi sono: " + contatore);

        scanner.close();
    }
}
