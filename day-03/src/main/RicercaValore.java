
import java.util.Scanner;

public class RicercaValore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Inserisci un numero da cercare: ");
        int numero = scanner.nextInt();

        boolean trovato = false;

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
