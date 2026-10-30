import java.util.Scanner;

public class SommaDepUtente {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int somma = 0;

        System.out.println("Inserisci un numero (0 per terminare):");
        numero = scanner.nextInt();

        while (numero != 0){

            somma += + numero;

            System.out.println("Inserisci un numero (0 per terminare):");
            numero = scanner.nextInt();
        }
        System.out.println("La somma totale è: " + somma);
        scanner.close();

    }
}
