package ParkingLotSystem.parkingLotSystem;

import ParkingLotSystem.parkingLotSystem.vehicletype.Car;
import ParkingLotSystem.parkingLotSystem.vehicletype.Motorcycle;
import ParkingLotSystem.parkingLotSystem.vehicletype.Truck;
import ParkingLotSystem.parkingLotSystem.vehicletype.Vehicle;

public class ParkingLotDataDump {

    public static void run() {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 100));
        parkingLot.addLevel(new Level(2, 80));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle motorcycle = new Motorcycle("M1234");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display availability
        parkingLot.displayAvailability();

        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailability();
    }
}