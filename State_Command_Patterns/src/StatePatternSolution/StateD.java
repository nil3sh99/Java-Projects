
public class StateD extends DFAstate{

	public StateD(DFArunner runnerObject) {
		this.runnerObject = runnerObject;
	}
	
	@Override
	public void transition(DFArunner runnerObject) {
		System.out.println("In State: D");
		System.out.println("Next State available: Final State. Type Q to quit");
		char input= this.runnerObject.getInput();

		if(input == 'Q') {
			this.runnerObject.state=new StateStop(runnerObject);
		
			
		}
		else
		{
			System.out.println("Input not D. "
					+ "Invalid input, can not reach from C");
		}
		
		
	}

}
