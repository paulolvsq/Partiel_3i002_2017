package calendrier;

public interface IEvent {
	
	public String getTitle();
	public int getDate();
	public int getStartHour();
	public void setTitle(String title);
	public void setStartHour(int hour);
	public void print();
	public IEvent copy();

}
