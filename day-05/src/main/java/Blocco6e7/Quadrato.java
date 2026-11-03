package Blocco6e7;

public class Quadrato extends Rettangolo{

    public Quadrato(double lato, String color) {

        super(lato, lato, color);
    }
    @Override
    public void descrivi() {
        System.out.println("Sono un quadrato di colore " + getColor());
    }
    @Override
    public double area() {
        double risultato = super.area();

        System.out.println("Calcolo area tramite Rettangolo: " + risultato);

        return risultato;
    }
}
