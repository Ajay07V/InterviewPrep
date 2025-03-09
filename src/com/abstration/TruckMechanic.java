package com.abstration;


class TruckMechanic extends AbstractVehicleRepairHandler {
    @Override
    public void handleRepair(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Truck") || vehicle.getType().equalsIgnoreCase("Bus")) {
            System.out.println("Truck Mechanic repaired the truck issue: " + vehicle.getProblem());
        } else {
            passToNext(vehicle);
        }
    }
}
