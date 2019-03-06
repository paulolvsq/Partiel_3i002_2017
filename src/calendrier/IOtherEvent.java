package calendrier;

public interface IOtherEvent {
	
	public String getName();
	public int getDate();
	public int getHour();
	public int getDuration();
	public void setName(String name);
	public void setHour(int hour);
	public void setDuration(int duration);
	public IOtherEvent copy();

}
