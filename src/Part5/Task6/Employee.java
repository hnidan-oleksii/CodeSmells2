package Part5.Task6;

class Employee {
    protected String name;
    protected String id;
    protected double baseSalary;

    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    public double calculateSalary() {
        return baseSalary;
    }
}
