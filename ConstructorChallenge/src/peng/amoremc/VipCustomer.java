package peng.amoremc;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){

        this ("Defaultname ", 0.0000, " defaultemailaddress");

    }

    public VipCustomer(double creditLimit, String emailAddress){
        this("Default name", creditLimit, emailAddress);
        //this.creditLimit = creditLimit;
        //this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
