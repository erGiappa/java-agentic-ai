package Blocco6;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        // Scanner legge i dati inseriti dall'utente dalla console.
        Scanner scanner = new Scanner(System.in);

        // 1. Divisione per zero: Java genera ArithmeticException quando si divide per 0.
        try {
            System.out.println("Primo numero:");
            int a = scanner.nextInt();

            System.out.println("Secondo numero:");
            int b = scanner.nextInt();

            int risultato = a / b;

            System.out.println("Risultato: " + risultato);

        // catch intercetta l'eccezione prevista e mostra un messaggio controllato.
        } catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero!");
        }


        // 2. nextInt può generare InputMismatchException se il testo inserito non è un intero.
        try {
            System.out.println("Inserisci un numero intero:");

            int numero = scanner.nextInt();

            System.out.println("Numero: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Errore: input non valido!");

            // Pulisce la riga errata dalla console per evitare che resti disponibile
            // alla successiva lettura dello Scanner.
            scanner.nextLine();
        }


        // 3. Gli indici validi di questo array vanno da 0 a 4.
        int[] numeri = {10, 20, 30, 40, 50};

        try {
            System.out.println("Inserisci un indice da 0 a 4:");

            int indice = scanner.nextInt();

            System.out.println("Valore: " + numeri[indice]);

        // L'indice negativo o maggiore di 4 causa ArrayIndexOutOfBoundsException.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: indice non valido!");
        }


        // 4. File rappresenta il percorso documento.txt.
        // new Scanner(file) tenta di aprire il file dalla directory di esecuzione.
        try {
            File file = new File("documento.txt");

            Scanner lettore = new Scanner(file);

            System.out.println("File aperto!");

            lettore.close();

        // L'eccezione viene generata quando il file specificato non esiste.
        } catch (FileNotFoundException e) {
            System.out.println("Errore: file non trovato!");
        }


        // 5. Più catch gestiscono separatamente errori diversi dello stesso try.
        try {
            File file = new File("numeri.txt");

            Scanner lettore = new Scanner(file);

            int valore = lettore.nextInt();

            System.out.println("Numero letto: " + valore);

            lettore.close();

        // Gestisce il caso in cui il file non venga trovato.
        } catch (FileNotFoundException e) {
            System.out.println("Errore: file non trovato!");

        // Gestisce il caso in cui il contenuto del file non sia un numero intero.
        } catch (InputMismatchException e) {
            System.out.println("Errore: contenuto non numerico!");
        }

        // Chiude lo Scanner della console e libera le risorse associate.
        scanner.close();
    }
}

