package com.ergiappa;
import java.util.Scanner;

public class Operazioni {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        int somma = num1 + num2;
        int differenza = num1 - num2;
        int moltiplicazione = num1 * num2;
        int divisione = num1 / num2;
        int divisioneResto = num1 % num2;

        System.out.println("La somma dei due numeri è: " + somma);
        System.out.println("La differenza dei due numeri è: " + differenza);
        System.out.println("La moltiplicazione dei due numeri è: " + moltiplicazione);
        System.out.println("La divisione dei due numeri è: " + divisione);
        System.out.println("La divisione con resto dei due numeri è: " + divisioneResto);



        scanner.close();

    }
}
