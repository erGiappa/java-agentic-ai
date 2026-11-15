package day2;

import java.util.Scanner;

public class SegnoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int num = scanner.nextInt();

        // Verifica se il numero è maggiore di zero.
        if (num >0) {
            System.out.println("Il numero è positivo!");
        }
        // Se la prima condizione è falsa, verifica se il numero è minore di zero.
        else if (num < 0) {
            System.out.println("Il numero è negativo!");
        }
        // Se entrambe le condizioni precedenti sono false, il numero deve necessariamente essere zero.
        else if (num == 0) {
            System.out.println("Il numero è 0!");
        }
        scanner.close();

    }
}
