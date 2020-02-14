package main;

import java.util.Scanner;

public class VehicleDatabaseLauncher {

    private static void printOptions () {
        System.out.println("You can add, retrieve, update, and delete entries:");
        System.out.println("1. Add - A\n2. Retrieve - R\n3. Update - U\n4. Delete - D\n5. Exit - any other key");
        System.out.println("Type in your choice and press enter (options are case insensitive).");
    }

    private static boolean verifyChoice (String inp) {
        return inp.equals("A") || inp.equals("R") || inp.equals("U") || inp.equals("D");
    }

    public static void main (String [] args) {

        // welcome message
        System.out.println("Welcome to the Mitchell vehicle database!");
        printOptions();

        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();

        VehicleDatabase db = new VehicleDatabase();

        while (verifyChoice(inp)) {

        }

        db = null;
        System.out.println("Thank you for using the Mitchell vehicle database!");
        System.out.println("Don't forget to rate us on the App Store! We value your feedback and are" +
                "continously looking to improve, so every bit helps :)");
    }
}
