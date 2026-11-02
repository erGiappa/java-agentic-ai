public class TestPersona {
    public static void main(String[] args) {

        Persona p1 = new Persona("John", 28);
        Persona p2 = new Persona("Michael", 29);
        Persona p3 = new Persona("John Michael", 30);


        //Login di due persone
        p1.login();
        p2.login();

        //Concatenazione stringhe e valori

        System.out.println(
                p1.getNome() + " è online: " + p1.isOnline()
        );

        System.out.println(
                p2.getNome() + " è online: " + p2.isOnline()
        );

        System.out.println(
                p3.getNome() + " è online: " + p3.isOnline()
        );

    }
}