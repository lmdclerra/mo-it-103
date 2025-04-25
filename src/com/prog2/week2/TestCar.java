package com.prog2.week2;

import org.junit.Test;

public class TestCar {

	@Test
	public void test() {
		Car myCar  = new Car("Toyota", "Camry", 2022, 25000.00);
        Car youCar = new Car("Honda", "Accord", 2023, 28000.00);
        System.out.println(myCar);
        System.out.println(youCar);

        // Test 1: Create a Car object and verify its attributes
        Car car1 = new Car("Toyota", "Camry", 2020, 24000.00);
        System.out.println("Test 1: " + car1);
        assert car1.getMake().equals("Toyota");
        assert car1.getModel().equals("Camry");
        assert car1.getYear() == 2020;
        assert car1.getPrice() == 24000.00;

        // Test 2: Test the setMake and setModel methods
        car1.setMake("Honda");
        car1.setModel("Civic");
        System.out.println("Test 2: " + car1);
        assert car1.getMake().equals("Honda");
        assert car1.getModel().equals("Civic");

        // Test 3: Test the setYear method with a valid year
        car1.setYear(2018);
        System.out.println("Test 3: " + car1);
        assert car1.getYear() == 2018;

        // Test 4: Test the setYear method with an invalid year
        try {
            car1.setYear(1800);
            System.out.println("Test 4: Failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 4: Passed - " + e.getMessage());
        }

        // Test 5: Test the setPrice method with a valid price
        car1.setPrice(20000.00);
        System.out.println("Test 5: " + car1);
        assert car1.getPrice() == 20000.00;

        // Test 6: Test the setPrice method with a negative price
        try {
            car1.setPrice(-5000.00);
            System.out.println("Test 6: Failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 6: Passed - " + e.getMessage());
        }

        // Test 7: Test the toString method
        String expectedString = "Car { make:'Honda', model:'Civic', year:2018, price:20000.0 }";
        System.out.println("Test 7: " + car1);
        assert car1.toString().equals(expectedString);
	}

}
