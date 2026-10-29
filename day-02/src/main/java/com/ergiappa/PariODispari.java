package com.ergiappa;

import java.util.Scanner;

public class PariODispari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("è un numero pari!");
        } else {
            System.out.println("è dispari!");

            scanner.close();

        }
    }
}
