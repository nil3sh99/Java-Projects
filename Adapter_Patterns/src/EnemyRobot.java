/**
 * This is the adaptee class.
 */

import java.util.Random;

public class EnemyRobot {
	
	Random generator = new Random();
	
	public void smashWithHands() {
		int damage = generator.nextInt(10) + 1;
		
		System.out.println("Tank does " + damage + " damage");
	}
	
	public void walkForward() {
		int movement = generator.nextInt(5) + 1;
		
		System.out.println("Tank moves " + movement + " moves");
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("Enemy Robot Tramps on " + driverName);
	}
}
