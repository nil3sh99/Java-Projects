package TwoWay;

/**
 * The RoundPeg Target/Adaptee class.
 */
public class RoundPeg implements IRoundPeg {
  public void insertIntoHole(String msg) {
    System.out.println("RoundPeg insertIntoHole(): " + msg);}
}
