package com.ergiappa;


public class ConfrontoTipi {
    public static void main(String[] args) {
        int x = 5;
        String y = "5";

        System.out.println(x);
        System.out.println(y);

        // Anche se in output appaiono uguali, x e y
        // appartengono a categorie di tipo diverse.
        //
        // int è un tipo primitivo e memorizza
        // direttamente un valore numerico intero.
        //
        // String è una classe e y è una variabile
        // che fa riferimento a un oggetto contenente
        // una sequenza di caratteri.
        //
        // Per questo motivo, x può essere utilizzato
        // per operazioni matematiche, mentre y rappresenta
        // testo e viene utilizzato per operazioni sulle stringhe.
    }
}
