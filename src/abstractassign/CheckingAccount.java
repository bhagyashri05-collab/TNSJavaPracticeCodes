package abstractassign;

class CheckingAccount extends Account {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    @Override
    void getBalance() {
        System.out.println("Checking Account Balance = " + balance);
    }
}