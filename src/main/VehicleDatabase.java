package main;

import java.util.Scanner;

public class VehicleDatabase {

    public static void printAddOptions () {
        System.out.println("Enter the ID, year, make, and model by typing in the value and pressing enter" +
                " (ID & year must be only digits).");
    }

    public static void printROptions () {
        System.out.println("You can either read a specific record based on ID or read all");
    }

    private static void printMenuOptions() {
        System.out.println("You can add, retrieve, update, and delete entries:");
        System.out.println("1. Add - A\n2. Retrieve All- RA\n3. Retrieve by ID - R\n4. Update - U\n5. Delete - D\n6. Exit - any other key");
        System.out.println("Type in your choice and press enter (options are case sensitive).");
    }

    private static boolean verifyChoice (String inp) {
        return inp.equals("A") || inp.equals("RA") || inp.equals("R") || inp.equals("U") || inp.equals("D");
    }

    public static void main (String [] args) {

        // welcome message
        System.out.println("Welcome to the Mitchell vehicle database!");
        printMenuOptions();

        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();

        Database db = new Database();

        while (verifyChoice(inp)) {
            if (inp.equals("A")) {
                printAddOptions();
                int ID = in.nextInt();
                int year = in.nextInt();
                in.nextLine();
                String make = in.nextLine();
                String model = in.nextLine();
                db.addEntry(ID, year, make, model);
            }
            else if (inp.equals("RA")) {
                db.retrieveAllEntries();
            }
            else if (inp.equals("R")) {
                System.out.println("Enter the ID for the item you wish to retrieve:");
                int ID = in.nextInt();
                in.nextLine();
                db.retrieveSingleEntry(ID);
            }
            else if (inp.equals("U")) {
                printAddOptions();
                int ID = in.nextInt();
                int year = in.nextInt();
                in.nextLine();
                String make = in.nextLine();
                String model = in.nextLine();
                db.updateEntry(ID, year, make, model);
                // check case where ID already exists
            }
            else if (inp.equals("D")) {
                System.out.println("Enter vehicle ID to be deleted:");
                int ID = in.nextInt();
                in.nextLine();
                db.deleteEntry(ID);
            }
            else {
                break;
            }
            printMenuOptions();
            inp = in.nextLine();
        }

        db = null;
        System.out.println("Thank you for using the Mitchell vehicle database!");
        System.out.println("Don't forget to rate us on the App Store! We value your feedback and are" +
                "continuously looking to improve, so every bit helps :)");
    }
}
