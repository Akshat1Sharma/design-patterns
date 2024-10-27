package VendingMachine.vendingMachine;

public class Product {

    //why final because one product has it's name and price added to inventory after It cann't change.
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}