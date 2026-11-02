public class Persona {

    private String nome;
    private int eta;
    private boolean isOnline;


    //Costruttore
    public Persona(String nome, int eta) {
        this.nome = nome;

        setEta(eta);

        isOnline = false;
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