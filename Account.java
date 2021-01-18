public class Account {
    private int id;
    private Customer2 customer;
    private double balance=0.0;

    public Account(int id, Customer2 customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }

    public Account(int id, Customer2 customer){
        this.id=id;
        this.customer=customer;
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer() {
        return customer;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return customer.toString()+" balance=$"+balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amount){
        balance+=amount;
        return this;
    }

    public Account withdraw(double amount){
        if (balance>=amount) {
            balance-=amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }

        return this;
    }

}