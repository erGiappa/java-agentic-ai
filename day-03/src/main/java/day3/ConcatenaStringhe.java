package day3;

public class ConcatenaStringhe {
    public static void main(String[] args) {

        // Creo un array di stringhe contenente tre parole
        String[] parole = {"Forza", "Inter", "!"};

        // Creo una stringa vuota dove concatenare le parole
        String risultato = "";

        // Scorro tutte le parole presenti nell'array
        for (String parola : parole){
            // Aggiungo ogni parola alla stringa risultato
            risultato += parola + " ";
        }
        // Stampo la frase completa
        System.out.println("Frase concatenata: " + risultato);
    }
}
