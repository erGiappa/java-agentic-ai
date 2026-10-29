package com.ergiappa;

import java.util.Scanner;

public class MaiuscoloMinuscolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Frase in MAIUSCOLO: " + frase.toUpperCase());
        System.out.println("Frase in minuscolo: " + frase.toLowerCase());

        scanner.close();

    }
}
