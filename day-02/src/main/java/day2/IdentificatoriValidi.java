package day2;

import java.util.Scanner;

public class IdentificatoriValidi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = input.nextLine();

        // Verifichiamo tre condizioni:
        //
        // 1. !parola.isEmpty()
        //    La stringa non deve essere vuota.
        //
        // 2. !Character.isDigit(parola.charAt(0))
        //    Il primo carattere non deve essere una cifra.
        //
        // 3. !parola.contains(" ")
        //    La stringa non deve contenere spazi.
        //
        // L'operatore && richiede che tutte le condizioni
        // siano vere affinché venga eseguito il blocco if.
        //
        // Grazie allo short-circuit di &&, charAt(0)
        // non viene eseguito se la stringa è vuota.

        if (!parola.isEmpty()
                && !Character.isDigit(parola.charAt(0))
                && !parola.contains(" ")) {
            System.out.println("L'identificatore rispetta le condizioni richieste.");
        } else {
            System.out.println("L'identificatore non è valido.");
        }


        input.close();


    }
}
