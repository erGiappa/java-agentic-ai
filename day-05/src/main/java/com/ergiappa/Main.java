

public class Main {
    public static void main(String[] args) {

        //Creazione Studente
        Studente s1 = new Studente("John", 30, "Informatica");

        //Chiamata dei metodi eriditati e propri
        s1.presentati();
        s1.studia();

        s1.mostraDati();

        StudenteLavoratore sl1 =
                new StudenteLavoratore("Michael", 24, "Ingegneria");

        sl1.presentati();
        sl1.studia();
        sl1.lavora();

    }
}