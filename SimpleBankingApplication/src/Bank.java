import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    private Branch findBranch(String branchName) {
        for (Branch el : branches) {
            if (el.getName().equalsIgnoreCase(branchName)) {
                return el;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialDeposit) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialDeposit);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        if (findBranch(branchName) != null) {
            Branch branch = findBranch(branchName);
            System.out.printf("Customer details for branch %s%n", branch.getName());
            int j = 1;
            for (Customer el : branch.getCustomers()) {
                System.out.printf("Customer: %s[%d]%n", el.getName(), j++);
                if (printTransaction) {
                    System.out.println("Transactions");
                    for (int i = 1; i <= el.getTransactions().size(); i++) {
                        System.out.printf("[%d] Amount %.2f%n", i, el.getTransactions().get(i - 1));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
