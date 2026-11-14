package com.ergiappa;

/**
 * Esempio di tipizzazione statica in Java.
 *
 * Ogni variabile possiede un tipo definito
 * al momento della dichiarazione.
 */

public class TipiStatici {
    public static void main(String[] args) {

        int numero = 10;

        String parola = "test";

        System.out.println("Parola: " + parola);
        System.out.println("Numero: " + numero);

        /*
         * Esempi di assegnazioni NON valide:
         *
         * numero = "venti";
         * ERRORE: una String non può essere assegnata
         * direttamente a una variabile int.
         *
         * parola = 15;
         * ERRORE: un int non può essere assegnato
         * direttamente a una variabile String.
         *
         * Queste istruzioni sono lasciate nei commenti
         * per mantenere il programma compilabile.
         */

        /*
         * TIPIZZAZIONE STATICA:
         *
         * Java verifica la compatibilità dei tipi
         * durante la compilazione.
         *
         * Gli errori di assegnazione incompatibile
         * vengono quindi individuati prima dell'esecuzione.
         */

    }
}
