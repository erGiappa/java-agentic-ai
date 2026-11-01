
import java.util.Scanner;

public class SommaMatrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [][] matrice = new int[3][3];
        int somma = 0;

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
