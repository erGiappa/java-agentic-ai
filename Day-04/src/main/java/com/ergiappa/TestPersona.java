package main.java.com.ergiappa;

public class TestPersona {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();


        p1.nome = "John";
        p1.eta = 30;


        p2.nome = "Mari";
        p2.eta = 28;

        System.out.println("Prima persona:");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Eta: " + p1.eta);

        System.out.println("Seconda persona:");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Eta: " + p2.eta);
    }
}