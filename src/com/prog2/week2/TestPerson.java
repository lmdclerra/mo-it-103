package com.prog2.week2;

public class TestPerson {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John Doe", 30);
        
        // Print the person's details
        System.out.println(person);
        
        // Change the person's name and age
        person.setName("Jane Doe");
        person.setAge(25);
        
        // Print the updated person's details
        System.out.println(person);
        
        // Attempt to set a negative age (should throw an exception)
        try {
            person.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    // Output:
}
