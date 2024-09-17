package StructualDesignPattern.CompositeDesignPattern.EmployeeHierarchy.with;

public class MainClass {
    public static void main(String[] args) {
        IndividualEmployee emp1 = new IndividualEmployee("John");
        IndividualEmployee emp2 = new IndividualEmployee("Jane");

        Manager manager1 = new Manager("Manager Mike");
        manager1.addEmployee(emp1);
        manager1.addEmployee(emp2);

        IndividualEmployee emp3 = new IndividualEmployee("Tom");
        Manager manager2 = new Manager("Senior Manager Alice");
        manager2.addEmployee(manager1);  // Adding a manager under another manager
        manager2.addEmployee(emp3);

        System.out.println("Total employees under Alice: " + manager2.getTotalEmployees());
        manager2.showDetails();
    }
}
