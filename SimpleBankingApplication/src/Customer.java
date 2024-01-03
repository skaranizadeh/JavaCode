

public class Customer {

    private String name;
    private java.util.ArrayList<Double> transactions = new java.util.ArrayList<>(100);

    public Customer(String name, double initialDeposit) {
        this.name = name;
        transactions.add(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public java.util.ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}
