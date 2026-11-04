package Blocco6;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Divisione per zero
        try {
            System.out.println("Primo numero:");
            int a = scanner.nextInt();

            System.out.println("Secondo numero:");
            int b = scanner.nextInt();

            int risultato = a / b;

            System.out.println("Risultato: " + risultato);

        } catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero!");
        }


        // 2. Conversione input errato
        try {
            System.out.println("Inserisci un numero intero:");

            int numero = scanner.nextInt();

            System.out.println("Numero: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Errore: input non valido!");

            scanner.nextLine();
        }


        // 3. Accesso a indice non valido
        int[] numeri = {10, 20, 30, 40, 50};

        try {
            System.out.println("Inserisci un indice da 0 a 4:");

            int indice = scanner.nextInt();

            System.out.println("Valore: " + numeri[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: indice non valido!");
        }


        // 4. Apertura file inesistente
        try {
            File file = new File("documento.txt");

            Scanner lettore = new Scanner(file);

            System.out.println("File aperto!");

            lettore.close();

        } catch (FileNotFoundException e) {
            System.out.println("Errore: file non trovato!");
        }


        // 5. Lettura file con più catch
        try {
            File file = new File("numeri.txt");

            Scanner lettore = new Scanner(file);

            int valore = lettore.nextInt();

            System.out.println("Numero letto: " + valore);

            lettore.close();

        } catch (FileNotFoundException e) {
            System.out.println("Errore: file non trovato!");

        } catch (InputMismatchException e) {
            System.out.println("Errore: contenuto non numerico!");
        }

        scanner.close();
    }
}

