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

class CheckingAccountTest {

    private static CheckingAccount checkingAccount;
    private static SavingsAccount savingsAccount;

    @BeforeAll
    public static void header() {
        System.out.println("Test class CheckingAccount");
    }

    @BeforeEach
    public void classCreation() {
        checkingAccount = new CheckingAccount();
        savingsAccount = new SavingsAccount();
    }


    @ParameterizedTest
    @MethodSource("payingTestSource")
    public void payingTest(int balance, int amount, boolean expected) {
        checkingAccount.addMoney(balance);

        boolean answer = checkingAccount.pay(amount);

        Assertions.assertEquals(answer, expected);
    }

    private static Stream<Arguments> payingTestSource() {
        return Stream.of(
                Arguments.of(200, 100, true),
                Arguments.of(200, 210, false)
        );
    }

    @Test
    public void replenishingTest() {
        int amount = 100;

        boolean answer = checkingAccount.addMoney(amount);

        Assertions.assertTrue(answer);
    }

    @ParameterizedTest
    @MethodSource("transmittingTestSource")
    public void transmittingTest(int balance, int amount, boolean expected) {
        checkingAccount.addMoney(balance);

        boolean answer = checkingAccount.transfer(savingsAccount, amount);

        Assertions.assertEquals(answer, expected);
    }

    private static Stream<Arguments> transmittingTestSource() {
        return Stream.of(
                Arguments.of(200, 100, true),
                Arguments.of(200, 210, false)
        );
    }
}
