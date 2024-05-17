package cz.cuni.mff.pasekaad;

import java.util.Scanner;

public class Settings {
    private static final int EXIT_CODE = 9;

    private static String mail;
    private static Scanner scanner;

    public static void run() {
        scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("Calendar settings");
            System.out.println("Select what you would like to change/see by typing given number");
            System.out.println("1. Personal settings");
            System.out.println("2. Reminder settings");
            System.out.println(EXIT_CODE + ". Exit");

            input = scanner.nextInt();
            scanner.nextLine();
    
            switch (input) {
                case 1:
                    personal();
                    break;
                case 2:
                    reminder();
                    break;
                case EXIT_CODE:
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
