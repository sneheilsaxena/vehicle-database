package main;

import java.util.Scanner;

public class VehicleDatabase {

    /**
     * Printing the instructions for how to add an entry.
     */
    public static void printAddOptions() {
        System.out.println("Enter the ID, year, make, and model by typing in the value and pressing enter" +
                " (ID & year must be only digits).");
    }

    /**
     * Printing the instructions for how to retrieve an entry.
     */
    public static void printRetrieveOptions() {
        System.out.println("Enter the ID for the item you wish to retrieve:");
    }

    /**
     * Printing the instructions for how to update an entry.
     */
    public static void printUpdateOptions() {
        System.out.println("Enter the ID of the item you want to change and then the year, make," +
                " and model by typing in the value and pressing enter (ID & year must be only digits).");
    }

    /**
     * Printing the instructions for how to delete an entry.
     */
    public static void printDeleteOptions() {
        System.out.println("Enter vehicle ID to be deleted:");
    }

    /**
     * Printing the main instructions for how the program works.
     */
    private static void printMenuOptions() {
        System.out.println("You can add, retrieve, update, and delete entries:");
        System.out.println("1. Add - A\n2. Retrieve All- RA\n3. Retrieve by ID - R\n4. Update - U\n" +
                "5. Delete - D\n6. Exit - any other key");
        System.out.println("Type in your choice and press enter (options are case sensitive).");
    }


    /**
     * verifies whether the user put in one of the standard choices or not.
     * @param inp the choice the user put in
     * @return whether the choice was a valid one or not
     */
    private static boolean verifyChoice(String inp) {
        return inp.equals("A") || inp.equals("RA") || inp.equals("R") || inp.equals("U") || inp.equals("D");
    }


    /**
     * The main method. The driver of the program.
     * @param args the command line arguments.
     */
    public static void main(String[] args) {

        // welcome message
        System.out.println("Welcome to the Mitchell vehicle database!");
        printMenuOptions();

        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();

        Database db = new Database();

        // check whether user inputted a correct choice
        while (verifyChoice(inp)) {
            switch (inp) {
                case "A": {
                    printAddOptions();
                    int ID = in.nextInt();
                    int year = in.nextInt();
                    in.nextLine();
                    String make = in.nextLine();
                    String model = in.nextLine();
                    System.out.println(db.addEntry(ID, year, make, model));
                    break;
                }
                case "RA": {
                    System.out.println(db.retrieveAllEntries());
                    break;
                }
                case "R": {
                    printRetrieveOptions();
                    int ID = in.nextInt();
                    in.nextLine();
                    System.out.println(db.retrieveSingleEntry(ID));
                    break;
                }
                case "U": {
                    printUpdateOptions();
                    int ID = in.nextInt();
                    int year = in.nextInt();
                    in.nextLine();
                    String make = in.nextLine();
                    String model = in.nextLine();
                    System.out.println(db.updateEntry(ID, year, make, model));
                    break;
                }
                case "D": {
                    printDeleteOptions();
                    int ID = in.nextInt();
                    in.nextLine();
                    System.out.println(db.deleteEntry(ID));
                    break;
                }
                default: {
                    break;
                }
            }
            printMenuOptions();
            inp = in.nextLine();
        }

        db = null;
        System.out.println("Thank you for using the Mitchell vehicle database!");
        System.out.println("Don't forget to rate/review us on the App Store! We value your feedback and are" +
                " continuously looking to improve, so every bit helps :)");
    }
}
