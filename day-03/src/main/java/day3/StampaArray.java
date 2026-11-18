package day3;

public class StampaArray {
    public static void main(String[] args) {

        // Array contenente i valori da stampare.
        int[] numeri = {1,2,3,4,5,6,7,8,9,10};

        // Il for-each stampa in sequenza ogni elemento dell'array.
        for (int numero : numeri) {
            System.out.println(numero);
        }
    }
}
