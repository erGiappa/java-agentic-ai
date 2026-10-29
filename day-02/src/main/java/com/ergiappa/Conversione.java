package com.ergiappa;
import java.util.Scanner;

public class Conversione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero decimale: ");
        double decimale = scanner.nextDouble();

        int intero = (int) decimale;

        System.out.println("Numero decimale: " + decimale);
        System.out.println("Numero intero: " + intero);


        scanner.close();


    }
}
