package Blocco3;

public class Manager extends Employee {

    private double bonus;

    public Manager(String nome, double salary, double bonus) {
        super(nome, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
    public void approveExpense(){
        System.out.println(nome + " ha approvato una spesa.");
    }
}
