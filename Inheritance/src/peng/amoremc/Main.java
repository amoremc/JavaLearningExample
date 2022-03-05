package peng.amoremc;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1,1,5, 5);

        Dog dog = new Dog("wangwang",8,20,2,4,1,"Long Silky");
        dog.eat();//the "eat" method is inherited from parent class
        dog.walk();
        dog.run();

        Fish fish = new Fish("Nimo", 5, 40, 2, 2, 1);
        fish.move(60);

    }
}
