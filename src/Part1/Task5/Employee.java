package Part1.Task5;

public class Employee {
    private String name;
    private Department department;
    // Конструктор та інші методи класу...
    public Department getDepartment() {
        return department;
    }

    public Employee getManager(){
        return department.getManager();
    }
}

