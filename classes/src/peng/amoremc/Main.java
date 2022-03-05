package peng.amoremc;

public class Main {

    public static void main(String[] args) {
        //build an object based on class-Car
        //when creating a new object, you need to initialize it;
        Car porsche = new Car();
        Car holden = new Car();

        //porsche = null;//class 没有被 new，之前创建的对象被null覆盖了

        //some new state would be inherited from Java base class, when you building new object;
        //porsche.model = "Carrera";
        //after implement setter in Car class
        System.out.println("Model is "+porsche.getModel());
        porsche.setModel("Carrera");
        //after implement getter in Car class
        System.out.println("Model is "+porsche.getModel());

        porsche.setModel("aaaa");
        System.out.println("Model is "+porsche.getModel());
    }
}
