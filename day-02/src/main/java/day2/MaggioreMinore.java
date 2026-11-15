package day2;

import java.util.Scanner;

public class MaggioreMinore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        // Verifica se il primo numero è minore del secondo.
        if (num1 < num2) {
            System.out.println("Il secondo numero è maggiore del primo");
        }
        // Verifica alternativa: il primo numero è maggiore?
        else if (num1 > num2) {
            System.out.println("Il primo numero è maggiore del secondo");
        }
        // Se nessuna delle due condizioni è vera, i due numeri sono uguali.
        else{
            System.out.println("Sono uguali!");
        }
        scanner.close();

    }
}
