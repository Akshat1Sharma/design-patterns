package FactoryDesignPattern.VehicleExample;

import FactoryDesignPattern.VehicleExample.FactoryInterface.VehicleFactory;
import FactoryDesignPattern.VehicleExample.Product.Vehicle;

public class ClientCode {
    private Vehicle pVehicle;

    public ClientCode( VehicleFactory factory){

        pVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle(){
        return pVehicle;
    }
}
