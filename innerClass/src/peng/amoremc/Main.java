package peng.amoremc;


/*
four types of nested class:
1. static nested classes: mainly used to associate with outer class. 但是要先把outer class实例化，才能access outer class里面的non-static method；
2. nonstatic nested class, also called inner class.
3. local class: declared inside a block, i.e. method, if statement
4. anonymous class: a nested class without a class name.

*/

public class Main {

    public static void main(String[] args) {
//
//        //create outer class instance first
//        Gearbox mcLaren = new Gearbox(6);
//
//        //"Gear" is inner class of "Gearbox.
//        //create inner class instance according to ".new" from outer class instance
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        //错误创建inner class -》 related to syntax
////        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);// error: Gearbox is not a enclosing class->because the inner class(Gear) is not static.
////        //Gearbox(outer class) 并不能直接访问 Gear（inner），所以需要先从outer的实例里例化inner class
////        Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
//
////we cannot access to the method of inner class directly when the inner class method is private.
////        System.out.println(first.driveSpeed(1000));
//


        Gearbox mcLaren = new Gearbox(6);
        //we can implement the initialization in Gearbox constructor
//        mcLaren.addGear(1, 5.3);
//        mcLaren.addGear(2, 10.6);
//        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
    }
}
