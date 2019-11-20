package WEEK7_OBJECTS.Pool;

public class Pool {
    //variables - referred to as fields
    private String name;
    private double length;
    private boolean isInside;


    // constructor MUST HAVE SAME NAME AS CLASS!
    public Pool(String name, double length, boolean isInside) {
        this.name = name;
        this.length = length;
        this.isInside = isInside;
    }

    public double distanceForLaps(int laps){
        return laps * length;
    }

    public boolean canSwimInWinter(){
        return isInside;
    }




    /*every object/class created  in java extends the built in class called "object" override
    isnt needed but its an annotation  - writing your own version of a method from a super class
    overide will have the compiler double check the method name.
    */
    @Override
    // to string will return a readable string instead of the memory address with this method also called an instance method
    public String toString() {
        String insideString = isInside ? "inside" : "outside"; //ternary operator takes a boolean if it is true it assigns the first listed value, if false it assigns the latter.
        return name + "pool is " + length + " meters long, " + "and is " + insideString;
    }
}