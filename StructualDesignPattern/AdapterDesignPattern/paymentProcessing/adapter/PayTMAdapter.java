package StructualDesignPattern.AdapterDesignPattern.paymentProcessing.adapter;

import StructualDesignPattern.AdapterDesignPattern.paymentProcessing.adaptee.PayTM;
import StructualDesignPattern.AdapterDesignPattern.paymentProcessing.targetInterface.UPIGateway;

public class PayTMAdapter implements UPIGateway{
    private PayTM payTM;

    public PayTMAdapter(PayTM payTM) {
        this.payTM = payTM;
    }

    @Override
    public void processPayment(double amount) {
        payTM.pay(amount);
    }
}
