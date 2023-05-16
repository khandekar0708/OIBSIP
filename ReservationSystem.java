import java.util.Scanner;

public class ReservationSystem {
    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        // Login form
        while (!loggedIn) {
            System.out.println("Login Form");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (validateLogin(username, password)) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        // Reservation form
        System.out.println("\nReservation Form");
        System.out.println("Please fill in the necessary details:");
        // Add code to handle reservation form inputs

        // Cancellation form
        System.out.println("\nCancellation Form");
        System.out.print("Enter PNR number: ");
        String pnrNumber = scanner.nextLine();
        displayCancellationDetails(pnrNumber);
        System.out.print("Press 'OK' to confirm cancellation: ");
        String confirmation = scanner.nextLine();
        if (confirmation.equalsIgnoreCase("OK")) {
            confirmCancellation(pnrNumber);
        } else {
            System.out.println("Cancellation not confirmed.");
        }
    }

    private static boolean validateLogin(String username, String password) {
        return username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD);
    }

    private static void displayCancellationDetails(String pnrNumber) {
        // Add code to display information related to the provided PNR number
        System.out.println("Displaying information for PNR number: " + pnrNumber);
    }

    private static void confirmCancellation(String pnrNumber) {
        // Add code to handle the cancellation process
        System.out.println("Cancellation confirmed for PNR number: " + pnrNumber);
    }
}
