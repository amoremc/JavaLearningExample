package peng.amoremc;

public class Main {

    public static void main(String[] args) {
	    double first = 20.00;
        double second = 80.00;
        double third = (first +second) *100.00;
        double reminder = third % 40.00;
        double modulus = third / 40.00;
        boolean output;
        if(reminder == 0){
            output = true;
            System.out.println("output is "+ output);
        }else{
           output = false;
            System.out.println("output is "+ output);
        }
        if(output != true){
            System.out.println("Got some reminder");
        }
    }
}
