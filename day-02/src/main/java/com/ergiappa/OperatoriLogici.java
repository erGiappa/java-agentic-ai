package com.ergiappa;


import java.util.Scanner;

public class OperatoriLogici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo valore (true/false):");
        boolean a = scanner.nextBoolean();

        System.out.print("Inserisci il secondo valore (true/false):");
        boolean b = scanner.nextBoolean();

        System.out.println("AND (&&): " + (a && b));
        System.out.println("OR (||): " + (a || b));
        System.out.println("NOT primo (!a): " + (!a));
        System.out.println("NOT secondo (!b): " + (!b));


        scanner.close();

    }
}
