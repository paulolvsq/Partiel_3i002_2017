package calendrier;

public class Event implements IEvent {
	
	private String title;
	private int date;
	private int startHour;
	
	public Event(String title, int date, int startHour) {
		this.title = title;
		this.date = date;
		this.startHour = startHour;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public int getDate() {
		return this.date;
	}

	@Override
	public int getStartHour() {
		return this.startHour;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void setStartHour(int hour) {
		this.startHour = hour;
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return title+":"+date+":"+startHour;
	}

	@Override
	public IEvent copy() {
		return new Event(title, date, startHour);
	}
	
	

}
