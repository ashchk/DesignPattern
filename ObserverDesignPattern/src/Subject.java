
public interface Subject { //subject must implement this interface
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
