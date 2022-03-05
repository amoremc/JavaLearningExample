package peng.amoremc;


public class Main {
//main method do not need to be in Main class, main method can be in any class.

    public static int multiplier = 7;

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number. " + firstInstance.getNumInstances() + " the static instance number is  " + firstInstance.getStaticnumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number. " + secondInstance.getNumInstances() + " the static instance number is  " + secondInstance.getStaticnumInstances());


        System.out.println("===========================================");

        //java cannot allow a static method to access non-static fields or method
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }

    public static int multiply (int number) {
        return number * multiplier;
    }
}
