package com.ergiappa;

import java.util.Scanner;

public class GiornoSwitchModerno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = input.nextInt();

        switch (numero){
            case 1 -> System.out.println("Lunedì!");
            case 2 -> System.out.println("Martedì!");
            case 3 -> System.out.println("Mercoledì!");
            case 4 -> System.out.println("Giovedì!");
            case 5 -> System.out.println("Venerdì!");
            case 6 -> System.out.println("Sabato!");
            case 7 -> System.out.println("Domenica!");
            default -> System.out.println("Errore! Inserisci un numero da 1 a 7");

        }
        input.close();
    }
}
