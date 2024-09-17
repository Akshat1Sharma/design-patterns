package StructualDesignPattern.DecoratorDesignPattern.coffeeOrders.with;

public class CoffeeShopMain {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: " + simpleCoffee.cost());

        // Adding milk to the coffee
        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of coffee with milk: " + coffeeWithMilk.cost());

        // Adding sugar to the coffee with milk
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println("Cost of coffee with milk and sugar: " + coffeeWithMilkAndSugar.cost());
    }
}
