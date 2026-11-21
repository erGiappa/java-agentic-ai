
// Rappresenta una persona che percepisce uno stipendio.
public class Lavoratore {
    // Protected permette alle sottoclassi di accedere direttamente allo stipendio.
    protected double stipendio;

    // Inizializza il lavoratore impostando il suo stipendio.
    public Lavoratore(double stipendio) {
        // this.stipendio indica il campo della classe, stipendio indica il parametro.
        this.stipendio = stipendio;
    }

    // Restituisce lo stipendio del lavoratore.
    public double getStipendio() {
        return stipendio;
    }

    // Simula l'attività lavorativa mostrando un messaggio.
    public void lavora(){
        System.out.println("La persona sta lavorando.");
    }
}
