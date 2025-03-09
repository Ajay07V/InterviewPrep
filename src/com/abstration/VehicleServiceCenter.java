package com.abstration;

public class VehicleServiceCenter {
    public static void main(String[] args) {
        BikeMechanic bikeMechanic = new BikeMechanic();
        CarMechanic carMechanic = new CarMechanic();
        TruckMechanic truckMechanic = new TruckMechanic();
        carMechanic.setNextHandler(bikeMechanic);
        bikeMechanic.setNextHandler(truckMechanic);
        Vehicle car = new Vehicle("Car","Regular Service");
        Vehicle bike= new Vehicle("Bike","Chain sprocket change");
        Vehicle bus = new Vehicle("Bus","Transmission Issue");
        bikeMechanic.handleRepair(bike);
        carMechanic.handleRepair(car);
        truckMechanic.handleRepair(bus);
    }
}
