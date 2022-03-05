package peng.amoremc;

public class ExtendedPassword extends PassWord{
    private int decryptPassword;

    public ExtendedPassword(int passpword) {
        super(passpword);
        this.decryptPassword = passpword;
    }

    @Override
    public void storePassword() {
//        super.storePassword();
        System.out.println("Saving password as " + this.decryptPassword);
    }
}
