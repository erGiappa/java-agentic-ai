package day2;
import java.util.Scanner;

public class DivisioneDecimale {
    public static void main(String[] args) {

        // Scanner permette di acquisire dati dalla tastiera.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        // Prima di effettuare la divisione, verifichiamo
        // che il divisore sia diverso da zero.
        if(num2 != 0) {
            // converte num1 da int a double.
            double divisione = (double) num1 / num2;
            System.out.println("Il risultato della divisione è: " + divisione);
        }
        else {
            // Gestione del caso in cui il divisore sia zero.
            System.out.println("Errore: non è possibile dividere per zero.");
        }
        scanner.close();

    }
}
