package TwoWay;

/**
 * Driver class for two way Peg Adapter.
 */
public class TwoWayAdapterDriver {
	
  public static void main(String args[]) {

    // Create some pegs.
    // Objects of Adaptee class are made here
	  
	RoundPeg roundPeg = new RoundPeg();
    SquarePeg squarePeg = new SquarePeg();

    // Do an insert using the square peg.
    squarePeg.insert("I am a SquarePeg into a square hole.");

// Create a two-way adapter and do an insert with it.

// This method is used to implement a functionality where:
//  if you have a square peg but you want to insert into a round hole.
    
    ISquarePeg wannabeRound = new PegAdapter(roundPeg);
    wannabeRound.insert("I am a SquarePeg into a round hole!");

    // Do an insert using the round peg.
    roundPeg.insertIntoHole("I am a RoundPeg into a round hole.");

    // Create a two-way adapter and do an insert with it.
    IRoundPeg wannabeSquare = new PegAdapter(squarePeg);
    wannabeSquare.insertIntoHole("I am a RoundPeg into a square hole!");}
}
