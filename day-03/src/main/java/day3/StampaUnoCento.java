package day3;

public class StampaUnoCento {
    public static void main(String[] args) {

        // La variabile accumula il totale dei numeri.
        int somma = 0;

        // Scorre i numeri da 1 a 100.
        for(int i = 1; i <= 100; i++) {
            somma += + i;
        }
        System.out.println("La somma di tutti i numeri da 1 a 100 è: " + somma);
    }
}
