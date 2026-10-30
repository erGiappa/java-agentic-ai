public class ConcatenaStringhe {
    public static void main(String[] args) {

        String[] parole = {"Forza", "Inter", "!"};

        String risultato = "";

        for (String parola : parole){
            risultato += parola + " ";
        }
        System.out.println("Frase concatenata: " + risultato);
    }
}
