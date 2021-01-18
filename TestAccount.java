public class TestAccount {
    public static void main(String[] args){

        Customer2 c=new Customer2(100, "John", 'm');
        Account a = new Account(1234,c, 100); // Test constructor
        System.out.println("ID: " + a.getId()); // Test getters
        System.out.println("customer: " + a.getCustomer()); // Test getters
        System.out.println("balance: " + a.getBalance()); // Test getters

        a.setBalance(200);

        System.out.println("account: " + a.toString()); // Test getters
        System.out.println("customer name: " + a.getCustomerName()); // Test getters


        a.deposit(100);
        System.out.println("balance: " + a.getBalance()); // Test getters
        a.withdraw(100);
        System.out.println("balance: " + a.getBalance()); // Test getters

    }
}
