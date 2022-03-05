package peng.amoremc;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

//        Team adelaideCrows = new Team("Adelaide Crows");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");

        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago cubs");
        baseballPlayerTeam.addPlayer(pat);

//        Team<String> brokenTeam = new Team<>("This won't work");
        //will get error here, Cz the String cannot be cast to Player in Team class.
        // we can restrict the generic type in Team class to Player type, by using "extends"
//        brokenTeam.addPlayer("no-one");


        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("wonwonwonwon");
        soccerPlayerTeam.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
    }
}
