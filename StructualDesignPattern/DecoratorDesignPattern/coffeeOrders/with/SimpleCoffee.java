package StructualDesignPattern.DecoratorDesignPattern.coffeeOrders.with;

public class SimpleCoffee implements Coffee{

    @Override
    public double cost() {
        return 5.0; // Base price of coffee
    }
}
