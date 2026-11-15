package day2;

import java.util.Scanner;

public class StringaImmutabile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = input.nextLine();

        // La concatenazione produce una nuova stringa.
        // L'oggetto String originale non viene modificato.
        String nuovaParola = parola + " mondo";

        // Stampa la stringa originale.
        System.out.println(parola);
        // Stampa la nuova stringa ottenuta dalla concatenazione.
        System.out.println(nuovaParola);


        input.close();
    }
}
