package partiel2017;

public class ActionnableEvent extends EventWithEnd {
	
	private IAction action;
	
	public ActionnableEvent(String title, int date, int startHour, int endHour, IAction action) {
		super(title, date, startHour, endHour);
		this.action = action;
	}
	
	public void executeAction() {
		this.action.execute(this);
	}
	
	public void setAction(IAction action) {
		this.action = action;
	}
	
	public ActionnableEvent copy() {
		return new ActionnableEvent(this.getTitle(), this.getDate(), this.getStartHour(), this.getEndHour(), this.action);
	}

}
