package account;

import operations.*;

public class CheckingAccount extends AbstractAccount implements Paying, Transmitting, Replenishing {

  public boolean pay(int amount) {
    if (balance > amount) {
      balance -= amount;
      System.out.println("Покупка осуществленна.");
      return true;
    } else {
      System.out.println("На счёте недостаточно средств.");
      return false;
    }
  }

  public boolean transfer(Replenishing account, int amount) {
    if (balance > amount) {
      System.out.println("Осуществление перевода.");
      if (account.addMoney(amount)) {
        balance -= amount;
        return true;
      } else {
        return false;
      }
    } else {
      System.out.println("На счёте недостаточно средств.");
      return false;
    }
  }

  public boolean addMoney(int amount) {
    balance += amount;
    System.out.println("Средства поступили на счёт.");
    return true;
  }
}