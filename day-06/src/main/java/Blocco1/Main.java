package Blocco1;

import java.util.ArrayList;
import java.util.List;

public class Main {
      public static void main(String[] args) {

          //1. Creazione della lista
            List<String> nomi = new ArrayList<>();

            nomi.add("Anna");
            nomi.add("Luca");
            nomi.add("Marco");
            nomi.add("Sara");
            nomi.add("Giulia");

            // 2. Stampa for-each
          System.out.println("Lista nomi:");
          for (String nome : nomi) {
              System.out.println(nome);
          }

          System.out.println("----------------------------------");

          //3. Accesso tramite indice
          if (nomi.size() > 2){
              System.out.println("Terzo elemento: " + nomi.get(2));
          } else {
              System.out.println("Indice non valido!");
          }

          System.out.println("-----------------------------------");

          //4. Modifica un elemento
          nomi.set(1, "John Michael");
          System.out.println("Lista modificata: " + nomi);

          System.out.println("-----------------------------------");

          //5. Rimozione dell'ultimo elemento
          nomi.remove(nomi.size()-1);
          System.out.println("Lista dopo rimozione: " + nomi);

          System.out.println("-----------------------------------");


          //6. Dimensione della lista
          System.out.println("La lista contiene " + nomi.size() + " elementi.");


      }
    }

