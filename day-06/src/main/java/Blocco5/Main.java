package Blocco5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // 1. Rimozione condizionale
        Set<Integer> numeri = new HashSet<>();

        numeri.add(4);
        numeri.add(5);
        numeri.add(8);
        numeri.add(10);
        numeri.add(3);
        numeri.add(2);

        numeri.removeIf(n -> n < 5);

        System.out.println("Numeri dopo rimozione: " + numeri);
        System.out.println("--------------------------------");

        //Inserimento parole uniche
        Scanner scanner = new Scanner(System.in);

        Set<String> parole = new HashSet<>();

        String parola;

        System.out.println("Inserisci parole (fine per terminare):");

        do {
            parola = scanner.nextLine();

            if (!parola.equalsIgnoreCase("fine")) {
                parole.add(parola);
            }

        }while(!parola.equalsIgnoreCase("fine"));

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

        numeri1.removeAll(numeri2);

        System.out.println("Differenza: " + numeri1);

        scanner.close();

    }

}
