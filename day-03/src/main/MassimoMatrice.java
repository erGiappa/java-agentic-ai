
import java.util.Scanner;

public class MassimoMatrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrice = new int[3][4];
        int massimo = Integer.MIN_VALUE;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Inserisci il valore [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();

                if (matrice[i][j] > massimo) {
                    massimo = matrice[i][j];
                }
            }
        }


        System.out.println("Il valore massimo è: " + massimo);

        scanner.close();
    }
}
