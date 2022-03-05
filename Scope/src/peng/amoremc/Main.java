package peng.amoremc;

//Scope is the visibility of Class, members and variables.

public class Main {

    public static void main(String[] args) {

        String var4 = "This is private to main()";// the scope of var4 is inside of the whole main class and main method.

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerclass = scopeInstance.new InnerClass();
//        System.out.println("var3 is not accessible here " + innerclass.var3);
        System.out.println("var5 is accessible here " + innerclass.var5);

        System.out.println("*********************************");

        System.out.println("ScopeInstance var1 is " + scopeInstance.getVar1());
        System.out.println(var4);

        scopeInstance.timesTwo();

        System.out.println("*********************************");

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
