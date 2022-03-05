package peng.amoremc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //value type: there is memory space allocated to this value, and a variable directly holds the value.
	    //value type： 一对一
        int myIntValue  = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("anotherIntValue = "+anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue = "+myIntValue);
        System.out.println("anotherIntValue = "+anotherIntValue);

        //reference type
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; //anotherArray and myIntArray holds the same object address;

        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);
        System.out.println("after modified myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("after modified anotherArray = " + Arrays.toString(anotherArray));

    }

    public static void modifyArray(int[] array){
        array[0] = 2;

        //de-reference
        array = new int[] {1,2,3,4,5};
    }
}
