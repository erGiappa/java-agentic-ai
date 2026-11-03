

public class Persona {

    protected String nome;
    protected int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void presentati(){
        System.out.println(
                "Ciao, sono " + nome + ", ho " + eta + " anni."
        );
    }
}
