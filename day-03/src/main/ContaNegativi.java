import java.util.Scanner;

public class ContaNegativi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int contatore = 0;
        int negativi = 0;

        while(contatore < 10){
            System.out.println("Digita un numero: ");
            numero = scanner.nextInt();

            if (numero < 0){
                negativi++;
            }
            contatore ++;
        }

        System.out.println("I numeri negativi digitati sono: " + negativi);


        scanner.close();
    }
}
