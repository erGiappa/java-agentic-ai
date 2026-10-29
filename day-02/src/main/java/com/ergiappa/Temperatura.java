package com.ergiappa;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci temperatura in gradi Celsius: ");
        int temperatura = scanner.nextInt();

        int C = temperatura;
        int Fahrenheit = (C * 9/5) + 32;

        System.out.println("Temperatura in Fahrenheit: " + Fahrenheit);


        scanner.close();

    }
}
