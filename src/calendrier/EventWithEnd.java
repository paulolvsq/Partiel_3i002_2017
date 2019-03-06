package calendrier;

public class EventWithEnd extends Event implements IEventWithEnd {
	
	private int endHour;
	
	public EventWithEnd(String title, int date, int startHour, int endHour) {
		super(title, date, startHour);
		this.endHour = endHour;
	}
	
	public String toString() {
		return this.getTitle()+":"+this.getDate()+":"+this.getStartHour()+":"+endHour;
	}
	
	public int getEndHour() {
		return this.getEndHour();
	}
	
	public void setEndHour(int endHour) {
		this.endHour = endHour;
	}
	
	public IEventWithEnd copy() {
		return new EventWithEnd(this.getTitle(), this.getDate(), this.getStartHour(), endHour);
	}

}
