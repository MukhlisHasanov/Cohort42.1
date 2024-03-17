package lesson27.homework;

/**
 * AIT-TR, Cohort42.1, Java Basic Homework #27
 * @author Muklis Hasanov
 * @version 17-Mar-24
 */
public class Homework27 {
    public static void main(String[] args) {

        // task#1
       ElectronicWallet electronicWallet = new ElectronicWallet(0);
       BankAccount bankAccount = new BankAccount(0);
       electronicWallet.transferMoney(1000);
       electronicWallet.withdrawMoney(400);
       System.out.println("eWallet balance: $" + electronicWallet.checkBalance());
       bankAccount.transferMoney(2000);
       bankAccount.withdrawMoney(500);
       System.out.println("Bank account balance: $" + bankAccount.checkBalance());

        // task #2
        Triathlete triathlete = new Triathlete();
        triathlete.run();
        triathlete.swim();
    }
}
