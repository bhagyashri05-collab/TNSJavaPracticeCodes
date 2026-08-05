package abstractassign;

class Transaction {

    final double transactionFee = 20;

    final void performTransaction(double amount) {

        System.out.println("Transaction Amount : " + amount);
        System.out.println("Transaction Fee : " + transactionFee);

        double total = amount + transactionFee;

        System.out.println("Total Deducted : " + total);
    }
}