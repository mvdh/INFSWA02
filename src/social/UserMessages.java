package social;

import java.util.ArrayList;


public class UserMessages<E> extends ArrayList<E> implements Subject{
	
	@Override
	public boolean add(E message){
		boolean result = super.add(message);
		
		//TODO En dan hier nog iets met een notify ofzo...
		
		return result;
		
	}
	
}
