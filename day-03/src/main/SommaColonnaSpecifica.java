
import java.util.Scanner;

public class SommaColonnaSpecifica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }


        System.out.print("Quale colonna vuoi sommare (1-3)? ");
        int colonna = scanner.nextInt();

        if (colonna >= 1 && colonna <= 3) {

            int somma = 0;

            for (int i = 0; i < 3; i++) {
                somma += matrice[i][colonna - 1];
            }

            System.out.println("La somma della colonna "
                    + colonna + " è: " + somma);

        } else {
            System.out.println("Colonna non valida!");
        }

        scanner.close();
    }
}
