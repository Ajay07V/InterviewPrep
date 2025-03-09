package com.abstration;

abstract class AbstractVehicleRepairHandler implements VehicleRepairHandler {
    protected VehicleRepairHandler nextHandler;

    public void setNextHandler(VehicleRepairHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    protected void passToNext(Vehicle vehicle) {
        if (nextHandler != null) {
            nextHandler.handleRepair(vehicle);
        } else {
            System.out.println("No mechanic available for vehicle type: " + vehicle.getType());
        }
    }
}
