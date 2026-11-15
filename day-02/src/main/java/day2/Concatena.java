package day2;

import java.util.Scanner;

public class Concatena {
    public static void main(String[] args) {

        // Crea lo Scanner per acquisire le due parole.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la prima parola: ");
        String parola1 = scanner.nextLine();

        System.out.print("Inserisci la seconda parola: ");
        String parola2 = scanner.nextLine();

        // L'operatore + applicato a due String effettua una concatenazione.
        String concatena = parola1 + parola2;

        // Visualizza il risultato della concatenazione.
        System.out.println("Risultato: " + concatena);


        scanner.close();
    }
}
