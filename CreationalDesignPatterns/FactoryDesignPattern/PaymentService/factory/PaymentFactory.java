package FactoryDesignPattern.PaymentService.factory;


import FactoryDesignPattern.PaymentService.product.ConcreteProductA;
import FactoryDesignPattern.PaymentService.product.ConcreteProductB;
import FactoryDesignPattern.PaymentService.product.Product;
public class PaymentFactory {

    public static Product createPayment(String type){

        if(type.equals("googlePay")){
            return new ConcreteProductA();
        }
        
        return new ConcreteProductB();
       
    }
}
