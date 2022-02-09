package bankaccountapp;

public class BankAccountApp{

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Nilesh Aggarwal", "123456789", 1500);
		
		Savings savacc1 = new Savings("Nehal Aggarwal", "333456678", 2500);
		
		savacc1.showInfo();
		
		
		chkacc1.showInfo();
		
		
	}

}
