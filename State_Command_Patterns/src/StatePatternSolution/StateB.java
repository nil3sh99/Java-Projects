
public class StateB extends DFAstate{

	
	public StateB(DFArunner runnerObject) {
		this.runnerObject = runnerObject;
	}
	@Override
	public void transition(DFArunner runnerObject) {
		System.out.println("In State: B");
		System.out.println("Next State available B -> A");
		char input= this.runnerObject.getInput();
		
		if(input == 'A') {
			this.runnerObject.state=new StateA(runnerObject);
			
		}
		else
		{
			System.out.println("Input not A. "
					+ "Invalid Input, not reachable");
		}
		
		
	}

}
