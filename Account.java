package abstractassign;

abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    abstract void getBalance();

    public void welcomeMessage() {
        System.out.println("Welcome to Bank");
    }
}