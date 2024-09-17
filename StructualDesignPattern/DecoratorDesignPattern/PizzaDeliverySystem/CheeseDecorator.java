package StructualDesignPattern.DecoratorDesignPattern.PizzaDeliverySystem;

class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5; // Adding the cost of cheese
    }
}
