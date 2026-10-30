
import java.util.Scanner;

public class AbbreviazioneGiorno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un giorno della settimana: ");
        String giorno = scanner.nextLine();

        switch (giorno.toLowerCase()) {
            case "lunedì":
                System.out.println("Lun");
                break;
            case "martedì":
                System.out.println("Mar");
                break;
            case "mercoledì":
                System.out.println("Mer");
                break;
            case "giovedì":
                System.out.println("Gio");
                break;
            case "venerdì":
                System.out.println("Ven");
                break;
            case "sabato":
                System.out.println("Sab");
                break;
            case "domenica":
                System.out.println("Dom");
                break;
            default:
                System.out.println("Giorno non valido!");
        }

        scanner.close();
    }
}
