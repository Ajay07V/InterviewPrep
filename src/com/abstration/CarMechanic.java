package com.abstration;

public class CarMechanic extends AbstractVehicleRepairHandler{
    @Override
    public void handleRepair(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            System.out.println("Car Mechanic repaired the car issue: " + vehicle.getProblem());
        } else {
            passToNext(vehicle);
        }
    }
}
