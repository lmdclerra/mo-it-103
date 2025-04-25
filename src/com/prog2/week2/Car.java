package com.prog2.week2;

public class Car {
    
    // fields to store the make, model, year, and price of the car
    private String  make;
    private String  model;
    private int     year;
    private double  price;
    private boolean isRunning = false; // default value

    // constructor to initialize the car's attributes
    public Car(String make, String model, int year, double price) {
        setMake ( make  );
        setModel( model );
        setYear ( year  );
        setPrice( price );
    }

    // getters and setters for car attributes
    public String  getMake  () { return make;  }
    public String  getModel () { return model; }
    public int     getYear  () { return year;  }
    public double  getPrice () { return price; }
    public boolean isRunning() { return isRunning; }

    public void setMake (String make ) { this.make  = make;  }
    public void setModel(String model) { this.model = model; }
    public void setYear (int year) {
        if (year < 1886) { // The first car was invented in 1886
            throw new IllegalArgumentException("Year cannot be before 1886");
        }
        this.year = year;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public void start() {
        if (isRunning) {
            System.out.println(make + " " + model + " is already running.");
            return;
        }
        isRunning = true;
        System.out.println(make + " " + model + " is starting.");
    }

    public void start(String key) {
        System.out.println(make + " " + model + " is starting with key: " + key);
    }

    public double drive(double distance) {
        System.out.println(make + " " + model + " is driving for " + distance + " miles.");
        double time = distance / 60; // Assuming a speed of 60 miles per hour
        return time;
    }

    public void stop() {
        if (!isRunning) {
            System.out.println(make + " " + model + " is already stopped.");
            return;
        }
        isRunning = false;
        System.out.println(make + " " + model + " is stopping.");
    }

    // method to return a string representation of the car
    @Override
    public String toString() {
        // Using StringBuilder for better performance in string concatenation
        StringBuilder sb = new StringBuilder();
        sb.append("Car { ");
        sb.append("make:'").append(make).append("\', ");
        sb.append("model:'").append(model).append("\', ");
        sb.append("year:").append(year).append(", ");
        sb.append("price:").append(price);
        sb.append(" }");
        return sb.toString();
    }   
}
