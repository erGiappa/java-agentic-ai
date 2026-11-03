public class Studente extends Persona {

    private String corsoDiStudio;
    protected String nome;

    public Studente(String nome, int eta, String corsoDiStudio){
        super(nome, eta);

        System.out.println("Costruttore studente eseguito");

        this.corsoDiStudio = corsoDiStudio;

        //Inizializza il campo nome della classe Studente
        this.nome = "Studente " + nome;
    }

    //Sovrascritture di presentati
    @Override
    public void presentati(){

        super.presentati();

        System.out.println("Sto studiando " + corsoDiStudio + ".");
    }


    @Override
    public void studia(){

        // Richiama prima il metodo della superclasse?
        // Studente non eredita studia() da Persona.
        // Per questo utilizziamo qui una versione propria.
        System.out.println("Sto studiando per il corso di "
                + corsoDiStudio + ".");
    }


    public void mostraDati(){
        System.out.println("Nome della classe Persona: " + super.nome);
        System.out.println("Nome della classe Studente: " + this.nome);
    }

}
