package social;

public interface Subject {
	
	boolean attach(Observer o);
	boolean detach(Observer o);
	void notifyObservers();
	
}
