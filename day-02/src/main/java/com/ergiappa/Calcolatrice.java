
import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n****MENU****");
        System.out.println("1. Somma");
        System.out.println("2. Differenza");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");

        System.out.print("Scegli un'operazione: ");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                System.out.println("Risultato: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Risultato: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Risultato: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Risultato: " + (num1 / num2));
                } else {
                    System.out.println("Errore: impossibile dividere per zero!");
                }
                break;

            default:
                System.out.println("Scelta non valida!");
                break;
        }

        scanner.close();
    }
}
