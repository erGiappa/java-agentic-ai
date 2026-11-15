package day2;

import java.util.Scanner;

public class Ripetizione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Quante volte vuoi ripetere il messaggio? ");
        int numero = scanner.nextInt();

        // Il primo if verifica che il numero richiesto sia almeno 1.
        if (numero >= 1) {
            System.out.println("Ciao, " + nome + "!");
        }
        // Il secondo if permette una seconda stampa
        // quando il numero richiesto è almeno 2.
        if (numero >= 2) {
            System.out.println("Ciao, " + nome + "!");
        }
        // Il terzo if permette una terza stampa
        // quando il numero richiesto è almeno 3.
        if (numero >= 3) {
            System.out.println("Ciao, " + nome + "!");
        }

        scanner.close();
    }
}
