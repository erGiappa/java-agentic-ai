import java.util.Scanner;

public class MatriceDiagonale {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int[][] matrice = new int[4][4];


            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Inserisci il valore [" + i + "][" + j + "]: ");
                    matrice[i][j] = scanner.nextInt();
                }
            }


            System.out.println("Diagonale:");

            for (int i = 0; i < 4; i++) {
                System.out.println(matrice[i][i]);
            }

            scanner.close();
        }
    }


