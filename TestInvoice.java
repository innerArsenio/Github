public class TestInvoice {
    public static void main(String[] args){

        Customer c=new Customer(100, "John", 50);
        Invoice m1 = new Invoice(1234,c,33); // Test constructor
        System.out.println("ID: " + m1.getID()); // Test getters
        System.out.println("customer: " + m1.getCustomer()); // Test getters

        Customer c1=new Customer(4321, "Johnny", 70);
        m1.setCustomer(c1);
        m1.setAmount(100);

        System.out.println("amount: " + m1.getAmount()); // Test getters
        System.out.println("customer name: " + m1.getCustomerName()); // Test getters
        System.out.println("amount after discount: " + m1.getAmountAfterDiscount()); // Test getters


    }
}
