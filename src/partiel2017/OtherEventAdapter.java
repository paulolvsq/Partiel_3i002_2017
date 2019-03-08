package partiel2017;

public class OtherEventAdapter implements IEventWithEnd {
	
	private IOtherEvent event;
	
	public OtherEventAdapter(IOtherEvent event) {
		this.event = event;
	}

	public String getTitle() {
		return this.event.getName();
	}
	
	public int getDate() {
		return this.event.getDate();
	}

	public int getStartHour() {
		return this.event.getHour();
	}

	public void setTitle(String title) {
		this.event.setName(title);
	}

	public void setStartHour(int hour) {
		this.event.setHour(hour);
	}

	public void print() {
		System.out.println(this.toString());
	}

	public IEvent copy() {
		return (IEvent) (this.event.copy());
	}

	public int getEndHour() {
		return this.event.getHour()+this.event.getDuration(); //on suppose que les formats horaires hh:mm sont corrects dans le calcul
	}

	public void setEndHour(int hour) {
		this.event.setDuration(hour + this.event.getHour());
	}
	
	

}
