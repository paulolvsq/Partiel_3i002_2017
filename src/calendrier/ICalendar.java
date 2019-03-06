package calendrier;

public interface ICalendar {
	
	public int getNbDays();
	public IDay getDay(int date);
	public void addEvent(IEvent event);
	public void removeEvent(IEvent event);
	public ICalendar copy();

}
