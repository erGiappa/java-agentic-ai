import java.util.Scanner;

public class MultiploControllo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digita un numero positivo: ");
            numero = scanner.nextInt();
        }
        while (numero >= 0);

        System.out.println("Hai inserito un numero negativo!");

        scanner.close();
    }

}
