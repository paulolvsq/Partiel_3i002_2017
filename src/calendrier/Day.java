package calendrier;

import java.util.ArrayList;
import java.util.List;

public class Day implements IDay {
	
	private List<IEvent> events;
	
	public Day() {
		events = new ArrayList<>();
	}

	@Override
	public List<IEvent> getEvents() {
		return events;
	}

	@Override
	public IDay copy() {
		Day res = new Day();
		for(IEvent event : this.events) {
			res.getEvents().add(event.copy());
		}
		return res;
	}

}
