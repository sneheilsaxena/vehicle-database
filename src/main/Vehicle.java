package main;

public class Vehicle {

    private int Id;
    private int Year;
    private String Make;
    private String Model;

    /**
     * Empty constructor.
     */
    public Vehicle() {
    }

    /**
     * Returns the ID.
     * @return ID ID of vehicle
     */
    public int getID() {
        return this.Id;
    }

    /**
     * Sets the ID.
     * @param inputID ID of vehicle
     */
    public void setID(int inputID) {
        this.Id = inputID;
    }

    /**
     * Returns the year.
     * @return the year
     */
    public int getYear() {
        return this.Year;
    }

    /**
     * Sets the year.
     * @param inputYear the year of the vehicle.
     */
    public void setYear(int inputYear) {
        this.Year = inputYear;
    }

    /**
     * Returns the make.
     * @return the make of the vehicle.
     */
    public String getMake() {
        return this.Make;
    }

    /**
     * Sets the make of the vehicle.
     * @param inputMake the make of the vehicle
     */
    public void setMake(String inputMake) {
        this.Make = inputMake;
    }

    /**
     * Returns the model of the vehicle.
     * @return model of the vehicle.
     */
    public String getModel() {
        return this.Model;
    }

    /** Sets the model of the vehicle.
     * @param inputModel the model of the vehicle
     */
    public void setModel(String inputModel) {
        this.Model = inputModel;
    }

    /**
     * Returns a string representation of the object.
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "ID: " + getID() + " Year: " + getYear() + " Make: " + getMake() + " Model: " + getModel();
    }
}
