package peng.amoremc;

public class ScopeCheck {
    public int publicVar = 0;
    private int var1 = 1;//refactor --> rename: from privateVar to var1
    // the scope of var1 is entire "ScopeCheck" class， although it is private accessible at here
    //the private varibale is accessible by its inner or supper class.

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + "; PrivateVar = " + var1);
//        System.out.println(var4);// the scope of var4 is only for main method and main class
    }

    public int getVar1() {
        return var1;
    }

//java对于变量会从小到大，一级一级的向上索引，直到找到对应的变量初始化为止; 比如这里的" privateVar"
    //不会从上往下找， 比如这里的 " i "

    public void timesTwo() {
        int var2 = 5;// the scope of var2 is limited to this method
        for (int i = 0; i < 10; i++) {// " i " can only be used in for loop
            System.out.println(i + "times two is " + i * var2 + "---> this is using the variable limited to this method ");
            System.out.println(i + "times two is " + i * var1 + "--> this is using the current Class defined variable");
        }
        //System.out.println("Value of i is " +i);
    }

    //check visibility
    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("var3 from outer class: " + innerClass.var3);
//        System.out.println("var 3 without instance the InnerClass: " + var3);
//        System.out.println("var2 is : " + var2);
//        System.out.println("var5 is : " + var5);//不能向同级找
    }

    //inner class---> class scope
    public class InnerClass {
//        public int var3 = 3;// the scope of var3 is inside "InnerClass"
            private int var3 = 3;//is not visible outside its class or a containing class of its class(parent class), 即使这个class在别的毫不相干的class里例化了（如 main里例化这个innerClass，var3不可以被access）；
            public int var5 = 6;
        public InnerClass() {
            System.out.println("InnerClass created, var1 is" + var1 +" and var3 is " + var3);
        }

        public void timesTwo() {
            System.out.println("var1 is still available here: " + var1);
            for (int i = 0; i < 10; i++) {// " i " can only be used in for loop
                System.out.println(i + "times two is " + i * var3 + "--> this is using the current Class defined variable");
            }

        }
    }
}
