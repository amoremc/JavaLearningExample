package peng.amoremc;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Peng", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;//assign the second class to point to the first class;
        //class is reference type;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " +customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i+ ": "+ intList.get(i));
        }

        intList.add(1,9);//first parm is the index, second parm is the item you want

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i+ ": "+ intList.get(i));
        }

    }
}
