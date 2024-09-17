package StructualDesignPattern.DecoratorDesignPattern.PizzaDeliverySystem;

public class PizzaShopCLient {
    public static void main(String[] args) {
        // Start with a plain pizza
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add cheese to the pizza
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add pepperoni to the pizza
        pizza = new PepperoniDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add mushrooms to the pizza
        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());
    }
}
