package peng.amoremc;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();
//        dog.getName();
        dog.normal();

//        Bird bird = new Bird("wond"); //abstract class cannot be instantiated
        Parrot bird = new Parrot("wond");

        bird.breath();
        bird.eat();
        bird.normal();
        bird.fly();

        Penguin penguin = new Penguin("Nimo");
        penguin.fly();
    }

}
