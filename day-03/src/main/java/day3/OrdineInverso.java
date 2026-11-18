package day3;

import java.util.Scanner;

public class OrdineInverso {
    public static void main(String[] args) {

        // Inizializza lo Scanner e crea un array di cinque elementi.
        Scanner scanner = new Scanner(System.in);
        int[] numeri = new int[5];

        // Acquisisce i numeri nelle posizioni da 0 a 4.
        for (int i = 0; i < 5; i++){
            System.out.println("Inserisci il numero di "+(i+1)+":");
            numeri[i] = scanner.nextInt();
        }
        System.out.println("Numeri in ordine inverso:");

        // Scorre l'array dall'ultimo indice fino al primo.
        for(int i = 4; i >= 0; i--){
            System.out.println(numeri[i]);
        }

        scanner.close();
    }
}
