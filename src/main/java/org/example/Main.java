package org.example;

public class Main {
    public static void main(String[] args) {
        GPS gps = new SimpleGPS();

        // Combinaison 1: Essence + Manuelle
        Car petrolManual = new Car(new PetrolEngine(), new ManualTransmission(), gps);
        System.out.println("--- Combinaison 1 ---");
        petrolManual.drive();

        // Combinaison 2: Électrique + Automatique
        Car electricAuto = new Car(new ElectricEngine(), new AutomaticTransmission(), gps);
        System.out.println("\n--- Combinaison 2 ---");
        electricAuto.drive();

        // Combinaison 3: Essence + Automatique
        Car petrolAuto = new Car(new PetrolEngine(), new AutomaticTransmission(), gps);
        System.out.println("\n--- Combinaison 3 ---");
        petrolAuto.drive();
        petrolAuto.navigateTo("Paris");
    }
}
