public class AirlinerConcreteBuilder extends AirplaneBuilder {
    
    AirlinerConcreteBuilder(String customer) {
        super.customer = customer;
        super.type = "787 Dreamliner";
    }

    public void buildWings() {
        airplane.setWingspan(197f);
    }

    public void buildPowerplant() {
        airplane.setPowerplant("dual turbofan");
    }

    public void buildAvionics() {
        airplane.setAvionics("commercial");
    }

    public void buildSeats() {
        airplane.setNumberSeats(8, 289);
    }

}
