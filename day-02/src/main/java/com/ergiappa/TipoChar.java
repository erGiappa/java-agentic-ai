package com.ergiappa;

import java.util.Scanner;

public class TipoChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci carattere: ");
        char carattere = scanner.next().charAt(0);

        if (Character.isDigit(carattere)) {
            System.out.println("è un numero!");
        }
        else if (Character.isLetter(carattere)) {
            System.out.println("è un lettera!");
        }
        else {
            System.out.println("è un altro simbolo!");
        }
        scanner.close();
    }
}
