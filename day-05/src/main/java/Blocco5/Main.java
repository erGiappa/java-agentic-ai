package Blocco5;

public class Main {

    public static void testVeicolo(Veicolo v) {
        v.muovi();
    }

    public static void main(String[] args) {

        // 21-22: Creazione oggetti e metodo ereditato
        Auto a = new Auto();
        Bicicletta b = new Bicicletta();

        a.accendiMotore();
        b.accendiMotore();

        // 23: Non possibile!
        // Veicolo v = new Veicolo();

        // 24: Polimorfismo con array
        Veicolo[] garage = {a, b};

        for (Veicolo v : garage) {
            v.muovi();
        }

        // 25: Metodo che accetta Veicolo
        testVeicolo(a);
        testVeicolo(b);
    }
}