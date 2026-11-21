

// Rappresenta una persona con un nome e un'età.
public class Persona {

    // Protected permette alle sottoclassi di accedere direttamente al nome.
    protected String nome;
    // Protected permette alle sottoclassi di accedere direttamente all'età.
    protected int eta;

    // Inizializza i dati della persona quando viene creato un oggetto.
    public Persona(String nome, int eta) {

        // Messaggio visualizzato ogni volta che viene eseguito il costruttore.
        System.out.println("Costruttore persona eseguito");

        // this.nome indica il campo della classe; nome indica il parametro.
        this.nome = nome;
        // this.eta indica il campo della classe; eta indica il parametro.
        this.eta = eta;
    }

    // Mostra a schermo una breve presentazione della persona.
    public void presentati(){
        System.out.println(
                "Ciao, sono " + nome + ", ho " + eta + " anni."
        );
    }

    // Simula l'attività di studio mostrando un messaggio.
    public void studia(){
        System.out.println("Sta studiando");
    }
}
