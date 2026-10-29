import java.util.Scanner;

public class PrimoCarattere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();

        System.out.println("La prima lettera della parola è: " + parola.charAt(0));

        scanner.close();
    }
}
