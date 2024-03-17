package lesson27.homework;

public interface PaymentSystem {
    void transferMoney(double amount);

    void withdrawMoney(double amount);

    double checkBalance();
}
