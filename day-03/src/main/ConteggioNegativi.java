
import java.util.Scanner;

public class ConteggioNegativi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrice = new int[3][3];
        int contatore = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Inserisci un numero: ");
                matrice[i][j] = scanner.nextInt();

                if (matrice[i][j] < 0) {
                    contatore++;
                }
            }
        }

        System.out.println("I valori negativi sono: " + contatore);

        scanner.close();
    }
}
