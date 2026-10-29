package com.ergiappa;

import java.util.Scanner;

public class ConfrontaStringhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci prima parola: ");
        String parola1 = scanner.nextLine();

        System.out.print("Inserisci seconda parola: ");
        String parola2 = scanner.nextLine();

        System.out.println("Confronto con == " + (parola1==parola2));
        System.out.println("Confronto con .equals " + parola1.equals(parola2));



        scanner.close();


    }
}
