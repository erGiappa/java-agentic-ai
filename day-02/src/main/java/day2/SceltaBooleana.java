package day2;

import java.util.Scanner;

public class SceltaBooleana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Java è bello?");
        // nextBoolean() legge un valore booleano.
        // Sono accettati true e false.
        boolean bello = input.nextBoolean();

        // Confronta il valore booleano con true.
        if (bello == true) {
            System.out.println("Hai ragione!");
        }
        else {
            // Se bello non è true, il valore è false.
            System.out.println("Ti sbagli!");
        }
        input.close();

    }
}
