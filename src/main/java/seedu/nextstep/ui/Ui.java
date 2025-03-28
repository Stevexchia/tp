package seedu.nextstep.ui;

import seedu.nextstep.core.Internship;

public class Ui {
    private static final String LINEBREAK = "____________________________________";

    public static void printLinebreak() {
        System.out.println(LINEBREAK);
    }

    /**
     * Prints welcome message when NextStep starts.
     */
    public static void printWelcomeMessage() {
        printLinebreak();
        System.out.println("Welcome to NextStep, your personal internship tracking assistant! (0_0)");
        System.out.println("What would you like to do today?");
        printLinebreak();
    }

    /**
     * Prints message to prompt user input
     */
    public static void printEnterCommand() {
        System.out.print("Enter command: ");
    }

    public static void printUnknownCommand() {
        System.out.println("Unknown command. Type help for more info! (o.o)");
        printLinebreak();
    }

    /**
     * Prints exit message when NextStep exits.
     */
    public static void printExitMessage() {
        printLinebreak();
        System.out.println("Thank you for using NextStep, good luck on your search! (0_0)");
        printLinebreak();
    }

    /**
     * Prints a message if user types filter/find without the tags.
     * @param input The wrong command.
     */
    public static void printSimilarCommandError(String input) {
        if (input.equals("filter")) {
            System.out.println("Woops! Perhaps you mean filter/a or filter/d?");
        } else if (input.equals("find")) {
            System.out.println("Woops! Perhaps you mean find/c, find/r, or find/s?");
        }
        printLinebreak();
    }

    /**
     * Prints a message when an internship is successfully added.
     * @param internship Internship to be added.
     */
    public static void printAddingMessage(Internship internship) {
        System.out.println("New internship added below! (o_o)");
        printLinebreak();
        System.out.println(internship);
        printLinebreak();
    }

    /**
     * Prints a message when an internship is successfully deleted.
     * @param internship
     */
    public static void printDeleteSuccess(Internship internship) {
        System.out.println("Deleted this internship! (o_o)");
        printLinebreak();
        System.out.println(internship);
        printLinebreak();
    }

    public static void printSearchingForSkill(String skill) {
        System.out.println("Searching for internships with skill: " + skill);
    }

    public static void printNoInternshipFound(String skill) {
        System.out.println("No internships found with skill: " + skill);
    }

    public static void printInternship(Internship internship) {
        System.out.println(internship);
    }
    public static void printSearchingForRole(String role) {
        System.out.println("Searching for internships with role: " + role);
    }

    public static void printNoInternshipFoundForRole(String role) {
        System.out.println("No internships found with role: " + role);
    }

    public static void printSearchingForCompany(String company) {
        System.out.println("Searching for internships with company: " + company);
    }

    public static void printNoInternshipFoundForCompany(String company) {
        System.out.println("No internships found with company: " + company);
    }

    public static void printNoFilteredInternshipFound() {
        System.out.println("No internships found here!");
        Ui.printLinebreak();
    }
}

