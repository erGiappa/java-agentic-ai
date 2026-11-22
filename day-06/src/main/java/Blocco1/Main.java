package Blocco1;

import java.util.ArrayList;
import java.util.List;

/**
 * Esempio delle principali operazioni effettuabili su una lista di String.
 * Mostra creazione, lettura, modifica, rimozione e dimensione degli elementi.
 */

public class Main {
      public static void main(String[] args) {

            // 1. Crea una lista vuota e aggiunge cinque nomi.
            // ArrayList contiene gli elementi in ordine di inserimento.
            List<String> nomi = new ArrayList<>();

            nomi.add("Anna");
            nomi.add("Luca");
            nomi.add("Marco");
            nomi.add("Sara");
            nomi.add("Giulia");

          // 2. Il ciclo for-each legge ogni nome e lo stampa a video.
          System.out.println("Lista nomi:");
          for (String nome : nomi) {
              System.out.println(nome);
          }

          System.out.println("----------------------------------");

          // 3. Gli indici partono da zero: size() e get() verificano
          // e leggono il terzo elemento, senza provocare un errore se la lista è troppo corta.
          if (nomi.size() > 2){
              System.out.println("Terzo elemento: " + nomi.get(2));
          } else {
              System.out.println("Indice non valido!");
          }

          System.out.println("-----------------------------------");

          // 4. set() sostituisce il secondo elemento (indice 1).
          nomi.set(1, "John Michael");
          System.out.println("Lista modificata: " + nomi);

          System.out.println("-----------------------------------");

          // 5. size() - 1 indica l'indice dell'ultimo elemento;
          // remove() elimina proprio questo elemento dalla lista.
          nomi.remove(nomi.size()-1);
          System.out.println("Lista dopo rimozione: " + nomi);

          System.out.println("-----------------------------------");

          // 6. size() restituisce il numero attuale di elementi nella lista.
          System.out.println("La lista contiene " + nomi.size() + " elementi.");


      }
    }

