
public class StateC extends DFAstate{

	public StateC(DFArunner runnerObject) {
		this.runnerObject = runnerObject;
	}
	
	@Override
	public void transition(DFArunner runnerObject) {
		System.out.println("In State: C");
		System.out.println("Next State available: C -> D. Type it");
		char input = this.runnerObject.getInput();
		
		if(input == 'D') {
			this.runnerObject.state=new StateD(runnerObject);	
		}
		else
		{
			System.out.println("Input not D. "
					+ "Invalid input, not reachable from C");
		}
	}

}
