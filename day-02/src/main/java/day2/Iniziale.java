package day2;

import java.util.Scanner;

public class Iniziale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci nome: ");
        String nome = scanner.nextLine();

        System.out.print("inserisci cognome: ");
        String cognome = scanner.nextLine();

        // charAt(0) restituisce il primo carattere del cognome.
        // L'operatore + concatena le stringhe e il carattere.
        System.out.println(nome + " " + cognome.charAt(0) + ".");
        scanner.close();
    }
}
