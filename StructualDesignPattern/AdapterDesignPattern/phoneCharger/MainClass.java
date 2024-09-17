package StructualDesignPattern.AdapterDesignPattern.phoneCharger;

import StructualDesignPattern.AdapterDesignPattern.phoneCharger.adapter.Iphone4sTo6sAdapter;

public class MainClass {
     public static void main(String args[])
    {
        IPhone6s iphone6s = new IPhone6s(new Iphone4sTo6sAdapter());
        iphone6s.OnCharge();
    }
}
