
public class TestPersona {
    public static void main(String[] args) {


        Persona p1 = new Persona();
        Persona p2 = new Persona();


        p1.nome = "John";
        p1.eta = 24;


        p2.nome = "Michael";
        p2.eta = 30;


        System.out.println("Prima persona:");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Età: " + p1.eta);


        System.out.println("Seconda persona:");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Età: " + p2.eta);

        p1.saluta();
        p2.saluta();
    }
}
