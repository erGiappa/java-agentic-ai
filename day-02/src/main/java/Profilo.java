import java.util.Scanner;

public class Profilo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Come ti chiami?");
        String nome = scanner.next();

        System.out.print("Quanti anni hai?");
        int anni = scanner.nextInt();

        System.out.print("Città di residenza?: ");
        String città = scanner.next();

        System.out.print("Ami java?");
        boolean amiJava = scanner.nextBoolean();

        System.out.println("Mi chiamo " + nome + " ho " + anni + "anni, sono di " + città + " e amo Java: " + amiJava +"." );
        scanner.close();


    }
}
