package partiel2017;

public class TestActionnableEvent {
	
	public static void main(String[] args) {
		
		ActionnableEvent event = new ActionnableEvent("Test", 803, 2011, 2100, new ActionSequence(new ActionText("C'est l'heure"), new ActionMarkDone()));
		event.print();
		event.executeAction();
		event.print();
		
	}

}
