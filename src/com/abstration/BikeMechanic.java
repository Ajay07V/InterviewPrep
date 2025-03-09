package com.abstration;

class BikeMechanic extends AbstractVehicleRepairHandler {
    @Override
    public void handleRepair(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Bike")) {
            System.out.println("Bike Mechanic repaired the bike issue: " + vehicle.getProblem());
        } else {
            passToNext(vehicle);
        }
    }
}