package Part5.Task7;

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }
}
