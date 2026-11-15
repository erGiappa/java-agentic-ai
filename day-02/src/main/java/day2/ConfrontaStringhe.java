package day2;

import java.util.Scanner;

public class ConfrontaStringhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci prima parola: ");
        String parola1 = scanner.nextLine();

        System.out.print("Inserisci seconda parola: ");
        String parola2 = scanner.nextLine();

        // L'operatore == confronta i riferimenti degli oggetti.
        //
        // Verifica quindi se le due variabili fanno riferimento
        // allo stesso oggetto in memoria.
        //
        // Non verifica direttamente se il testo è uguale.
        System.out.println("Confronto con == " + (parola1==parola2));

        // equals() confronta il contenuto delle String.
        //
        // Restituisce true se le due stringhe contengono
        // la stessa sequenza di caratteri.
        System.out.println("Confronto con .equals " + parola1.equals(parola2));


        scanner.close();


    }
}
