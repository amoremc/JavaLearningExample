package peng.amoremc;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is "+newScore);

        calculateScore(75);

        calculateScore();
    }
//overLoading method: same method name, but different number of parameters;
    //not overWriting, overRiding
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName +" scored "+score +" points");
        return score*100;
    }
    public static int calculateScore(int score){
        System.out.println("unnamed Player " +" scored "+score +" points");
        return score*100;
    }

    public static void calculateScore(){
        System.out.println("no Player name, no score ");
    }

}
