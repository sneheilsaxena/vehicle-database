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
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "ID: " + getID() + " Year: " + getYear() + " Make: " + getMake() + " Model: " + getModel();
    }
}
