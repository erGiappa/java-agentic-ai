package Blocco2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. ArrayList crea una lista modificabile: String indica il tipo dei suoi elementi.
        List<String> nomi = new ArrayList<>();

        // Aggiunge ogni nome alla fine della lista.
        nomi.add("Anna");
        nomi.add("John");
        nomi.add("Michael");
        nomi.add("John Michael");
        nomi.add("JM");

        // 2. contains cerca "Anna" nella lista e restituisce true oppure false.
        if (nomi.contains("Anna")) {
            System.out.println("Anna è presente");
        } else {
            System.out.println("Anna non è presente");
        }

        // 3. add aggiunge Mario alla fine della lista.
        nomi.add("Mario");
        System.out.println("Lista nomi: " + nomi);

        // 4. Creazione di una lista di numeri interi.
        // Integer è il tipo "oggetto" usato come parametro generico al posto di int.
        List<Integer> numeri = new ArrayList<>();

        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        numeri.add(4);
        numeri.add(5);
        numeri.add(6);
        numeri.add(7);
        numeri.add(8);

        // 5. Somma tutti gli elementi della lista.
        // Nella sintassi "for (tipo variabile : lista)", ogni elemento viene letto a turno.
        int somma = 0;

        for (int numero : numeri) {
            somma += numero;
        }
        System.out.println("Somma: " + somma);

        // 6. removeIf elimina gli elementi per cui l'espressione lambda restituisce true.
        // Il resto % 2 vale 0 per i numeri pari.
        numeri.removeIf(numero -> numero % 2 == 0);
        System.out.println("Numeri dispari " + numeri);

        // 7. sort ordina la lista in ordine crescente.
        Collections.sort(numeri);

        System.out.println("Ordine crescente: " + numeri);

        // 8. reverse inverte l'ordine della lista già ordinata,
        // ottenendo così la sequenza decrescente.
        Collections.reverse(numeri);

        System.out.println("Ordine decrescente: " + numeri);
    }
}