package AbstractFactoryDesignPattern.CarExample.ConcreteFactories;

import AbstractFactoryDesignPattern.CarExample.AbstractProducts.Car;
import AbstractFactoryDesignPattern.CarExample.AbstractProducts.CarSpecification;
import AbstractFactoryDesignPattern.CarExample.CarFactory.CarFactory;
import AbstractFactoryDesignPattern.CarExample.ConcreteProducts.NorthAmericaSpecification;
import AbstractFactoryDesignPattern.CarExample.ConcreteProducts.Sedan;

public class NorthAmericanCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
       return new NorthAmericaSpecification();
    }
    

}
