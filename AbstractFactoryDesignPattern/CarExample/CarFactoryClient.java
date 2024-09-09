package AbstractFactoryDesignPattern.CarExample;

import AbstractFactoryDesignPattern.CarExample.AbstractProducts.Car;
import AbstractFactoryDesignPattern.CarExample.AbstractProducts.CarSpecification;
import AbstractFactoryDesignPattern.CarExample.CarFactory.CarFactory;
import AbstractFactoryDesignPattern.CarExample.ConcreteFactories.*;

public class CarFactoryClient {
     public static void main(String[] args) {
        // Creating cars for North America
        CarFactory northAmericaFactory = new NorthAmericanCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        // Creating cars for Europe
        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
