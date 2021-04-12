import java.util.Random;



public class EnemyTank implements EnemyAttacker {

	Random generator = new Random();
	
	
	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		int attackDamage = generator.nextInt(10) + 1;
		
		System.out.println("Tank does " + attackDamage + " damage");
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		int movement = generator.nextInt(5) + 1;
		
		System.out.println("Tank moves " + movement + " moves");
	}

	@Override
	public void assignDriver(String driverName) {
		// TODO Auto-generated method stub
		System.out.println(driverName + " is driving the tank");
	}

}
