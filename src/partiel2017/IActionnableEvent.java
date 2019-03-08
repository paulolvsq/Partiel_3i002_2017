package partiel2017;

public interface IActionnableEvent extends IEventWithEnd {
	
	public void executeAction();
	public void setAction (IAction action);

}
