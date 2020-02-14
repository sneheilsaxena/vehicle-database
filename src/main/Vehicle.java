package main;

public class Vehicle {

    public int Id;
    public int Year;
    public String Make;
    public String Model;

    public Vehicle() {
        System.out.println("lmao vehicle object declared");
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
}
