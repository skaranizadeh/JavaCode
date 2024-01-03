import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    private Customer getCustomer(String customerName) {

        for (Customer el : customers) {
            if (el.name().equalsIgnoreCase(customerName)) {
                return el;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public boolean addCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialDeposit));
            return true;
        }
        return false;
    }


    public boolean addTransaction(String customerName, double transaction) {

        Customer customer = getCustomer(customerName);
        if (customer != null) {
            customer.transactions().add(transaction);
            return true;
        }
        return false;
    }

    public void printStatment(String customerName) {

        Customer customer = getCustomer(customerName);
        if (customer == null) {
            System.out.println("Customer name does not exist!!!");
            return;
        }

        System.out.println("*".repeat(30));
        System.out.println("Customer name: " + customer.name());
        System.out.println("Transanctiosn:");
        for (double el : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", el, el < 0 ? "debit" : "credit");
        }
        System.out.println("*".repeat(30));
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
