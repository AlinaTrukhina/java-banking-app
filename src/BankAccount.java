/**
 * Represents a checking/savings acct for a customer
 * @author alinatrukhina
 */
public class BankAccount {

    // instance variables
    /**
     * Type of account
     */
    String accountType;

    /**
     * Balance for bank account
     */
    double balance;

    /**
     * Customer for the account
     */
    Customer customer;

    /**
     * fixed amount for fast withdrawal
     */
    double fastCashAmount;
    // constructor

    /**
     * Creates a bank account for the customer with the given class
     * @param accountType checking or savings
     * @param customer given customer
     */
    public BankAccount(String accountType, Customer customer) {
        this.customer = customer;
        this.accountType = accountType;

        this.fastCashAmount = 60;
    }

    // method

    /**
     * Deposits the given amount
     * @param amount to add to balance
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    /**
     * Withdraws given amount from balance.
     * @param amt to withdraw
     * @throws Exception if balance smaller than amount
     */
    public void withdraw(double amt) throws Exception {
        if (amt > balance) {
            throw new Exception("Amount is greater than available balance");
        }
        this.balance -= amt;
    }

    /**
     * withdraws the fast cash amount
     * @throws Exception if amount is larger than the available balance
     */
    public void fastWithdraw() throws Exception {
        // withdraw the given cash amount
        this.withdraw(this.fastCashAmount);
    }

    /**
     * sets the fast cash amount to given param, as long as param larger than 0
     * @param amount to set fast cash to
     */
    public void setFastCashAmount(double amount) {
        if (amount > 0) {
            this.fastCashAmount = amount;
        }
    }

    /**
     * Returns account type and balance
     * @return string with all the info
     */
    public String getAccountInfo() {
        return this.accountType + ": " + this.balance;
    }

    /**
     * gets customer name and address for this bank account
     * @return string with all the info
     */
    public String getCustomerInfo() {
        return this.customer.getCustomerName() + ", " + this.customer.getCustomerAddress();
    }
}
