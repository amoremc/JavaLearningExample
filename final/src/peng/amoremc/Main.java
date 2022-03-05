package peng.amoremc;

import java.math.MathContext;

public class Main {

    public static void main(String[] args) {
//  final keywords is used to define a constant, the final variable can just be modified onece, and any modification
        //must be performed before the class constructor finishes.
        //we can assign the final variable with a value when we declare it or in the constructor.

        //by making instanceNumber "final", its value cannot be changed once the class
        //instance has been created.

        //if the value is really to be a constant, need to be declared as " static final".

        //by declaring a class as 'final', no subclass allowed to extend this class

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI);
//        Math m = new Math(); //class Math cannot be initiated

       // Math m = new Math();
        //the constructor of Math class is declared as private, no one can instance this class.
        //also the Math class is declared as final, no subclass(no extension) allowed
        System.out.println("==================================");


        int pw = 674312;
        PassWord password = new PassWord(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(52366);
        password.letMeIn(456544);
        password.letMeIn(63522);
        password.letMeIn(123456789);
        password.letMeIn(122783517);
        password.letMeIn(674312);

        System.out.println("==================================");

        ExtendedPassword extendedPassword = new ExtendedPassword(pw);

        extendedPassword.storePassword();
        //less secure with final method in parent class. the child class can override the non-final method to any version.

        extendedPassword.letMeIn(1);
        extendedPassword.letMeIn(52366);
        extendedPassword.letMeIn(456544);
        extendedPassword.letMeIn(63522);
        extendedPassword.letMeIn(123456789);
        extendedPassword.letMeIn(122783517);
        extendedPassword.letMeIn(674312);
        System.out.println("==================================");

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
