package day2;

import java.util.Scanner;

public class Lingua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il codice lingua (it, en, fr, es): ");
        String lingua = scanner.nextLine();

        // toLowerCase() converte la stringa in minuscolo.
        // In questo modo possiamo confrontare i codici
        // senza distinguere tra lettere maiuscole e minuscole.
        switch (lingua.toLowerCase()) {
            case "it":
                System.out.println("Ciao");
                break;
            case "en":
                System.out.println("Hello");
                break;
            case "fr":
                System.out.println("Bonjour");
                break;
            case "es":
                System.out.println("Hola");
                break;
            default:
                System.out.println("Lingua non riconosciuta");
        }

        scanner.close();
    }
}
