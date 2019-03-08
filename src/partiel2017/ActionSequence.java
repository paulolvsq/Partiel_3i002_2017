package partiel2017;

public class ActionSequence implements IAction {
	
	private IAction action1;
	private IAction action2;
	
	public ActionSequence(IAction action1, IAction action2) {
		this.action1 = action1;
		this.action2 = action2;
	}

	public void execute(IEvent event) {
		action1.execute(event);
		action2.execute(event);
	}
	
	

}
