package day2;

import java.util.Scanner;

public class OperatoriConfronto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Risultati dei confronti: ");

        // Ogni operatore relazionale restituisce un valore boolean.
        System.out.println(num1 + " > " + num2 + " = " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " = " + (num1 < num2));
        System.out.println(num1 + " >= " + num2 + " = " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + " = " + (num1 <= num2));
        System.out.println(num1 + " == " + num2 + " = " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " = " + (num1 != num2));


        scanner.close();

    }
}
