import java.util.Scanner;

public class NomeUtente {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;

        do{
            System.out.println("Inserisci nome utente: ");
            nome = input.nextLine();
        } while (nome.length() <= 3);

        System.out.println("Ciao " + nome);
        input.close();
    }
}
