package FactoryDesignPattern.PaymentService.product;

public class ConcreteProductB implements Product{

    @Override
    public void processPayment() {
        System.out.println("PhonePay Processing payment......");
    }

}
