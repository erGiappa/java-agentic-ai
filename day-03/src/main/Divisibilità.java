import java.util.Scanner;

public class Divisibilità {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero:");
        int m = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i % m == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
