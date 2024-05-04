package Part2.Task1;

public class Employee {
    private String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Конструктор та інші методи класу...
    public void raiseSalary(double amount) {
        if (amount > 0) {
            setSalary(getSalary() + amount);
        }
    }
    // Інші методи класу...
}

