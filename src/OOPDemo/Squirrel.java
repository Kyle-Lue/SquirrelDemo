package OOPDemo;

public class Squirrel{
    // instance variables
    String colourString;
    String SizeString;
    int nutCountInt;
    boolean aliveBoolean;
    double iqDouble;

    // constructor
    public Squirrel(String newColourString, String newSizeString, int newNutCount, double newIQdouble){
        this.aliveBoolean = true;
        this.colourString = newColourString;
        this.SizeString = newSizeString;
        this.nutCountInt = newNutCount;
        this.iqDouble = newIQdouble;
    }

    // instance methods

    public void run(){
        System.out.println("run!!");
        
    }

    public void findNut(int numberNuts){
        this.nutCountInt = this.nutCountInt + numberNuts;
    }

    public int getNutCount(){
        return this.nutCountInt;
    }

    public void eatNut(){
        this.nutCountInt--;
    }

    public void climb(){
        System.out.println("Climb that tree!!");
    }

    public void kill(){
        this.aliveBoolean = false;
    }
}