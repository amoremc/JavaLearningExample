package peng.amoremc;

public class Penguin extends Animal implements Canfly{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println(getName() + "is breathing");
    }

    @Override
    public void fly() {
        System.out.println("fly method defined in Penguin");
    }
}
