package Blocco4;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Creazione HashSet
        Set<Integer> numeri = new HashSet<>();

        numeri.add(5);
        numeri.add(6);
        numeri.add(7);
        numeri.add(8);
        numeri.add(9);
        numeri.add(10);

        System.out.println(numeri);
        System.out.println("----------------------------------------------");

        // 2. Verifica presenza elemento
        if (numeri.contains(5)) {
            System.out.println("Il numero 5 è presente!");
        } else {
            System.out.println("Il numero 5 non è presente!");
        }

        System.out.println("----------------------------------------------");

        // 3. Iterazione con for-each
        System.out.println("Elementi del set");

        for (int numero : numeri) {
            System.out.print(numero);
        }

        System.out.println();

        System.out.println("----------------------------------------------");

        // 4. Conversione Set in List
        List<Integer> lista = new ArrayList<>(numeri);

        System.out.println("Lista convertita: " + lista);

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(3);
        hashSet.add(8);
        hashSet.add(15);
        hashSet.add(20);

        System.out.println("----------------------------------------------");

        // 5. Creazione TreeSet

        Set<Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);



    }
}
