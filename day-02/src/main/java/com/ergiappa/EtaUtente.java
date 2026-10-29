package com.ergiappa;

import java.util.Scanner;

public class EtaUtente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci età: ");
        int eta = scanner.nextInt();

        if (eta > 18){
            System.out.println("utente maggiorenne");
        }
        else if (eta < 0){
            System.out.println("Errore!");
        }
        else if (eta < 18){
            System.out.println("utente minorenne");
        }


        scanner.close();


    }
}
