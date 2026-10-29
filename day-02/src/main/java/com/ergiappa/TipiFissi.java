package com.ergiappa;


public class TipiFissi {
    public static void main(String[] args) {
        int numero = 10;

        // Errore: non è possibile assegnare una stringa a una variabile int.
        // numero = "ciao";

        // Messaggio d'errore:
        // incompatible types: String cannot be converted to int

        // La tipizzazione statica significa che il tipo di una variabile
        // viene stabilito durante la compilazione.
        // Una variabile int può contenere numeri interi, ma non stringhe.

        System.out.println("Numero: " + numero);
    }
}
