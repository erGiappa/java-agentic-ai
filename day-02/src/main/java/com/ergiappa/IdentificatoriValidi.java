import java.util.Scanner;

public class IdentificatoriValidi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = input.nextLine();

        if (!parola.isEmpty()
                && !Character.isDigit(parola.charAt(0))
                && !parola.contains(" ")) {
            System.out.println("L'identificatore rispetta le condizioni richieste.");
        } else {
            System.out.println("L'identificatore non è valido.");
        }


        input.close();


    }
}
