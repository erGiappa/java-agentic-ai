public class SommaArray {
    public static void main(String[] args) {

        int [] numeri = {1,2,3,4,5};

        int somma = 0;

        for (int numero : numeri){
            somma += numero;
        }

        System.out.println("La somma del array è: " + somma);
    }
}
