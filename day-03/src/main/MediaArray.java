import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeri = new int[5];
        int somma = 0;
        double media = 0;

        for(int i = 0; i < numeri.length; i++){
            System.out.println("Inserisci il numero " + (i+1) + ":");

            numeri[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++){
            somma = somma + numeri[i];
        }

        media = (double) somma/5;

        System.out.println("La somma è: " + somma);
        System.out.println("La media è: " + media);

        scanner.close();
    }
}
