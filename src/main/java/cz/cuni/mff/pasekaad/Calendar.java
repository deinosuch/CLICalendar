package cz.cuni.mff.pasekaad;

import java.util.Scanner;

public class Calendar {
    private static final int EXIT_CODE = 9;

    private static void run() {
        welcomeMessage();

        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("Select option by typing given number:"
                             + "1. All events"
                             + "2. Settings"
                             + EXIT_CODE + ". Exit");

            input = scanner.nextInt();
            scanner.nextLine();

            switch(input) {
                case EXIT_CODE:
                    break;
                case 1:
                    Events.run(scanner);
                    break;
                case 2:
                    Settings.run(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");

            }
            
        } while (input != EXIT_CODE);

        System.out.println("Exiting calendar CLI...");
        
        scanner.close();
    }

    private static void welcomeMessage() {
        System.out.println("Welcome to my CLI calendar implementation!\n"
                         + "You can select what would you like to do next\n"
                         + "(If you are here for the first time I would recommend setting up your preferences in settings)\n");
    }

    public static void main(String[] args) {
        run();
    }
}