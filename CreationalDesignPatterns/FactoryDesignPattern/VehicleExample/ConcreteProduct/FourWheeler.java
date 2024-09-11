package FactoryDesignPattern.VehicleExample.ConcreteProduct;

import FactoryDesignPattern.VehicleExample.Product.Vehicle;

public class FourWheeler extends Vehicle{

    @Override
    public void printVehicle(){
        System.out.println("I am Four wheeler.");
    }
}
