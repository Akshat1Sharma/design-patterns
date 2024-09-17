package StructualDesignPattern.CompositeDesignPattern.EmployeeHierarchy.with;

public class IndividualEmployee implements EmployeeComponent {
    private String name;

    public IndividualEmployee(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name);
    }

    @Override
    public int getTotalEmployees() {
        return 1; // Individual employee, always counts as 1
    }
}