public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("American Bank");

        System.out.println("Customer moji added: " + bank.addCustomer("moji", 1000));
        System.out.println("Customer customer2 added: " + bank.addCustomer("customer2", 1000));
        System.out.println("Customer cutomer3 added: " + bank.addCustomer("cutomer3", 100));
        System.out.println("Customer cutomer4 added: " + bank.addCustomer("cutomer4",100));
        System.out.println("Customer cutomer5 added: " + bank.addCustomer("cutomer5", 100));


        bank.addTransaction("moji", 23.34);
        bank.addTransaction("moji", -3.34);
        bank.addTransaction("moji", -2.04);
        bank.addTransaction("moji", 100.00);
        bank.addTransaction("moji", -25.50);
        bank.addTransaction("moji", 200.00);
        bank.addTransaction("moji", -30.80);

        bank.printStatment("moji");

        System.out.println();
        bank.printStatment("customer");

    }
}
