package lesson27.homework;

public class ElectronicWallet implements PaymentSystem {
    private double balance;

    public ElectronicWallet(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        balance += amount;
        System.out.println("Transfering money $" + amount + " to electronic wallet");
    }

    @Override
    public void withdrawMoney(double amount) {
        balance -= amount;
        System.out.println("Withdrawing money $" + amount + " from electronic wallet");
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
