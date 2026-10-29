import java.util.Scanner;

public class CondizioniComposte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int numero1 = input.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int numero2 = input.nextInt();

        boolean risultato = numero1 > 0 && numero2 > 0;

        System.out.println(risultato);

        input.close();
    }
}