package bankaccountapp;

public class Checking extends Account{
	// List the props specific to a checking account
	// Ex: Holders are assigned a Debit card with 12 digit number and 4 digit pin
	int debitCardNumber;
	int debitCardPIN;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit); // This is done because in the parent class, a constructor with the matching pattern has to be defined and we are explicity calling that to avoid calling the default parent constructor which is a method with no parameter
		accountNumber = "2" + accountNumber;
		
	}
	
	// List any methods specific to the checking account
	// Polymorphism
	
	public void showInfo() {
		super.showInfo(); // this will call the show info method of the super class and 
							// we can print the relevant information from our checking account
		System.out.println("ACCOUNT TYPE: CHECKING ");
	}
}
