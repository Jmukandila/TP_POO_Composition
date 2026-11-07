package org.example;

public class Car {
    private final Engine engine;
    private final Transmission transmission;
    private final GPS gps;

    public Car(Engine engine, Transmission transmission, GPS gps) {
        this.engine = engine;
        this.transmission = transmission;
        this.gps = gps;
    }

    public void drive() {
        engine.start();
        transmission.shiftGear();
        System.out.println("Car is driving");
    }

    public void navigateTo(String destination) {
        gps.navigate(destination);
    }
}
