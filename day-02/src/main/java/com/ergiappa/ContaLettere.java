package com.ergiappa;

import java.util.Scanner;

public class ContaLettere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = scanner.next();

        System.out.println("La lunghezza della parola è: " + parola.length());
        scanner.close();
    }
}
