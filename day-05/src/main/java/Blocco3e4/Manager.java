package Blocco3e4;

public class Manager extends Employee {

    protected double bonus;

    public Manager(String nome, double salary, double bonus) {
        super(nome, salary);
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println(nome + " sta gestendo il personale.");
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
    public void approveExpense(){
        System.out.println(nome + " ha approvato una spesa.");
    }
    public void valutaDipendente(){
        System.out.println(nome + " sta valutando un dipendente");
    }
}
