package TwoWay;

/**
* The PegAdapter class. This is the two-way adapter class.
*/
public class PegAdapter implements ISquarePeg, IRoundPeg {
  private RoundPeg rP;
  private SquarePeg sP;

  public PegAdapter(RoundPeg peg) {
    this.rP = peg;
    }
  
  public PegAdapter(SquarePeg peg) {
    this.sP = peg;
    }
  
  public void insert(String str) {
    rP.insertIntoHole(str);
    }
  
  public void insertIntoHole(String msg){
    sP.insert(msg);
    }
}
