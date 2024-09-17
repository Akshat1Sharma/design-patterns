package StructualDesignPattern.CompositeDesignPattern.EmployeeHierarchy.without;

import java.util.*;

public class Manager {

    private String name;

    private List<Employee> employees = new ArrayList<>();
    private List<Manager> subManagers = new ArrayList<>():

    public Manager(String name){
        this.name = name;
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addManager(Manager manager) {
        subManagers.add(manager);
    }


    public int getTotalEmployees() {
        int totalEmployees = employees.size();

        for (Manager manager : subManagers) {
            totalEmployees += manager.getTotalEmployees();
        }

        return totalEmployees;
    }


}
