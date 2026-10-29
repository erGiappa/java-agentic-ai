package com.ergiappa;

import java.util.Scanner;

public class Concatena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la prima parola: ");
        String parola1 = scanner.nextLine();

        System.out.print("Inserisci la seconda parola: ");
        String parola2 = scanner.nextLine();

        String concatena = parola1 + parola2;

        System.out.println("Risultato: " + concatena);


        scanner.close();
    }
}
