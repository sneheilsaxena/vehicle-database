package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Database {

    private HashMap<Integer, Vehicle> vehicles = new HashMap<>();

    public void addEntry(int ID, int year, String make, String model) {
        Vehicle vehicle = new Vehicle();
        vehicle.setID(ID);
        vehicle.setYear(year);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicles.put(ID, vehicle);
    }

    public void retrieveSingleEntry(int ID) {
        if (vehicles.containsKey(ID)) {
            System.out.println(vehicles.get(ID) + "\n");
        } else {
            System.out.println("Record not found");
        }
    }

    public void retrieveAllEntries() {
        // Getting an iterator
        Iterator vehicleIterator = vehicles.entrySet().iterator();

        // Iterate through the hashmap
        System.out.println("List of vehicles (in no particular order):");

        while (vehicleIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) vehicleIterator.next();
            System.out.println(mapElement.getValue());
        }

        System.out.println();
    }

    public void updateEntry (int ID, int year, String make, String model) {
        Vehicle vehicle = new Vehicle();
        vehicle.setID(ID);
        vehicle.setYear(year);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicles.put(ID, vehicle);
    }

    public void deleteEntry (int ID) {
        vehicles.remove(ID);
    }

    Database() {
    }

}
