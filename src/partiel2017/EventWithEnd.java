package partiel2017;

public class EventWithEnd extends Event implements IEventWithEnd {
	
	private int endHour;
	
	public EventWithEnd(String title, int date, int startHour, int endHour) {
		super(title, date, startHour);
		this.endHour = endHour;
	}
	
	public int getEndHour() {
		return this.endHour;
	}
	
	public void setEndHour(int hour) {
		this.endHour = hour;
	}
	
	public String toString() {
		return this.getTitle()+":"+this.getDate()+":"+this.getStartHour()+":"+this.endHour;
	}
	
	public IEventWithEnd copy() {
		return new EventWithEnd(this.getTitle(), this.getDate(), this.getStartHour(), this.endHour);
	}

}
