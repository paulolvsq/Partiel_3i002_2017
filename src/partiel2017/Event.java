package partiel2017;

public class Event implements IEvent {
	
	private String title;
	private int date;
	private int startHour;
	
	public Event(String title, int date, int startHour) {
		this.title = title;
		this.date = date;
		this.startHour = startHour;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getDate() {
		return this.date;
	}
	
	public int getStartHour() {
		return this.startHour;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setStartHour(int hour) {
		this.startHour = hour;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public IEvent copy() {
		return new Event(this.title, this.date, this.startHour);
	}
	
	public String toString() {
		return this.title+":"+this.date+":"+this.startHour;
	}

}
