package day2;

import java.util.Scanner;

public class PrimoCarattere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        // nextLine() acquisisce l'intera riga inserita
        String parola = scanner.nextLine();

        // charAt(0) restituisce il carattere che si trova nella posizione 0 della stringa.
        System.out.println("La prima lettera della parola è: " + parola.charAt(0));

        scanner.close();
    }
}
