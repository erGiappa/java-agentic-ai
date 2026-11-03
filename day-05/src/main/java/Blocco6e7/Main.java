package Blocco6e7;

public class Main {

    public static void stampaAree(Shape[] figure){

        for (Shape s : figure){

            System.out.println("Area: " + s.area());
            System.out.println("Colore: " + s.getColor());

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Shape[] figure = {
                new Cerchio(5, "Rosso"),
                new Rettangolo(4, 6, "Blu"),
                new Cerchio(3, "Verde"),
                new Rettangolo(8, 2, "Giallo"),
                new Triangolo(10, 5, "Arancione")
        };

        stampaAree(figure);

    }
}
