package AbstractFactoryDesignPattern.CarExample.CarFactory;

import AbstractFactoryDesignPattern.CarExample.AbstractProducts.Car;
import AbstractFactoryDesignPattern.CarExample.AbstractProducts.CarSpecification;

public interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
