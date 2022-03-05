package peng.amoremc;

public class PassWord {

    private static final int key = 123456789;
    private final int encryptedPassword;


    public PassWord(int passpword) {
        this.encryptedPassword = encryptDecrypt(passpword);
    }

    private int encryptDecrypt(int password)
    {
        return password ^ key;
    }

    public void storePassword(){
//        public final void storePassword{

            System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return  true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
