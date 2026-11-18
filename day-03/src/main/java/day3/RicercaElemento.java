package day3;

import java.util.Scanner;

public class RicercaElemento {
    public static void main(String[] args) {

        // Inizializza lo Scanner per acquisire il valore da cercare.
        Scanner scanner=new Scanner(System.in);

        // Array in cui viene effettuata la ricerca.
        int [] numeri = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Inserisci un numero: ");
        int cerca = scanner.nextInt();

        // Il flag viene impostato a true solo quando viene trovato il valore.
        boolean trovato = false;

        // Il for-each scorre tutti gli elementi dell'array.
        for (int numero : numeri){
            if (numero == cerca){
                trovato = true;
                break;
            }
        }
        if (trovato){
            System.out.println("Numero presente nell'array");
        }
        else {
            System.out.println("Numero non presente nell'array");
        }

        scanner.close();
    }

}
