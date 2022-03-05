package peng.amoremc;

public abstract class Bird extends Animal implements Canfly{

    public Bird(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is picking.");
    }

    @Override
    public void breath() {
        System.out.println("huhuhuhuhu");
    }


    //not all birds can fly, so make it as abstract method, so the class should be abstract.
//    public abstract void fly();


    @Override
    public void fly() {
        System.out.println("function override from interface");
    }
}
