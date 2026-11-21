// Studente è una sottoclasse di Persona.
public class Studente extends Persona {

    // Nome del corso seguito dallo studente.
    private String corsoDiStudio;
    // Campo dichiarato anche nella superclasse: qui viene nascosto il campo nome di Persona.
    protected String nome;

    // Inizializza i dati dello studente.
    public Studente(String nome, int eta, String corsoDiStudio){
        // Richiama il costruttore di Persona per inizializzare nome ed età.
        super(nome, eta);

        System.out.println("Costruttore studente eseguito");

        this.corsoDiStudio = corsoDiStudio;

        //Inizializza il campo nome della classe Studente
        this.nome = "Studente " + nome;
    }

    //Sovrascritture di presentati
    @Override
    public void presentati(){

        // Richiama prima l'implementazione della classe Persona.
        super.presentati();

        // Aggiunge al messaggio il corso di studio dello studente.
        System.out.println("Sto studiando " + corsoDiStudio + ".");
    }


    // Sovrascrive il metodo studia() ereditato da Persona.
    @Override
    public void studia(){

        // Richiama prima il metodo della superclasse?
        // Studente non eredita studia() da Persona.
        // Per questo utilizziamo qui una versione propria.
        System.out.println("Sto studiando per il corso di "
                + corsoDiStudio + ".");
    }


    // Confronta il campo nome definito nelle due classi.
    public void mostraDati(){
        // super.nome accede al campo nome della classe Persona.
        System.out.println("Nome della classe Persona: " + super.nome);
        // this.nome accede al campo nome della classe Studente.
        System.out.println("Nome della classe Studente: " + this.nome);
    }

}
