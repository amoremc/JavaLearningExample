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
        Math m = new Math();

    }
}
