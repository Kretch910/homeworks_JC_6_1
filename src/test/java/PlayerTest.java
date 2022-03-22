import account.CheckingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class CheckingAccountTest {

    private static CheckingAccount checkingAccount;

    @BeforeAll
    public static void header() {
        System.out.println("Test class CheckingAccount");
    }

    @BeforeEach
    public void classCreation() {
        checkingAccount = new CheckingAccount();
    }


    @Test
    public void successfulPayment() {
        checkingAccount.addMoney(108);
        int amount = 20;

        boolean answer = checkingAccount.pay(amount);

        Assertions.assertTrue(answer);
    }

    @Test
    public void unsuccessfulPayment() {
        checkingAccount.addMoney(10);
        int amount = 20;

        boolean answer = checkingAccount.pay(amount);

        Assertions.assertFalse(answer);
    }

    @Test
     public void correctCalculation() {
        checkingAccount.addMoney(200);
        int amount = 20;
        int expected = 180;

        checkingAccount.pay(amount);
        int answer = checkingAccount.balance;

        Assertions.assertEquals(expected, answer);
    }
}
