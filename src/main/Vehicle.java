package main;

public class Vehicle {

    private int Id;
    private int Year;
    private String Make;
    private String Model;

    public Vehicle() {
    }

    public int getID() {
        return this.Id;
    }

    public void setID(int inputID) {
        this.Id = inputID;
    }

    public int getYear() {
        return this.Year;
    }

    public void setYear(int inputYear) {
        this.Year = inputYear;
    }

    public String getMake() {
        return this.Make;
    }

    public void setMake(String inputMake) {
        this.Make = inputMake;
    }

    public String getModel() {
        return this.Model;
    }

    public void setModel(String inputModel) {
        this.Model = inputModel;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "ID: " + getID() + " Year: " + getYear() + " Make: " + getMake() + " Model: " + getModel();
    }
}
