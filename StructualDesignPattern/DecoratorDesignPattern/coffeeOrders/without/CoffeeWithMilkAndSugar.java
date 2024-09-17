package StructualDesignPattern.DecoratorDesignPattern.coffeeOrders.without;

public class CoffeeWithMilkAndSugar extends CoffeeWithMilk {
    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
