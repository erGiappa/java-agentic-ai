import java.util.Scanner;

public class InserisciPositivo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Inserisci un numero positivo: ");
        num = scanner.nextInt();

        while (num <= 0) {
            System.out.print("Numero non valido! Inserisci un numero positivo: ");
            num = scanner.nextInt();
        }

        System.out.println("Numero corretto: " + num);

        scanner.close();
    }
}
