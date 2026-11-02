
import java.util.Scanner;

public class TestPersona {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Persona p1 = new Persona("John", 30, 16, "giapponese");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Età: " + p1.getEta());

        System.out.println("Inserisci il tuo giorno preferito (1-7):");
        int giorno = scanner.nextInt();

        p1.setGiornoPreferito(giorno);

        System.out.println("Inserisci la tua materia preferita:");
        String materia = scanner.next();

        System.out.println("Giorno preferito: " + p1.getNomeGiorno());

        // La materia viene gestita tramite switch
        // sull'attributo materiaPreferita.

        System.out.println("Materia preferita: " + p1.descriviMateria());

        p1.login();

        System.out.println("Online: " + p1.isOnline());

        scanner.close();
    }
}
