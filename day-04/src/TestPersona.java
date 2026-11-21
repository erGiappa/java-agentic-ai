//La classe TestPersona.java contiene il metodo main() e serve per creare una persona e 
//interagire con essa tramite tastiera.

//Scanner permette di leggere dati inseriti dall'utente nella console.
import java.util.Scanner;

//È il punto iniziale del programma. Il codice in esso contenuto viene eseguito all'avvio.
public class TestPersona {

    public static void main(String[] args) {

        //Crea uno Scanner collegato al terminale. System.in rappresenta l'input standard.
        Scanner scanner = new Scanner(System.in);

        //Creazione della persona
        Persona p1 = new Persona("John", 30, 6, "Informatica");

        //Viene chiesto all'utente di inserire un numero. 
        System.out.println("Inserisci un giorno della settimana (1-7):");
        //nextInt() legge l'intero digitato e lo memorizza nella variabile giorno.
        int giorno = scanner.nextInt();

        //Il giorno inserito viene salvato nell'oggetto p1, modificando il relativo attributo privato.
        p1.setGiornoPreferito(giorno);

        //Dopo nextInt(), il carattere di fine riga inserito premendo Invio rimane nel buffer di Scanner.
        //nextLine() consuma quel carattere, permettendo la successiva lettura della risposta testuale.
        scanner.nextLine();

        System.out.println("Vuoi essere online? (si/no)");
        String risposta = scanner.nextLine();

        if (risposta.equalsIgnoreCase("si")) {
            p1.login();
        } else {
            p1.logout();
        }

        //Lo switch esamina il numero letto dall'utente e seleziona il blocco corrispondente. 
        switch (giorno){
            case 1:
                if (p1.isOnline()){
                    System.out.println("Lunedì: sei online e pronto a iniziare");
                } else {
                    System.out.println("Lunedi: al momento sei offline");
                }
                break;
            case 2:
                if (p1.isOnline()){
                    System.out.println("Martedì: sei online e pronto a iniziare");
                } else {
                    System.out.println("Martedì: al momento sei offline");
                }
                break;
            case 3:
                if (p1.isOnline()){
                    System.out.println("Mercoledì: sei online e pronto a iniziare");
                } else {
                    System.out.println("Mercoledì: al momento sei offline");
                }
                break;
            case 4:
                if (p1.isOnline()){
                    System.out.println("Giovedì: sei online e pronto a iniziare");
                } else {
                    System.out.println("Giovedì: al momento sei offline");
                }
                break;
            case 5:
                if (p1.isOnline()){
                    System.out.println("Venerdì: sei online e pronto a iniziare");
                } else {
                    System.out.println("Venerdì: al momento sei offline");
                }
                break;
            case 6:
                if (p1.isOnline()){
                    System.out.println("Sabato: sei online e pronto a iniziare");
                } else {
                    System.out.println("Sabato: al momento sei offline");
                }
                break;
            case 7:
                if (p1.isOnline()){
                    System.out.println("Domenica: sei online e pronto a iniziare");
                } else {
                    System.out.println("Domenica: al momento sei offline");
                }
                break;
            default:
                System.out.println("Giorno non valido!");
                break;
        }


        scanner.close();
    }
}

