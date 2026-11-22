package Blocco3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner permette di leggere dati digitati dall'utente dalla console.
        Scanner scanner = new Scanner(System.in);

        // 1. ArrayList crea una lista modificabile in cui vengono salvati i nomi.
        List<String> nomi = new ArrayList<>();
        String nome;

        System.out.println("Inserisci dei nomi (stop per terminare):");

        // Il ciclo do-while esegue almeno una lettura e si ripete finché l'utente non scrive "stop".
        do {
            nome = scanner.nextLine();

            // equalsIgnoreCase considera uguali le parole indipendentemente da maiuscole e minuscole.
            // Quando il valore non è "stop", il nome inserito viene aggiunto alla fine della lista.
            if (!nome.equalsIgnoreCase("stop")) {
                nomi.add(nome);
            }
        } while (!nome.equalsIgnoreCase("stop"));

        System.out.println("Nomi inseriti:");

        // for-each legge e mostra in sequenza tutti gli elementi presenti nella lista.
        for (String n : nomi){
            System.out.println(n);
        }

        System.out.println("-----------------------------------------");

        // 2. Lista usata per memorizzare i numeri inseriti dall'utente.
        List<Integer> numeri = new ArrayList<>();

        int numero;
        int somma = 0;

        // Il ciclo continua fino a quando viene inserito il numero 0.
        do{
            System.out.println("Inserisci dei numeri (0 per terminare):");

            // nextInt legge un numero intero inserito nella console.
            numero = scanner.nextInt();

            if (numero != 0) {
                numeri.add(numero);
                // somma viene aggiornato aggiungendo il numero appena inserito.
                somma += numero;
            }
        } while (numero != 0);

        // isEmpty verifica che sia stato inserito almeno un numero prima di calcolare la media.
        if (!numeri.isEmpty()) {
            // La conversione in double evita che la divisione venga arrotondata a un intero.
            double media = (double) somma / numeri.size();

            System.out.println("La media è: " + media);
        } else {
            System.out.println("Non hai inserito numeri.");
        }

        System.out.println("-----------------------------------------");

        // 3. Una ArrayList permette di contenere elementi duplicati.
        List<String> duplicati = new ArrayList<>();

        duplicati.add("Anna");
        duplicati.add("Luca");
        duplicati.add("Anna");
        duplicati.add("Marco");

        System.out.println("Lista con duplicati: " + duplicati);

        System.out.println("-----------------------------------------");

        // Consuma il carattere di nuova riga rimasto dopo la precedente lettura con nextInt.
        // Senza questa chiamata, la prossima lettura con nextLine potrebbe ricevere una riga vuota.
        scanner.nextLine();

        // 4. Lettura del nome da cercare nella lista dei nomi.
        System.out.println("Inserisci un nome da cercare:");
        String ricerca = scanner.nextLine();

        // contains verifica se il nome cercato è presente almeno una volta.
        if (nomi.contains(ricerca)) {
            System.out.println("Nome presente!");
            // indexOf restituisce l'indice della prima occorrenza del nome.
            System.out.println("Indice: " + nomi.indexOf(ricerca));
        } else {
            System.out.println("Nome non presente!");
        }

        System.out.println("-----------------------------------------");

        // 5. Creazione di un array contenente tre elementi String.
        String[] frutti = {"Mela", "Banana", "Pera"};

        // Arrays.asList converte l'array in una vista a forma di lista.
        // Il costruttore di ArrayList crea una copia modificabile di quella vista.
        List<String> listaFrutti =
                new ArrayList<>(Arrays.asList(frutti));

        System.out.println("Lista dei frutti: " + listaFrutti);

        // Chiude lo Scanner e libera le risorse associate.
        scanner.close();

    }
}
