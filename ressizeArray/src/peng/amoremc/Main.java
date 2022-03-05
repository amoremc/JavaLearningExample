package peng.amoremc;

import java.util.Scanner;
//resize one array which has 10 elements, to 12 elements and contains the original content;
//ArrayLists can handle the resizing automatically
public class Main {
    //global variable
    private static Scanner s = new Scanner(System.in);
    //non-static variable s cannot be referenced from a static context
    private static int[] baseData = new int[10];

    public static void main(String[] args) {

        System.out.println("Enter 10 integers: ");
        getInput();
        System.out.println("Entered value has been received: \r");
        printArray(baseData);
        resizeArray();
        System.out.println("After resizing, the array becomes: \r");
        printArray(baseData);
        System.out.println("Enter 12 integers: ");
        getInput();
        System.out.println("Now the content of the array has been reset to other values");
        printArray(baseData);
    }

    private static void getInput(){

        for (int i = 0; i < baseData.length; i++){
            baseData[i] = s.nextInt();
        }

    }

    private static void printArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    private static void resizeArray(){

        int[] original = baseData;

        baseData = new int[12];

        for (int i = 0; i<original.length; i++){
            baseData[i] = original[i];
        }

    }
}
