package day2;

import java.util.Scanner;

public class TipoGiorno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero da 1 a 7: ");
        int giorno = scanner.nextInt();

        switch (giorno) {

            // I giorni da lunedì a venerdì appartengono
            // alla stessa categoria.
            //
            // L'assenza di break permette ai case di condividere
            // lo stesso blocco di istruzioni.
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Giorno lavorativo");
                break;

            // Anche sabato e domenica condividono
            // lo stesso comportamento.
            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Numero non valido! Inserisci un numero da 1 a 7.");
                break;
        }

        scanner.close();
    }
}
