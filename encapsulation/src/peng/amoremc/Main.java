package peng.amoremc;

//encapsulation is the mechanism that allows you to restrict access to certain components in the objects you are creating;

public class Main {

    public static void main(String[] args) {

//bad example without Encapsulation

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health  = "+ player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;//the class calling the player class is able to change those fields directly.
//        player.loseHealth(damage);
//        System.out.println("Remaining health  = "+ player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
        //即使子类内部的field名称改变了，也能正常运行
        System.out.println("Initial health is " + player.getHealth());

    }
}
