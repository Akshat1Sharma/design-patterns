package Builderdesignpattern.CarProduction.builders;

import Builderdesignpattern.CarProduction.cars.CarType;
import Builderdesignpattern.CarProduction.components.Engine;
import Builderdesignpattern.CarProduction.components.GPSNavigator;
import Builderdesignpattern.CarProduction.components.Transmission;
import Builderdesignpattern.CarProduction.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
