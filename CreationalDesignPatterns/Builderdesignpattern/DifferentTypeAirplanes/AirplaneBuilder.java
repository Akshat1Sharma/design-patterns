public abstract class AirplaneBuilder {

    protected AirplaneProduct airplane;
    protected String customer;
    protected String type;

    public AirplaneProduct getAirplane() {
        return airplane;
    }

    public void createNewAirplane() {
        airplane = new AirplaneProduct(customer, type);
    }

    public abstract void buildWings();

    public abstract void buildPowerplant();

    public abstract void buildAvionics();

    public abstract void buildSeats();
}
