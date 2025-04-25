package com.prog2.week2;

public class Person {
    
    // Fields to store the name and age of the person
    private String name;
    private int age;

    // Constructor to initialize the name and age of the person
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Getters and setters for name and age
    public String getName() { return name; }
    public int    getAge () { return age;  }

    public void setName(String name) { this.name = name; }
    public void setAge (int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }  

    // Methods to simulate actions of the person
    public void walk() { System.out.println(name + " is walking."); }
    public void talk() { System.out.println(name + " is talking."); }

    // Method to return a string representation of the person
    @Override
    public String toString() {
        return String.format("Person { name:'%s', age:%d }", name, age);
    }
}