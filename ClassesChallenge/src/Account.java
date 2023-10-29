public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("12345", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        accountNumber = number;
        accountBalance = balance;
        this.customerName = customerName;
        this.email = email;
        phoneNumber = phone;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposit of $" + amount + " made. New balance is $" + accountBalance);
    }

    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient founds! You only have $" + accountBalance + " in your account.");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawal of $" + amount + " processed, remaining balance = $" + accountBalance);
        }

    }
}
