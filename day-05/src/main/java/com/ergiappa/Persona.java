

public class Persona {

    protected String nome;
    protected int eta;

    public Persona(String nome, int eta) {

        //Messaggio quando viene creato una persona
        System.out.println("Costruttore persona eseguito");

        this.nome = nome;
        this.eta = eta;
    }

    public void presentati(){
        System.out.println(
                "Ciao, sono " + nome + ", ho " + eta + " anni."
        );
    }
    public void studia(){
        System.out.println("Sta studiando");
    }
}
