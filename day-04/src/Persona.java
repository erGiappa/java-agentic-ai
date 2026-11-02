
public class Persona {

    public String nome;
    public int eta;


    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;

        saluta();
    }

    public void saluta() {
        System.out.println("Ciao, il mio nome è: " + nome);
    }

    public void invecchia() {
        eta ++;
    }


}

