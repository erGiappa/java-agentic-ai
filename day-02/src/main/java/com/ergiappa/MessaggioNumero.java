package com.ergiappa;

import java.util.Scanner;

public class MessaggioNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci un numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci un numero: ");
        int num2 = scanner.nextInt();

        int somma = num1 + num2;

        System.out.println("Ciao: " + nome + ". La somma dei numeri è " + somma + ".");


        scanner.close();
    }
}
