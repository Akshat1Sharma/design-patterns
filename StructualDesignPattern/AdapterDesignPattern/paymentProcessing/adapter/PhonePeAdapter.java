package StructualDesignPattern.AdapterDesignPattern.paymentProcessing.adapter;

import StructualDesignPattern.AdapterDesignPattern.paymentProcessing.adaptee.PhonePe;
import StructualDesignPattern.AdapterDesignPattern.paymentProcessing.targetInterface.UPIGateway;

public class PhonePeAdapter implements UPIGateway{

    private PhonePe phonePe;

    public PhonePeAdapter(PhonePe phonePe){
        this.phonePe = phonePe;
    }

    @Override
    public void processPayment(double amount) {
       phonePe.makePayment(amount);
    }

}
