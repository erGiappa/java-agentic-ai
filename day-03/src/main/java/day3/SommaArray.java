package day3;

public class SommaArray {
    public static void main(String[] args) {

        // Array contenente i numeri da sommare.
        int [] numeri = {1,2,3,4,5};

        // L'accumulatore parte da zero.
        int somma = 0;

        // Il for-each aggiunge progressivamente ogni elemento alla somma.
        for (int numero : numeri){
            somma += numero;
        }

        System.out.println("La somma del array è: " + somma);
    }
}
