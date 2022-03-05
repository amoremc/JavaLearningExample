package peng.amoremc;

public class SomeClass {
//public class otherClass extends Math{}
    private final int exampleNumber  = 1;
    private final int instancelala;

    private static int classCounter = 0;
    private final int instanceNumber;
    private final String name;


    public SomeClass(String name) {
        //exampleNumber = 2;
        instancelala = 4;

        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    //mark the methods as final to prevent the method to be overriden in subclassed
}
