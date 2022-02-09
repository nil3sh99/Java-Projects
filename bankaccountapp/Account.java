package bankaccountapp;

/**
 * We don't want to create objects from Account, thus we make it abstract
 * @author Nilesh Aggarwal
 *
 */
public abstract class Account implements IBaseRate{
	// List common properties for Savings and Checking account
	
	String name;
	String sSN;
	double balance;
	
	static int index = 100000;
	String accountNumber;
	double rate;
	
	
	// Constructor to set BASE props. and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		// set account number
		index++;
		this.accountNumber = setAccountNumber();
		
	}
	
	// List common methods 
	// generateAccountNumber(), deposit(), withdraw(), showInfo()
	
	// Set account number
	private String setAccountNumber() {
		// Algo --> 11 digit = 1 or 2 depending on savings + last two digit of SSN, unique 5 digit number + random 3 digit number

		// last two of SSN
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());

		// unique 5 digit 
		int uniqueID = index;

		// random 3 digit
		int randomNumber = (int) (Math.random() * Math.pow(10,3));
		
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void showInfo() {
		System.out.println(
				"NAME:" + name + 
				"\nACCOUNT NUMBER " + accountNumber +
				"\nBALANCE: " + balance
				);
	}
	
	// We have to read a .csv file and get certain params
	
	
}
