package day3;

import java.util.Random;
import java.util.Scanner;

public class IndovinaNumero {

    public static void main(String[] args) {

        // Scanner legge il tentativo dell'utente, Random genera il numero segreto.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // nextInt(10) restituisce un valore da 0 a 9; + 1 lo porta nel range 1-10.
        int numeroSegreto = random.nextInt(10) + 1;
        int tentativo;

        System.out.println("Indovina il numero da 1 a 10: ");

        tentativo = scanner.nextInt();

        // Il ciclo continua finché il tentativo soddisfa questa condizione.
        while (tentativo <= numeroSegreto) {
            System.out.println("Numero sbagliato! Riprova: ");
            tentativo = scanner.nextInt();

        }

        System.out.println("Complimenti! Hai indovinato il numero!");


        scanner.close();

    }
}

