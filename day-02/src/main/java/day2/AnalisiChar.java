package day2;

import java.util.Scanner;

public class AnalisiChar {
    public static void main(String[] args) {

        // Crea lo Scanner per leggere l'input dell'utente.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un carattere:");
        // charAt(0) restituisce il carattere presente nella posizione zero della String.
        char carattere = scanner.next().charAt(0);

        // Conversione esplicita da char a int.
        int valoreUnicode = (int) carattere;

        // Visualizza il carattere inserito e il relativo valore.
        System.out.println("Carattere inserito: " + carattere);
        System.out.println("Valore unicode: " + valoreUnicode);

        scanner.close();

    }
}
