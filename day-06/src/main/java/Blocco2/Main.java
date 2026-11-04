package Blocco2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. Creazione lista nomi
        List<String> nomi = new ArrayList<>();

        nomi.add("Anna");
        nomi.add("John");
        nomi.add("Michael");
        nomi.add("John Michael");
        nomi.add("JM");

        //2. Verifica la presenza di Anna
        if (nomi.contains("Anna")) {
            System.out.println("Anna è presente");
        } else {
            System.out.println("Anna non è presente");
        }

        //3. Inserimento in posizione specifica
        nomi.add("Mario");
        System.out.println("Lista nomi: " + nomi);

        //4. Creazione lista di numeri
        List<Integer> numeri = new ArrayList<>();

        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        numeri.add(4);
        numeri.add(5);
        numeri.add(6);
        numeri.add(7);
        numeri.add(8);

        //5. Calcolo della somma
        int somma = 0;

        for (int numero : numeri) {
            somma += numero;
        }
        System.out.println("Somma: " + somma);

        //6. Rimozione dei numeri pari
        numeri.removeIf(numero -> numero % 2 == 0);
        System.out.println("Numeri dispari " + numeri);


        // 7. Ordinamento crescente
        Collections.sort(numeri);

        System.out.println("Ordine crescente: " + numeri);

        // 8. Ordinamento decrescente
        Collections.reverse(numeri);

        System.out.println("Ordine decrescente: " + numeri);
    }
}