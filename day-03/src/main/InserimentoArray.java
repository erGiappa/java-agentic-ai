import java.util.Scanner;

public class InserimentoArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeri = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Inserisci il numero " + (i + 1)+ ": ");
            numeri[i] = scanner.nextInt();
        }
        System.out.println("\nNumeri inseriti:");

        for(int i = 0; i < 5; i++){
            System.out.println(numeri[i]);
        }
        scanner.close();
    }
}
