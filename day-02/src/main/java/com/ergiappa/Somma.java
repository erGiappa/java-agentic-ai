package com.ergiappa;
import java.util.Scanner;


public class Somma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita un numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digita un numero: ");
        int num2 = scanner.nextInt();

        int somma = num1 + num2;

        System.out.println("La somma di " + num1 + " e " + num2 + " è " + somma);

        scanner.close();


    }
}
