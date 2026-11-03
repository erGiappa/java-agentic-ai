package Blocco3e4;

public class Employee {

    protected String nome;
    protected double salary;

    public Employee(String nome, double salary) {
        this.nome = nome;
        this.salary = salary;
    }
    public String getNome() {
        return nome;
    }
    public double getSalary() {
        return salary;
    }
    public void work(){
        System.out.println(nome + " sta lavorando.");
    }
}
