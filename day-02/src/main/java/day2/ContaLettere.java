package day2;

import java.util.Scanner;

public class ContaLettere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // next() legge un singolo token.
        // Se l'utente inserisce più parole separate da spazi,
        // viene acquisita soltanto la prima.
        System.out.print("Inserisci una parola: ");
        String parola = scanner.next();

        // length() restituisce il numero di unità presenti nella String.
        System.out.println("La lunghezza della parola è: " + parola.length());
        scanner.close();
    }
}
