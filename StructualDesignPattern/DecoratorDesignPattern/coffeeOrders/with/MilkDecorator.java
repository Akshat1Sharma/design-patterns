package StructualDesignPattern.DecoratorDesignPattern.coffeeOrders.with;

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.0; // Adding the cost of milk
    }
}
