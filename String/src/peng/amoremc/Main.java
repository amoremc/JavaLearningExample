package peng.amoremc;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "This is a string";
        System.out.println("myString is equal to "+myString);
        myString = myString + "and this is more";
        System.out.println("myString is equal to " +myString);

        myString = myString + "\u00A9 2022";
        System.out.println("myString is equal to " +myString);

        String numberString = "250.55";
        numberString = numberString + "47.55";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;//trying to append an INTEGER to string type variable-> convert to string auto.
        System.out.println("LastString is equal to " + lastString);//outcome is "1050"

        double doubleNumber = 200.456;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
