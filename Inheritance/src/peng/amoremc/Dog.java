package peng.amoremc;


//"extends" means inheritate from other class
public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;



    //"super" is to call the constructor which from the class(superClass) that we are extending from
    //生成default inherited constructor 需要在单独声明该sub-class的field之前，不然不能通过IntelliJ自动生成；
    //不论constructor里的参数怎么变，前几个一定是父类的default constructor里的参数

//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, String coat) {
        super(name, 1, 1, size, weight);//给父类的constructor传参；
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //we can inherite the method from parent class, but also can override the method;
    //i.e. the "eat" method;
    private void chew(){
        System.out.println("Dog.chew() called ");
    }



    //override methods
    // command+N->可以选择override method
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
        //"super" means that call the super equivalent of that class
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);//sometimes we need to override the parent class func, but we still want to use the parent one at some point;
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
