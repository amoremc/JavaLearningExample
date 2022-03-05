package peng.amoremc;

//Polymorphism allows actions to act differently based on the actual action is being performed on.
//creat class in the Main page

class Movie{
    private String name;

    //constructor
    public Movie(String name) {
        this.name = name;
    }

    //method
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

//five more classes now, all of them inherite from base Movie class
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }

    //No plot method
}

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " + i +
                                ":" + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n");
        }
    }

    //retrurn random movies(one of the five)
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 5) + 1; //return a int number belong to  [0,5]
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();

//            default:
//                return null;
        }

        return null;
    }
}
