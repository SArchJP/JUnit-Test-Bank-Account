import lt.vtvpmc.oop.practice.Account;
import lt.vtvpmc.oop.practice.FeeCollector;

public class MyBankAccount implements Account, FeeCollector {
    private Account account;
    private String number;
    private double balance;
    private double earnings;
    private int numberOfTransactions;

    public MyBankAccount(Account account) {
        this.account = account;
        this.number = account.getNumber();
        this.balance = account.getBalance();
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public boolean deposit(double v) {
        if (v >= 5) {
            balance = balance + (v - (v * 0.02));
            earnings = earnings + (v * 0.02);
            numberOfTransactions++;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double v) {
        if (v >= 5 && balance > 0 && v >= balance * 0.1) {
            balance = balance - v;
            numberOfTransactions++;
            return true;
        }
        return false;
    }

    @Override
    public double getEarnings() {
        return earnings;
    }

    @Override
    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    @Override
    public double getAverageEarningsPerTransaction() {
        return earnings / numberOfTransactions;
    }
}
