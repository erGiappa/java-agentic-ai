package Blocco5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // 1. HashSet contiene valori unici e non garantisce un ordine preciso.
        Set<Integer> numeri = new HashSet<>();

        numeri.add(4);
        numeri.add(5);
        numeri.add(8);
        numeri.add(10);
        numeri.add(3);
        numeri.add(2);

        // removeIf elimina gli elementi che soddisfano la condizione indicata dalla lambda.
        // In questo caso vengono rimossi tutti i numeri minori di 5.
        numeri.removeIf(n -> n < 5);

        System.out.println("Numeri dopo rimozione: " + numeri);
        System.out.println("--------------------------------");

        // 2. Scanner permette di leggere una parola alla volta dalla console.
        Scanner scanner = new Scanner(System.in);

        // Il Set elimina automaticamente i duplicati: ogni parola viene salvata una sola volta.
        Set<String> parole = new HashSet<>();

        String parola;

        System.out.println("Inserisci parole (fine per terminare):");

        // Il ciclo legge almeno una volta e termina quando viene digitata la parola "fine".
        do {
            parola = scanner.nextLine();

            // equalsIgnoreCase rende il controllo indipendente dalle maiuscole e minuscole.
            if (!parola.equalsIgnoreCase("fine")) {
                parole.add(parola);
            }

        }while(!parola.equalsIgnoreCase("fine"));

        // size restituisce il numero di elementi unici presenti nel Set.
        System.out.println("Parole uniche: " + parole.size());
        System.out.println("Elenco: " + parole);
        System.out.println("--------------------------------");

        // 3. Intersezione
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Una copia di set1 evita di modificare l'insieme originale.
        // retainAll conserva solo gli elementi presenti anche in set2.
        Set<Integer> intersezione = new HashSet<>(set1);
        intersezione.retainAll(set2);

        System.out.println("Intersezione: " + intersezione);
        System.out.println("--------------------------------");

        // 4. Unione
        Set<String> colori1 = new HashSet<>();
        Set<String> colori2 = new HashSet<>();

        colori1.add("Rosso");
        colori1.add("Blu");
        colori1.add("Verde");

        colori2.add("Blu");
        colori2.add("Giallo");
        colori2.add("Nero");

        // Una copia di colori1 diventa il risultato dell'unione.
        // addAll aggiunge gli elementi di colori2, ignorando quelli già presenti.
        Set<String> unione = new HashSet<>(colori1);
        unione.addAll(colori2);

        System.out.println("Unione: " + unione);
        System.out.println("--------------------------------");


        // 5. Differenza
        Set<Integer> numeri1 = new HashSet<>();
        Set<Integer> numeri2 = new HashSet<>();

        numeri1.add(1);
        numeri1.add(2);
        numeri1.add(3);
        numeri1.add(4);
        numeri1.add(5);

        numeri2.add(3);
        numeri2.add(4);
        numeri2.add(5);

        // removeAll elimina da numeri1 tutti gli elementi presenti in numeri2.
        // La lista risultante contiene quindi solo i numeri esclusivi di numeri1.
        numeri1.removeAll(numeri2);

        System.out.println("Differenza: " + numeri1);

        // Chiude lo Scanner e libera le risorse associate alla lettura dalla console.
        scanner.close();

    }

}
