
import java.util.Scanner;

public class Trasposta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrice = new int[2][3];
        int[][] trasposta = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Inserisci il valore [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                trasposta[j][i] = matrice[i][j];
            }
        }

        System.out.println("Matrice trasposta:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(trasposta[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
