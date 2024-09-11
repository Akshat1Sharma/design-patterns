package FactoryDesignPattern.VehicleExample;

import FactoryDesignPattern.VehicleExample.ConcreteFactories.TwoWheelerFactory;
import FactoryDesignPattern.VehicleExample.FactoryInterface.VehicleFactory;
import FactoryDesignPattern.VehicleExample.Product.Vehicle;

public class MainMethod {
    public static void main(String[] args) {


        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();

        ClientCode twoWheelerClient = new ClientCode(twoWheelerFactory);

        Vehicle twoWheeler = twoWheelerClient.getVehicle();

        twoWheeler.printVehicle();
    }
}
