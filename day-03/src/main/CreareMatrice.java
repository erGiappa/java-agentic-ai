import java.util.Scanner;

public class CreareMatrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrice = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Inserisci il valore [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }
        System.out.println("La matrice inserita è:");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();

    }
}
