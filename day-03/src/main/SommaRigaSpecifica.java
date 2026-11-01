import java.util.Scanner;

public class SommaRigaSpecifica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matrice 3x3:");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Quale riga sommare?");
        int riga = scanner.nextInt();

        if (riga >= 1 && riga <= 3){

            int somma = 0;

            for (int j = 0; j < 3; j++){
                somma = somma + matrice[riga - 1][j];
            }
            System.out.println("La somma della riga " + riga + " è: " + somma);
        } else {
            System.out.println("Riga non valida");
        }
        scanner.close();
    }
}
