package Blocco4;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. HashSet implementa un insieme di numeri interi.
        // Un Set non contiene elementi duplicati e HashSet non garantisce un ordine preciso.
        Set<Integer> numeri = new HashSet<>();

        numeri.add(5);
        numeri.add(6);
        numeri.add(7);
        numeri.add(8);
        numeri.add(9);
        numeri.add(10);

        System.out.println(numeri);
        System.out.println("----------------------------------------------");

        // 2. contains verifica se il valore 5 è presente nel Set.
        if (numeri.contains(5)) {
            System.out.println("Il numero 5 è presente!");
        } else {
            System.out.println("Il numero 5 non è presente!");
        }

        System.out.println("----------------------------------------------");

        // 3. Il for-each permette di leggere tutti gli elementi del Set.
        System.out.println("Elementi del set");

        for (int numero : numeri) {
            System.out.print(numero);
        }

        // Aggiunge un salto di riga dopo tutti i numeri.
        System.out.println();

        System.out.println("----------------------------------------------");

        // 4. ArrayList riceve tutti gli elementi del Set durante la creazione.
        // La conversione produce una lista modificabile e conserva gli elementi
        // come sono al momento della copia.
        List<Integer> lista = new ArrayList<>(numeri);

        System.out.println("Lista convertita: " + lista);

        // HashSet viene usato qui per memorizzare altri numeri senza duplicati.
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(3);
        hashSet.add(8);
        hashSet.add(15);
        hashSet.add(20);

        System.out.println("----------------------------------------------");

        // 5. TreeSet crea un nuovo insieme ordinando gli elementi presenti in hashSet.
        // Per numeri interi l'ordine prodotto è crescente.
        Set<Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);



    }
}
