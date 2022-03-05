package peng.amoremc;

public class Main {

    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getCreditLimit());

        VipCustomer customer2 = new VipCustomer(50000, "bob@email.com");
        System.out.println(customer2.getEmailAddress());

        VipCustomer customer3 = new VipCustomer("Peng", 5000000000000000000.00000, "peng.email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
    }
}
