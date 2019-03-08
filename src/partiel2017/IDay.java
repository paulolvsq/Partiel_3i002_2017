package partiel2017;

import java.util.List;

public interface IDay {
	
	public List<IEvent> getEvents();
	public IDay copy();

}
