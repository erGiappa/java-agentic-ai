package Blocco6e7;

public class Cerchio extends Shape{

    private double raggio;

    public Cerchio(double raggio, String color) {
        super(color);
        this.raggio = raggio;
    }
    @Override
    public double area() {
        return Math.PI * raggio * raggio;
    }
    @Override
        public void descrivi() {
            System.out.println("Sono un cerchio di colore " + color
                    + ", con raggio " + raggio);
        }
}
