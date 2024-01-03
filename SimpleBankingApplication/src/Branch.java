import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>(50);
    }

    private Customer findCustomer(String customerName) {
        for (Customer el : customers) {
            if (el.getName().equalsIgnoreCase(customerName)) {
                return el;
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double initialDeposit) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialDeposit));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {

        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
