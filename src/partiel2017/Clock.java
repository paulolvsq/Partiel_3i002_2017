package partiel2017;

public class Clock {
	
	private ICalendar calendrier;
	private int date;
	private int heure;
	
	public Clock(ICalendar calendrier) {
		this.calendrier = calendrier;
		this.date = 0;
		this.heure = 0;
	}
	
	public void tick() {
		heure = (heure + 1)%24;
		if(heure == 0) date += 1;
		for(int i = 0; i < calendrier.getNbDays(); i++) {
			for(IEvent event : calendrier.getDay(i).getEvents()) {
				if(event.getDate() == date && event.getStartHour() == heure && event instanceof IActionnableEvent) {
					((IActionnableEvent) (event)).executeAction();
				}
			}
		}
	}

}
