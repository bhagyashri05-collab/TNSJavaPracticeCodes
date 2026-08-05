package abstractassign;


public class Main {

    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount(1000);

        sa.welcomeMessage();
        sa.deposit(500);
        sa.withdraw(300);
        sa.getBalance();

        System.out.println();

        CheckingAccount ca = new CheckingAccount(2000);

        ca.deposit(700);
        ca.withdraw(1000);
        ca.getBalance();

        System.out.println();

        Transaction t = new Transaction();
        t.performTransaction(500);
    }

}