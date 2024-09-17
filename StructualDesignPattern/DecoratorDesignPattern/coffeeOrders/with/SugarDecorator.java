package StructualDesignPattern.DecoratorDesignPattern.coffeeOrders.with;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // Adding the cost of sugar
    }
}