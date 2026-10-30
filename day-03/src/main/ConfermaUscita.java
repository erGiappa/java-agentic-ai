import java.util.Scanner;

public class ConfermaUscita {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String risposta;

        do {
            System.out.println("Vuoi uscire? (s/n)");
            risposta = scanner.next();
        } while (!risposta.equals("s"));

        System.out.println("Sei uscito!");
        scanner.close();
    }
}
