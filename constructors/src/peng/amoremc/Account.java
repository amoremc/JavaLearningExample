package peng.amoremc;

public class Account {

    private  String number;
    private  double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){//只有access modifier和类名，没有static，void什么的
        //call another constructor in one constructor
        // 表示如果没有额外在main里传参，就用这些；
        //别忘了关键字"this",带this的这句，必须是constructor的第一句！！！！！
        // System.out.println("Empty constructor called");
        this("56789", 2.50, "Default name", "Default address", "default fone" );
        //System.out.println("Empty constructor called");
    }

    //constructor can also be overloaded;
    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number;//updating fields without using setter
        this.balance = balance;
        //setBalance(balance);//updating fields by calling setter->not a good way for inheretance.
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("Balance is " + balance);

    }

    //generate constructor auto by IntelliJ: Code -> Generate ->Constructor -> choose target parameter
    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        //this.customerName = customerName;//created by IntelliJ
        //this.customerEmailAddress = customerEmailAddress;//created by IntelliJ
        //this.customerPhoneNumber = customerPhoneNumber;//created by IntelliJ
        //把本constructor里没有的参数赋成默认值，已有的参数按main里的调用传参；
        this("9999", 100.55, customerName,customerEmailAddress, customerPhoneNumber);
    }

    public String getNumber(){
        return this.number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}
