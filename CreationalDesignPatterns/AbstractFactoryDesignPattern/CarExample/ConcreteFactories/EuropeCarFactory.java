package AbstractFactoryDesignPattern.CarExample.ConcreteFactories;

import AbstractFactoryDesignPattern.CarExample.AbstractProducts.Car;
import AbstractFactoryDesignPattern.CarExample.AbstractProducts.CarSpecification;
import AbstractFactoryDesignPattern.CarExample.CarFactory.CarFactory;
import AbstractFactoryDesignPattern.CarExample.ConcreteProducts.EuropeSpecification;
import AbstractFactoryDesignPattern.CarExample.ConcreteProducts.Hatchback;

public class EuropeCarFactory implements CarFactory {
    public Car createCar() {
        return new Hatchback();
    }

    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
