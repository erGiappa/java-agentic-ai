package Blocco6e7;

public class Triangolo extends Shape {

    private double base;
    private double altezza;

    public Triangolo(double base, double altezza, String color) {
        super(color);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double area() {
        return (base * altezza) / 2;
    }

    @Override
    public void descrivi() {
        System.out.println("Sono un triangolo di colore " + color
                + ", con base " + base
                + " e altezza " + altezza);
    }
}
