package peng.amoremc;

public class Player {
//bad example without Encapsulation
    //    //public String name;
    public String fullName;//when you change the field name, you have to change in other class also.
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0){
            System.out.println("Player knocked out");
            //reducing number of lives remaining for the player;
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
