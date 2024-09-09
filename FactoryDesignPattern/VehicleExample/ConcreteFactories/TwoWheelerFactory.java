package FactoryDesignPattern.VehicleExample.ConcreteFactories;

import FactoryDesignPattern.VehicleExample.ConcreteProduct.TwoWheeler;
import FactoryDesignPattern.VehicleExample.FactoryInterface.VehicleFactory;
import FactoryDesignPattern.VehicleExample.Product.Vehicle;

public class TwoWheelerFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
       return new TwoWheeler();
    }
    

}
