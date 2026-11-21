

// Manager è una sottoclasse di Lavoratore.
// Un manager ha uno stipendio base ereditato e un bonus aggiuntivo.
public class Manager extends Lavoratore {

    // Bonus economico esclusivo della classe Manager.
    private double bonus;

    // Inizializza stipendio base e bonus del manager.
    public Manager(double stipendio, double bonus) {
        // Richiama il costruttore della superclasse Lavoratore.
        super(stipendio);
        // this.bonus indica il campo bonus della classe; bonus indica il parametro.
        this.bonus = bonus;
    }

    // Override del metodo getStipendio ereditato da Lavoratore.
    @Override
    public double getStipendio() {
        // getStipendio() della superclasse restituisce lo stipendio base.
        // Il bonus viene aggiunto allo stipendio per ottenere la retribuzione totale.
        return super.getStipendio() + bonus;
    }
}
