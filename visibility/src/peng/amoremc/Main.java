package peng.amoremc;

//Scope is the visibility of Class, members and variables.

public class Main {

    public static void main(String[] args) {

        String privateVar = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("ScopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
