package peng.amoremc;

public class Main {

    public static void main(String[] args) {

        Account pengsAccount = new Account("Peng");
        pengsAccount.deposit(1000);
        pengsAccount.withdraw(500);
        pengsAccount.withdraw(-200);
        pengsAccount.deposit(-20);

        System.out.println("Current balance from getBalance(): " + pengsAccount.getBalance());

        pengsAccount.calculateBalance();
        //System.out.println("Current balance from calculateBalance(): " + pengsAccount.calculateBalance());

    }
}
