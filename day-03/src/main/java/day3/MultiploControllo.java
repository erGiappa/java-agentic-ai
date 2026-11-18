package day3;

import java.util.Scanner;

public class MultiploControllo {
    public static void main(String[] args) {

        // Inizializza lo Scanner per leggere i numeri.
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Continua a richiedere numeri finché il valore è positivo o zero.
        do {
            System.out.println("Digita un numero positivo: ");
            numero = scanner.nextInt();
        }
        while (numero >= 0);

        System.out.println("Hai inserito un numero negativo!");

        scanner.close();
    }

}
