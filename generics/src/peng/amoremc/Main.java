package peng.amoremc;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        ArrayList items = new ArrayList<>();//create a raw arraylist which can store any  type of object

        ArrayList<Integer> items = new ArrayList<>();// <> called diamond
        items.add(1);//autoboxing
        items.add(8);
        items.add(2);
        //items.add("tim");
        items.add(3);
        items.add(4);

        printDoubled(items);
    }

//    private static void printDoubled(ArrayList n){
        private static void printDoubled(ArrayList<Integer> n){

            for (Object i : n){
//            System.out.println((Integer) i *2);
                System.out.println((int)i * 2);

            }
    }
}
