package day3;

import java.util.Scanner;

public class MenuInterattivo {
    public static void main(String[] args) {

        // Inizializza lo Scanner e la variabile che contiene la scelta dell'utente.
        Scanner scanner = new Scanner(System.in);
        int scelta;

        // Il menu viene mostrato almeno una volta grazie al ciclo do-while.
        do{
            System.out.println("1. Saluta");
            System.out.println("2. Mostra nome");
            System.out.println("3. Mostra tipo");
            System.out.println("0. Esci");

            System.out.println("Scegli un opzione: ");
            scelta = scanner.nextInt();

            // Il switch associa ogni scelta a una specifica istruzione.
            switch (scelta){
            case 1:
                System.out.println("Bellaaaa!");
                break;
                case 2:
                    System.out.println("Skiddo");
                    break;
                case 3:
                    System.out.println("Erba");
                    break;
                case 0:
                    System.out.println("Uscita dal programma...");
                    break;
                    default:
                        System.out.println("Scelta non valida");
                        break;
            }
        }while(scelta!=0);

        scanner.close();

    }
}
