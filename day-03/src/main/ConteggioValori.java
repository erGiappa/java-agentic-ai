import java.util.Scanner;

public class ConteggioValori {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeri = new int[5];
        int contatore = 0;

        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci un numero: ");
            numeri[i] = scanner.nextInt();

            if (numeri[i] > 10 ) {

                    contatore++;
                }
            }
            System.out.println("I numeri maggiori di 10 sono:" + contatore);


        scanner.close();
    }
}
