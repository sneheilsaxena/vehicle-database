package main;

import java.util.HashMap;

public class Database {

    private HashMap<Integer, Vehicle> vehicles = new HashMap<>();

    public void addEntry(int ID, int year, String make, String model) {
        if (vehicles.containsKey(ID)) {
            System.out.println("Record with that ID already exists in the database.");
            return;
        }
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

        if (vehicles.isEmpty()) {
            System.out.println("No entries in the database.");
            return;
        }

        // Iterate through the hashmap
        System.out.println("List of vehicles (in no particular order):");

        for (Vehicle entry : vehicles.values()) {
            System.out.println(entry);
        }

        System.out.println();
    }

    public void updateEntry(int ID, int year, String make, String model) {
        if (!vehicles.containsKey(ID)) {
            System.out.println("No record with that ID exists in the database. Please try again.\n");
            return;
        }
        Vehicle vehicle = new Vehicle();
        vehicle.setID(ID);
        vehicle.setYear(year);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicles.put(ID, vehicle);
    }

    public void deleteEntry(int ID) {
        if (!vehicles.containsKey(ID)) {
            System.out.println("No record with that ID exists in the database. Please try again.\n");
            return;
        }
        vehicles.remove(ID);
    }

    Database() {

    }

}
