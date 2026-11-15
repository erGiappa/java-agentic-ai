package day2;

import java.util.Scanner;

public class EtaUtente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci età: ");
        int eta = scanner.nextInt();

        // Verifica se l'età è superiore a 18.
        if (eta > 18){
            System.out.println("utente maggiorenne");
        }
        // Verifica se l'età è negativa.
        // Un'età negativa non rappresenta un valore valido.
        else if (eta < 0){
            System.out.println("Errore!");
        }
        // Verifica se l'età è inferiore a 18.
        else if (eta < 18){
            System.out.println("utente minorenne");
        }


        scanner.close();


    }
}
