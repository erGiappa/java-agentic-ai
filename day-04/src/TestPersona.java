public class TestPersona{
    public static void main(String[] args) {

        //Creazione oggetti
        Persona p1 = new Persona("JohnM", 29);
        Persona p2 = new Persona("JMichael", 25);

        //Modifica dei campi usando i setter
        p1.setNome("John");
        p1.setEta(30);

        p2.setNome("Michael");
        p2.setEta(24);

        // Tentativo di inserire un'età negativa
        p1.setEta(-5);

        // Richiamo dei metodi
        p1.saluta();
        p2.saluta();

        p1.invecchia();

        // Lettura dei dati usando esclusivamente i getter
        System.out.println("\nPrima persona:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Età: " + p1.getEta());

        System.out.println("\nSeconda persona:");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Età: " + p2.getEta());
    }
}