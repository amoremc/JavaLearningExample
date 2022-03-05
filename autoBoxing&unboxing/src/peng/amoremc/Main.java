package peng.amoremc;

import java.util.ArrayList;

//you use autoboxing and unboxing when you want to store primitive types in arraylist in Java


//wrapper
class intClass{
    private int myValue;

    public intClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Peng");

        /*
        ArrayList<int> intArrayList = new ArrayList<int>();
        // you will get an error here;
        //the type of arraylist should be a class, but int is primitive type, not class
         */

        ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
        intClassArrayList.add(new intClass(54));

        Integer integer = new Integer(54); //Integer is a class
        Double doubleValue = new Double(12.25); //double is a keyword;

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++){
            integerArrayList.add(Integer.valueOf(i));//autoboxing: turn an int(primitive type) into Integer(class)
        }

        for (int i = 0; i<= 10; i++){
            System.out.println(i + "--->" + integerArrayList.get(i).intValue());//unboxing: taking it from the class or from the object wrapper and
            //converting it back to primitive type;
        }

//short way to do autoboxing and unboxing

        Integer myIntValue = 56;
        //equal to, the java compiler can do this for you
        Integer myIntValue2 = Integer.valueOf(56);


        int myInt = myIntValue;
        //equal to
        int myInt2 = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl<=10.0; dbl += 0.5){
//            myDoubleValues.add(Double.valueOf(dbl));
            myDoubleValues.add(dbl);

        }
        for (int i = 0; i<myDoubleValues.size(); i++){
//            double value = myDoubleValues.get(i).doubleValue();
            double value = myDoubleValues.get(i);

            System.out.println(i + " -----> " + value);
        }

    }
}
