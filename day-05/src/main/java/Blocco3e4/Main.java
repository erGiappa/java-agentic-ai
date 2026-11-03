package Blocco3e4;


public class Main {

    public static void main(String[] args) {

        // Creazione degli oggetti
        Employee e1 = new Employee("John", 1500);

        Manager m1 = new Manager("Michael", 2500, 500);

        Director d1 = new Director("John Michael", 4000, 1000, 1500);

        // 16 Sovrascrivere metodi


        System.out.println("ESERCIZIO 16");

        e1.work(); //Employee esegue il proprio work()
        m1.work(); //Manager esegue il proprio work()

        // 17 e 18 Overriding multiplo

        System.out.println("\nESERCIZIO 17 e 18");

        System.out.println("Stipendio Manager: " + m1.getSalary());
        System.out.println("Stipendio director: " + d1.getSalary());

        //19 poliformismo gerarchico

        System.out.println("\nESERCIZIO 19");

        Employee[] staff = {
                e1, m1, d1
        };
        for (Employee e : staff) {
            System.out.println("Nome: " + e.getNome());

            System.out.println("Stipendio: " + e.getSalary());
        }

        //20 metodo aggiuntivo di manager

        System.out.println("\nESERCIZIO 20");

        m1.valutaDipendente();

        Employee emp = new Manager("JMB", 2500, 500);

        if (emp instanceof Manager) {

            Manager manager = (Manager) emp;

            manager.valutaDipendente();
        }


    }
}
