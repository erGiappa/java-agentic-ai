import java.util.Scanner;

public class SommaTotale {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int somma = 0;

        do{
            System.out.println("Digita un numero: ");
            numero = scanner.nextInt();

            somma += numero;
            System.out.println("Somma è: " + somma);
        } while (somma <= 100);

        System.out.println("Hai superato 100!");

        scanner.close();
    }

}
