package com.prog2.week2;

import org.junit.Test;

public class TestElectricCar {

	@Test
	public void test() {
		// Test 1: Constructor and getters
        ElectricCar car1 = new ElectricCar("Tesla", "Model S", 2022, 79999.99, 80);
        System.out.println("Make:  " + car1.getMake ()); // Expected: Tesla
        System.out.println("Model: " + car1.getModel()); // Expected: Model S
        System.out.println("Year:  " + car1.getYear ()); // Expected: 2022
        System.out.println("Price: " + car1.getPrice()); // Expected: 79999.99
        System.out.println("Battery Level: " + car1.getBatteryLevel()); // Expected: 80

        // Test 2: Start method with sufficient battery
        car1.start(); // Expected: Calls Car's start method (assuming it prints something)

        // Test 3: Start method with low battery
        ElectricCar car2 = new ElectricCar("Nissan", "Leaf", 2021, 31999.99, 10);
        car2.start(); // Expected: "The battery is too low to start the car."

        // Test 4: setBatteryLevel with valid value
        car1.setBatteryLevel(50);
        System.out.println("Updated Battery Level: " + car1.getBatteryLevel()); // Expected: 50

        // Test 5: setBatteryLevel with invalid value (negative)
        try {
            car1.setBatteryLevel(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Expected: "Battery level must be between 0 and 100."
        }

        // Test 6: setBatteryLevel with invalid value (greater than 100)
        try {
            car1.setBatteryLevel(150);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Expected: "Battery level must be between 0 and 100."
        }
	}

}
