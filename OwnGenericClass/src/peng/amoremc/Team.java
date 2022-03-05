package peng.amoremc;

import java.util.ArrayList;

//public class Team {
//public class Team<T> {//now T can be any type, no restriction. But some type cannot be casted to target one, potential problem.
public class Team<T extends Player> {
//public class Team<T extends class & interface & interface & interface....>

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    //    private ArrayList<Player> members = new ArrayList<>();
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public boolean addPlayer (Player player){
//    public boolean addPlayer (T player){
public boolean addPlayer (T player) {
    if (members.contains(player)) {
        //.getName()会报错，因为直到run的时候才会知道type是什么，到底有无getName()这个method，所以这里强制转换，cast to Player class
//            System.out.println(player.getName() + " is already on this team");
//        System.out.println(((Player) player).getName() + " is already on this team");
        //we do not need cast for type after setting the bound of generic type
        System.out.println(player.getName() + " is already on this team");
        return false;
    } else {
        members.add(player);
//            System.out.println(player.getName() + " picked for team" + this.name);
//        System.out.println(((Player) player).getName() + " picked for team" + this.name);
        System.out.println(player.getName() + " picked for team" + this.name);
        return true;
    }
}

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            won++;
        }else if (ourScore == theirScore){
            tied++;
        }else {
            lost++;
        }
        played++;//以上是保存ourteam的比赛结果
        if (opponent != null){
            opponent.matchResult(null, theirScore, ourScore);//保存opponent的比赛结果。
        }

    }

    public int ranking(){
        return (won * 2) + tied;
    }
}
