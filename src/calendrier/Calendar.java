package calendrier;

public class Calendar implements ICalendar {
	
	private Day[] calendrier;
	
	public Calendar(int nb) {
		calendrier = new Day[nb];
	}

	@Override
	public int getNbDays() {
		return calendrier.length;
	}

	@Override
	public IDay getDay(int date) {
		return calendrier[date];
	}

	@Override
	public void addEvent(IEvent event) {
		calendrier[event.getDate()].getEvents().add(event);
	}

	@Override
	public void removeEvent(IEvent event) {
		calendrier[event.getDate()].getEvents().remove(event);
	}

	@Override
	public ICalendar copy() {
		Calendar res = new Calendar(calendrier.length);
		for(int i = 0; i < calendrier.length; i++)
			res.calendrier[i] = (Day) (calendrier[i].copy());
		return res;
	}
	
	

}
