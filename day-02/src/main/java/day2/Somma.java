package day2;
import java.util.Scanner;


public class Somma {
    public static void main(String[] args) {

        // Crea lo Scanner per leggere i valori inseriti dall'utente.
        Scanner scanner = new Scanner(System.in);

        // nextInt() legge un numero intero.
        System.out.print("Digita un numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digita un numero: ");
        int num2 = scanner.nextInt();

        // L'operatore + esegue la somma aritmetica
        // dei due valori interi.
        // Il risultato viene memorizzato nella variabile somma.
        int somma = num1 + num2;

        // Costruisce una frase concatenando testo e valori numerici.
        System.out.println("La somma di " + num1 + " e " + num2 + " è " + somma);

        scanner.close();


    }
}
