import java.util.Scanner;

public class UltimoCarattere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();

        int lunghezza = parola.length();
        char ultimo = parola.charAt(lunghezza - 1);

        System.out.println("Ultimo carattere: " + ultimo);
        scanner.close();
    }
}
