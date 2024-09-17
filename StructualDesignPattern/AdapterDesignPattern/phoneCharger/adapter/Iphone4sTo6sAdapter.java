package StructualDesignPattern.AdapterDesignPattern.phoneCharger.adapter;

import StructualDesignPattern.AdapterDesignPattern.phoneCharger.adaptee.Charger;
import StructualDesignPattern.AdapterDesignPattern.phoneCharger.adaptee.Iphone4sCharger;

public class Iphone4sTo6sAdapter implements Charger {
    Iphone4sCharger iphone4sCharger;

    public Iphone4sTo6sAdapter()
    {
        iphone4sCharger = new Iphone4sCharger();
    }

    @Override
    public void charge()
    {
        iphone4sCharger.charge();
    }
}
