package org.example;

public class ManualTransmission implements Transmission {
    @Override
    public void shiftGear() {
        System.out.println("Manually shifting gear");
    }
}
