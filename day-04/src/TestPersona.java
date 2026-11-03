import java.util.Scanner;

public class TestPersona {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Persona p1 = new Persona("John", 30, 1, "giapponese");

        System.out.println("Inserisci il giorno preferito (1-7):");

        int giorno = scanner.nextInt();

        p1.setGiornoPreferito(giorno);

        scanner.nextLine();

        System.out.println("Inserisci la materia preferita:");
        String materia = scanner.nextLine();

        p1.setMateriaPreferita(materia);

        System.out.println("Giorno preferito: " + p1.getNomeGiorno());

        System.out.println("Materia preferita: " +p1.descriviMateria());

        scanner.close();

    }
}
