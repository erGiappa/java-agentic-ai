package com.ergiappa;
import java.util.Scanner;

public class DivisioneDecimale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        if(num2 != 0) {
            double divisione = (double) num1 / num2;
            System.out.println("Il risultato della divisione è: " + divisione);
        }
        else {
            System.out.println("Errore: non è possibile dividere per zero.");
        }
        scanner.close();

    }
}
