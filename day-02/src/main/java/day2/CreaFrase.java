package day2;

import java.util.Scanner;

public class CreaFrase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci soggetto: ");
        String soggetto  = scanner.nextLine();

        System.out.print("Inserisci verbo: ");
        String verbo  = scanner.nextLine();

        System.out.print("Inserisci complemento: ");
        String complemento  = scanner.nextLine();

        // Costruisce la frase concatenando le tre stringhe.
        //
        // Gli spazi vengono aggiunti esplicitamente:
        // Java non inserisce automaticamente separatori
        // durante la concatenazione.
        String frase = soggetto + " " + verbo + " " + complemento;

        System.out.println(frase);

        scanner.close();

    }
}
