/**
 * A concrete Strategy that implements a addition operation.
 * 
 * What we are doing here is:
 * for same method in the Strategy class, "execute()" we are implementing the different behaviors it can exhibit.
 * So that method is same, but the code in it changes at the run time to --> Add, Subtract, Multiply (i.e. to the type of strategy we want it to set to)
 */
class Add implements Strategy {
    public int execute(int a, int b) {
        System.out.println("Called Add's execute()");
        return a + b;  // Do an addition with a and b
    }
}
 