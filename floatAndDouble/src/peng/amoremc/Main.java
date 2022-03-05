package peng.amoremc;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.printf("Float maximum value = "+myMaxFloatValue+"\n");


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.printf("Double maximum value = "+myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatvalue1 = 5;
        double myDoubleValue1 = 5;

        float myFloatvalue2 = 5f / 3;
        double myDoubleValue2 = 5d / 3;
        //double myDoubleValue2 = 5.00/3.00;

        //float myFloatvalue3 = 5.25;//decimal value is "double" type by default;
        double myDoubleValue3 = 5.25;

        float myFloatValue4 = 5.26f;//"f" specify floating type, better way;
        float myFloatValue5 = (float) 5.26; //same as previous one
        double myDoubleValue4 = 5.26d;//"d" specify double type

        System.out.println("\n"+"myIntValue = " +myIntValue);

        System.out.println("myFloatValue4 = " + myFloatValue4);
        System.out.println("myDoubleValue4 = " + myDoubleValue4);

        System.out.println("myFloatValue1 = " + myFloatvalue1);
        System.out.println("myDoubleValue1 = " + myDoubleValue1);

        System.out.println("myFloatValue2 = " + myFloatvalue2);
        System.out.println("myDoubleValue2 = " + myDoubleValue2);

        double pounds = 13;
        double convert = 0.45359237;
        double kilo = pounds * convert;
        System.out.printf("kilogram is "+kilo);


        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.printf("pi is "+pi);
        System.out.printf("Anothernum is "+anotherNumber);

    }
}
