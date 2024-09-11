package AbstractFactoryDesignPattern.CarExample.ConcreteProducts;

import AbstractFactoryDesignPattern.CarExample.AbstractProducts.CarSpecification;

public class NorthAmericaSpecification implements CarSpecification {
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}
