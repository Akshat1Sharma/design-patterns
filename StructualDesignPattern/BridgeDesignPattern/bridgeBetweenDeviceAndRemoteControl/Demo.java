package StructualDesignPattern.BridgeDesignPattern.bridgeBetweenDeviceAndRemoteControl;

import StructualDesignPattern.BridgeDesignPattern.bridgeBetweenDeviceAndRemoteControl.devices.Device;
import StructualDesignPattern.BridgeDesignPattern.bridgeBetweenDeviceAndRemoteControl.devices.Radio;
import StructualDesignPattern.BridgeDesignPattern.bridgeBetweenDeviceAndRemoteControl.devices.Tv;
import StructualDesignPattern.BridgeDesignPattern.bridgeBetweenDeviceAndRemoteControl.remotes.AdvancedRemote;
import StructualDesignPattern.BridgeDesignPattern.bridgeBetweenDeviceAndRemoteControl.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
