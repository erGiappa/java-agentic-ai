
public class TipiPrimitivi {
    public static void main(String[] args) {

        byte piccolo = 100;
        // Memoria: 1 byte (8 bit) - Intervallo: da -128 a 127

        short numeroBreve = 1000;
        // Memoria: 2 byte (16 bit) - Intervallo: da -32.768 a 32.767

        int intero = 50000;
        // Memoria: 4 byte (32 bit) - Intervallo: da -2^31 a 2^31 - 1

        long grande = 10000000000L;
        // Memoria: 8 byte (64 bit) - Intervallo: da -2^63 a 2^63 - 1

        float decimalePiccolo = 3.14f;
        // Memoria: 4 byte (32 bit) - Precisione: circa 6-7 cifre significative
        // Intervallo: circa ±3.4 × 10^38

        double decimaleGrande = 3.14159265359;
        // Memoria: 8 byte (64 bit) - Precisione: circa 15-16 cifre significative
        // Intervallo: circa ±1.7 × 10^308

        char carattere = 'A';
        // Memoria: 2 byte (16 bit) - Intervallo: da '\u0000' a '\uFFFF'

        boolean vero = true;
        // Valori possibili: true oppure false
        // La dimensione in memoria non è definita ufficialmente dalla JVM

        System.out.println("Il valore di byte è: " + piccolo);
        System.out.println("Il valore di short è: " + numeroBreve);
        System.out.println("Il valore di int è: " + intero);
        System.out.println("Il valore di long è: " + grande);
        System.out.println("Il valore di float è: " + decimalePiccolo);
        System.out.println("Il valore di double è: " + decimaleGrande);
        System.out.println("Il valore di char è: " + carattere);
        System.out.println("Il valore di boolean è: " + vero);
    }
}
