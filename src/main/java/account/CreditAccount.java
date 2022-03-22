package account;

import operations.*;

public class CreditAccount extends AbstractAccount implements Paying, Transmitting, Replenishing {

    public boolean pay(int amount) {
        balance -= amount;
        System.out.println("Покупка осуществленна.");
        return true;
    }

    public boolean transfer(Replenishing account, int amount) {
        System.out.println("Осуществление перевода.");
      if (account.addMoney(amount)) {
        balance -= amount;
        return true;
      } else {
        return false;
      }
    }

    public boolean addMoney(int amount) {
        if (balance + amount < 0) {
            balance += amount;
            System.out.println("Задолжность погашена на " + amount);
            return true;
        } else {
            System.out.println("Внесите сумму не привышающею задолжность.\nЗадолжность составляет: " + balance);
            return false;
        }
    }
}