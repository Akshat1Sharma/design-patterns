package StructualDesignPattern.DecoratorDesignPattern.coffeeOrders.without;

public class CoffeeWithMilk extends SimpleCoffee {
    @Override
    public double cost(){

        return super.cost() + 1.0;
    }
}
