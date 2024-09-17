package StructualDesignPattern.DecoratorDesignPattern.PizzaDeliverySystem;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0; // Adding the cost of mushrooms
    }
}
