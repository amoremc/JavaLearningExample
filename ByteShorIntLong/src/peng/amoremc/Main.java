package peng.amoremc;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntvalue = Integer.MAX_VALUE;
        System.out.println("int minimum value = "+myMinIntValue);
        System.out.println("int max value = " + myMaxIntvalue);
        System.out.println("Busted Max value = " +(myMaxIntvalue +1));
        System.out.println("Busted min value = "+(myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("myMinBytevalue" + myMinByteValue);
        System.out.println("myMaxByteValue" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("myMinShortvalue" + myMinShortValue);
        System.out.println("myMaxShortValue" + myMaxShortValue);

        //long myLongValue = 100L;
        //long myLongValue = 100;
        //long myLongValue = 9223372036854775807; //treat as integer without "L" in the end;
        long myLongValue = 9223372036854775807L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("myMinLongvalue" + myMinLongValue);
        System.out.println("myMaxLongValue" + myMaxLongValue);
        System.out.println(myLongValue);

        int myTotal = (myMinIntValue / 2);
        //byte myNewByteValue = (myMinByteValue / 2);//the default type of a number is "int", you are doing narrow casting when you transfer from "int" to "byte"
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte byteNum = 123;
        short shortNum = 456;
        int intNum = 789;
        long totalNum1 = (50000L+10L)*((long)byteNum + (long) shortNum +(long) intNum);
        long totalNum2 = (50000+10)*(byteNum+shortNum+intNum);
        System.out.println("totalNum1 = "+totalNum1);
        System.out.println("totalNum2 = "+totalNum2);



    }
}
