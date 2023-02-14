import java.util.Scanner;

/**
 * represents a bank for managing customers and their bank accounts
 * @author alina trukhina
 */

public class Bank {

    public static void main(String[] args) {
        // create new instance of Bank class
        Bank bank = new Bank();

        // calls the run method
        bank.run();
    }

    /**
     * Runs the program by initializing and managing bank accounts
     */
    public void run() {
        System.out.println("Welcome to First Bank of Alinia! What is your name? ");

        // create scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // get customer name as a string
        String name = scanner.next();
        System.out.println("Creating your account");

        // create new customer
        Customer customer = new Customer(name);

        // get customer address
        System.out.println("What is your address?");

        // save address from input
        String address = scanner.next();

        // set the address to input
        customer.setCustomerAddress(address);

        // create checking and savings accounts for the customer
        BankAccount checkingAccount = new BankAccount("checking", customer);
        BankAccount savingsAccount = new BankAccount("savings", customer);

        System.out.println("customer info: ");
        System.out.println(checkingAccount.getCustomerInfo());

        // deposit into checking
        System.out.println("enter how much to deposit into checking");
        double amount = scanner.nextDouble();
        checkingAccount.deposit(amount);
        // deposit savings
        System.out.println("enter how much to deposit into savings");
        amount = scanner.nextDouble();
        savingsAccount.deposit(amount);

        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());

        // withdraws
        System.out.println("enter how much to withdraw from checking");
        double amt = scanner.nextDouble();

        try {
            checkingAccount.withdraw(amt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("enter how much to withdraw from savings");
        amt = scanner.nextDouble();

        try {
            savingsAccount.withdraw(amt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());


        scanner.close();
    }
}
