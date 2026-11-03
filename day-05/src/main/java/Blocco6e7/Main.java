package Blocco6e7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> figure = new ArrayList<>();

                figure.add(new Cerchio(5, "Rosso"));
                figure.add(new Rettangolo(4, 6, "Blu"));
                figure.add(new Triangolo(10, 5, "Arancione"));
                figure.add(new Quadrato(5, "Viola"));

                for (Shape s : figure) {
                    s.descrivi();
                    System.out.println();
                }

    }
}


