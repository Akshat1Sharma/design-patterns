public class CropDusterConcreteBuilder extends AirplaneBuilder {

    CropDusterConcreteBuilder(String customer) {
        super.customer = customer;
        super.type = "Crop Duster v3.4";
    }

    public void buildWings() {
        airplane.setWingspan(9f);
    }

    public void buildPowerplant() {
        airplane.setPowerplant("single piston");
    }

    public void buildAvionics() {
    }

    public void buildSeats() {
        airplane.setNumberSeats(1, 1);
    }

}
