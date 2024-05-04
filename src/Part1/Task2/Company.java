package Part1.Task2;

import java.util.Set;
import java.util.HashMap;

public class Company {
    private HashMap<Employee, Double> employeeSalaries;

    public Set<Employee> getEmployees() {
        return employeeSalaries.keySet();
    }

    public double getSalaryByEmployee(Employee employee) {
        return employeeSalaries.get(employee);
    }

    public void printEmployeeSalaries() {
        for (Employee employee : employeeSalaries.keySet()) {
            System.out.println(employee.getName() + ": " + employeeSalaries.get(employee));
        }
    }

    // Конструктор та інші методи класу...
}

