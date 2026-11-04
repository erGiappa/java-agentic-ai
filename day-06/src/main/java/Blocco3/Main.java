package Blocco3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Inserimento dei nomi
        List<String> nomi = new ArrayList<>();
        String nome;

        System.out.println("Inserisci dei nomi (stop per terminare):");

        do {
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("stop")) {
                nomi.add(nome);
            }
        } while (!nome.equalsIgnoreCase("stop"));

        System.out.println("Nomi inseriti:");

        for (String n : nomi){
            System.out.println(n);
        }

        System.out.println("-----------------------------------------");

        //2. Media numeri
        List<Integer> numeri = new ArrayList<>();

        int numero;
        int somma = 0;

        do{
            System.out.println("Inserisci dei numeri (0 per terminare):");

            numero = scanner.nextInt();

            if (numero != 0) {
                numeri.add(numero);
                somma += numero;
            }
        } while (numero != 0);

        if (!numeri.isEmpty()) {
            double media = (double) somma / numeri.size();

            System.out.println("La media è: " + media);
        } else {
            System.out.println("Non hai inserito numeri.");
        }

        System.out.println("-----------------------------------------");

        // 3. Duplicati ammessi
        List<String> duplicati = new ArrayList<>();

        duplicati.add("Anna");
        duplicati.add("Luca");
        duplicati.add("Anna");
        duplicati.add("Marco");

        System.out.println("Lista con duplicati: " + duplicati);

        System.out.println("-----------------------------------------");

        scanner.nextLine();

        // 4. Ricerca di un elemento
        System.out.println("Inserisci un nome da cercare:");
        String ricerca = scanner.nextLine();

        if (nomi.contains(ricerca)) {
            System.out.println("Nome presente!");
            System.out.println("Indice: " + nomi.indexOf(ricerca));
        } else {
            System.out.println("Nome non presente!");
        }

        System.out.println("-----------------------------------------");

        // 5. Conversione array in lista
        String[] frutti = {"Mela", "Banana", "Pera"};

        List<String> listaFrutti =
                new ArrayList<>(Arrays.asList(frutti));

        System.out.println("Lista dei frutti: " + listaFrutti);

        scanner.close();

    }
}
