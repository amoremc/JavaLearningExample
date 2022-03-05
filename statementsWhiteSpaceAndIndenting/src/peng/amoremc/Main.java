package peng.amoremc;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50; //entire line is statement;
        myVariable++; //statement
        System.out.println("This is" +
                " Another" +
                " story");//java would combine them as one line, Cz there is no ; to finish one line;

        //菜单栏： code->reformat code 就可以优化代码结构
        // cmd + / ->整体注释

        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        if(score==10000 && levelCompleted == 8 && bonus == 200){
            System.out.println("second score get");
        };

    }
}
