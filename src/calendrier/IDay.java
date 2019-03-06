package calendrier;

import java.util.List;

public interface IDay {
	
	public List<IEvent> getEvents();
	public IDay copy();

}
