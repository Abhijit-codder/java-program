import java.util.Scanner;

class Bank {
    String depositorName;
    long accountNumber;
    String accountType;
     double balanceAmount;

    // Constructor to initialize the data members
    public Bank(String name, long accountNumber, String accountType, double initialBalance) {
        this.depositorName = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balanceAmount = initialBalance;
    }

    // Member function to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balanceAmount += amount;
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    // Member function to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balanceAmount >= amount) {
                balanceAmount -= amount;
                System.out.println("Withdrawn $" + amount + " successfully.");
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }

    // Member function to display account information
    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance Amount: $" + balanceAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Depositor Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Account Type: ");
        String accountType = scanner.nextLine();

        System.out.print("Enter Initial Balance: $");
        double initialBalance = scanner.nextDouble();

        Bank account = new Bank(name, accountNumber, accountType, initialBalance);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Info");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayAccountInfo();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
