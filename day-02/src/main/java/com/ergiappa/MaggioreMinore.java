package com.ergiappa;

import java.util.Scanner;

public class MaggioreMinore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("Il secondo numero è maggiore del primo");
        }
        else if (num1 > num2) {
            System.out.println("Il primo numero è maggiore del secondo");
        }
        else{
            System.out.println("Sono uguali!");
        }
        scanner.close();

    }
}
