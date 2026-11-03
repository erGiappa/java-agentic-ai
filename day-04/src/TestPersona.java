
import java.util.Scanner;

public class TestPersona {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Persona p1 = new Persona("John", 30, 6, "Informatica");

        System.out.println("Inserisci un giorno della settima (1-7):");
        int giorno = scanner.nextInt();

        p1.setGiornoPreferito(giorno);

        scanner.nextLine();

        System.out.println("Vuoi essere online? (si/no)");
        String risposta = scanner.nextLine();

        if (risposta.equalsIgnoreCase("si")) {
            p1.login();
        } else {
            p1.logout();
        }

        switch (giorno){
            case 1:
                if (p1.isOnline()){
                    System.out.println("Lunedì: sei online e pronto a iniziare");
                } else {
                    System.out.println("Lunedi: al momento sei offline");
                }
                break;
            case 2:
                if (p1.isOnline()){
                    System.out.println("Martedì: sei online e pronto a iniziare");
                } else {
                    System.out.println("Martedì: al momento sei offline");
                }
                break;
            case 3:
                if (p1.isOnline()){
                    System.out.println("Mercoledì: sei online e pronto a iniziare");
                } else {
                    System.out.println("Mercoledì: al momento sei offline");
                }
                break;
            case 4:
                if (p1.isOnline()){
                    System.out.println("Giovedì: sei online e pronto a iniziare");
                } else {
                    System.out.println("Giovedì: al momento sei offline");
                }
                break;
            case 5:
                if (p1.isOnline()){
                    System.out.println("Venerdì: sei online e pronto a iniziare");
                } else {
                    System.out.println("Venerdì: al momento sei offline");
                }
                break;
            case 6:
                if (p1.isOnline()){
                    System.out.println("Sabato: sei online e pronto a iniziare");
                } else {
                    System.out.println("Sabato: al momento sei offline");
                }
                break;
            case 7:
                if (p1.isOnline()){
                    System.out.println("Domenica: sei online e pronto a iniziare");
                } else {
                    System.out.println("Domenica: al momento sei offline");
                }
                break;
            default:
                System.out.println("Giorno non valido!");
                break;
        }


        scanner.close();
    }
}

