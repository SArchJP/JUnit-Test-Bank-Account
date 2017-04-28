import lt.vtvpmc.oop.practice.Bank;
import lt.vtvpmc.oop.practice.BaseBankTest;

public class MyBaseBankTest extends BaseBankTest {
    @Override
    protected Bank getBank() {
        return new MyBank();
    }
}
