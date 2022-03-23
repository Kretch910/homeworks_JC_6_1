import account.CheckingAccount;
import account.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SavingsAccountTest {

    private static CheckingAccount checkingAccount;
    private static SavingsAccount savingsAccount;

    @BeforeAll
    public static void header() {
        System.out.println("Test class SavingsAccount");
    }

    @BeforeEach
    public void classCreation() {
        checkingAccount = new CheckingAccount();
        savingsAccount = new SavingsAccount();
    }

    @Test
    public void ReplenishingTest() {
        int amount = 100;

        boolean answer = savingsAccount.addMoney(amount);

        Assertions.assertTrue(answer);
    }

    @ParameterizedTest
    @MethodSource("TransmittingTestSource")
    public void TransmittingTest(int balance, int amount, boolean expected) {
        savingsAccount.addMoney(balance);

        boolean answer = savingsAccount.transfer(checkingAccount, amount);

        Assertions.assertEquals(answer, expected);
    }

    private static Stream<Arguments> TransmittingTestSource() {
        return Stream.of(
                Arguments.of(200, 100, true),
                Arguments.of(200, 210, false)
        );
    }
}
