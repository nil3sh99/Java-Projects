package bankaccountapp;

public class Savings extends Account{
	// List props. specific to Savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// Constructor to initialize the settings for Savings
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit); // This is done because in the parent class, a constructor with the matching pattern has to be defined and we are explicity calling that to avoid calling the default parent constructor which is a method with no parameter
		accountNumber = "1" + accountNumber;
		
		setSafetyDepositBox();
	}
	// List any methods specific to savings account
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random()*Math.pow(10,3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: SAVINGS ");
		super.showInfo();
		System.out.println(
				"Your savings account features: " + 
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey +
				"\n************************"
				);
	}
}
