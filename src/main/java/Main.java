import account.*;

class Main {
  public static void main(String[] args) {

    CheckingAccount сheckingAccount = new CheckingAccount();

    CreditAccount creditAccount = new CreditAccount();

    SavingsAccount savingsAccount = new SavingsAccount();

    System.out.println("Демо.");
    System.out.println();

    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();
    //System.out.println("Попытка оплатить со сберегательного счёта:");
    //System.out.println(savingsAccount.pay(100));
    System.out.println("Пополняем сберегательный счёт на 25000:");
    savingsAccount.addMoney(25000);
    
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();

    System.out.println("Переводим со сберегательного счёта на расчётный 20000:");
    savingsAccount.transfer(сheckingAccount, 20000);

    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();

    System.out.println("Пытаемся перевести со сберегательного счёта на расчётный ещё 10000:");
    savingsAccount.transfer(сheckingAccount, 10000);
        
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();
    
    System.out.println("Производим оплату с кредитного счёта на 1000:");
    creditAccount.pay(1000);
    
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();
    
    System.out.println("Переводим с кредитного счёта на расчётный 500:");
    creditAccount.transfer(сheckingAccount, 500);
    
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();

    System.out.println("Пополняем кредитный счёт на 300:");
    creditAccount.addMoney(300);
    
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();

    System.out.println("Пытаемся пополнить кредитный счёт на ещё на 3000:");
    creditAccount.addMoney(3000);
        
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();

    System.out.println("Производим оплату с расчётного счёта на: 10000");
    сheckingAccount.pay(10000);
    
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();

    System.out.println("Пытаемся произвести оплату с расчётного счёта ещё на: 15000");
    сheckingAccount.pay(15000);
    
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();

    System.out.println("Переводим с расчётного счёта на кредитный 500:");
    сheckingAccount.transfer(creditAccount, 500);
    
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();

    System.out.println("Переводим с расчётного счёта на кредитный ещё 5000:");
    сheckingAccount.transfer(creditAccount, 5000);
    
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();

    System.out.println("Переводим с расчётного счёта на сберегательный 20500:");
    сheckingAccount.transfer(savingsAccount, 20500);
    
    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();

    System.out.println("Пополняем расчётный счёт на 10000:");
    сheckingAccount.addMoney(10000);

    System.out.println("Баланс сберегательного счёта: " + savingsAccount.balance);
    System.out.println("Баланс кредитного счёта: " + creditAccount.balance);
    System.out.println("Баланс расчётного счёта: " + сheckingAccount.balance);
    System.out.println();
  }
}