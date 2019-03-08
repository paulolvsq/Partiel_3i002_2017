package partiel2017;

import java.util.ArrayList;
import java.util.List;

public class Day implements IDay {
	
	private List<IEvent> events;
	
	public Day() {
		events = new ArrayList<>();
	}
	
	public List<IEvent> getEvents() { 
		return this.events;
	}
	
	public IDay copy() {
		Day res = new Day();
		for(IEvent e : this.events)
			res.getEvents().add(e.copy());
		return res;
	}

}
