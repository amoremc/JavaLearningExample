package peng.amoremc;

public class EnhancedPlayer {

    private String name;
    //to rename something: right click -> refactor -> rename
    private int hitPoint = 100;//define the default health
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.hitPoint = health;//this is encapsulation
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoint = this.hitPoint - damage;
        if (this.hitPoint <= 0){
            System.out.println("Player knocked out");
            //reducing number of lives remaining for the player;
        }
    }

    public int getHealth() {
        return hitPoint;
    }
}
