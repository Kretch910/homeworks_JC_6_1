import account.CreditAccount;
import account.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CreditAccountTest {
    private static CreditAccount creditAccount;
    private static SavingsAccount savingsAccount;

    @BeforeAll
    public static void header() {
        System.out.println("Test class CreditAccount");
    }

    @BeforeEach
    public void classCreation() {
        creditAccount = new CreditAccount();
        savingsAccount = new SavingsAccount();
    }

    @Test
    public void PayingTest() {
        int amount = 100;

        boolean answer = creditAccount.pay(amount);

        Assertions.assertTrue(answer);
    }

    @ParameterizedTest
    @MethodSource("ReplenishingTestSource")
    public void ReplenishingTest(int amount, boolean expected) {
        creditAccount.pay(150);

        boolean answer = creditAccount.addMoney(amount);

        Assertions.assertEquals(answer, expected);
    }

    private static Stream<Arguments> ReplenishingTestSource() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(200, false)
        );
    }

    @Test
    public void TransmittingTest() {
        int amount = 100;

        boolean answer = creditAccount.transfer(savingsAccount, amount);

        Assertions.assertTrue(answer);
    }
}
