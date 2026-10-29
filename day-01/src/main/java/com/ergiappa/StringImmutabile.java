package com.ergiappa;

public class StringImmutabile {
    public static void main(String[] args) {
        String saluto = "Ciao";

        // Le stringhe in Java sono immutabili:
        // il valore originale "Ciao" non viene modificato.
        // La concatenazione crea un nuovo oggetto String
        // con il nuovo valore "Ciao Mondo".
        saluto = saluto + " Mondo";

        System.out.println(saluto);
    }
}