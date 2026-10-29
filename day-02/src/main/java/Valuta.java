import java.util.Scanner;

public class Valuta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci importo in euro: ");
        double importo = scanner.nextDouble();

        double dollaro = importo * 1.10;

        System.out.println("Importo in dollaro: " + dollaro + " $");
        scanner.close();
    }
}
