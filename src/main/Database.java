package main;

import java.util.HashMap;

public class Database {

    private HashMap<Integer, Vehicle> vehicles = new HashMap<>();

    /**
     * Adds the vehicle entry to the database.
     * @param ID the ID of the vehicle
     * @param year the year the vehicle was made
     * @param make the make of the vehicle
     * @param model the model of the vehicle
     * @return Returns whether the entry was added successfully or not.
     */
    public String addEntry(int ID, int year, String make, String model) {
        if (vehicles.containsKey(ID)) {
            return "Record with that ID already exists in the database.";
        }

        if (year >= 2050 || year <= 1950) {
           return "Year must be between 2050 and 1950 (inclusive).";
        }

        Vehicle vehicle = new Vehicle();
        vehicle.setID(ID);
        vehicle.setYear(year);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicles.put(ID, vehicle);
        return "Added successfully.\n";
    }

    /**
     * @param ID The ID of the entry to be retrieved.
     * @return Returns whether the entry was found or not.
     */
    public String retrieveSingleEntry(int ID) {
        if (vehicles.containsKey(ID)) {
            return vehicles.get(ID) + "\n";
        } else {
            return "Record not found.\n";
        }
    }

    /**
     * Returns all the entries.
     * @return All the entries if there were a non zero amount, error message otherwise.
     */
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

    /**
     * Updates the vehicle entry based on the ID from the database.
     * @param ID the ID of the vehicle
     * @param year the year the vehicle was made
     * @param make the make of the vehicle
     * @param model the model of the vehicle
     * @return Returns whether the entry was updated successfully or not.
     */
    public String updateEntry(int ID, int year, String make, String model) {
        if (!vehicles.containsKey(ID)) {
            return "No record with that ID exists in the database. Please try again.\n";
        }

        if (year >= 2050 || year <= 1950) {
            return "Year must be between 2050 and 1950 (inclusive).";
        }

        Vehicle vehicle = new Vehicle();
        vehicle.setID(ID);
        vehicle.setYear(year);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicles.put(ID, vehicle);
        return "Updated successfully.\n";
    }

    /**
     * @param ID ID of the item to be deleted.
     * @return Indicates whether deletion was successful.
     */
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

    /**
     * @return The number of entries in the database.
     */
    public int getSize() {
        return vehicles.size();
    }

    /**
     * The empty constructor.
     */
    public Database() {

    }

}
