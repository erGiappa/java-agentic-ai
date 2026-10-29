package com.ergiappa;
import java.util.Scanner;

public class Messaggio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di nome: ");
        String nome = scanner.nextLine();

        System.out.println("Ciao, " + nome + "! Benvenuto in Java!");

        scanner.close();


    }
}
