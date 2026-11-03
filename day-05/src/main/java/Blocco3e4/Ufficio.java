package Blocco3e4;


public class Ufficio {

    public void stampaSalario(Employee e) {

        System.out.println("Dipendente: " + e.getNome());

        // Viene eseguito getSalary() in base
        // alla classe reale dell'oggetto.
        System.out.println("Stipendio: " + e.getSalary());

        System.out.println("-------------------");
    }
}
