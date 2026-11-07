package org.example;

public class AutomaticTransmission implements Transmission {
    @Override
    public void shiftGear() {
        System.out.println("Automatically shifting gear");
    }
}
