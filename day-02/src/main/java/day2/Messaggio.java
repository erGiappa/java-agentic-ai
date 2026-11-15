package day2;
import java.util.Scanner;

// Importa la classe Scanner dalla libreria standard Java.

// Scanner permette di leggere dati provenienti da diverse sorgenti, tra cui la tastiera.

public class Messaggio {

    // Metodo main: punto di ingresso dell'applicazione Java.
    public static void main(String[] args) {

        // Crea un oggetto Scanner collegato allo standard input.
        // System.in rappresenta normalmente la tastiera.
        Scanner scanner = new Scanner(System.in);

        // Il risultato è un nuovo messaggio composto dal testo fisso e dal nome inserito dall'utente.
        System.out.print("Inserisci nome: ");
        String nome = scanner.nextLine();

        System.out.println("Ciao, " + nome + "! Benvenuto in Java!");

        // Chiude lo Scanner e la risorsa associata.
        scanner.close();


    }
}
