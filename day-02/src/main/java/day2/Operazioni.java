package day2;
import java.util.Scanner;

public class Operazioni {
    public static  void main(String[] args) {

        // Crea lo Scanner per acquisire i due numeri.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        // Operatore + : addizione.
        int somma = num1 + num2;

        // Operatore - : sottrazione.
        int differenza = num1 - num2;

        // Operatore * : moltiplicazione.
        int moltiplicazione = num1 * num2;

        // Operatore / : divisione.
        // Poiché entrambi gli operandi sono int, anche il risultato sarà un intero.
        // La parte decimale viene eliminata.
        int divisione = num1 / num2;
        int divisioneResto = num1 % num2;

        // Visualizza i risultati delle operazioni.
        System.out.println("La somma dei due numeri è: " + somma);
        System.out.println("La differenza dei due numeri è: " + differenza);
        System.out.println("La moltiplicazione dei due numeri è: " + moltiplicazione);
        System.out.println("La divisione dei due numeri è: " + divisione);
        System.out.println("La divisione con resto dei due numeri è: " + divisioneResto);



        scanner.close();

    }
}
