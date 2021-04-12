/**
 * The Adapter must provide an alternative action for
 * the the methods that need to be used because EnemyAttacker was implemented
 * 
 * This adapter does this by containing an object 
 * of the same type as the Adaptee (EnemyRobot) 
 * All calls to EnemyAttacker methods are sent instead to methods used by EnemyRobot

 * @author Nilesh Aggarwal
 *
 */

public class EnemyRobotAdapter implements EnemyAttacker{

	/**
	 * Instance variable of the Adaptee
	 */
	EnemyRobot robot;
	
	/**
	 * Constructor of this adapter class is made
	 */
	public EnemyRobotAdapter(EnemyRobot p_robot) {
		robot = p_robot;
	}
	
	@Override
	public void fireWeapon() {
		// Here we are implementing the methods of Adaptee class in the Adapter class 
		// under the methods of a Target Interface, viz. Client Code (Methods given in the Interface class)
		// Adaptee --> EnemyRobot.java
		// Adapter --> This file: EnemyRobotAdapter.java
		// Target Interface --> EnemyAttacker.java
		robot.smashWithHands();
	}

	@Override
	public void driveForward() {
		robot.walkForward();
	}

	@Override
	public void assignDriver(String driverName) {
		robot.reactToHuman(driverName);		
	}
}
