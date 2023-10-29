public class Main {
    public static void main(String[] args) {
        Account mojiBankAccount = new Account();
        System.out.println(mojiBankAccount.getAccountNumber());
        System.out.println(mojiBankAccount.getAccountBalance());
//        mojiBankAccount.setAccountNumber("12345");
//        mojiBankAccount.setAccountBalance(1000);
//        mojiBankAccount.setCustomerName("Moji K");
//        mojiBankAccount.setEmail("mmm@gmail.comz");
//        mojiBankAccount.setPhoneNumber("91685745862");

        mojiBankAccount.withdraw(100);
        mojiBankAccount.deposit(250);
        mojiBankAccount.withdraw(50);

        mojiBankAccount.withdraw(200);
        mojiBankAccount.deposit(100);
        mojiBankAccount.withdraw(45.55);
        mojiBankAccount.withdraw(54.46);

        mojiBankAccount.withdraw(54.55);

        Account timsAccount = new Account("Tim", "tim@gmail.com", "916 342 4452");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());
    }
}
