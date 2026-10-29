package com.ergiappa;

import java.util.Scanner;

public class CarattereIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita una parola: ");
        String parola = scanner.next();

        System.out.print("Digita un numero: ");
        int posizione = scanner.nextInt();

        System.out.println("La parola è: " + parola.charAt(posizione));


    }
}
