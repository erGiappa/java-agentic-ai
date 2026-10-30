import java.util.Scanner;

public class RicercaElemento {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int [] numeri = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Inserisci un numero: ");
        int cerca = scanner.nextInt();

        boolean trovato = false;

        for (int numero : numeri){
            if (numero == cerca){
                trovato = true;
                break;
            }
        }
        if (trovato){
            System.out.println("Numero presente nell'array");
        }
        else {
            System.out.println("Numero non presente nell'array");
        }

        scanner.close();
    }

}
