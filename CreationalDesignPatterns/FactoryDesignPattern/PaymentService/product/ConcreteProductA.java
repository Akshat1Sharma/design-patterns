package FactoryDesignPattern.PaymentService.product;

public class ConcreteProductA implements Product{

    @Override
    public void processPayment() {
       System.out.println("Google Pay Payment processing.....");
    }

}
