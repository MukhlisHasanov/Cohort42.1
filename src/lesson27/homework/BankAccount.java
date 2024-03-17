package lesson27.homework;

public class BankAccount implements PaymentSystem {
    @Override
    public void transferMoney() {
        System.out.println("Transfering money");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Withdrawing money");
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking balance");
    }
}
