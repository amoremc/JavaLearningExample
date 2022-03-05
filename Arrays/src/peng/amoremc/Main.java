package peng.amoremc;

public class Main {

    public static void main(String[] args) {

//        int[] myVariable;
//        myVariable = new int[10]; //要创建的array里有 10 个元素；

//          int [] myIntArray = new int[10];
//          myIntArray[5] = 50; // the 6th element is 50

        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myIntArray[5]);

        double[] myDoubleArray = new double[10];
//        //for(int i = 0; i<10; i++){
//        for(int i = 0; i<myDoubleArray.length; i++){ //length is a function in array class
//            myDoubleArray[i] = i*10;
//            System.out.println(myDoubleArray[i]);
//        }

        printArray(myDoubleArray);

    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) { //length is a function in array class
            array[i] = i * 10;
            System.out.println(array[i]);
        }
    }
}
