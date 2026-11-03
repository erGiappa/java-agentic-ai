public class StudenteLavoratore extends Studente{

    public StudenteLavoratore(String nome, int eta, String corsoDiStudio){
        super(nome, eta, corsoDiStudio);
    }
    public void lavora(){
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
