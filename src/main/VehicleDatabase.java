package main;

import java.util.ArrayList;

public class VehicleDatabase {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    private void addEntry (int ID, int year, String make, String model) {
        Vehicle vehicle = new Vehicle();
        vehicle.setID(ID);
        vehicle.setYear(year);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicles.add(vehicle);
    }

    VehicleDatabase () {

    }

}
