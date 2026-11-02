public class Persona {

    private String nome;
    private int eta;
    private boolean isOnline;
    private int giornoPreferito;
    private String materiaPreferita;



    //Costruttore
    public Persona(String nome, int eta, int giornoPreferito, String materiaPreferita) {
        this.nome = nome;
        setEta(eta);
        this.giornoPreferito = giornoPreferito;
        this.materiaPreferita = materiaPreferita;
        isOnline = false;
    }

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

    public String descriviMateria() {

        return switch (materiaPreferita.toLowerCase()) {
            case "matematica" -> "Mi piacciono i numeri!";
            case "giapponese" -> "Mi piacciono gli anime!";
            case "informatica" -> "Mi piace programmare!";
            default -> "Non conosco questa materia!";

        };
    }


    public String getNome() {
        return nome;

    }
    public int getEta() {
        return eta;
    }
    public void setEta(int nuovaEta) {
        if (nuovaEta > 0){
            eta = nuovaEta;
        } else {
            System.out.println("Errore");
            eta = 0;
        }
    }

    public void setGiornoPreferito(int giornoPreferito) {
        this.giornoPreferito = giornoPreferito;
    }

    public void setMateriaPreferita(String materiaPreferita) {
        this.materiaPreferita = materiaPreferita;
    }

    //Getter booleano
    public boolean isOnline() {
        return isOnline;
    }

    //Imposta la persona online
    public void login(){
        isOnline = true;
    }

    public void logout(){
        isOnline = false;
    }

}