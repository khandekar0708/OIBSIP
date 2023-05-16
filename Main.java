import java.util.Scanner;

class Main {
    static Scanner scanner = new Scanner(System.in);
    static String username;
    static String password;

    public static void main(String[] args) {
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("Welcome to the Quiz System!");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    isLoggedIn = login();
                    if (isLoggedIn) {
                        showMenu();
                    }
                    break;
                case 2:
                    System.out.println("Thank you for using the Quiz System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static boolean login() {
        System.out.print("Enter your username: ");
        username = scanner.next();
        System.out.print("Enter your password: ");
        password = scanner.next();

        // Simulating login check
        return username.equals("admin") && password.equals("password");
    }

    static void showMenu() {
        boolean isLoggedOut = false;

        while (!isLoggedOut) {
            System.out.println("\nLogged in as: " + username);
            System.out.println("1. Update Profile and Password");
            System.out.println("2. Select Answers for MCQs");
            System.out.println("3. Timer and Auto Submit");
            System.out.println("4. Close Session and Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    updateProfileAndPassword();
                    break;
                case 2:
                    selectMCQAnswers();
                    break;
                case 3:
                    timerAndAutoSubmit();
                    break;
                case 4:
                    isLoggedOut = true;
                    System.out.println("Logged out successfully.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void updateProfileAndPassword() {
        System.out.println("\n--- Update Profile and Password ---");
        // Add your code here to update the profile and password
    }

    static void selectMCQAnswers() {
        System.out.println("\n--- Select Answers for MCQs ---");
        // Add your code here to handle the MCQ selection
    }

    static void timerAndAutoSubmit() {
        System.out.println("\n--- Timer and Auto Submit ---");
        // Add your code here to implement the timer and auto submit functionality
    }
}
