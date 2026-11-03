
public class Lavoratore {
    protected double stipendio;

    public Lavoratore(double stipendio) {
        this.stipendio = stipendio;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void lavora(){
        System.out.println("La persona sta lavorando.");
    }
}
