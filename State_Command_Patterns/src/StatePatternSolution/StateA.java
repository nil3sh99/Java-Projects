
public class StateA extends DFAstate{

	
	public StateA(DFArunner runnerObject) {
		this.runnerObject = runnerObject;
	}
	
	@Override
	public void transition(DFArunner runnerObject) {
		System.out.println("In state: A");
		System.out.println("Enter the next state: [A,B,C] ");
		char input = this.runnerObject.getInput();
		if(input == 'A') {
			this.runnerObject.state=new StateA(runnerObject);
			
		}else if(input == 'B'){
			this.runnerObject.state=new StateB(runnerObject);
		}
		else if(input == 'C')
		{
			this.runnerObject.state=new StateC(runnerObject);
			
		}
		else
		{
			System.out.println("Input is not A,B, C . "
					+ "Invalid Input, not reachable");
		}
		
	}
	

}
