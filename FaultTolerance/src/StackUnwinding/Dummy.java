package StackUnwinding;

public class Dummy {
	public String dummyName;
	public int age;

//Constructor overloading is done here, depending upon the data type of parameter being passed
// Data type 1: String
// Data type 2: Object of class Dummy, see above: public String dummyName
//													public int age;
	
	Dummy(String s) {
		dummyName = s; // saving the passed argument which is "Bunny" here to, dummyName.
		System.out.println("Created Dummy: " + dummyName);
	}

	Dummy(Dummy other) {
		dummyName = other.dummyName;
		System.out.println("Copy created Dummy: " + dummyName);
	}
}
