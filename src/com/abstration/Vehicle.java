package com.abstration;

public class Vehicle {
    private final String type;  // Car, Bike, Truck
    private final String problem;

    public Vehicle(String type, String problem) {
        this.type = type;
        this.problem = problem;
    }

    public String getType() {
        return type;
    }

    public String getProblem() {
        return problem;
    }
}
