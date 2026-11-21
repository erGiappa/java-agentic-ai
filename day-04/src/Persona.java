// La classe Persona.java rappresenta una persona con un nome, un'età e alcune preferenze.

public class Persona {

    // Gli attributi sono private, quindi sono accessibili dall'esterno solo tramite metodi getter e setter.

    private String nome;
    private int eta;
    private boolean isOnline;
    private int giornoPreferito;
    private String materiaPreferita;

    //Costruttore
    public Persona(String nome, int eta, int giornoPreferito, String materiaPreferita) {
        //this.nome indica l'attributo della classe; nome indica il parametro del costruttore. 
        this.nome = nome;
        setEta(eta);
        this.giornoPreferito = giornoPreferito;
        this.materiaPreferita = materiaPreferita;
        isOnline = false;
    }

    //switch expression: l'operatore -> restituisce direttamente il valore corrispondente.
    public String getNomeGiorno() {
        return switch (giornoPreferito) {
            case 1 -> "Lunedì: si ricomincia!";
            case 2 -> "Martedì: la settimana continua!";
            case 3 -> "Mercoledì: siamo a metà settimana!";
            case 4 -> "Giovedì: manca poco al weekend!";
            case 5 -> "Venerdì: finalmente weekend!";
            case 6 -> "Sabato: relax e divertimento!";
            case 7 -> "Domenica: giornata di riposo!";
            default -> "Giorno non valido!";
        };
    }

    //Il metodo descriviMateria() confronta la materia ignorando maiuscole e minuscole grazie a toLowerCase()
    public String descriviMateria() {
        return switch (materiaPreferita.toLowerCase()) {
            case "matematica" -> "Mi piacciono i numeri!";
            case "giapponese" -> "Mi piacciono gli anime!";
            case "informatica" -> "Mi piace programmare!";
            default -> "Non conosco questa materia!";
        };
    }

    //I getter restituiscono i valori degli attributi:

    public String getNome() {
        return nome;

    }
    public int getEta() {
        return eta;
    }

    //Il metodo setEta() verifica che l'età sia positiva
    public void setEta(int nuovaEta) {
        if (nuovaEta > 0){
            eta = nuovaEta;
        } else {
            System.out.println("Errore");
            eta = 0;
        }
    }

    //Il metodo setEta() verifica che l'età sia positiva
    public void setGiornoPreferito(int giornoPreferito) {
        this.giornoPreferito = giornoPreferito;
    }

    public void setMateriaPreferita(String materiaPreferita) {
        this.materiaPreferita = materiaPreferita;
    }

    //Il metodo presentati() stampa nome, età e stato online
    public void presentati(){
        System.out.println("Mi chiamo " +  nome);
        System.out.println("Ho " +  eta + " anni");
        System.out.println("Sono online: " +  isOnline);
    }
    //Getter booleano
    public boolean isOnline() {
        return isOnline;
    }
    //Il metodo isAdult() restituisce true quando l'età è almeno 18
    public boolean isAdult(){
        return eta >= 18;
    }

    //Imposta la persona online
    public void login(){
        isOnline = true;
    }

    public void logout(){
        isOnline = false;
    }

}