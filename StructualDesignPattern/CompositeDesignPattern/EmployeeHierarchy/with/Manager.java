package StructualDesignPattern.CompositeDesignPattern.EmployeeHierarchy.with;

import java.util.*;
public class Manager implements EmployeeComponent {
    private String name;
    private List<EmployeeComponent> employees = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    public void addEmployee(EmployeeComponent employee) {
        employees.add(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        for (EmployeeComponent employee : employees) {
            employee.showDetails();
        }
    }

    @Override
    public int getTotalEmployees() {
        int total = 0;
        for (EmployeeComponent employee : employees) {
            total += employee.getTotalEmployees();
        }
        return total;
    }
}
