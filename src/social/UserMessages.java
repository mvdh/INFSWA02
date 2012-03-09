package social;

import java.util.ArrayList;


public class UserMessages<E> extends ArrayList<E> implements Subject{
	
	ArrayList<Observer> subscribers = new ArrayList<Observer>();
	
	@Override
	public boolean add(E message){
		boolean result = super.add(message);
		notifyObservers();
		return result;
	}

	@Override
	public boolean attach(Observer o) {
		if (subscribers.contains(o)){
			return false;
		} else {
			return subscribers.add(o);
		}
	}

	@Override
	public boolean detach(Observer o) {
		if (subscribers.contains(o)){
			return subscribers.remove(o);
		} else {
			return false;
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer o : subscribers){
			o.update(this);
		}
		
	}
	
}
