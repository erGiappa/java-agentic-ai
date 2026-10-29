package com.ergiappa;

import java.util.Scanner;

public class CreaFrase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci soggetto: ");
        String soggetto  = scanner.nextLine();

        System.out.print("Inserisci verbo: ");
        String verbo  = scanner.nextLine();

        System.out.print("Inserisci complemento: ");
        String complemento  = scanner.nextLine();

        String frase = soggetto + " " + verbo + " " + complemento;

        System.out.println(frase);

        scanner.close();

    }
}
