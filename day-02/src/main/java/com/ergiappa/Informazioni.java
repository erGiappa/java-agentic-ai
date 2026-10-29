package com.ergiappa;
import java.util.Scanner;

public class Informazioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci l'età: ");
        String eta = scanner.nextLine();

        System.out.print("Inserisci città di residenza: ");
        String citta = scanner.nextLine();

        System.out.println("Mi chiamo " + nome + ", ho " + eta + " anni e vivo a " + citta);
        scanner.close();
    }
}
