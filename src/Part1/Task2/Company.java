package Part1.Task2;

import java.util.List;

public class Company {
    private List<Employee> employees;
    // Конструктор та інші методи класу...
    public void printEmployeeSalaries() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }
}

