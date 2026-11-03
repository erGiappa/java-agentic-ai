package Blocco6e7;

public class Rettangolo extends Shape {

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza, String color) {
        super(color);
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double area() {
        return base * altezza;
    }
    @Override
    public void descrivi() {
        System.out.println("Sono un rettangolo di colore "
        + color + ", con base " + base
        + " e altezza " + altezza);
    }
}

