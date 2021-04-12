/**
 * This is the target interface, i.e. client expects us to work with this.
 * It is the adapters job to make new classes compatible with this class.
 * @author Nilesh Aggarwal
 *
 */

public interface EnemyAttacker {

	public void fireWeapon();
	public void driveForward();
	public void assignDriver(String driverName);
}
