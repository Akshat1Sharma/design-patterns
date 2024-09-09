package FactoryDesignPattern.VehicleExample.ConcreteFactories;

import FactoryDesignPattern.VehicleExample.ConcreteProduct.FourWheeler;
import FactoryDesignPattern.VehicleExample.FactoryInterface.VehicleFactory;
import FactoryDesignPattern.VehicleExample.Product.Vehicle;

public class FourWheelerFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }

}
