public class Persona {

    //Campi privati
    private String nome;
    private int eta;

    //Costruttore
    public Persona(String nome, int eta) {
        this.nome = nome;

        if (eta > 0){
            this.eta = eta;
        } else {
            this.eta = 0;
        }
    }

    //Getter nome
    public  String getNome() {
        return nome;
    }

    //Getter età
    public int getEta() {
        return eta;
    }

    //Setter nome
    public void setNome(String nuovoNome) {
        nome = nuovoNome;
    }

    //Setter età con validazione
    public void setEta(int nuovaEta) {
        if (nuovaEta > 0) {
            eta = nuovaEta;
            System.out.println("Età modificata correttamente!");
        } else {
            System.out.println("Errore, età deve essere positiva!");
        }
    }

    //Metodo saluta
    public void saluta(){
        System.out.println("Ciao, il mio nome è " + nome);
    }

    //Metodo invecchia
    public void invecchia(){
        eta++;

    }
}