import java.util.Scanner;

public class Methods {
    static Scanner scanner = new Scanner(System.in);

    // overloading methods -> same name, same datatype but different signature
    static double add(double one, double two) {
        return one + two;
    }

    static double add(double one, double two, double three) {
        return one + two + three;
    }

    static void getBalance(double balance) {
        System.out.printf("your account balance is : $%.2f\n", balance);
    }

    static double deposit() {
        double amount = 0.0;

        System.out.println("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("minimum deposit amount is 1");
            return 0;
        }

        return amount;
    }

    static double withdraw(double balance) {
        double amount = 0;

        System.out.println("Enter amount to be withdrawn");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.printf("Sorry you don't have enough balance to withdraw $%.2f\n", amount);
            return 0;
        } else if (amount < 0) {
            System.out.println("minimum withdrawal amount is $1");
            return 0;
        } else {
            balance = balance - amount;
            System.out.printf("You successfully withdrawn $%.2f your current balance is: $%.2f\n ", amount, balance);
        }
        return balance;
    }

    public static void main(String[] args) {
        // BANKING PROGRAM

        double balance = 0.0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println("******************");
            System.out.println("BANKING PROGRAM");
            System.out.println("******************");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter you choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> getBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance = withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
