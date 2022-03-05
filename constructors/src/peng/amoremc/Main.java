package peng.amoremc;

public class Main {

    public static void main(String[] args) {
	    Account bobsAccount = new Account();
        System.out.println("Default number is "+ bobsAccount.getNumber());

        Account pengAccount = new Account("12345", 0.00, "Bob Brown", "myEmail@.com",
                "2323232");
        System.out.println("Number is "+ pengAccount.getNumber());

        //pengAccount.setBalance(1000000000000.000);
        Account boAccount = new Account("bo", "bo@email.com", "1234500");
        System.out.println(boAccount.getNumber());

    }
}
