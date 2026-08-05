package abstractassign;

class SavingAccount extends Account {

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    void getBalance() {
        System.out.println("Saving Account Balance = " + balance);
    }
}