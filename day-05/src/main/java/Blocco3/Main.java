package Blocco3;


public class Main {

    public static void main(String[] args) {

        // Creazione degli oggetti
        Employee e1 = new Employee("John", 1500);

        Manager m1 = new Manager("Michael", 2500, 500);

        // 11. Variabili di tipo superclasse


        Employee emp = new Manager("John Michael", 3000, 700);

        // Anche se emp è di tipo Employee,
        // viene eseguito getSalary() di Manager.
        // Questo accade perché l'oggetto reale è Manager.

        System.out.println("ESERCIZIO 11");

        System.out.println("Stipendio: " + emp.getSalary());

        // Risultato: 3700


        // 12. Array polimorfico


        System.out.println("\nESERCIZIO 12");

        Employee[] staff = {
                e1,
                m1,
                new Employee("JMB", 1800),
                new Manager("Baticos", 2800, 600)
        };

        // Ciclo attraverso tutti i dipendenti
        for (Employee e : staff) {

            System.out.println("Nome: " + e.getNome());

            // Il metodo corretto viene scelto
            // in base al tipo reale dell'oggetto.
            System.out.println("Stipendio: " + e.getSalary());

            System.out.println("-------------------");
        }

        // 13. Metodo che accetta la superclasse

        System.out.println("\nESERCIZIO 13");

        Ufficio ufficio = new Ufficio();

        // Passiamo un Employee
        ufficio.stampaSalario(e1);

        // Passiamo un Manager
        ufficio.stampaSalario(m1);

        // 14. Assegnazione polimorfica

        System.out.println("\nESERCIZIO 14");

        Employee dipendente = new Manager("Sara", 3200, 800);

        System.out.println("Stipendio: " + dipendente.getSalary());

        // ERRORE:
        // dipendente.approveExpense();

        // Non possiamo chiamare approveExpense()
        // perché il riferimento è di tipo Employee.
        // Employee non conosce questo metodo.


        // 15. Downcasting con instanceof

        System.out.println("\nESERCIZIO 15");

        if (dipendente instanceof Manager) {

            // Convertiamo Employee in Manager
            Manager manager = (Manager) dipendente;

            // Ora possiamo chiamare il metodo specifico
            manager.approveExpense();

        } else {

            System.out.println("Il dipendente non è un Manager.");
        }
    }
}
