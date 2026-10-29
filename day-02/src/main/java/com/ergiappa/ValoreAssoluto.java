package com.ergiappa;

import java.util.Scanner;

public class ValoreAssoluto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num = input.nextInt();

        if (num < 0){
            num =- num;
        }
        System.out.println("Valore assoluto: " + num);

        input.close();
    }
}
