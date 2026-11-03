package Blocco3e4;

public class Director extends  Manager {

    private double bonusDirettore;

    public Director(String nome, double salary, double bonus, double bonusDirettore) {

        super(nome, salary, bonus);

        this.bonusDirettore = bonusDirettore;
    }

    @Override
    public double getSalary() {

        double stipendioManager = super.getSalary();
        return stipendioManager + bonusDirettore;
    }
    @Override
    public void work(){
        System.out.println(nome + " sta dirigendo l'azienda");
    }
}
