package partiel2017;

public class ActionText implements IAction {
	
	private String text;
	
	public ActionText(String text) {
		this.text = text;
	}

	public void execute(IEvent event) {
		System.out.println(text);
	}
	

}
