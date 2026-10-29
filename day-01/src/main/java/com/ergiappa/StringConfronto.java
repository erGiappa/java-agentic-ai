package com.ergiappa;

public class StringConfronto {
    public static void main(String[] args) {
        String a = "Java";
        String b = new String("Java");

        // L'operatore == confronta i riferimenti:
        // verifica se a e b puntano allo stesso oggetto.
        // In questo caso restituisce false perché
        // new String("Java") crea un nuovo oggetto.
        System.out.println(a == b);

        // Il metodo equals() confronta il contenuto
        // delle stringhe, cioè i caratteri.
        // Poiché entrambe contengono "Java", restituisce true.
        System.out.println(a.equals(b));
    }
}
