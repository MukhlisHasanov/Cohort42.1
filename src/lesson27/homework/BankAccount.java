package lesson27.homework;

public class BankAccount implements PaymentSystem {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        balance += amount;
        System.out.println("Transfering money $" + amount + " to bank account");
    }

    @Override
    public void withdrawMoney(double amount) {
        balance -= amount;
        System.out.println("Withdrawing money $" + amount + " from bank account");
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
