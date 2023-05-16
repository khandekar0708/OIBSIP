import java.util.Scanner;

class ATMSystem {
    static Scanner scanner = new Scanner(System.in);
    static String userId = "123456";
    static String userPin = "1234";
    static double balance = 5000.0;

    public static void main(String[] args) {
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("Welcome to the ATM System!");
            System.out.print("Enter your user ID: ");
            String enteredUserId = scanner.next();
            System.out.print("Enter your user PIN: ");
            String enteredUserPin = scanner.next();

            if (enteredUserId.equals(userId) && enteredUserPin.equals(userPin)) {
                isLoggedIn = true;
                showMenu();
            } else {
                System.out.println("Invalid user ID or user PIN. Please try again.");
            }
        }
    }

    static void showMenu() {
        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showTransactionHistory();
                    break;
                case 2:
                    performWithdrawal();
                    break;
                case 3:
                    performDeposit();
                    break;
                case 4:
                    performTransfer();
                    break;
                case 5:
                    isQuit = true;
                    System.out.println("Thank you for using the ATM System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void showTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        // Add your code here to display the transaction history
    }

    static void performWithdrawal() {
        System.out.println("\n--- Withdrawal ---");
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    static void performDeposit() {
        System.out.println("\n--- Deposit ---");
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    static void performTransfer() {
        System.out.println("\n--- Transfer ---");
        System.out.print("Enter the recipient's user ID: ");
        String recipientId = scanner.next();
        System.out.print("Enter the amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transfer successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
}
