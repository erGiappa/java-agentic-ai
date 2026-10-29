package com.ergiappa;

import java.util.Scanner;

public class SegnoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int num = scanner.nextInt();

        if (num >0) {
            System.out.println("Il numero è positivo!");
        }
        else if (num < 0) {
            System.out.println("Il numero è negativo!");
        }
        else if (num == 0) {
            System.out.println("Il numero è 0!");
        }
        scanner.close();

    }
}
