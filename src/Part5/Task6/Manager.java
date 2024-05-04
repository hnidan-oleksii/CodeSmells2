package Part5.Task6;

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    public void motivateTeam() {
        System.out.println(name + " is motivating his team");
    }
}
