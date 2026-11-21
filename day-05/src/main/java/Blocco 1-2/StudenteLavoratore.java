// StudenteLavoratore è una specializzazione della classe Studente.
public class StudenteLavoratore extends Studente{

    // Inizializza sia i dati dello studente sia quelli della persona.
    public StudenteLavoratore(String nome, int eta, String corsoDiStudio){
        // Richiama il costruttore della superclasse Studente.
        super(nome, eta, corsoDiStudio);
    }

    // Simula la doppia attività dello studente lavoratore.
    public void lavora(){
        // Il campo nome contiene il nome modificato dalla classe Studente.
        System.out.println(nome + " studia e lavora");
    }
    /*
     * Java non permette di estendere due classi contemporaneamente.
     * Per questo StudenteLavoratore estende Studente e specializza
     * il suo comportamento aggiungendo il metodo lavora().
     *
     * È possibile anche utilizzare le interfacce per simulare
     * comportamenti provenienti da più tipi.
     */
}
