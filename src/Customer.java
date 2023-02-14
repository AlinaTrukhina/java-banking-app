/**
 * Represents and customer
 * @author alinatrukhina
 */
public class Customer {

    // instance vars

    /**
     * Name of customer
     */
    String customerName;

    /**
     * Customer address
     */
    String customerAddress;

    // constructor

    /**
     * Creates a customer with the given name
     * @param customerName of customer
     */
    public Customer(String customerName) {
        // sets name to the given name
        this.customerName = customerName;
    }

    // methods

    /**
     * sets the address of a customer to the given address
     * @param customerAddress for customer
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * returns customer's name
     * @return name of customer
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * returns customer's address
     * @return address of customer
     */
    public String getCustomerAddress() {
        return this.customerAddress;
    }
}
