package peng.amoremc;

public class SIBTest {
    //SIB: static initialization block
    public static final String owner;

    //当new 一个 instance时，所有SIB执行完，再执行constructor， 不论顺序是怎么。
    static {
        //static initialization block can be used to assign "final static" variable.
        owner = "Peng";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
