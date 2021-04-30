public class StateStart extends DFAstate {
	@Override
	public void transition(DFArunner runnerObject) {
		this.runnerObject = runnerObject;
		this.runnerObject.state = new StateA(runnerObject);
		System.out.println("In Start state and transiting to State A");
	}

}
