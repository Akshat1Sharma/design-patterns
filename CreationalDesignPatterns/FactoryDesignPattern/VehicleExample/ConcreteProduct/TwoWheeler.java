package FactoryDesignPattern.VehicleExample.ConcreteProduct;

import FactoryDesignPattern.VehicleExample.Product.Vehicle;

public class TwoWheeler extends Vehicle{

    @Override
    public void printVehicle() {
        System.out.println("I am two wheeler.");
    }
    
}
