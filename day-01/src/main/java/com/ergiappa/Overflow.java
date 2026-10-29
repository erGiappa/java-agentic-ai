
public class Overflow {
    public static void main(String[] args) {

        byte b = 127;
        // Il tipo byte occupa 1 byte e può contenere valori da -128 a 127.
        System.out.println("Valore iniziale di b: " + b);

        b = (byte)(b + 1);
        // Si aggiunge 1 a 127, superando il valore massimo del byte.
        // Questo fenomeno si chiama overflow.
        // Il risultato torna al valore minimo rappresentabile: -128.
        System.out.println("Valore di b dopo l'incremento: " + b);
    }
}
