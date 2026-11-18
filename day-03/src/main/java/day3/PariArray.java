package day3;

public class PariArray {
    public static void main(String[] args) {

        // Array contenente i valori da controllare.
        int [] numeri = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        // Il for-each assegna a numero uno elemento alla volta.
        for (int numero : numeri){
            // Un numero è pari se il resto della divisione per 2 è zero.
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        }
    }
}
