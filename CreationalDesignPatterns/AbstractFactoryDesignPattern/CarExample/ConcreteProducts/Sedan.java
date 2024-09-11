package AbstractFactoryDesignPattern.CarExample.ConcreteProducts;

import AbstractFactoryDesignPattern.CarExample.AbstractProducts.Car;

public class Sedan implements Car{

    @Override
    public void assemble() {
       System.out.println("Assembling Sedan car.");
    }

}
