/**
 * Esempio di utilizzo del metodo main() e di un secondo
 * metodo static definito all'interno della stessa classe.
 */

//punto di ingresso del programma
public class MetodoMain {

    public static void main(String[] args) {
        System.out.println("Esecuzione avviata");

        // Richiamo diretto di un altro metodo static.
        // Non è necessario creare un oggetto MetodoMain.
        inizia();
    }

    /*
     * Un metodo static appartiene alla classe e può essere
     * richiamato senza creare un'istanza della classe stessa.
     *
     * In questo esempio il metodo viene richiamato
     * direttamente dal main(), che è anch'esso static.
     */
    public static void inizia() {
        System.out.println("Il metodo inizia() è stato eseguito!");
    }
}
