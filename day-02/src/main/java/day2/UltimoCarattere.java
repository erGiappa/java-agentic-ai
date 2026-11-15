package day2;

import java.util.Scanner;

public class UltimoCarattere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();

        // length() restituisce il numero di caratteri della stringa.
        int lunghezza = parola.length();
        // L'ultimo carattere si trova nella posizione lunghezza - 1.
        char ultimo = parola.charAt(lunghezza - 1);

        System.out.println("Ultimo carattere: " + ultimo);
        scanner.close();
    }
}
