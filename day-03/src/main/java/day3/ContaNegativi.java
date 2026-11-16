package day3;

import java.util.Scanner;

public class ContaNegativi {

    public static void main(String[] args) {

        // Creo lo Scanner per leggere i numeri
        Scanner scanner = new Scanner(System.in);

        int numero;
        // Contatore per tenere traccia dei numeri inseriti
        int contatore = 0;
        // Contatore per contare solamente i numeri negativi
        int negativi = 0;

        // Il ciclo continua finché non vengono inseriti 10 numeri
        while(contatore < 10){
            System.out.println("Digita un numero: ");
            // Leggo il numero inserito
            numero = scanner.nextInt();

            // Controllo se il numero è negativo
            if (numero < 0){
                negativi++;
            }
            // Incremento il contatore dei numeri inseriti
            contatore ++;
        }

        // Stampo quanti numeri negativi sono stati inseriti
        System.out.println("I numeri negativi digitati sono: " + negativi);


        scanner.close();
    }
}
