package org.example;

public class SimpleGPS implements GPS {
    @Override
    public void navigate(String destination) {
        System.out.println("Navigating to " + destination);
    }
}
