package partiel2017;

public class ActionMarkDone implements IAction {
	
	public ActionMarkDone() {
		
	}

	public void execute(IEvent event) {
		event.setTitle(event.getTitle()+" URGENT !");
	}

}
