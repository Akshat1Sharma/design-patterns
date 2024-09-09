public class Client {

    public static void main(String[] args) {
        // instantiate the director (hire the engineer)
        AerospaceEngineerDirector aero = new AerospaceEngineerDirector();
        // instantiate each concrete builder (take orders)
        AirplaneBuilder crop = new CropDusterConcreteBuilder("Farmer Joe");
        AirplaneBuilder fighter = new FighterJetConcreteBuilder("The Navy");
        AirplaneBuilder glider = new GliderConcreteBuilder("Tim Rice");
        AirplaneBuilder airliner = new AirlinerConcreteBuilder("United Airlines");
        // build a CropDuster
        aero.setAirplaneBuilder(crop);
        aero.constructAirplane();
        AirplaneProduct completedCropDuster = aero.getAirplane();
        System.out.println(completedCropDuster.getType() +
                " is completed and ready for delivery to " +
                completedCropDuster.getCustomer());
        // the other 3 builds removed to fit the code on one slide
    }

}
