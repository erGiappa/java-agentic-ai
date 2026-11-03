

public class Main {
    public static void main(String[] args) {

        System.out.println("****Creazione studente****");

        //Creazione Studente
        Studente s1 = new Studente("John", 30, "Informatica");

        System.out.println("****Presentazione****");
        s1.presentati();

        System.out.println("****Studio****");

        s1.studia();

        System.out.println("****Mostra dati****");
        s1.mostraDati();

        System.out.println("****Manager****");
        Manager m1 = new Manager(2000, 500);

        System.out.println( "Stipendio totale: " + m1.getStipendio() + " euro");

    }
}