package StructualDesignPattern.AdapterDesignPattern.phoneCharger;

import StructualDesignPattern.AdapterDesignPattern.phoneCharger.adaptee.Charger;
import StructualDesignPattern.AdapterDesignPattern.phoneCharger.targetInterface.Iphone;

public class IPhone6s implements Iphone {
    Charger Iphone4sTo6sAdapter;
    public IPhone6s(Charger iphone4sTo6sAdapter)
    {
        this.Iphone4sTo6sAdapter = iphone4sTo6sAdapter;
    };

    @Override
    public void OnCharge()
    {
        Iphone4sTo6sAdapter.charge();
    }
}
