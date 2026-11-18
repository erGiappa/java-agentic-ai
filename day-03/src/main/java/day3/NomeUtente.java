package day3;

import java.util.Scanner;

public class NomeUtente {

    public static void main(String[] args) {

        // Inizializza lo Scanner per leggere il nome da tastiera.
        Scanner input = new Scanner(System.in);

        String nome;

        // Richiede il nome almeno una volta e lo ripete finché è troppo breve.
        do{
            System.out.println("Inserisci nome utente: ");
            nome = input.nextLine();
        } while (nome.length() <= 3);

        System.out.println("Ciao " + nome);
        input.close();
    }
}
