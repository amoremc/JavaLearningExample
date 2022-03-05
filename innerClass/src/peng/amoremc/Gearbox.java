package peng.amoremc;

import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    //constructor
    public Gearbox(int maxGears) {

        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i = 0; i<maxGears; i++){
            addGear(i, i * 5.3);
        }
    }

    //outer class method
    public  void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if ((number > 0) && (number <= maxGears)){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        }else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if (clutchIsIn){
            System.out.println("Scream!!");
            return 0.0;
        }else {
            return revs * gears.get(currentGear).getRatio();
        }
    }

//the inner class has all access to the outer class
    // change the access mode of inner class from public to private, to improve encapsulation
    private class Gear{
        private int gearNumber;
        private double ratio;

        //constructor
        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        //method
        private double driveSpeed(int revs){
            return revs * (this.ratio);
        }

         public double getRatio() {
             return ratio;
          }
}


}
