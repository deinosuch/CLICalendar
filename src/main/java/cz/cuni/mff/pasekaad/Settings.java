package cz.cuni.mff.pasekaad;

import java.util.Scanner;

public class Settings {
    private static final int EXIT_CODE = 9;

    private static String mail;
    private static Scanner scanner;

    public static void run(Scanner scnr) {
        scanner = scnr;
        int input;

        do {
            System.out.println("Calendar settings");
            System.out.println("Select option by typing given number"
                             + "1. Personal settings"
                             + "2. Reminder settings"
                             + EXIT_CODE + ". Exit");

            input = scanner.nextInt();
            scanner.nextLine();
    
            switch (input) {
                case EXIT_CODE:
                    break;
                case 1:
                    personal();
                    break;
                case 2:
                    reminder();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

        } while (input != EXIT_CODE);

        scanner.close();
    }

    private static void reminder() {
        System.out.println("Currently no reminder stuff to be edited");
    }

    private static void personal() {
        System.out.println("Current mail: " + mail);
        System.out.println("Do you wish to change? (y/n)");

        boolean invalidChoice;
        String response;
        
        do {
            invalidChoice = false;
            response = scanner.nextLine().trim();
    
            if (response.equalsIgnoreCase("y")) {
                System.out.println("Enter new mail:");
                mail = scanner.nextLine().trim();
                System.out.printf("Mail updated successfully to %s!\n", mail);
            } else if (response.equalsIgnoreCase("n")) {
                System.out.println("No changes made to mail.");
            } else {
                System.out.println("Invalid choice. Please enter 'y' or 'n'.");
                invalidChoice = true;
            }
        } while (invalidChoice);
    }
}
