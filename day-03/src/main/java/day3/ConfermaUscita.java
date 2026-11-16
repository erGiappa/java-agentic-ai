package day3;

import java.util.Scanner;

public class ConfermaUscita {
    public static void main(String[] args) {

        // Creo uno Scanner per leggere quello che inserisce l'utente
        Scanner scanner = new Scanner(System.in);
        String risposta;

        //do-while esegue almeno una volta le istruzioni
        do {
            System.out.println("Vuoi uscire? (s/n)");
            // Leggo la risposta dell'utente
            risposta = scanner.next();
            // Continuo a chiedere finché la risposta non è "s"
        } while (!risposta.equals("s"));

        // Quando l'utente scrive s, il ciclo termina
        System.out.println("Sei uscito!");
        scanner.close();
    }
}
