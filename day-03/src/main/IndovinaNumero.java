import java.util.Random;
import java.util.Scanner;

public class IndovinaNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSegreto = random.nextInt(10) + 1;
        int tentativo;

        System.out.println("Indovina il numero da 1 a 50: ");

        tentativo = scanner.nextInt();

        while (tentativo <= numeroSegreto) {
            System.out.println("Numero sbagliato! Riprova: ");
            tentativo = scanner.nextInt();

        }

        System.out.println("Complimenti! Hai indovinato il numero!");


        scanner.close();

    }
}

