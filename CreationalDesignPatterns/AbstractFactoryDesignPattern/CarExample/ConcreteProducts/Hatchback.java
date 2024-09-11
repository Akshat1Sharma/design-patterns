package AbstractFactoryDesignPattern.CarExample.ConcreteProducts;

import AbstractFactoryDesignPattern.CarExample.AbstractProducts.Car;

public class Hatchback implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car.");
    }

}

