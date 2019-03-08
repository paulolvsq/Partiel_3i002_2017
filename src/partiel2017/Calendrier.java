package partiel2017;

import java.util.ArrayList;
import java.util.List;

public class Calendrier implements ICalendar {
	
	private Day[] calendrier;
	
	public Calendrier(int nbJours) {
		calendrier = new Day[nbJours];
	}
	
	public int getNbDays() {
		return this.calendrier.length;
	}
	
	public IDay getDay(int date) {
		return this.calendrier[date];
	}
	
	public void addEvent(IEvent event) {
		this.calendrier[event.getDate()].getEvents().add(event); 
	}
	
	public void removeEvent(IEvent event) {
		this.calendrier[event.getDate()].getEvents().remove(event);
	}
	
	public ICalendar copy() {
		return new Calendrier(calendrier.length);
	}
	
	public List<IEvent> eventsInRange(int firstDate, int lastDate) {
		List<IEvent> res = new ArrayList<>();
		for(int i = 0; i < calendrier.length; i++) {
			for(IEvent event : calendrier[i].getEvents()) {
				if(event.getDate() >= firstDate && event.getDate() <= lastDate) {
					res.add(event);
				}
			}
		}
		return res;
	}

}
