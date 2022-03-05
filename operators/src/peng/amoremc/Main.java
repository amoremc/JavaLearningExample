package peng.amoremc;

public class Main {

    public static void main(String[] args) {
	    int result = 4;

        //result = result +1;
        result++;//4+1 = 5
        System.out.println(result);
        result += 1; //5+1 =6
        System.out.println(result);

        result *=10;
        System.out.println(result);

        result /= 3;//result = result / 3;
        System.out.println(result);

        boolean isCar = false;
        if(isCar = true){//if内只要boolean类型的，这里相当于给isCar赋值成true了；
            System.out.println("this is not supposed to happen");
        }

        boolean isCar1 = false;
        if(isCar1 == true){//if内只要boolean类型的，这里相当于给isCar赋值成true了；
            System.out.println("this is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;//ternary operator;
        if (wasCar){
            System.out.println("This is what happend");
        }

    }
}
