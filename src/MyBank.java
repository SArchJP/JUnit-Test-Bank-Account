import lt.vtvpmc.oop.practice.Account;
import lt.vtvpmc.oop.practice.Bank;
import lt.vtvpmc.oop.practice.BankAccount;

public class MyBank extends Bank {
    public MyBank() {
        super();
    }

    @Override
    protected Account postProcessAccount(Account account) {
        return super.postProcessAccount(new MyBankAccount(account));
    }
}
