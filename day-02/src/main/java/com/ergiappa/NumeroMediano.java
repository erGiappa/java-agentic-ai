package com.ergiappa;


import java.util.Scanner;

public class NumeroMediano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int a = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int b = scanner.nextInt();

        System.out.print("Inserisci il terzo numero: ");
        int c = scanner.nextInt();

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            System.out.println("Il numero intermedio è: " + a);
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println("Il numero intermedio è: " + b);
        } else {
            System.out.println("Il numero intermedio è: " + c);
        }

        scanner.close();
    }
}

