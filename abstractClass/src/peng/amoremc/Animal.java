package peng.amoremc;


//you can just declare abstract method by using keyword "abstract" or 具体可以执行的method inside of a abstract class
//but you can only decalre abstract method without using keyword "abstract" in interface
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }

    public void normal(){
        System.out.println("from abstract class.");
    }
}
