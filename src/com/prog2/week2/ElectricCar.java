package com.prog2.week2;

public class ElectricCar extends Car { 
    
    private int batteryLevel;

    public ElectricCar(String make, String model, int year, double price, int batteryLevel) {
        super(make, model, year, price);
        setBatteryLevel(batteryLevel);
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void start() {
        if (batteryLevel < 20) {
            System.out.println("The battery is too low to start the car.");
        } 
        else {
            super.start();
        }
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel < 0 || batteryLevel > 100) {
            throw new IllegalArgumentException("Battery level must be between 0 and 100.");
        }
        this.batteryLevel = batteryLevel;
    }
}
