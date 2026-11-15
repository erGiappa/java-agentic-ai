package day2;

import java.util.Scanner;

public class MaiuscoloMinuscolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita una frase: ");
        String frase = scanner.nextLine();

        // toUpperCase() restituisce una nuova String
        // contenente i caratteri convertiti in maiuscolo.
        System.out.println("Frase in MAIUSCOLO: " + frase.toUpperCase());

        // toLowerCase() restituisce una nuova String
        // contenente i caratteri convertiti in minuscolo.
        System.out.println("Frase in minuscolo: " + frase.toLowerCase());

        scanner.close();

    }
}
