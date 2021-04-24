package StackUnwinding;

import java.io.IOException;

public class StackUnwindingDemo {

	public static void main(String[] args) {
		System.out.println("Entering main");
		Dummy d = null;
		DummyProcessor dp = null;
		try {
			d = new Dummy("Buster"); //in this case method 1 of the class Dummy will be used, as the parameter passed is a string data type.
			dp = new DummyProcessor(d); //when an object of class Dummy is passed as an argument.
			dp.changeName(); // we are calling the method of class DummyProcessor.
		} catch (Exception e) {
			System.out.println("Caught an exception");
		    e.printStackTrace(System.out);
		}
		System.out.println("Changed name of the dummy : " + d.dummyName);
		System.out.println("Exiting main.");
	}
}
