package StructualDesignPattern.AdapterDesignPattern.paymentProcessing;

import StructualDesignPattern.AdapterDesignPattern.paymentProcessing.adaptee.PayTM;
import StructualDesignPattern.AdapterDesignPattern.paymentProcessing.adaptee.PhonePe;
import StructualDesignPattern.AdapterDesignPattern.paymentProcessing.adapter.PayTMAdapter;
import StructualDesignPattern.AdapterDesignPattern.paymentProcessing.adapter.PhonePeAdapter;
import StructualDesignPattern.AdapterDesignPattern.paymentProcessing.targetInterface.UPIGateway;

public class Client {
     public static void main(String[] args) {
        UPIGateway payTMGateway = new PayTMAdapter(new PayTM());
        UPIGateway phonePeGateway = new PhonePeAdapter(new PhonePe());
        
        double amount = 15000.0;
        payTMGateway.processPayment(amount);
        phonePeGateway.processPayment(amount);
    }
}
