

public class Manager extends Lavoratore {

    private double bonus;

    public Manager(double stipendio, double bonus) {
        super(stipendio);
        this.bonus = bonus;
    }
    @Override
    public double getStipendio() {
        return super.getStipendio() + bonus;
    }
}
