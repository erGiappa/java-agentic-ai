package day2;

import java.time.LocalDate;
import java.util.Scanner;

public class MenuInterattivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int scelta;

        // Il ciclo do-while esegue almeno una volta il blocco di istruzioni prima di verificare la condizione.
        // Il menu viene riproposto finché l'utente non seleziona l'opzione 4.

        do{
            System.out.println("Menu interattivo");
            System.out.println("1. Dire ciao");
            System.out.println("2. Mostrare la data corrente");
            System.out.println("3. Calcolare la somma di due numeri");
            System.out.println("4. Uscire");
            System.out.print("Scegli un'opzione: ");

            scelta = scanner.nextInt();

            // switch determina quale operazione eseguire in base alla scelta dell'utente.
            switch (scelta){
                case 1:
                    System.out.println("Ciao, Benvenuto!");
                    break;
                    case 2:
                        // LocalDate.now() restituisce la data corrente
                        System.out.println("La data corrente è: " + LocalDate.now());
                        break;
                        case 3:
                            System.out.print("Inserisci il primo numero: ");
                            double num1 = scanner.nextDouble();
                            System.out.print("Inserisci il secondo numero: ");
                            double num2 = scanner.nextDouble();
                            double somma = num1 + num2;
                            System.out.println("La somma è: " + somma);
                            break;
                            case 4:
                                System.out.println("Programma terminato");
                                break;
                                default:
                                    System.out.println("Scelta non valida! Riprova.");
            }
        } while (scelta != 4);
        // Il programma termina.
        scanner.close();
    }
}
