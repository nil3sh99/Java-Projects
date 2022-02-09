package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private int defaultmailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "nile.com";
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
	
		// Call a method asking for the dept and return the dept.
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Random password: " + this.password);
		
		// Generate an email id:
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix; 
		System.out.println("Your email is: " + email);
	}
	
	//Ask and set the department
	private String setDepartment() {
		System.out.print("Department Codes: \n 1. Sales \n 2. Development \n 3. Accounting \n 0. None \n Enter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "sales";
		}
		else if(depChoice == 2) {
			return "dev";
		}
		else if(depChoice == 3) {
			return "accounting";
		}
		else
			return "";
		
	}
	
	//Generate a random password for a given length
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGIJKLMNOPQRSTUVWXYZ!@#$%";
		char[] password = new char[length];
		for(int i=0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Getters
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
}
