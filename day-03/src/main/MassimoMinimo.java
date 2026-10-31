import java.util.Scanner;

public class MassimoMinimo{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeri = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il numero " + (i + 1) + ":");
            numeri[i] = input.nextInt();
        }
        int massimo = numeri[0];
        int minimo = numeri[0];

        for (int i = 1; i < 5; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }

            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
        }

        System.out.println("Massimo: " + massimo);
        System.out.println("Minimo: " + minimo);
        input.close();
    }
}






