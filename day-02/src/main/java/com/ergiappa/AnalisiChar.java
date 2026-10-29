package com.ergiappa;

import java.util.Scanner;

public class AnalisiChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un carattere:");
        char carattere = scanner.next().charAt(0);

        int valoreUnicode = (int) carattere;

        System.out.println("Carattere inserito: " + carattere);
        System.out.println("Valore unicode: " + valoreUnicode);

        scanner.close();

    }
}
