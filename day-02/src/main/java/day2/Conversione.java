package day2;
import java.util.Scanner;

public class Conversione {
    public static void main(String[] args) {

        // Inizializza Scanner per acquisire il numero decimale.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero decimale: ");
        // nextDouble() legge un valore numerico di tipo double.
        double decimale = scanner.nextDouble();

        // La conversione elimina la parte decimale
        int intero = (int) decimale;

        // Visualizza il valore originale e quello convertito.
        System.out.println("Numero decimale: " + decimale);
        System.out.println("Numero intero: " + intero);


        scanner.close();


    }
}
