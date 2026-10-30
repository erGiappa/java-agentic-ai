
import java.util.Scanner;

public class TipoGiorno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero da 1 a 7: ");
        int giorno = scanner.nextInt();

        switch (giorno) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Giorno lavorativo");
                break;

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
