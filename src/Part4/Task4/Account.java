package Part4.Task4;

public class Account {
    private double balance;

    public double getBalance() {
        double commission = 0.05;
        setBalance(balance * (1 - commission));
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
