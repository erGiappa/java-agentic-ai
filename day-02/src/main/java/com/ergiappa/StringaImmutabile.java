package com.ergiappa;

import java.util.Scanner;

public class StringaImmutabile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = input.nextLine();

        String nuovaParola = parola + " mondo";

        System.out.println(parola);
        System.out.println(nuovaParola);

        // Le stringhe in Java sono immutabili.
        // La prima stringa non viene modificata.
        // La concatenazione crea una nuova stringa.

        input.close();
    }
}
