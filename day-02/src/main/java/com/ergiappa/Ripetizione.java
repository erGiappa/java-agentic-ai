
import java.util.Scanner;

public class Ripetizione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Quante volte vuoi ripetere il messaggio? ");
        int numero = scanner.nextInt();


        if (numero >= 1) {
            System.out.println("Ciao, " + nome + "!");
        }

        if (numero >= 2) {
            System.out.println("Ciao, " + nome + "!");
        }

        if (numero >= 3) {
            System.out.println("Ciao, " + nome + "!");
        }

        scanner.close();
    }
}
