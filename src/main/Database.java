package main;

import java.util.HashMap;

public class Database {

    private HashMap<Integer, Vehicle> vehicles = new HashMap<>();

    public String addEntry(int ID, int year, String make, String model) {
        if (vehicles.containsKey(ID)) {
            return "Record with that ID already exists in the database.";
        }
        Vehicle vehicle = new Vehicle();
        vehicle.setID(ID);
        vehicle.setYear(year);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicles.put(ID, vehicle);
        return "Added successfully.\n";
    }

    public String retrieveSingleEntry(int ID) {
        if (vehicles.containsKey(ID)) {
            return vehicles.get(ID) + "\n";
        } else {
            return "Record not found.\n";
        }
    }

    public String retrieveAllEntries() {
        if (vehicles.isEmpty()) {
            return "No entries in the database.";
        }

        String toReturn = "";
        // Iterate through the hashmap
        toReturn += "List of vehicles (in no particular order):\n";

        for (Vehicle entry : vehicles.values()) {
            toReturn += entry;
            toReturn += "\n";
        }

        toReturn += "\n";
        return toReturn;
    }

    public String updateEntry(int ID, int year, String make, String model) {
        if (!vehicles.containsKey(ID)) {
            return "No record with that ID exists in the database. Please try again.\n";
        }
        Vehicle vehicle = new Vehicle();
        vehicle.setID(ID);
        vehicle.setYear(year);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicles.put(ID, vehicle);
        return "Updated successfully.\n";
    }

    public String deleteEntry(int ID) {
        if (this.getSize() == 0) {
            return "There are no entries in the table right now.";
        }
        if (!vehicles.containsKey(ID)) {
            return "No record with that ID exists in the database. Please try again.\n";
        }
        vehicles.remove(ID);
        return "Deleted succesfully.\n";
    }

    public int getSize() {
        return vehicles.size();
    }

    public Database() {

    }

}
