package OneWay;

/**
* The RoundPeg class.
* This is the Adaptee class.
*/
public class RoundPeg {
  /**
   * The client does not know this interface, though
   * it provides the service that the client wants.  
   */
  public void insertIntoHole(String msg) {
    System.out.println("RoundPeg insertIntoHole(): " + msg);
  }
}
