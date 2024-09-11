package Builderdesignpattern.CarProduction;

import Builderdesignpattern.CarProduction.builders.CarBuilder;
import Builderdesignpattern.CarProduction.builders.CarManualBuilder;
import Builderdesignpattern.CarProduction.cars.Car;
import Builderdesignpattern.CarProduction.cars.Manual;
import Builderdesignpattern.CarProduction.director.Director;

public class ClientCode {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
