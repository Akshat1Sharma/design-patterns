package FactoryDesignPattern.PaymentService;



import FactoryDesignPattern.PaymentService.factory.PaymentFactory;
import FactoryDesignPattern.PaymentService.product.Product;

public class Client {
public static void main(String[] args) {
    

    String paymentType = "googlePay"; //googlePay  phonePay

    Product paymentGateway = PaymentFactory.createPayment(paymentType);

    paymentGateway.processPayment();
}
}
