public class Studente extends Persona {

    private String corsoDiStudio;

    public Studente(String nome, int eta, String corsoDiStudio){
        super(nome, eta);
        this.corsoDiStudio = corsoDiStudio;
    }

    public void studia(){
        System.out.println(nome + " sta studiando " + corsoDiStudio);
    }

    public void mostraDati(){
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }

}
