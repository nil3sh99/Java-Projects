/**
 * Abstract class for DFAState which acts as a State
 * @author Nilesh Aggarwal
 *
 */
public abstract class DFAState {
    /**
     * Method to Log and Print if the command can't be executed in current phase.
     */
    public void InvalidState() {
        System.out.println("This is an invalid transition");
    }

    private void HandleStartState(DFArunner dfaRunner){
        dfaRunner.state = new StateA();
    }

    private void HandleTransition(DFArunner dfaRunner){
        dfaRunner.state = new StateStop();
    }

    public void transition(DFArunner dfaRunner){
        if(dfaRunner.state instanceof StateStart) {
            HandleStartState(dfaRunner);
        } 
        else if(dfaRunner.state instanceof StateD){
            HandleTransition(dfaRunner);
        }
        else {
            switch (dfaRunner.getInput()) {
                case 'a':
                    onPressA(dfaRunner);
                    break;
                case 'b':
                    onPressB(dfaRunner);
                    break;
                case 'c':
                    onPressC(dfaRunner);
                    break;
                case 'd':
                    onPressD(dfaRunner);
                    break;
                default:
                    InvalidState();
                    break;
            }
        }
    }

    /**
     * Executes when user inputs A
     */
    protected abstract void onPressA(DFArunner dfaRunner);

    /**
     * Executes when user inputs B
     */
    protected abstract void onPressB(DFArunner dfaRunner);

    /**
     * Executes when user inputs C
     */
    protected abstract void onPressC(DFArunner dfaRunner);

    /**
     * Executes when user inputs D
     */
    protected abstract void onPressD(DFArunner dfaRunner);
}
