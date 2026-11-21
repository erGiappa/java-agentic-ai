

// Classe principale utilizzata per avviare il programma.
public class Main {
    // Punto di ingresso dell'applicazione Java.
    public static void main(String[] args) {

        System.out.println("****Creazione studente****");

        //Creazione Studente
        Studente s1 = new Studente("John", 30, "Informatica");

        System.out.println("****Presentazione****");
        // Richiama il metodo presentati(), incluso il comportamento dello studente.
        s1.presentati();

        System.out.println("****Studio****");

        // Richiama il metodo studia() sovrascritto da Studente.
        s1.studia();

        System.out.println("****Mostra dati****");
        // Mostra i diversi campi nome della classe Persona e della classe Studente.
        s1.mostraDati();

        System.out.println("****Manager****");
        // Crea un manager con stipendio base 2000 e bonus 500.
        Manager m1 = new Manager(2000, 500);

        // getStipendio() restituisce stipendio base più bonus.
        System.out.println( "Stipendio totale: " + m1.getStipendio() + " euro");

    }
}